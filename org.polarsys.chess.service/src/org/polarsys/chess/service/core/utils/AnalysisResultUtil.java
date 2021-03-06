/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.service.core.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.service.gui.utils.SelectionUtil;

import eu.fbk.eclipse.standardtools.utils.ui.utils.CommandBuilder;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;
import eu.fbk.eclipse.standardtools.utils.ui.utils.DirectoryUtil;
import eu.fbk.eclipse.standardtools.utils.ui.utils.ErrorsDialogUtil;

/**
 * Utility class to store the results of an analysis.
 * 
 * @author cristofo
 *
 */
public class AnalysisResultUtil {
	private static final String ANALYSIS_CONTEXT_ELEMENT = "CHESS::Dependability::DependableComponent::AnalysisContextElement";
	private static final String ANALYSIS_VIEW = "CHESS::Core::CHESSViews::AnalysisView";
	private static final String DEPENDABILITY_ANALYSIS_VIEW = "CHESS::Core::CHESSViews::DependabilityAnalysisView";
	private static final String RESULTS_FILE_PATH = File.separator + "VerificationResults";
	/*
	 * public static final String FMEA_ANALYSIS = "FMEA"; public static final
	 * String FTA_ANALYSIS = "FTA"; public static final String
	 * CONTRACT_BASED_FTA_ANALYSIS = "CONTRACT_FTA"; public static final String
	 * CONTRACT_REFINEMENT_ANALYSIS = "CONTRACT_REF"; public static final String
	 * CONTRACT_IMPLEMENTATION_ANALYSIS = "CONTRACT_IMPL"; public static final
	 * String PROPERTY_VALIDATION_ANALYSIS = "PROP_VAL"; public static final
	 * String CONTRACT_PROPERTY_VALIDATION_ANALYSIS = "CONT_PROP_VAL"; public
	 * static final String MODEL_CHECKING_ANALYSIS = "MODEL_CHECK";
	 */

	public static final String PROPERTY = "property";
	public static final String CHECK_TYPE = "check_type";
	public static final String SELECTED_PROPERTIES = "selected_properties";
	public static final String SELECTED_COMPONENTS = "selected_components";

	private static AnalysisResultUtil packageUtilInstance;
	private final EntityUtil entityUtil = EntityUtil.getInstance();
	private final ErrorsDialogUtil errorsDialogUtil = ErrorsDialogUtil.getInstance();
	private final DialogUtil dialogUtil = DialogUtil.getInstance();

	public static AnalysisResultUtil getInstance() {
		if (packageUtilInstance == null) {
			packageUtilInstance = new AnalysisResultUtil();
		}
		return packageUtilInstance;
	}

	/**
	 * Converts an Iterator to a Collection
	 */
	private <T> Collection<T> iterator2Collection(final Iterator<T> iter) {
		ArrayList<T> list = new ArrayList<T>();
		for (; iter.hasNext();) {
			T item = iter.next();
			list.add(item);
		}
		return list;
	}

	/**
	 * Returns the requested view, starting from the UML model.
	 * 
	 * @return the requested view
	 */
	public Package getDependabilityView() {
		final UmlModel umlModel = UmlUtils.getUmlModel();

		final TreeIterator<EObject> allElements = umlModel.getResource().getAllContents();
		if (allElements != null) {
			final Collection<Package> packages = EcoreUtil.getObjectsByType(iterator2Collection(allElements),
					UMLPackage.eINSTANCE.getPackage());

			for (Package p : packages) {
				if (p.getAppliedStereotype(DEPENDABILITY_ANALYSIS_VIEW) != null) {
					return p;
				}
			}
		}
		errorsDialogUtil.showMessage_GenericError("Error: DependabilityAnalysisView not found!");
		return null;
	}

	/**
	 * Returns the requested view starting from the given package.
	 * 
	 * @param pkg
	 *            the package from which go up and find the wiew
	 * @return the requested view
	 */
	public Package getDependabilityViewFromPackage(Package pkg) {

		final Model model = pkg.getModel();

		// Get the list of first level packages
		EList<Package> modelPackages = model.getNestedPackages();

		Package analysisView = null;
		for (Package modelPackage : modelPackages) {
			if (modelPackage.getAppliedStereotype(ANALYSIS_VIEW) != null) {
				analysisView = modelPackage;
				break;
			}
		}

		if (analysisView == null) {
			errorsDialogUtil.showMessage_GenericError(
					"No <<AnalysisView>> view found. " + "Cannot read or store analyses results.");
			return null;
		}

		// Get the list of second level packages
		modelPackages = analysisView.getNestedPackages();

		for (Package modelPackage : modelPackages) {
			if (modelPackage.getAppliedStereotype(DEPENDABILITY_ANALYSIS_VIEW) != null) {
				return modelPackage;
			}
		}
		errorsDialogUtil.showMessage_GenericError(
				"No <<DependabilityAnalysisView>> view found. " + "Cannot read or store analyses results.");
		return null;
	}

	/**
	 * Applies the ResultElement stereotype to the given element.
	 * 
	 * @param element
	 *            the element
	 * @return the stereotype applied
	 */
	private Stereotype applyAnalysisContextElementStereotype(Component element) {
		return UMLUtils.applyStereotype(element, ANALYSIS_CONTEXT_ELEMENT);
	}

	/**
	 * Returns the local path of the given absolute path.
	 * 
	 * @param filePath
	 *            the absolute file path
	 * @return the local path
	 */
	private String getLocalPath(String filePath) {
		return filePath.substring(filePath.indexOf(RESULTS_FILE_PATH) + 1, filePath.length());
	}

	/**
	 * Returns the ResultElement application from a given UML element.
	 * 
	 * @param element
	 *            the element containing the appplication, if any
	 * @return the application of the stereotype
	 */
	public AnalysisContextElement getAnalysisContextElementFromUmlElement(Element element) {
		final Stereotype appliedStereotype = element.getAppliedStereotype(ANALYSIS_CONTEXT_ELEMENT);
		return (AnalysisContextElement) element.getStereotypeApplication(appliedStereotype);
	}

	/**
	 * Return a kind of qualified name for the given package.
	 * 
	 * @param pkg
	 *            the package
	 * @return the qualified name, without "model" and "::" replaced by "_"
	 */
	public String getPackageName(Package pkg) {
		String name = pkg.getQualifiedName();
		name = name.substring(name.indexOf("::") + 2);
		return name.replace("::", "_");
	}

	/**
	 * Creates a ResultElement and store the given result.
	 * 
	 * @param type
	 *            the type of the analysis
	 * @param conditions
	 *            the specified conditions
	 * @param filePath
	 *            the path of the result file
	 * @param rootComponent
	 *            the root component of the architecture
	 * @param analysisContext
	 *            the context analysis used to run the check
	 * @return true if succeded
	 */
	public boolean createOrUpdateAnalysisContext(final Analysis type, final EList<String> conditions, final String resultFilePath,
			final boolean storeResultFilePath, final Class rootComponent,
			final InstantiatedArchitectureConfiguration instantiatedArchitecture, final AnalysisContextElement analysisContext) {

		final Package activePackage = rootComponent.getNearestPackage();

		// Select the correct view where to store the result
		final Package dependabilityView = getDependabilityViewFromPackage(activePackage);
		if (dependabilityView == null) {
			return false;
		}

		// Start a transaction to modify the package content
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(dependabilityView);
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {

				// Get the correct package, or create it if needed
				final String componentPackageName = getPackageName(rootComponent.getNearestPackage());
				Package dependabilityPackage = dependabilityView.getNestedPackage(componentPackageName, false,
						UMLPackage.eINSTANCE.getPackage(), true);

				// Compute the local path to store in the result
				// final String localFilePath = getLocalPath(filePath);

				// Check if the result is already present in the package
				EList<PackageableElement> packageableElements = dependabilityPackage.getPackagedElements();
				for (PackageableElement packageableElement : packageableElements) {

					if (packageableElement != null && packageableElement instanceof Component
							&& (packageableElement.getAppliedStereotype(ANALYSIS_CONTEXT_ELEMENT) != null)) {

						// There is an element with the same name, check to see
						// if it is possible to reuse it
						final AnalysisContextElement resultElement = getAnalysisContextElementFromUmlElement(
								packageableElement);
						if (resultElement.getType().equals(type) && resultElement.getRoot() == rootComponent) {
							if (isEquals(resultElement.getConditions(), conditions)
									& resultElement.getInstantiatedArchitecture()==(instantiatedArchitecture)) {

								// Same analysis, can be updated with the new
								// values
								resultElement.setDate(new Date().toString());
								resultElement.setValid(true);

								// Remove the result file from disk and set the
								// new one
								/*
								 * File resultFile; try { resultFile = new
								 * File(DirectoryUtil.getInstance().
								 * getCurrentProjectDir() + File.separator +
								 * resultElement.getFile());
								 * resultFile.delete(); } catch (Exception e) {
								 * dialogUtil.showMessage_ExceptionError(e);
								 * e.printStackTrace(); }
								 * resultElement.setFile(localFilePath);
								 */
								// File resultFile = new File(resultFilePath);

								if (resultFilePath != null) {
									if (storeResultFilePath) {
										resultElement.setResult(resultFilePath);

									} else {
										try {
											resultElement.setResult(
													new String(Files.readAllBytes(Paths.get(resultFilePath))));
										} catch (IOException e) {
											e.printStackTrace();
										}
									}
								}

								return;
							}
						}
					}
				}

				int currAnalysisContextElement = countAnalysisContextElements(packageableElements, type) + 1;

				// Create a new result element
				final Component umlComponent = (Component) dependabilityPackage.createPackagedElement(
						type.getName() + "_" + currAnalysisContextElement, UMLPackage.eINSTANCE.getComponent());
				final Stereotype appliedStereotype = applyAnalysisContextElementStereotype(umlComponent);
				if (appliedStereotype == null) {
					errorsDialogUtil.showMessage_GenericError(
							"Cannot apply the "+ANALYSIS_CONTEXT_ELEMENT+" stereotype. " + "Is the CHESS model up to date?");
					return;
				}
				final AnalysisContextElement resultElement = (AnalysisContextElement) umlComponent
						.getStereotypeApplication(appliedStereotype);
				if (resultElement != null) {
					resultElement.setType(type);
					resultElement.setDate(new Date().toString());
					if (conditions != null) {
						resultElement.getConditions().addAll(conditions);
					}
					if (instantiatedArchitecture != null) {
						resultElement.setInstantiatedArchitecture(instantiatedArchitecture);
					}
					resultElement.setValid(true);
					if (resultFilePath != null) {
						if (storeResultFilePath) {
							resultElement.setResult(resultFilePath);

						} else {
							try {
								resultElement.setResult(new String(Files.readAllBytes(Paths.get(resultFilePath))));
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
					resultElement.setRoot(rootComponent);
					// resultElement.setContextAnalysis(contextAnalysis);
				}
			}
		});
		return true;
	}

	protected int countAnalysisContextElements(EList<PackageableElement> packageableElements, Analysis type) {

		int numElements = 0;
		for (PackageableElement packageableElement : packageableElements) {
			if (packageableElement != null && packageableElement instanceof Component
					&& (packageableElement.getAppliedStereotype(ANALYSIS_CONTEXT_ELEMENT) != null)) {

				// There is an element with the same name, check to see
				// if it is possible to reuse it
				final AnalysisContextElement resultElement = getAnalysisContextElementFromUmlElement(
						packageableElement);
				if (resultElement.getType().equals(type)) {
					numElements++;
				}
			}
		}
		return numElements;
	}

	boolean isEquals(EList<String> eList, EList<String> conditions) {
		if ((eList == null) && (conditions == null)) {
			return true;
		}
		if ((eList == null) || (conditions == null)) {
			return false;
		}
		if (eList.size() != conditions.size())
			return false;
		for (String s : conditions) {
			if (!eList.contains(s))
				return false;
		}
		return true;
	}

	/**
	 * Returns the selected package, if any.
	 * 
	 * @param event
	 *            the event
	 * @return the selected package
	 */
	private Package getPackageFromSelectedObject(ExecutionEvent event) {
		final ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		final Object selectedUmlElement = SelectionUtil.getInstance().getUmlSelectedObject(selection);

		if (selectedUmlElement instanceof Package) {
			return (Package) selectedUmlElement;
		}
		return null;
	}

	/**
	 * Gets the System component from the selected event, if any.
	 * 
	 * @param event
	 *            the event
	 * @return the System component
	 * @throws ExecutionException
	 */
	public Class getSystemComponentFromEvent(ExecutionEvent event) throws ExecutionException {
		final Package pkg = getPackageFromSelectedObject(event);
		if (pkg == null || !entityUtil.isSystemViewPackage(pkg)) {
			final ExecutionException e = new ExecutionException("Please select a package from <<SystemView>>");
			dialogUtil.showMessage_ExceptionError(e);
			throw e;
		}

		final Class systemComponent = EntityUtil.getInstance().getSystemComponent(pkg);
		if (systemComponent == null) {
			final ExecutionException e = new ExecutionException(
					"The package does not have a <<System>> block or it has more than one. Please check.");
			dialogUtil.showMessage_ExceptionError(e);
			throw e;
		}
		return systemComponent;
	}

	/**
	 * Computes the name for the results directory.
	 * 
	 * @return the name that the directory should have
	 */
	private String computeResultDir() {
		try {
			return DirectoryUtil.getInstance().getCurrentProjectDir() + RESULTS_FILE_PATH;
		} catch (Exception e) {
			dialogUtil.showMessage_ExceptionError(e);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Returns the directory where validation result files are stored. If the
	 * directory is not present, it will be created.
	 * 
	 * @return the string containing the directory
	 */
	public String getResultDir() {
		final String resultDir = computeResultDir();
		final File directory = new File(resultDir);
		if (!directory.exists()) {
			return createResultDir(resultDir);
		} else {
			return resultDir;
		}
	}

	/**
	 * Creates the directory where to store validation results.
	 * 
	 * @return the string containing the directory
	 */
	private String createResultDir(String dirName) {
		try {
			final File directory = new File(dirName);
			if (!directory.mkdirs()) {
				errorsDialogUtil.showMessage_GenericError("Cannot create results directory: " + dirName);
				return null;
			}
			return dirName;
		} catch (Exception e) {
			dialogUtil.showMessage_ExceptionError(e);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Shows the result of the given function, reading data from the given file.
	 * 
	 * @param functionName
	 *            the name of the function used to obtain the result
	 * @param fileName
	 *            the file containing the data to visualize
	 */
	public void showResult(String functionName, String fileName) {
		final String commandId = "eu.fbk.tools.adapter.ui.commands.ShowVVResultCommand";
		final String functionNameParam = "function_name";
		final String fileNameParam = "result_file";

		CommandBuilder computeFaultTree;
		try {
			computeFaultTree = CommandBuilder.build(commandId);
			computeFaultTree.setParameter(functionNameParam, functionName);
			computeFaultTree.setParameter(fileNameParam, fileName);
			computeFaultTree.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<AnalysisContextElement> getAnalysisContexts(Class element,
			InstantiatedArchitectureConfiguration instantiatedArchitecture, Analysis analysisType, Model model) {
		List<AnalysisContextElement> result = new ArrayList<AnalysisContextElement>();
		for (Element elem : model.allOwnedElements()) {
			Stereotype stereo = elem.getAppliedStereotype(ANALYSIS_CONTEXT_ELEMENT);
			if (stereo != null) {
				AnalysisContextElement contextAnalysis = (AnalysisContextElement) elem.getStereotypeApplication(stereo);
				if (contextAnalysis.getType().equals(analysisType) && contextAnalysis.getRoot().equals(element)
						&& contextAnalysis.getInstantiatedArchitecture()==(instantiatedArchitecture)) {
					result.add(contextAnalysis);
				}
			}
		}
		return result;
	}

}
