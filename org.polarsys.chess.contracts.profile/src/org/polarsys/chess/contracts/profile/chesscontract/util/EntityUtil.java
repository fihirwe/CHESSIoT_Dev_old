/*******************************************************************************
 * Copyright (C) 2017 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alberto Debiasi - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.contracts.profile.chesscontract.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
//import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.DataTypes.BoundedSubtype;
import org.eclipse.papyrus.sysml.portandflows.FlowDirection;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.papyrus.sysml.service.types.element.SysMLElementTypes;
import org.eclipse.papyrus.uml.service.types.utils.ElementUtil;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
//import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPage;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerPageBookView;
import org.eclipse.papyrus.views.modelexplorer.ModelExplorerView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.ide.IDE;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BodyOwner;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
//import org.polarsys.chess.contracts.profile.chesscontract.util.ContractEntityUtil;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.chessmlprofile.StateMachines.PrioritizedTransition;
import org.polarsys.chess.contracts.profile.chesscontract.FormalProperty;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.core.util.uml.UMLUtils;

import eu.fbk.eclipse.standardtools.utils.core.utils.EObjectUtil;

/**
 * Util class that provides methods to manage SysML/CHESS/MARTE objects.
 *
 */
public class EntityUtil {

	private static final Logger logger = Logger.getLogger(EntityUtil.class);

	public static final String BLOCK = "SysML::Blocks::Block";
	public static final String SYSTEM = "CHESSContract::System";
	public static final String FLOW_Port = "SysML::PortAndFlows::FlowPort";
	private static final String FLOW_Port_MARTE = "MARTE::MARTE_DesignModel::GCM::FlowPort";
	public static final String BOUNDED_TYPE = "MARTE::MARTE_Annexes::VSL::DataTypes::BoundedSubtype";
	private static final String COMP_TYPE = "CHESS::ComponentModel::ComponentType";
	private static final String COMP_IMPL = "CHESS::ComponentModel::ComponentImplementation";
	private static final String SYSVIEW = "CHESS::Core::CHESSViews::SystemView";

	public static final String INSTANTIATED_ARCHITECTURE_CONFIGURATION = "CHESS::ParameterizedArchitecture::InstantiatedArchitectureConfiguration";

	private static final String INTEGER_TYPE = "PrimitiveTypes::Integer";
	private static final String STRING_TYPE = "PrimitiveTypes::String";
	private static final String REAL_TYPE = "PrimitiveTypes::Real";
	private static final String BOOLEAN_TYPE = "PrimitiveTypes::Boolean";

	private static final String CHESS_CONTINUOUS_TYPE = "CHESSContract::DataTypes::Continuous";

	private static final String MARTE_BOOLEAN_TYPE = "MARTE_Library::MARTE_PrimitivesTypes::Boolean";
	private static final String MARTE_REAL_TYPE = "MARTE_Library::MARTE_PrimitivesTypes::Real";
	private static final String MARTE_INTEGER_TYPE = "MARTE_Library::MARTE_PrimitivesTypes::Integer";
	private static final String FORMAL_PROP = "CHESSContract::FormalProperty";
	private static final String FAULTY_STATE_MACHINE = "CHESS::Dependability::ThreatsPropagation::ErrorModel";
	public static final String DELEGATION_CONST = "CHESSContract::DelegationConstraint";

	public static final String PRIORITIZED_TRANSITION = "CHESS::StateMachines::PrioritizedTransition";

	public static final String MACRO_DEFINITION = "CHESS::Expressions::MacroDefinition";
	public static final String PARAMETER_ASSUMPTIONS = "CHESS::Expressions::ParameterAssumptions";

	// default names of created objects
	private static final String DEFAULT_DELEGATION_PREFIX = "DelegConstr_";
	private static final String DEFAULT_PAR_ASSUMPTION_PREFIX = "ParamAssumption";
	private static final String DEFAULT_ASSOCIATION_NAME = "association";
	private static final String DEFAULT_ENUMERATION_NAME = "Enumeration";
	private static final String DEFAULT_SIGNAL_NAME = "Signal";
	private static final String DEFAULT_CONNECTOR_NAME = "connector";
	private static final String DEFAULT_DELEGATION_CONSTRAINT_LITERAL_STRING_NAME = "constraintSpec";
	private static final String DEFAULT_PAR_ASSUMPTION_LITERAL_STRING_NAME = "constraintSpec";
	private static final String DEFAULT_MACRO_DEFINITION_STRING_NAME = "constraintSpec";
	private static final String DEFAULT_PARAMETER_IN_NAME = "parameterIn";
	private static final String DEFAULT_PARAMETER_OUT_NAME = "parameterOut";
	private static final String DEFAULT_BOUNDEDTYPE_NAME = "BoundedInteger_";

	private static final String modelExtension = ".di";

	// Library for UML primitive types
	private Model umlLibrary = null;
	// Library for CHESS types like continuous
	private Profile chessContractLibrary = null;

	private static EntityUtil entityUtilInstance;

	public static EntityUtil getInstance() {
		if (entityUtilInstance == null) {
			entityUtilInstance = new EntityUtil();
		}
		return entityUtilInstance;
	}

	public IFile getCurrentIFile() throws Exception {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page != null) {
			IEditorPart editorPart = page.getActiveEditor();

			if (editorPart != null) {
				IEditorInput editorInput = editorPart.getEditorInput();

				if ((editorInput != null) && (editorInput instanceof IFileEditorInput)) {
					return ((IFileEditorInput) editorInput).getFile();
				}
			}
		}
		return null;
	}

	public IEditorPart openCurrentModelIntoEditor(IFile file) throws Exception {

		IProject project = file.getProject();

		if (project == null) {
			throw new Exception("No project associated to the file " + file.getName());
		}

		// Look inside the resources to find the model file. The extension of
		// that file should be
		// standard, but the model name could be different from the project
		// name.
		IFile modelFile = null;
		try {
			IResource[] resources = project.members();
			for (IResource iResource : resources) {
				if (iResource.getName().endsWith(modelExtension) && iResource.getType() == IResource.FILE) {
					modelFile = (IFile) iResource;
					break;
				}
			}
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

		if (modelFile == null) {
			throw new Exception("No model found in the project " + project.getName());

		}

		// Open the model file
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			return IDE.openEditor(page, modelFile, true);
		} catch (PartInitException e) {
		}

		return null;
	}

	public Model loadModel(String projectName, String fileName) {
		IWorkspaceRoot wRoot = ResourcesPlugin.getWorkspace().getRoot();
		logger.debug("wRoot: " + wRoot);

		IProject proj = wRoot.getProject(projectName);

		return loadModel(proj, fileName);
	}

	public Model loadModel(IProject proj, String fileName) {
		IFile file = proj.getFile(fileName);
		IPath loc = file.getLocation();
		logger.debug("loc: " + loc);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(loc.toString()), true);
		Model model = ResourceUtils.getModel(resource);
		return model;
	}

	/**
	 * Loads a package from the given resource.
	 * 
	 * @param uri
	 *            the URI of the resource to load
	 * @return the retrieved package
	 */
	public Package loadPackage(URI uri) {
		Package package_ = null;

		try {
			final ResourceSet resourceSet = new ResourceSetImpl();
			final Resource resource = resourceSet.getResource(uri, true);
			package_ = (Package) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PACKAGE);
		} catch (WrappedException we) {
			logger.error(we.getMessage());
			System.exit(1);
		}
		return package_;
	}

	/**
	 * Returns the Type Continuous.
	 * 
	 * @return the requested Type
	 */
	public Type getContinuousType() {

		if (chessContractLibrary == null) {
			chessContractLibrary = (Profile) loadPackage(
					URI.createURI("pathmap://CHESSContract/CHESSContract.profile.uml"));
		}

		// The Continuous type is defined here:
		// CHESSContract::DataTypes::Continuous
		// Get the correct package inside the profile
		final Package dataTypes = chessContractLibrary.getNestedPackage("DataTypes");

		// Get the correct type
		final Type type = dataTypes.getOwnedType("Continuous");

		if (type != null) {
			logger.debug("Type '" + type.getQualifiedName() + "' found.");
			return type;
		}
		return null;
	}

	/**
	 * Returns the primitive type from the standard primitive library.
	 * 
	 * @param name
	 *            the name of the Type
	 * @return the requested primitive type
	 */
	public Type getPrimitiveType(String name) {

		if (umlLibrary == null) {
			umlLibrary = (Model) loadPackage(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI));
		}

		// Get the correct type from the library
		final Type type = umlLibrary.getOwnedType(name);

		if (type != null) {
			logger.debug("Type '" + type.getQualifiedName() + "' found.");
			logger.debug("Type object'" + type + "' found.");
			return type;
		}
		return null;
	}

	/**
	 * Returns the delegation constraint with the given specs from a list
	 * 
	 * @param delegationConstraints
	 *            the list of delegation constraints to scan
	 * @param variable
	 *            variable part
	 * @param constraint
	 *            costraint part
	 * @return the delegation constraint, if found
	 */
	public Constraint getExistingDelegationConstraint(EList<Constraint> delegationConstraints, String variableIdText,
			String constraintText, String iterConditionText) {

		// Text of the delegation constraint
		final String formalPropertyText = createDelegationConstraintText(variableIdText, constraintText,
				iterConditionText);

		// Loop on all the delegation constraints to find one with same text
		for (Constraint delegationConstraint : delegationConstraints) {
			final LiteralString specification = (LiteralString) delegationConstraint.getSpecification();
			if (specification.getValue().equals(formalPropertyText)) {
				return delegationConstraint;
			}
		}
		return null;
	}

	/**
	 * Return the Parameter with the given speccs if present among a list of
	 * Parameters
	 * 
	 * @param parameters
	 *            the list of Parameters to scan
	 * @param type
	 *            the type of the Parameter
	 * @param isInput
	 *            the direction of the Parameter
	 * @return the Parameter, if found
	 */
	public Parameter getExistingFunctionBehaviorParameter(EList<Parameter> parameters, Type functionBehaviourType,
			boolean isInput) {
		for (Parameter parameter : parameters) {
			if (parameter.getType() == functionBehaviourType) {
				if ((isInput && parameter.getDirection() == ParameterDirectionKind.IN_LITERAL)
						|| (!isInput && parameter.getDirection() == ParameterDirectionKind.OUT_LITERAL)) {
					return parameter;
				}
			}
		}
		return null;
	}

	/**
	 * Returns the list of contract refinements associated to a Class
	 * 
	 * @param owner
	 *            the owner Class
	 * @return the list of contract refinements
	 */
	public EList<DataType> getDataTypes(Class owner) {
		EList<DataType> contractRefinements = new BasicEList<DataType>();

		for (Classifier classifier : owner.getNestedClassifiers()) {
			if (classifier instanceof DataType) {
				contractRefinements.add((DataType) classifier);
			}
		}
		return contractRefinements;
	}

	public Port getExistingUmlPort(String portName, EList<NamedElement> existingPorts) {
		for (Object object : existingPorts) {
			final Port tmpPort = (Port) object;
			if (tmpPort.getName().equals(portName)) {
				return tmpPort;
			}
		}
		return null;
	}

	public Port getExistingUmlPort(String portName, String typeName, EList<NamedElement> existingPorts) {
		for (Object object : existingPorts) {
			final Port tmpPort = (Port) object;
			if (tmpPort.getName().equals(portName) && tmpPort.getType().getName().equals(typeName)) {
				return tmpPort;
				// Port found
			}
		}
		return null;
	}

	public Stereotype findStereotype(Package pkg, String stereotypeName) {

		logger.debug("findStereotype " + stereotypeName);

		try {
			if (stereotypeName.startsWith("CHESSContract")) {
				return StereotypeUtil.getCHESSContractStereotype(stereotypeName, pkg);
			} else if (stereotypeName.startsWith("CHESS")) {
				return StereotypeUtil.getCHESSStereotype(stereotypeName, pkg);
			} else if (stereotypeName.startsWith("SysML")) {
				return StereotypeUtil.getSysMLStereotype(stereotypeName, pkg);
			} else if (stereotypeName.startsWith("MARTE")) {
				return StereotypeUtil.getMarteStereotype(stereotypeName, pkg);
			} else {
				for (Stereotype sub : UMLUtil.findSubstereotypes(pkg, stereotypeName)) {
					if (sub.getQualifiedName().equals(stereotypeName)) {
						return sub;
					}
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		/*
		 * for (Stereotype sub : UMLUtil.findSubstereotypes(pkg,
		 * stereotypeName)) { if (sub.getQualifiedName().equals(stereotypeName))
		 * { return sub; } } return null;
		 */
	}

	public void updateUmlStaticPort(Port port, String[] newMultiplicityRange) {
		final String[] multiplicityRange = getAttributeMultiplicity(port);

		// Update its multiplicity if needed
		if (!equalMultiplicityBoundaries(newMultiplicityRange, multiplicityRange)) {
			setAttributeMultiplicity(port, newMultiplicityRange);
		}
	}

	public void updateUmlNonStaticPort(Port port, Type newType, String[] newMultiplicityRange) {
		if (!port.getType().getName().equals(newType.getName())) {
			port.setType(newType);
		}

		// Update its multiplicity if needed
		final String[] multiplicityRange = getAttributeMultiplicity(port);
		if (!equalMultiplicityBoundaries(newMultiplicityRange, multiplicityRange)) {
			setAttributeMultiplicity(port, newMultiplicityRange);
		}

	}

	public FunctionBehavior createUmlFunctionBehaviour(Class owner, String functionBehaviourName,
			EList<Type> inputTypes, EList<String[]> inputMultiplicities, Type outputType, String[] outputMultiplicity) {

		// Create an empty functionBehavior
		FunctionBehavior functionBehavior = createFunctionBehavior(owner, functionBehaviourName);

		createUmlFunctionBehaviorParameters(functionBehavior, inputTypes, inputMultiplicities, outputType,
				outputMultiplicity);

		return functionBehavior;

	}

	public Parameter createUmlFunctionBehaviorParameters(FunctionBehavior owner, EList<Type> inputTypes,
			EList<String[]> inputMultiplicities, Type outputType, String[] outputMultiplicity) {

		// Create the input parameters
		for (int i = 0; i < inputTypes.size(); i++) {
			Type parameterType = inputTypes.get(i);
			String[] parameterMultiplicity = inputMultiplicities.get(i);
			createFunctionBehaviorParameter(owner, parameterType, parameterMultiplicity, true);
		}

		// Create the output parameter
		return createFunctionBehaviorParameter(owner, outputType, outputMultiplicity, false);
	}

	public Constraint createDelegationConstraint(Class owner, String variableIdText, String constraintText,
			String iterConditionText, Stereotype delegationConstraintStereotype) {

		String delegationName = DEFAULT_DELEGATION_PREFIX + variableIdText;

		logger.debug("\n\n\n Creating delegation constraint " + delegationName + " for owner " + owner);
		logger.debug("\n\n\n");

		final Constraint newUMLConstraint = owner.createOwnedRule(delegationName.toString());
		newUMLConstraint.applyStereotype(delegationConstraintStereotype);

		final LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setName(DEFAULT_DELEGATION_CONSTRAINT_LITERAL_STRING_NAME);

		final String formalPropertyText = createDelegationConstraintText(variableIdText, constraintText,
				iterConditionText);
		literalString.setValue(formalPropertyText);
		newUMLConstraint.setSpecification(literalString);

		logger.debug("\n\nCreated " + delegationName + " Delegation Constraint\n\n");
		return newUMLConstraint;
	}

	public Connector createUmlConnector(Class owner, String constraintName, Property partWithPortOfConstraint,
			Class portOwnerOfConstraint, String variableName, Property partWithPortOfVariable,
			Class portOwnerOfVariable) {
		// Create the source end

		// Create the name using an incremental value
		final String connectorName = DEFAULT_CONNECTOR_NAME + (owner.getOwnedConnectors().size() + 1);
		// Create a connector, but only after I'm sure it isn't
		// a delegation constraint

		logger.debug("\n\n\n Creating connector " + connectorName + " for owner " + owner);
		logger.debug("\n\n\n");
		Connector connector = createConnector(connectorName);
		logger.debug("Creating source end :" + constraintName);
		createUmlConnectorEnd(portOwnerOfConstraint, connector, constraintName, partWithPortOfConstraint);

		// Create the target end
		logger.debug("Creating source end :" + variableName);
		createUmlConnectorEnd(portOwnerOfVariable, connector, variableName, partWithPortOfVariable);

		// At last, add the connector to the owner
		addConnector(owner, connector);

		return connector;

	}

	/**
	 * Returns the System View package that is found in the given UML model.
	 * 
	 * @param umlModel
	 *            the model to use
	 * @return the package
	 */
	public Package getSystemView(UmlModel umlModel) {
		if (umlModel == null) {
			logger.error("No Models are open");
			return null;
		}

		logger.debug("UML Model name = " + umlModel.getIdentifier());

		TreeIterator<EObject> allElements = umlModel.getResource().getAllContents();

		if (allElements != null) {
			Collection<Package> packages = EcoreUtil.getObjectsByType(iterator2Collection(allElements),
					UMLPackage.eINSTANCE.getPackage());

			for (Package p : packages) {
				if (p.getAppliedStereotype(SYSVIEW) != null) {
					logger.debug("Found systemView!");
					return p;
				}
			}
		}
		logger.error("SystemView not found!");
		return null;
	}

	public Package getCurrentSystemView() {
		return getSystemView(UmlUtils.getUmlModel());
	}

	public Package createPackage(Package owner, final String elementName) {
		return owner.createNestedPackage(elementName);
	}

	public Comment createComment(Package owner, String content) {
		Comment comment = owner.createOwnedComment();
		comment.setBody(content);
		return comment;
	}

	public Dependency createDependency(Package owner, NamedElement supplierElement, NamedElement clientElement) {
		Dependency dependency = owner.createDependency(supplierElement);
		dependency.getClients().add(clientElement);
		return dependency;
	}

	public Property createInstantiatedArchitecture(Class owner, Class instantiatedRootComponent,
			ArrayList<String> parameters) {

		int numInstantiatedArchitecures = getInstantiatedArchitecureConfigurations(owner).size();

		Property property = owner.createOwnedAttribute("InstantiateArc_" + (numInstantiatedArchitecures + 1), null);
		UMLUtils.applyStereotype(property, INSTANTIATED_ARCHITECTURE_CONFIGURATION);
		InstantiatedArchitectureConfiguration instantiatedArchitecture = getInstantiatedArchitectureConfiguration(
				property);
		if (instantiatedRootComponent != null) {
			instantiatedArchitecture.setInstantiatedRootComponent(instantiatedRootComponent);
		}
		instantiatedArchitecture.getParameterList().addAll(parameters);
		return property;
	}

	public InstantiatedArchitectureConfiguration getInstantiatedArchitectureConfiguration(Property umlProperty) {
		Stereotype instantiatedArchitectureStereotype = // UMLUtil.getAppliedStereotype(umlProperty,
				// INSTANTIATED_ARCHITECTURE_CONFIGURATION, false);
				StereotypeUtil.getCHESSStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION, umlProperty);

		return (InstantiatedArchitectureConfiguration) umlProperty
				.getStereotypeApplication(instantiatedArchitectureStereotype);
	}

	public String getInstantiatedArchitectureConfigurationName(
			InstantiatedArchitectureConfiguration instantiatedArchitecture) {
		return instantiatedArchitecture.getBase_Property().getName();
	}

	/**
	 * Creates a Block element in the given package.
	 * 
	 * @param owner
	 *            the Package that will contain the element
	 * @param elementName
	 *            the name of the new Block
	 * @param blockStereotype
	 *            the stereotype of the Block element
	 * @return the newly created Class
	 */
	public Class createBlock(Package owner, final String elementName, Stereotype blockStereotype) {

		Class umlClass = owner.createOwnedClass(elementName, false);
		umlClass.applyStereotype(blockStereotype);

		// owner.createPackagedElement(elementName, newUMLClass.eClass()); This
		// also works...
		// owner.getPackagedElements().add(newUMLClass); // This works too!

		logger.debug("\n\nCreated " + elementName + " Block\n\n");
		return umlClass;
	}

	public Class createSystemBlock(Package owner, final String elementName, Stereotype blockStereotype,
			Stereotype sytemblockStereotype) {
		Class umlClass = createBlock(owner, elementName, blockStereotype);
		umlClass.applyStereotype(sytemblockStereotype);
		return umlClass;
	}

	private ConnectorEnd createUmlConnectorEnd(Class owner, Connector connector, String sourcePort,
			Property partWithPort) {

		// Get the port and set it
		ConnectableElement role = owner.getOwnedPort(sourcePort, null);

		if (role != null) {
			return createConnectorEnd(connector, partWithPort, role);
		}
		return null;
	}

	/**
	 * Creates a new BoundedSubType as requested.
	 * 
	 * @param pkg
	 *            the package where to create the Enumeration
	 * @param typeName
	 *            the name of the type
	 * @param lowerBound
	 *            the lower bound
	 * @param upperBound
	 *            the upper bound
	 * @return the created type
	 */
	public Type createBoundedSubType(Package pkg, String typeName, String lowerBoundValue, String upperBoundValue,
			Stereotype boundedTypeStereotype) {

		// Create a data type to the component view and apply the stereotype
		final Type dataType = pkg.createOwnedType(typeName, UMLPackage.Literals.DATA_TYPE);
		// Stereotype stereotype = UMLUtils.applyStereotype(dataType,
		// BOUNDED_TYPE);
		dataType.applyStereotype(boundedTypeStereotype);

		// Extract the stereotiped type and configure it
		// BoundedSubtype boundedType = (BoundedSubtype)
		// dataType.getStereotypeApplication(stereotype);
		final BoundedSubtype boundedType = (BoundedSubtype) dataType.getStereotypeApplication(boundedTypeStereotype);
		boundedType.setMinValue(lowerBoundValue);
		boundedType.setMaxValue(upperBoundValue);
		boundedType.setBaseType((DataType) getPrimitiveType("Integer"));
		// boundedType.setBaseType((DataType) getUMLPrimitiveType("Integer"));
		// // Alternative version

		logger.debug("Type '" + dataType.getQualifiedName() + "' created.");
		return dataType;
	}

	/**
	 * Creates a new Enumeration as requested.
	 * 
	 * @param owner
	 *            the package where to create the Enumeration
	 * @param enumType
	 *            the type specifying the values
	 * @return the created Enumeration
	 */
	public Enumeration createEnumerationFromEnumType(Package owner, Set<String> enumValues) {

		// Create the name using an incremental value
		final String enumerationName = DEFAULT_ENUMERATION_NAME + (getEnumerations(owner).size() + 1);

		final Enumeration enumeration = owner.createOwnedEnumeration(enumerationName);
		// final Set<String> values = getListValuesForEnumType(enumType);
		for (String string : enumValues) {
			enumeration.createOwnedLiteral(string);
		}

		logger.debug("Type '" + enumeration.getQualifiedName() + "' created.");
		return enumeration;
	}

	/**
	 * Retrieves all the Enumerations owned by the package.
	 * 
	 * @param pkg
	 *            the package to be searched
	 * @return
	 */
	public EList<Enumeration> getEnumerations(Package pkg) {
		final EList<Enumeration> enumerations = new BasicEList<Enumeration>();

		final EList<Type> types = pkg.getOwnedTypes();
		for (Type type : types) {
			if (type instanceof Enumeration) {
				enumerations.add((Enumeration) type);
			}
		}
		return enumerations;
	}

	/**
	 * Returns the first enumeration found with the given name in the package.
	 * 
	 * @param pkg
	 *            the package where to look for
	 * @param enumName
	 *            the name of the enumeration
	 * @param ignoreCase
	 * @return the Enumeration
	 */
	public Enumeration getEnumeration(Package pkg, String enumName, boolean ignoreCase) {
		return (Enumeration) pkg.getOwnedMember(enumName, ignoreCase,
				UMLFactory.eINSTANCE.createEnumeration().eClass());
	}

	public EList<Enumeration> getEnumerationsInOrder(Package pkg) {
		final EList<Enumeration> enumerations = getEnumerations(pkg);

		Collections.sort(enumerations, new Comparator<Enumeration>() {

			@Override
			public int compare(Enumeration o1, Enumeration o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		return enumerations;
	}

	/**
	 * Creates a Signal type in the given package.
	 * 
	 * @param owner
	 *            the package where to create the Enumeration
	 * @return the newly created type
	 */
	public Signal createSignalType(Package owner) {
		final String signalName = DEFAULT_SIGNAL_NAME;

		final Type type = owner.createOwnedType(signalName, UMLPackage.Literals.SIGNAL);

		logger.debug("Type '" + type.getQualifiedName() + "' created.");
		return (Signal) type;
	}

	/**
	 * Looks for a Signal already defined in the package.
	 * 
	 * @param pkg
	 *            the package in which look for the Signal
	 * @return the Signal already defined
	 */
	public Signal getExistingSignalType(Package pkg) {
		final EList<Type> types = pkg.getOwnedTypes();

		for (Type type : types) {
			if (type instanceof Signal) {
				return (Signal) type;
			}
		}
		return null;
	}

	/**
	 * Looks for a specific enumeration among existing enumerations of the given
	 * package.
	 * 
	 * @param pkg
	 *            the package in which look for the Enumeration
	 * @param enumValues
	 *            the values that the enumeration should contain
	 * @return the enumeration already defined
	 */
	public Enumeration getExistingEnumerationForEnumType(Package pkg, Set<String> enumValues) {
		final EList<Enumeration> enumerations = getEnumerations(pkg);

		if (enumerations.size() > 0) {

			for (Enumeration enumeration : enumerations) {
				if (enumValues.equals(getListValuesForEnumeration(enumeration))) {
					return enumeration;
				}
			}
		}
		return null;
	}

	/**
	 * Returns a Signal as requested (Only a Signal can be defined in the
	 * package).
	 * 
	 * @param pkg
	 *            the package where to look for or create the new type
	 * @return the requested type
	 */
	public Type getOrCreateSignalType(Package pkg) {

		// Look for existing Signal Type in the package
		final Type type = getExistingSignalType(pkg);

		if (type != null) {

			// The type has been found in the package, use it
			logger.debug("Type '" + type.getQualifiedName() + "' found.");
			return type;
		} else {
			return createSignalType(pkg);
		}
	}

	public Type getOrCreateEnumerationType(Set<String> enumValues, Package pkg) {

		// Look for existing Enumerations in the package
		final Type type = getExistingEnumerationForEnumType(pkg, enumValues);

		if (type != null) {

			// The type has been found in the package, use it
			logger.debug("Type '" + type.getQualifiedName() + "' found.");
			return type;
		} else {
			return createEnumerationFromEnumType(pkg, enumValues);
		}
	}

	public Type getOrCreateBoundedSubType(String[] boundaries, Package pkg, Stereotype boundedTypeStereotype) {

		String lowerBound = boundaries[0];
		String upperBound = boundaries[1];
		// Generate a suitable type name
		final String typeName = DEFAULT_BOUNDEDTYPE_NAME + lowerBound + "_" + upperBound;

		return getOrCreateBoundedSubType(typeName, pkg, lowerBound, upperBound, boundedTypeStereotype);
	}

	public Type getOrCreateBoundedSubType(String typeName, Package pkg, String lowerBoundValue, String upperBoundValue,
			Stereotype boundedTypeStereotype) {
		// Look for that type in the ComponentView
		Type type = pkg.getOwnedType(typeName);
		if (type != null) {

			// The type has been found in the package, use it
			logger.debug("Type '" + type.getQualifiedName() + "' found.");
			return type;
		} else {
			return (Type) createBoundedSubType(pkg, typeName, lowerBoundValue, upperBoundValue, boundedTypeStereotype);
		}
	}

	/**
	 * Returns the list of the values inside a given Enumeration.
	 * 
	 * @param enumeration
	 *            the Enumeration to be analysed
	 * @return the list of contained values
	 */
	private Set<String> getListValuesForEnumeration(Enumeration enumeration) {
		final Set<String> enumValuesNames = new TreeSet<String>(); // Ordered
																	// list of
																	// values
		// Set<String> enumValuesNames = new HashSet<String>(); // Original
		// order of values

		for (EnumerationLiteral enumLit : enumeration.getOwnedLiterals()) {
			enumValuesNames.add(enumLit.getName());
		}
		return enumValuesNames;
	}

	public String getFormalPropertyStr(FormalProperty formalProperty, String language) {

		String str = null;
		if (formalProperty != null) {
			str = getConstraintBodyStr(formalProperty.getBase_Constraint(), language);
		}
		return str;
	}

	public void updateUmlAssociation(Property componentInstance, Type newType, String[] newMultiplicity)
			throws Exception {
		// The component instance is already present, update its
		// type if needed
		if (!componentInstance.getType().equals(newType)) {
			componentInstance.setType(newType);

			// Add the association to the list of changes, it
			// needs to be redrawn
			// addedElements.add(componentInstance.getAssociation());
		}

		String[] componentInstanceMultiplicity = getComponentInstanceMultiplicity(componentInstance);

		if (!equalMultiplicityBoundaries(componentInstanceMultiplicity, newMultiplicity)) {
			setAttributeMultiplicity(componentInstance, newMultiplicity);
		}

	}

	public void updateUmlConstraint(Constraint umlConstraint, String updatedText, String language) {
		final String formalPropertyText = getConstraintBodyStr(umlConstraint, language);

		// If the expression is different, save it,
		// otherwise go on
		if (!updatedText.equals(formalPropertyText)) {
			setTextInUMLConstraint(umlConstraint, updatedText, language);
		}
	}

	public String getConstraintBodyStr(Constraint formalProperty, String language) {

		String str = null;
		if (formalProperty != null) {
			if (formalProperty.getSpecification() != null) {
				if (formalProperty.getSpecification() instanceof LiteralString) {
					str = formalProperty.getSpecification().stringValue();
				} else if (formalProperty.getSpecification() instanceof OpaqueExpression) {
					str = getBodyForLanguageOfBodyOwner((OpaqueExpression) formalProperty.getSpecification(), language);
				}

			}
		}
		// logger.debug("getFormalPropertyStr: "+str);

		return str;
	}

	/**
	 * Returns the component instance with the given name.
	 * 
	 * @param owner
	 *            the class owning the instance
	 * @param componentName
	 *            the name of the instance
	 * @return the UML property representing the component instance
	 */
	public Property getSubComponentInstance(Class owner, String componentName) {
		// logger.debug("getSubComponentInstance");
		for (Property umlProperty : (owner.getAttributes())) {
			//FIXME stereotype
			// logger.debug("umlProperty: " + umlProperty);
			// logger.debug("umlProperty.getname: " + umlProperty.getName());
			if (umlProperty.getName().equals(componentName) && isComponentInstance(umlProperty)) {
				return umlProperty;
			}
		}
		return null;
	}

	public String getSystemElementURIFragment(Model model) throws Exception {

		if (model != null) {
			TreeIterator<EObject> allElements = model.eResource().getAllContents();
			if (allElements != null) {
				Collection<Class> classes = EcoreUtil.getObjectsByType(iterator2Collection(allElements),
						UMLPackage.eINSTANCE.getClass_());

				for (Class c : classes) {
					if (isSystem(c)) {
						return c.eResource().getURIFragment(c);
					}
				}
			}
		}
		throw new Exception("Element does not exist.");
	}

	public String getSystemViewPackageURIFragment(Model model) throws Exception {

		Package p = getSystemViewPackage(model);
		return p.eResource().getURIFragment(p);

	}

	public Package getSystemViewPackage(Model model) throws Exception {

		if (model != null) {
			TreeIterator<EObject> allElements = model.eResource().getAllContents();
			if (allElements != null) {
				Collection<org.eclipse.uml2.uml.Package> packages = EcoreUtil
						.getObjectsByType(iterator2Collection(allElements), UMLPackage.eINSTANCE.getPackage());

				for (Package p : packages) {
					//FIXME stereotype
					if (isSystemViewPackage(p)) {
						return p;
					}
				}
			}
		}
		throw new Exception("Element does not exist.");
	}

	public EObject getElement(String projectName, String umlFileModelName, String elementID) throws Exception {

		Model model = loadModel(projectName, umlFileModelName);
		return getElement(model, elementID);

	}

	public EObject getElement(Model model, String elementURI) throws Exception {

		if (model != null) {
			/*
			 * TreeIterator<EObject> allElements =
			 * model.eResource().getAllContents(); while(allElements.hasNext()){
			 * logger.debug("URI  fragment: "+allElements.next().eResource().
			 * getURI().fragment()); }
			 */
			EObject umlElement = model.eResource().getEObject(elementURI.trim());
			return umlElement;
		}

		return null;

	}

	public String getUmlElementName(String projectName, String fileModelPath, String elementID) throws Exception {

		Model model = loadModel(projectName, fileModelPath);

		if (model != null) {
			EObject umlElement = model.eResource().getEObject(elementID.trim());
			return ((Class) umlElement).getName();
		}

		return null;

	}

	public EList<Element> getSubComponentsOfOwner(Constraint constraint) {
		Element element = constraint.getOwner();
		EList<Element> subComponents = new BasicEList<Element>();

		for (Property umlProperty : getSubComponentsInstances((Class) element)) {
			subComponents.add(getUmlType(umlProperty));
		}

		return subComponents;
	}

	public Element getSubComponent(Element element, String componentName) {

		for (Property umlProperty : getSubComponentsInstances((Class) element)) {
			if (umlProperty.getName().compareTo(componentName) == 0) {
				return getUmlType(umlProperty);
			}
		}

		return null;
	}

	public String[] getSubComponentsNameOfConstraintOwner(Constraint constraint) {
		Element umlElement = constraint.getOwner();
		Set<String> subCompArr = getSubComponentsNames((Class) umlElement);
		return toArray(subCompArr);
	}

	private String[] toArray(Set<String> set) {
		String[] strArray = new String[set.size()];
		return set.toArray(strArray);
	}

	private String[] toArray(EList<String> eList) {
		String[] strArray = new String[eList.size()];
		return eList.toArray(strArray);
	}

	public String getQualifiedName(NamedElement element) {
		return ((NamedElement) element).getQualifiedName();
	}

	public String getComponentName(Element umlComponent) {

		if ((isBlock(umlComponent))) {
			return ((Class) umlComponent).getName();
		}

		if (isComponentInstance((Element) umlComponent)) {
			return (((Property) umlComponent).getName());
		}

		return null;
	}

	public EList<Property> getInstantiatedArchitecureElementsAsProperties(Class umlComponent) {
		EList<Property> instantiatedArchitecureList = new BasicEList<Property>();
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION, umlComponent);
		for (Property umlProperty : ((Class) umlComponent).getAttributes()) {
			if ((umlProperty.getAppliedStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION)!=null)) {
				instantiatedArchitecureList.add(umlProperty);
			}
		}
		return instantiatedArchitecureList;
	}

	public EList<InstantiatedArchitectureConfiguration> getInstantiatedArchitecureConfigurations(Class umlComponent) {
		EList<InstantiatedArchitectureConfiguration> instantiatedArchitecureList = new BasicEList<InstantiatedArchitectureConfiguration>();
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION, umlComponent);
		for (Property umlProperty : ((Class) umlComponent).getAttributes()) {
			if ((umlProperty.getAppliedStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION)!=null)) {
				instantiatedArchitecureList.add(getInstantiatedArchitectureConfiguration(umlProperty));
			}
		}
		return instantiatedArchitecureList;
	}

	public List<Property> getSubComponentsInstances(Class umlComponent) {
		List<Property> subComponents = new ArrayList<Property>();
		EList<Property> umlProperties = ((Class) umlComponent).getAttributes();
		if (umlProperties != null) {
			//FIXME stereotype
			for (Property umlProperty : umlProperties) {
				if (isComponentInstance(umlProperty)) {
					subComponents.add(umlProperty);
				}
			}
		}
		return subComponents;
	}

	/**
	 * Returns the component instance with the given name.
	 * 
	 * @param umlComponent
	 *            the class owning the instance
	 * @param componentName
	 *            the name of the instance
	 * @return the UML property representing the component instance
	 */
	public Property getUmlComponentInstance(Class umlComponent, String componentName) {

		for (Property umlProperty : (umlComponent.getAttributes())) {
			//FIXME stereotype
			if (umlProperty.getName().equals(componentName) && isComponentInstance(umlProperty)) {
				return umlProperty;
			}
		}
		return null;
	}

	public String[] getEnumValuesFromComponentPorts(Class umlComponent) {
		EList<String> enumValuesEList = new BasicEList<String>();

		for (Port port : getUmlPortsFromClass(umlComponent)) {
			if (isEnumerationAttribute(port)) {
				Set<String> currValues = getListValuesForEnumeratorType(port.getType());
				enumValuesEList.addAll(currValues);
			}
		}

		return toArray(enumValuesEList);
	}

	public EList<String> getEnumValuesFromComponentAttributes(Element umlComponent) {
		EList<String> enumValuesEList = new BasicEList<String>();

		if (isComponentInstance(umlComponent)) {
			umlComponent = getUmlType((Property) umlComponent);
		}

		if (isBlock(umlComponent) || (isCompType(umlComponent) || (isComponentImplementation(umlComponent)))) {
			Class umlClass = (Class) umlComponent;

			for (Property umlProperty : umlClass.getOwnedAttributes()) {

				if (isEnumerationAttribute(umlProperty)) {
					Set<String> currValues = getListValuesForEnumeratorType(umlProperty.getType());
					if (currValues != null) {
						enumValuesEList.addAll(currValues);
					}
				}
			}

			EList<FunctionBehavior> functionBehaviors = getUmlFunctionBehaviors(umlClass);
			if (functionBehaviors != null) {
				for (FunctionBehavior functionBehavior : functionBehaviors) {
					for (Parameter parameter : functionBehavior.inputParameters()) {
						Set<String> currValues = getListValuesForEnumeratorType(parameter.getType());
						if (currValues != null) {
							enumValuesEList.addAll(currValues);
						}
					}
					for (Parameter parameter : functionBehavior.outputParameters()) {
						Set<String> currValues = getListValuesForEnumeratorType(parameter.getType());
						if (currValues != null) {
							enumValuesEList.addAll(currValues);
						}
					}
				}
			}
		}

		return enumValuesEList;
		// return toArray(enumValuesEList);
	}

	/**
	 * Returns the blocks contained in the given package.
	 * 
	 * @param umlSelectedPackage
	 *            the package to browse
	 * @return the list of blocks
	 */
	public ArrayList<Class> getBlocks(Package umlSelectedPackage) {
		final EList<Element> packageChildren = umlSelectedPackage.getOwnedElements();

		ArrayList<Class> blocksAsClasses = new ArrayList<Class>();

		if (!packageChildren.isEmpty()) {
			
			//Stereotype stereotype = StereotypeUtil.getSysMLStereotype(BLOCK, umlSelectedPackage);
			//Stereotype stereotype2 = StereotypeUtil.getCHESSContractStereotype(ContractEntityUtil.CONTRACT, umlSelectedPackage);
			blocksAsClasses = new ArrayList<Class>();
			for (Element element : packageChildren) {
				if ((element.getAppliedStereotype(BLOCK)!=null) && (element.getAppliedStereotype(ContractEntityUtil.CONTRACT)==null)) {
					blocksAsClasses.add((Class) element);
				}
			}
		}
		return blocksAsClasses;
	};

	public Set<String> getSubComponentsNames(Class umlComponent) {

		Set<String> subComponentsNames = new HashSet<String>();
		for (Property umlProperty : getSubComponentsInstances(umlComponent)) {
			subComponentsNames.add((umlProperty).getName());
		}
		return subComponentsNames;
	}

	public String[] getSubComponentsName(Class umlComponent) {
		return toArray(getSubComponentsNames(umlComponent));
	}

	public EList<Port> getUmlPorts(Element umlElement, boolean isStaticPort) {
		EList<Port> portsArr = new BasicEList<Port>();
		if (isBlock(umlElement) || isCompType(umlElement) || isComponentImplementation(umlElement)) {
			portsArr.addAll(getUmlPortsFromClass((Class) umlElement, isStaticPort));
		}

		if (isComponentInstance(umlElement)) {
			portsArr.addAll(getUmlPortsFromProperty((Property) umlElement, isStaticPort));
		}
		return portsArr;
	}

	private EList<Port> getUmlPortsFromProperty(Property umlElement, boolean isStaticPort) {
		return getUmlPortsFromClass((Class) getUmlType((Property) umlElement), isStaticPort);
	}

	/*
	 * private EList<Port> getUMLPortsFromProperty(Element umlElement, int
	 * portDirection, boolean isStaticPort) { return
	 * getUMLPortsFromClass((Class)getUMLType((Property)
	 * umlElement),portDirection,isStaticPort); }
	 */

	public EList<Port> getUmlPorts(Element umlElement, int portDirection, boolean isStaticPort) {
		EList<Port> portsArr = new BasicEList<Port>();
		if (isBlock(umlElement)) {
			portsArr.addAll(getUmlPortsFromClass((Class) umlElement, portDirection, isStaticPort));
		}

		if (isCompType(umlElement) || (isComponentImplementation(umlElement))) {
			portsArr.addAll(getUmlPortsFromComponent((Component) umlElement, portDirection, isStaticPort));
		}

		if (isComponentInstance(umlElement)) {
			portsArr.addAll(getUmlPorts(getUmlType((Property) umlElement), portDirection, isStaticPort));
		}
		return portsArr;

	}

	private EList<Port> getUmlPortsFromClass(Class umlComponent, int portDirection, boolean isStatic) {
		EList<Port> ports = new BasicEList<Port>();
		Stereotype stereotype = StereotypeUtil.getSysMLStereotype(FLOW_Port, umlComponent);
		for (Port umlPort : umlComponent.getOwnedPorts()) {
			FlowPort fp =  (FlowPort) umlPort.getStereotypeApplication(stereotype);
			if ((fp.getDirection().getValue() == portDirection) && (umlPort.isStatic() == isStatic)) {
				ports.add(umlPort);
			}
		}
		return ports;
	}

	public boolean isInputPort(Element umlPort) {
		return (umlPort instanceof Property && getPortDirection(umlPort) != null
				&& getPortDirection(umlPort) == FlowDirection.IN_VALUE);
	}

	public boolean isInOutPort(Element umlPort) {
		return (umlPort instanceof Property && getPortDirection(umlPort) != null
				&& getPortDirection(umlPort) == FlowDirection.INOUT_VALUE);
	}

	public boolean isOutputPort(Element umlPort) {
		return (umlPort instanceof Property && getPortDirection(umlPort) != null
				&& getPortDirection(umlPort) == FlowDirection.OUT_VALUE);
	}

	public Integer getPortDirection(Element umlPort) {
		if (isFlowPort(umlPort)) {
			return ((FlowPort) getFlowPort((Port) umlPort)).getDirection().getValue();
		} else if (isFlowPortMarte(umlPort)) {
			return ((org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowPort) getFlowPortMarte((Port) umlPort))
					.getDirection().getValue();
		} else {
			return null;
		}
	}

	private Set<Port> getUmlPortsFromComponent(Component umlComponent, int portDirection, boolean isStaticPort) {
		Set<Port> ports = new HashSet<Port>();
		Stereotype stereotype = StereotypeUtil.getMarteStereotype(FLOW_Port_MARTE, umlComponent);
		for (Port umlPort : umlComponent.getOwnedPorts()) {
			org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowPort fp = (org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowPort) umlPort.getStereotypeApplication(stereotype);
			if ((fp.getDirection().getValue() == portDirection) && (umlPort.isStatic() == isStaticPort)) {
				ports.add(umlPort);
			}
		}
		return ports;
	}

	private EList<Port> getUmlPortsFromClass(Class umlComponent, boolean isStaticPort) {
		EList<Port> ports = new BasicEList<Port>();
		for (Port umlPort : umlComponent.getOwnedPorts()) {
			if (umlPort.isStatic() == isStaticPort) {
				ports.add(umlPort);
			}
		}
		return ports;
	}

	private Set<Port> getUmlPortsFromClass(Class umlComponent) {
		Set<Port> ports = new HashSet<Port>();
		for (Port umlPort : umlComponent.getOwnedPorts()) {
			ports.add(umlPort);
		}
		return ports;
	}

	/*
	 * private Set<Port> getUmlPortsFromComponent(Component umlComponent) {
	 * Set<Port> ports = new HashSet<Port>();
	 * 
	 * for (Port umlPort : umlComponent.getOwnedPorts()) { ports.add(umlPort); }
	 * return ports; }
	 */

	public Package getToPackage(Element umlElememt) {

		Package tmp = umlElememt.getNearestPackage();
		while (tmp.getOwner() != null && (tmp.getOwner() instanceof Package)) {
			tmp = (Package) tmp.getOwner();
		}
		return tmp;
	}

	/**
	 * Returns the package containing the given element.
	 * 
	 * @param umlElement
	 *            the UML element
	 * @return the Package
	 */
	public Package getContainingPackage(Element umlElement) {
		return umlElement.getNearestPackage();
	}

	private FlowPort getFlowPort(Port umlPort) {
		Stereotype stereotype = StereotypeUtil.getSysMLStereotype(FLOW_Port, umlPort);
		// Stereotype contrStereo = UMLUtil.getAppliedStereotype(umlPort,
		// FLOW_Port, false);
		return (FlowPort) umlPort.getStereotypeApplication(stereotype);

	}

	private org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowPort getFlowPortMarte(Port umlPort) {
		Stereotype stereotype = StereotypeUtil.getMarteStereotype(FLOW_Port_MARTE, umlPort);
		// Stereotype flowPortStereo = UMLUtil.getAppliedStereotype(umlPort,
		// FLOW_Port_MARTE, false);
		return (org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowPort) umlPort.getStereotypeApplication(stereotype);
	}

	public boolean isPort(Element umlElement) {
		return ((umlElement instanceof Property) && (isFlowPort(umlElement) || isFlowPortMarte(umlElement)));
	}

	private boolean isFlowPort(Element umlElement) {
		//Stereotype stereotype = StereotypeUtil.getSysMLStereotype(FLOW_Port, umlElement);
		return (umlElement instanceof Property && (umlElement.getAppliedStereotype(FLOW_Port)!=null));
	}

	private boolean isFlowPortMarte(Element umlElement) {
		//Stereotype stereotype = StereotypeUtil.getMarteStereotype(FLOW_Port_MARTE, umlElement);
		return (umlElement instanceof Property && (umlElement.getAppliedStereotype(FLOW_Port_MARTE)!=null));
	}

	public void deleteComponentContract(Class clazz) {
		clazz.destroy();
	}

	public boolean isComponentImplementation(Element umlElement) {
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(COMP_IMPL, umlElement);
		return (umlElement instanceof Class && (umlElement.getAppliedStereotype(COMP_IMPL)!=null));
	}

	public boolean isInstantiatedArchitecuture(Element umlElement) {
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION, umlElement);
		return (umlElement instanceof Property && (umlElement.getAppliedStereotype(INSTANTIATED_ARCHITECTURE_CONFIGURATION)!=null));
	}

	// modified method!!
	public boolean isComponentInstance(Element umlProperty) {
		// return UMLUtil.getAppliedStereotype(umlProperty, COMP_INST, false) !=
		// null;
		if (!(umlProperty instanceof Property)) {
			return false;
		}

		Property property = (Property) umlProperty;

		if (property.getAssociation() == null) {
			return false;
		}

		if (ContractEntityUtil.getInstance().isContractProperty(property)) {
			return false;
		}

		if (isInstantiatedArchitecuture(property)) {
			return false;
		}

		Element owner = (getOwner(umlProperty));
		Association association = property.getAssociation();
		int associationEndsSize = association.getEndTypes().size();
		if (associationEndsSize != 2) {
			return false;
		}
		boolean End1TypeIsOwner = association.getEndTypes().get(0).equals(owner);
		boolean End2TypeIsOwner = association.getEndTypes().get(1).equals(owner);

		return (associationEndsSize == 2) && ((End1TypeIsOwner) || (End2TypeIsOwner));

		// Type umlPropertyType = ((Property) umlProperty).getType();
		// return (isBlock(umlPropertyType) ||
		// isComponentImplementation(umlPropertyType));
	}

	public boolean isBooleanAttribute(Property umlProperty) {
		return isBooleanType(umlProperty.getType());
	}

	public boolean isBooleanType(Type type) {
		if (type != null) {
			return ((type.getQualifiedName().compareTo(BOOLEAN_TYPE) == 0)
					|| (type.getQualifiedName().compareTo(MARTE_BOOLEAN_TYPE) == 0));
		}
		return false;
	}

	/*
	 * public String[] getLowerUpperBoundsForRangeType(Property umlProperty) {
	 * return getLowerUpperBoundsForRangeType(umlProperty.getType()); }
	 */

	public String[] getLowerUpperBoundsForRangeType(Type umlType) {
		BoundedSubtype boundedSubtype = getRangeAttribute(umlType);
		String[] bounds = { boundedSubtype.getMinValue(), boundedSubtype.getMaxValue() };

		return bounds;
	}

	private BoundedSubtype getRangeAttribute(Type umlType) {
		// Stereotype boundedStereo = UMLUtil.getAppliedStereotype(umlType,
		// BOUNDED_TYPE, false);
		Stereotype stereotype = StereotypeUtil.getMarteStereotype(BOUNDED_TYPE, umlType);
		return (BoundedSubtype) umlType.getStereotypeApplication(stereotype);
	}

	public boolean isRangeAttribute(Property umlProperty) {
		return isRangeType(umlProperty.getType());
	}

	public boolean isRangeType(Type umlType) {		
		if (umlType != null) {
			//Stereotype stereotype = StereotypeUtil.getMarteStereotype(BOUNDED_TYPE, umlType);
			if ((umlType.getAppliedStereotype(BOUNDED_TYPE)!=null)) {
				return true;
			}
		}
		return false;
	}

	public boolean isDoubleAttribute(Property umlProperty) {
		if (umlProperty.getType() != null) {
			return (umlProperty.getType().getName().compareTo("Double") == 0);
		}
		return false;
	}

	public boolean isStringAttribute(Property umlProperty) {
		return isStringType(umlProperty.getType());
	}

	public boolean isRealAttribute(Property umlProperty) {
		return isRealType(umlProperty.getType());
	}

	public boolean isIntegerAttribute(Property umlProperty) {
		return isIntegerType(umlProperty.getType());
	}

	public boolean isContinuousAttribute(Property umlProperty) {
		if (umlProperty.getType() != null) {
			return isContinuousType(umlProperty.getType());
		}
		return false;
	}

	public boolean isContinuousType(Type type) {
		if (type != null) {
			return type.getQualifiedName().compareTo(CHESS_CONTINUOUS_TYPE) == 0;
		} else
			return false;
	}

	public Type getAttributeType(Property umlProperty) {
		return (umlProperty.getType());
	}

	public boolean isEnumerationAttribute(Property umlProperty) {
		return isEnumerationType(umlProperty.getType());
	}

	public boolean isEnumerationType(Type umlType) {
		if (umlType != null) {
			return (umlType instanceof Enumeration);
		}
		return false;
	}

	public Set<String> getListValuesForEnumeratorType(Type umlType) {
		Set<String> enumValuesNames = new HashSet<String>();
		if (umlType instanceof Enumeration) {
			for (EnumerationLiteral enumLit : ((Enumeration) umlType).getOwnedLiterals()) {
				enumValuesNames.add(enumLit.getName());
			}
			return enumValuesNames;

		}
		return null;
	}

	public boolean isEnumValue(String value, Type umlType) {

		if (umlType instanceof Enumeration) {
			return getListValuesForEnumeratorType(umlType).contains(value);
		}
		return false;
	}

	public String[] getValuesForEnumeratorType(Type umlType) {
		Set<String> enumValuesNames = getListValuesForEnumeratorType(umlType);
		if (enumValuesNames != null) {
			return toArray(enumValuesNames);
		}
		return null;
	}

	public Element getUmlType(Property umlProperty) {
		return ((Element) umlProperty.getType());
	}

	public boolean isBlock(Element umlClass) {
		if(umlClass instanceof Class){
		//Stereotype stereotype = StereotypeUtil.getSysMLStereotype(BLOCK, umlClass);
		return (umlClass.getAppliedStereotype(BLOCK)!=null);
		}
		return false;
		}

	public boolean isCompType(Element umlComponent) {
		if(umlComponent instanceof Class){
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(COMP_TYPE, umlComponent);
		return (umlComponent.getAppliedStereotype(COMP_TYPE)!=null);
		}
		return false;
	}

	public boolean isSystem(Element umlElement) {
		if(umlElement instanceof Class){
		//Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(SYSTEM, umlElement);
		return (umlElement.getAppliedStereotype(SYSTEM)!=null);
		}
		return false;
	}

	public boolean isFaultyStateMachine(Element umlElement) {
		if(umlElement instanceof StateMachine){
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(FAULTY_STATE_MACHINE, umlElement);
		return (umlElement.getAppliedStereotype(FAULTY_STATE_MACHINE)!=null);
		}
		return false;
	}

	public boolean isNominalStateMachine(Element umlElement) {
		if(umlElement instanceof StateMachine){
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(FAULTY_STATE_MACHINE, umlElement);
		return (umlElement.getAppliedStereotype(FAULTY_STATE_MACHINE)==null);
		}
		return false;
	}

	public boolean isPrioritizedTransition(Element umlElement) {
		if(umlElement instanceof Transition){
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(PRIORITIZED_TRANSITION, umlElement);
		return (umlElement.getAppliedStereotype(PRIORITIZED_TRANSITION)!=null);
		}
		return false;
	}

	/*
	 * public void saveConstraint(final Constraint constraint, final String
	 * text) {
	 * 
	 * TransactionalEditingDomain domain =
	 * TransactionUtil.getEditingDomain(constraint);
	 * domain.getCommandStack().execute(new RecordingCommand(domain) {
	 * 
	 * @Override protected void doExecute() {
	 * 
	 * LiteralString litString = (LiteralString) constraint.getSpecification();
	 * litString.setValue(text); constraint.setSpecification(litString); } }); }
	 */

	public Element getOwner(Element umlElement) {
		return umlElement.getOwner();
	}

	public String getName(Class umlClass) {
		return umlClass.getName();
	}

	public String[] getPortsNames(Element umlElement, int portDirection, boolean isStaticPort) {
		EList<String> portsNames = new BasicEList<String>();

		for (Port umlPort : getUmlPorts(umlElement, portDirection, isStaticPort)) {
			portsNames.add(umlPort.getName());
		}

		return toArray(portsNames);
	}

	public EList<String> getPortsName(EList<Port> ports) {
		EList<String> portsNames = new BasicEList<String>();

		for (Port umlPort : ports) {
			portsNames.add(umlPort.getName());
		}
		return portsNames;
	}

	public String[] getInputPortsNames(Element umlElement, boolean isStaticPort) {
		return getPortsNames(umlElement, FlowDirection.IN_VALUE, isStaticPort);
	}

	public String[] getOutputPortsNames(Element umlElement, boolean isStaticPort) {
		return getPortsNames(umlElement, FlowDirection.OUT_VALUE, isStaticPort);
	}

	public String[] getInputOutputPortsNames(Element umlElement, boolean isStaticPort) {
		return getPortsNames(umlElement, FlowDirection.INOUT_VALUE, isStaticPort);
	}

	public Set<Property> getSupportedAttributes(Element umlElement, Boolean isStaticAttribute) {
		Set<Property> simpleAttributes = new HashSet<Property>();

		if (isComponentInstance(umlElement)) {
			umlElement = getUmlType((Property) umlElement);
		}

		if (isBlock(umlElement) || (isCompType(umlElement) || (isComponentImplementation(umlElement)))) {
			Class umlClass = (Class) umlElement;
			for (Property umlProperty : umlClass.getOwnedAttributes()) {
				if ((isStaticAttribute == null) || (umlProperty.isStatic() == isStaticAttribute)) {
					if (isBooleanAttribute(umlProperty) || isContinuousAttribute(umlProperty)
							|| isDoubleAttribute(umlProperty) || isRangeAttribute(umlProperty)
							|| isEnumerationAttribute(umlProperty) || isIntegerAttribute(umlProperty)
							|| isRealAttribute(umlProperty) || isStringAttribute(umlProperty)) {
						simpleAttributes.add(umlProperty);
					} /*
						 * else if (isContinuousAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }else if
						 * (isDoubleAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }else if
						 * (isRangeAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }else if
						 * (isEnumerationAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }else if
						 * (isIntegerAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }else if
						 * (isRealAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }else if
						 * (isStringAttribute(umlProperty)) {
						 * simpleAttributes.add(umlProperty); }
						 */
				}
			}
		}

		return simpleAttributes;
	}

	private Set<Property> getIntegerAttributes(Element umlElement) {
		Set<Property> integerAttributes = new HashSet<Property>();

		if (isBlock(umlElement) || (isCompType(umlElement) || (isComponentImplementation(umlElement)))) {
			Class umlClass = (Class) umlElement;
			EList<Property> attributes = umlClass.getOwnedAttributes();
			for (Property umlProperty : attributes) {
				if (isIntegerAttribute(umlProperty)) {
					integerAttributes.add(umlProperty);
				}
			}
		}

		if (isComponentInstance(umlElement)) {
			integerAttributes.addAll(getIntegerAttributes(getUmlType((Property) umlElement)));
		}
		return integerAttributes;
	}

	public Set<Property> getAttributesExceptPorts(Element umlElement, Boolean isStaticAttribute) {
		Set<Property> attributes = new HashSet<Property>();
		for (Property umlProperty : getSupportedAttributes(umlElement, isStaticAttribute)) {
			if (!isPort(umlProperty)) {
				attributes.add(umlProperty);
			}
		}
		return attributes;
	}

	public Set<Property> getIntegerAttributesExceptPorts(Element umlElement) {
		Set<Property> integerAttributes = new HashSet<Property>();
		for (Property umlProperty : getIntegerAttributes(umlElement)) {
			if (!isPort(umlProperty)) {
				integerAttributes.add(umlProperty);
			}
		}
		return integerAttributes;
	}

	public Collection<StateMachine> getNominalStateMachines() {

		UmlModel umlModel = UmlUtils.getUmlModel();
		Set<StateMachine> stateMachines = getNominalStateMachines(umlModel);
		return stateMachines;

	}

	public Set<StateMachine> getNominalStateMachines(Model umlModel) {

		Set<StateMachine> stateMachines = new HashSet<StateMachine>();

		if (umlModel != null) {
			TreeIterator<EObject> allElements = umlModel.eResource().getAllContents();
			//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(FAULTY_STATE_MACHINE, umlModel);
			if (allElements != null) {
				Collection<org.eclipse.uml2.uml.Class> classes = EcoreUtil
						.getObjectsByType(iterator2Collection(allElements), UMLPackage.eINSTANCE.getClass_());
				for (Class c : classes) {
					if ((c instanceof StateMachine) && (c.getAppliedStereotype(FAULTY_STATE_MACHINE)==null)) {
						stateMachines.add((StateMachine) c);
					}
				}
			}
		}

		return stateMachines;
	}

	public Set<StateMachine> getNominalStateMachines(UmlModel umlModel) {

		Set<StateMachine> stateMachines = new HashSet<StateMachine>();

		if (umlModel != null) {
			TreeIterator<EObject> allElements = umlModel.getResource().getAllContents();
			if (allElements != null) {
				Collection<org.eclipse.uml2.uml.Class> classes = EcoreUtil
						.getObjectsByType(iterator2Collection(allElements), UMLPackage.eINSTANCE.getClass_());
				for (Class c : classes) {
					//FIXME stereotype
					if (isNominalStateMachine(c)) {
						stateMachines.add((StateMachine) c);
					}
				}
			}
		}

		return stateMachines;
	}

	public Set<StateMachine> getNominalStateMachines(Class umlSelectedComponent, boolean fromSubComponent) {

		Set<StateMachine> stateMachines = getNominalStateMachines(umlSelectedComponent);
		if (fromSubComponent) {
			for (Property subComponentInstance : getSubComponentsInstances(umlSelectedComponent)) {
				stateMachines.addAll(getNominalStateMachines((Class) subComponentInstance.getType(), true));
			}
		}
		return stateMachines;
	}

	public StateMachine getFirstNominalStateMachine(Class umlSelectedComponent) {
		Set<StateMachine> stateMachines = getNominalStateMachines(umlSelectedComponent);
		if ((stateMachines != null) && (stateMachines.size() > 0)) {
			return stateMachines.iterator().next();
		} else
			return null;
	}

	public Set<StateMachine> getNominalStateMachines(Class umlSelectedComponent) {

		Set<StateMachine> stateMachines = new HashSet<StateMachine>();

		if (umlSelectedComponent != null) {
			EList<Behavior> behaviours = umlSelectedComponent.getOwnedBehaviors();
			//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(FAULTY_STATE_MACHINE, umlSelectedComponent);
			if (behaviours != null) {
				for (Class c : behaviours) {
					if ((c instanceof StateMachine) && (c.getAppliedStereotype(FAULTY_STATE_MACHINE)==null)) {
						stateMachines.add((StateMachine) c);
					}
				}
			}
		}

		return stateMachines;
	}

	/**
	 * Returns the state machine with the given name inside the given element.
	 * 
	 * @param umlSelectedComponent
	 *            the owner component
	 * @param stateMachineName
	 *            the name of the state machine
	 * @return
	 */
	public StateMachine getNominalStateMachine(Class umlSelectedComponent, String stateMachineName) {
		for (StateMachine stateMachine : getNominalStateMachines(umlSelectedComponent)) {
			if (stateMachine.getName().equals(stateMachineName)) {
				return stateMachine;
			}
		}
		return null;
	}

	private <T> Collection<T> iterator2Collection(final Iterator<T> iter) {
		ArrayList<T> list = new ArrayList<T>();
		for (; iter.hasNext();) {
			T item = iter.next();
			list.add(item);
		}
		return list;
	}

	public EList<Transition> getTranstitions(StateMachine stateMachine) {
		Region region = stateMachine.getRegions().get(0);
		return region.getTransitions();
	}

	public EList<Vertex> getStates(StateMachine stateMachine) {
		Region region = stateMachine.getRegions().get(0);
		return region.getSubvertices();
	}

	public Vertex getState(StateMachine stateMachine, String stateName) {
		Region region = stateMachine.getRegions().get(0);
		return region.getSubvertex(stateName);
	}

	public boolean isInitialState(Vertex state) {
		return (state instanceof Pseudostate)
				&& ((Pseudostate) state).getKind().equals(PseudostateKind.INITIAL_LITERAL);
	}

	public boolean isFinalState(Vertex state) {
		return ((state instanceof Pseudostate)
				&& ((Pseudostate) state).getKind().getName().compareTo("Terminate") == 0);
	}

	public EList<Vertex> getIntermediateStates(StateMachine stateMachine) {
		EList<Vertex> intermediateStates = new BasicEList<Vertex>();
		for (Vertex state : getStates(stateMachine)) {
			if (!isInitialState(state) && !isFinalState(state)) {
				intermediateStates.add(state);
			}
		}
		return intermediateStates;
	}

	public EList<String> getStatesNameList(EList<Vertex> states) {
		EList<String> names = new BasicEList<String>();
		for (Vertex state : states) {
			names.add(state.getName());
		}
		return names;
	}

	public EList<String> getTransitionNameList(EList<Transition> transitions) throws Exception {
		// logger.debug("getTransitionNameList");
		EList<String> transNames = new BasicEList<String>();
		for (Transition trans : transitions) {
			if (trans.getName() == null) {
				throw new Exception("In " + trans.containingStateMachine().getQualifiedName()
						+ ", one transition has name == null.");
			}
			// logger.debug("transition Name: " + trans.getName());
			transNames.add(trans.getName());
		}

		return transNames;
	}

	public String getStateMachineName(StateMachine stateMachine) {
		return stateMachine.getName();
	}

	public String getTransitionName(Transition transition) {
		return transition.getName();
	}

	public Vertex getInitialState(StateMachine stateMachine) {
		for (Vertex state : getStates(stateMachine)) {
			if (isInitialState(state)) {
				return state;
			}
		}
		return null;
	}

	public EList<Transition> getInitialTransitions(StateMachine stateMachine) throws Exception {
		Vertex initialState = getInitialState(stateMachine);
		if (initialState != null) {
			return initialState.getOutgoings();
		} else {
			throw new Exception("The state machine of " + ((Class) (stateMachine.getOwner())).getName()
					+ " does not have the initial state.");
		}

	}

	public EList<Transition> getNonInitialTransitions(StateMachine stateMachine) {
		EList<Vertex> states = getIntermediateStates(stateMachine);
		EList<Transition> transitions = new BasicEList<Transition>();
		for (Vertex state : states) {
			if (!isInitialState(state)) {
				transitions.addAll(state.getOutgoings());
			}
		}
		return transitions;
	}

	public EList<Transition> getOutgoingTransitions(Vertex state) {
		return state.getOutgoings();
	}

	public EList<Transition> getIncomingTransitions(Vertex state) {
		return state.getIncomings();
	}

	public String getSignalEventName(Trigger trigger) {

		if (trigger.getEvent() instanceof SignalEvent) {
			return ((SignalEvent) trigger.getEvent()).getSignal().getName();
		}

		return null;
	}

	public Vertex getTransitionNextState(Transition transition) {
		return transition.getTarget();
	}

	public Vertex getTransitionSourceState(Transition transition) {
		return transition.getSource();
	}

	public Constraint getTransitionGuard(Transition transition) {
		return transition.getGuard();
	}

	public String getTransitionGuardText(Transition transition, String language) {
		Constraint condition = getTransitionGuard((Transition) transition);
		if (condition != null) {
			return getConditionExpression(condition, language);
		}
		return null;
	}

	public OpaqueBehavior getTransitionEffect(Transition transition) {
		if (transition.getEffect() instanceof OpaqueBehavior) {
			return (OpaqueBehavior) transition.getEffect();
		}
		return null;
	}

	public EList<String> getTransitionEffectParameters(Transition transition) {
		OpaqueBehavior effect = getTransitionEffect(transition);
		EList<String> paramsNames = new BasicEList<String>();
		for (Parameter par : effect.getOwnedParameters()) {
			paramsNames.add(par.getName());
		}
		return paramsNames;
	}

	public String getTransitionEffectText(Transition transition, String language) {
		OpaqueBehavior effect = getTransitionEffect(transition);
		if (effect != null) {
			return getBodyForLanguageOfBodyOwner(getTransitionEffect(transition), language);
		}
		return null;
	}

	public Integer getTransitionPriority(Transition transition) {
		if (isPrioritizedTransition(transition)) {
			Stereotype prioritizedTransitionStereotype =
					// UMLUtil.getAppliedStereotype(transition,PRIORITIZED_TRANSITION,
					// false);
					StereotypeUtil.getCHESSStereotype(PRIORITIZED_TRANSITION, transition);
			PrioritizedTransition prioritizedTransition = (PrioritizedTransition) transition
					.getStereotypeApplication(prioritizedTransitionStereotype);
			return prioritizedTransition.getPriority();
		}
		return null;
	}

	public void setTransitionEffectText(Transition transition, String effectText, String language) {
		OpaqueBehavior effect = getTransitionEffect(transition);
		if (effect != null) {
			effect.getLanguages().add(0, language);
			effect.getBodies().add(0, effectText);
		}
	}

	public String getGuardName(Constraint guard) {
		return guard.getName();
	}

	public String getStateName(Vertex state) {
		return state.getName();
	}

	public String getEffectName(Behavior effect) {
		return effect.getName();
	}

	public boolean isFinalTransition(Transition transition) {
		return isFinalState(transition.getTarget());
	}

	public EList<Port> getEvents(StateMachine stateMachine) {
		EList<Port> eventsPort = getEventPorts(getOwner(stateMachine));
		return eventsPort;
	}

	public Constraint createTransitionGuard(Transition owner, String guardName, String guardText, String language) {

		// Create an empty guard for the transition
		final Constraint guard = owner.createGuard(guardName);

		// Create an opaque expression and assign it to the guard
		final OpaqueExpression opaqueExpression = UMLFactory.eINSTANCE.createOpaqueExpression();
		guard.createSpecification(null, null, opaqueExpression.eClass());

		// Fill the opaque expression
		setOpaqueExpressionTextInUMLConstraint(guard, guardText, language);

		return guard;
	}

	public OpaqueBehavior createTransitionEffect(Transition owner, String effectName, String effectText,
			String language) {

		// Create an empty behavior for the transition
		final OpaqueBehavior opaqueBehavior = (OpaqueBehavior) owner.createEffect(effectName,
				UMLPackage.eINSTANCE.getOpaqueBehavior());

		// Fill the effect
		setTransitionEffectText(owner, effectText, language);

		return opaqueBehavior;
	}

	public EList<Port> getEventPorts(Element umlElement) {

		EList<Port> eventPorts = new BasicEList<Port>();

		if (isComponentInstance(umlElement)) {
			umlElement = getUmlType((Property) umlElement);
		}

		if (isBlock(umlElement) || (isCompType(umlElement) || (isComponentImplementation(umlElement)))) {
			Class umlClass = (Class) umlElement;
			for (Property umlProperty : umlClass.getOwnedAttributes()) {
				if (isEventPortAttribute(umlProperty)) {
					eventPorts.add((Port) umlProperty);
				}
			}
		}

		return eventPorts;
	}

	public boolean isEventPortAttribute(Property umlProperty) {
		return ((umlProperty.getType() != null) && (isEventType(umlProperty.getType())));
	}

	public boolean isEventType(Type type) {
		return (type instanceof Signal);
	}

	public EList<Port> getTransitionEvents(Transition transition) {
		if (!isTransitionWithNoEvent(transition)) {
			return transition.getTriggers().get(0).getPorts();
		}
		return null;
	}

	public String getPortName(Port port) {
		return port.getName();
	}

	public String getAttributeName(Property attribute) {
		return attribute.getName();
	}

	/**
	 * Returns the name of the given parameter
	 * 
	 * @param parameter
	 *            the parameter
	 * @return the requested name
	 */
	public String getParameterName(Parameter parameter) {
		return parameter.getName();
	}

	/**
	 * Returns the owner of the given parameter
	 * 
	 * @param parameter
	 *            the parameter
	 * @return the owner of the parameter
	 */
	public Element getParameterOwner(Parameter parameter) {
		return parameter.getOwner();
	}

	/**
	 * Returns the owner of the given function behavior
	 * 
	 * @param function
	 *            the function behavior
	 * @return the owner of the function behavior
	 */
	public Element getUmlFunctionBehaviorOwner(FunctionBehavior function) {
		return function.getOwner();
	}

	public boolean isTransitionWithNoEvent(Transition transition) {
		return !((transition.getTriggers() != null) && (transition.getTriggers().size() != 0)
				&& (transition.getTriggers().get(0).getPorts() != null)
				&& transition.getTriggers().get(0).getPorts().size() != 0);

	}

	public boolean isRealType(Type type) {
		if (type != null) {
			return ((type.getQualifiedName().compareTo(REAL_TYPE) == 0)
					|| (type.getQualifiedName().compareTo(MARTE_REAL_TYPE) == 0));
		}
		return false;
	}

	public boolean isIntegerType(Type type) {
		if (type != null) {
			return ((type.getQualifiedName().compareTo(INTEGER_TYPE) == 0)
					|| (type.getQualifiedName().compareTo(MARTE_INTEGER_TYPE) == 0));
		}
		return false;
	}

	public boolean isStringType(Type type) {
		if (type != null) {
			return (type.getQualifiedName().compareTo(STRING_TYPE) == 0);
		}
		return false;
	}

	public EList<? extends Port> getUmlPortsExceptEvents(Element umlElement, int portDirection) {

		if (isComponentInstance(umlElement)) {
			umlElement = getUmlType((Property) umlElement);
		}

		EList<Port> portsArr = new BasicEList<Port>();
		if (isBlock(umlElement)) {
			portsArr.addAll(getUmlPortsExceptEventsFromClass((Class) umlElement, portDirection));
		}

		if (isCompType(umlElement) || (isComponentImplementation(umlElement))) {
			portsArr.addAll(getUmlPortsExceptEventsFromComponent((Component) umlElement, portDirection));
		}

		return portsArr;
	}

	private Collection<? extends Port> getUmlPortsExceptEventsFromComponent(Component umlComponent, int portDirection) {
		Set<Port> ports = new HashSet<Port>();

		for (Port umlPort : umlComponent.getOwnedPorts()) {
			org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.FlowPort fp = getFlowPortMarte(umlPort);
			if ((fp.getDirection().getValue() == portDirection) && (!isEventPortAttribute(umlPort))) {
				ports.add(umlPort);
			}
		}
		return ports;
	}

	private EList<? extends Port> getUmlPortsExceptEventsFromClass(Class umlElement, int portDirection) {
		EList<Port> ports = new BasicEList<Port>();
		for (Port umlPort : umlElement.getOwnedPorts()) {
			FlowPort fp = getFlowPort(umlPort);
			if ((fp.getDirection().getValue() == portDirection) && (!isEventPortAttribute(umlPort))) {
				ports.add(umlPort);
			}
		}
		return ports;
	}

	public String getConditionExpression(Constraint condition, String language) {
		if ((condition.getSpecification() != null) && (condition.getSpecification() instanceof OpaqueExpression)
				&& ((OpaqueExpression) condition.getSpecification()).getBodies() != null) {
			return getBodyForLanguageOfBodyOwner((OpaqueExpression) condition.getSpecification(), language);
		}
		return null;
	}

	/**
	 * Checks if the selected object is a package in the &lt&ltSystemView&gt&gt branch.
	 * 
	 * @param pkg
	 *            the selected element
	 * @return true if the package is valid
	 */
	public boolean isSystemViewPackage(Element obj) {
		if (obj instanceof Package) {
			final Package pkg = (Package) obj;
			if (pkg.getAppliedStereotype(SYSVIEW) != null) {
				return true;
			} else {
				EList<Package> owningPackages = pkg.allOwningPackages();
				for (Package owningPackage : owningPackages) {
					//FIXME stereotype
					if (owningPackage.getAppliedStereotype(SYSVIEW) != null) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public EList<Constraint> getRefinementFormalPropertiesAsConstraints(Element component) {

		if (component instanceof Class) {
			return getRefinementFormalPropertiesAsConstraintsFromClass((Class) component);
		} else if (component instanceof Property) {
			return getRefinementFormalPropertiesAsConstraintsFromProperty((Property) component);
		}

		return null;
	}

	private EList<Constraint> getRefinementFormalPropertiesAsConstraintsFromClass(Class component) {

		EList<Constraint> formalProperties = new BasicEList<Constraint>();

		for (Constraint umlConstraint : ((Class) component).getOwnedRules()) {
			if (isRefinementFormalProperty(umlConstraint)) {
				formalProperties.add(umlConstraint);
			}
		}

		return formalProperties;
	}

	private EList<Constraint> getRefinementFormalPropertiesAsConstraintsFromProperty(Property componentInstance) {

		return getRefinementFormalPropertiesAsConstraintsFromClass((Class) componentInstance.getType());
	}

	public EList<Constraint> getInterfaceFormalPropertiesAsConstraints(Element component) {

		if (component instanceof Class) {
			return getInterfaceFormalPropertiesAsConstraintsFromClass((Class) component);
		} else if (component instanceof Property) {
			return getInterfaceFormalPropertiesAsConstraintsFromProperty((Property) component);
		}

		return null;
	}

	private EList<Constraint> getInterfaceFormalPropertiesAsConstraintsFromClass(Class component) {

		EList<Constraint> formalProperties = new BasicEList<Constraint>();

		for (Constraint umlConstraint : ((Class) component).getOwnedRules()) {
			if (isInterfaceFormalProperty(umlConstraint)) {
				formalProperties.add(umlConstraint);
			}
		}

		return formalProperties;
	}

	private EList<Constraint> getInterfaceFormalPropertiesAsConstraintsFromProperty(Property componentInstance) {

		return getInterfaceFormalPropertiesAsConstraintsFromClass((Class) componentInstance.getType());
	}

	public boolean isFormalProperty(Element umlConstraint) {
		//Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(FORMAL_PROP, umlConstraint);
		if (umlConstraint instanceof Constraint) {
			return (umlConstraint.getAppliedStereotype(FORMAL_PROP)!=null);
		}
		return false;
	}

	public boolean isInterfaceFormalProperty(Element umlConstraint) {
		return (isFormalProperty(umlConstraint)
				&& (((Constraint) umlConstraint).getVisibility() == VisibilityKind.PUBLIC_LITERAL));
	}

	public boolean isRefinementFormalProperty(Element umlConstraint) {
		return (isFormalProperty(umlConstraint)
				&& (((Constraint) umlConstraint).getVisibility() == VisibilityKind.PRIVATE_LITERAL));
	}

	/**
	 * Returns the list of Macro Definitions in the given element, as UML
	 * Constraints.
	 * 
	 * @param umlElement
	 *            the Element to analyze
	 * @return the list of Macro Definitions as UML Constraints
	 */
	public EList<Constraint> getMacroDefinitionsAsUMLConstraints(Element umlElement) {
		EList<Constraint> constraints = new BasicEList<Constraint>();

		if (isBlock(umlElement) || isCompType(umlElement) || isComponentImplementation(umlElement)) {
			//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(MACRO_DEFINITION, umlElement);
			for (Constraint umlConstraint : ((Class) umlElement).getOwnedRules()) {
				if ((umlConstraint.getAppliedStereotype(MACRO_DEFINITION)!=null)) {
					constraints.add((Constraint) umlConstraint);
				}
			}
		}

		if (isComponentInstance(umlElement)) {
			constraints.addAll(getMacroDefinitionsAsUMLConstraints(getUmlType((Property) umlElement)));
		}

		return constraints;
	}

	/**
	 * Checks if the given element is a Macro Definition.
	 * 
	 * @param umlConstraint
	 *            the constraint
	 * @return true if the given element is a Macro Definition
	 */
	public boolean isMacroDefinition(Element umlConstraint) {
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(MACRO_DEFINITION, umlConstraint);
		if (umlConstraint instanceof Constraint) {
			return (umlConstraint.getAppliedStereotype(MACRO_DEFINITION)!=null);
		}
		return false;
	}

	public String getConstraintQualifiedName(Constraint formalProperty) {
		if (formalProperty != null) {
			return ((Constraint) formalProperty).getQualifiedName();
		}
		return null;
	}

	public String getConstraintName(Constraint constraint) {
		if (constraint != null) {
			return ((Constraint) constraint).getName();
		}
		return null;
	}

	public FormalProperty getFormalProperty(Constraint umlConstraint) {
		// Stereotype formalPropertyStereotype =
		// UMLUtil.getAppliedStereotype(umlConstraint, FORMAL_PROP, false);
		Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(FORMAL_PROP, umlConstraint);
		return (FormalProperty) umlConstraint.getStereotypeApplication(stereotype);
	}

	public boolean isDelegationConstraint(Element umlProperty) {
		//Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(DELEGATION_CONST, umlProperty);
		return ((umlProperty instanceof Constraint) && (umlProperty.getAppliedStereotype(DELEGATION_CONST)!=null));
	}

	public EList<Constraint> getDelegationConstraintsAsUMLConstraints(Element umlElement) {
		EList<Constraint> constraints = new BasicEList<Constraint>();

		if (isBlock(umlElement) || isCompType(umlElement) || isComponentImplementation(umlElement)) {
			//Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(DELEGATION_CONST, umlElement);
			for (Constraint umlConstraint : ((Class) umlElement).getOwnedRules()) {				
				if ((umlConstraint.getAppliedStereotype(DELEGATION_CONST)!=null)) {
					constraints.add((Constraint) umlConstraint);
				}
			}
		}

		if (isComponentInstance(umlElement)) {
			constraints.addAll(getDelegationConstraintsAsUMLConstraints(getUmlType((Property) umlElement)));
		}

		return constraints;
	}

	public EList<FunctionBehavior> getUmlFunctionBehaviors(Element umlElement) {

		EList<FunctionBehavior> functionBehaviours = null;

		if (isComponentInstance((Element) umlElement)) {
			umlElement = ((Property) umlElement).getType();
		}

		if (umlElement instanceof Class) {
			Class umlClass = (Class) umlElement;
			EList<Behavior> behaviours = umlClass.getOwnedBehaviors();
			for (Behavior behavior : behaviours) {
				if (behavior instanceof FunctionBehavior) {
					if (functionBehaviours == null) {
						functionBehaviours = new BasicEList<FunctionBehavior>();
					}
					functionBehaviours.add((FunctionBehavior) behavior);
				}
			}
		}

		return functionBehaviours;
	}

	/**
	 * Returns the name of the given function behavior
	 * 
	 * @param function
	 *            the function behavior
	 * @return the requested name
	 */
	public String getUmlFunctionBehaviorName(FunctionBehavior uninterpretedFunction) {
		return uninterpretedFunction.getName();
	}

	public Type getUmlFunctionBehaviorOutputType(FunctionBehavior uninterpretedFunction) {
		for (Parameter parameter : uninterpretedFunction.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.OUT_LITERAL) {
				return parameter.getType();
			}
		}
		return null;
	}

	public EList<Type> getUmlFunctionBehaviorInputTypes(FunctionBehavior uninterpretedFunction) {

		EList<Type> inputTypes = new BasicEList<Type>();

		for (Parameter parameter : uninterpretedFunction.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.IN_LITERAL) {
				inputTypes.add(parameter.getType());
			}
		}
		return inputTypes;
	}

	/**
	 * Returns the input parameters of the given function behavior
	 * 
	 * @param function
	 *            the function behavior
	 * @return the input parameters
	 */
	public EList<Parameter> getUmlFunctionBehaviorInputParameters(FunctionBehavior function) {
		final EList<Parameter> inputParameters = new BasicEList<Parameter>();

		// Loop on all the parameters to find the input ones
		final EList<Parameter> parameters = function.getOwnedParameters();
		for (Parameter parameter : parameters) {
			if (parameter.getDirection() == ParameterDirectionKind.IN_LITERAL) {
				inputParameters.add(parameter);
			}
		}
		return inputParameters;
	}

	public Parameter getUmlFunctionBehaviorOutputParameter(FunctionBehavior function) {
		// Loop on all the parameters to find the input ones
		final EList<Parameter> parameters = function.getOwnedParameters();
		for (Parameter parameter : parameters) {
			if (parameter.getDirection() == ParameterDirectionKind.OUT_LITERAL) {
				return (parameter);
			}
		}
		return null;
	}

	public Object getParameterType(Parameter parameter) {
		return parameter.getType();
	}

	public String[] getComponentInstanceMultiplicity(Property component) throws Exception {
		if (isComponentInstance(component)) {
			return getAttributeMultiplicity(component);
		}

		throw new Exception("" + component.getName() + " is not a component instance");

	}

	public String[] getAttributeMultiplicity(MultiplicityElement attribute) {
		// logger.debug("getAttributeMultiplicity");

		ValueSpecification upperValueSpecification = attribute.getUpperValue();
		ValueSpecification lowerValueSpecification = attribute.getLowerValue();

		String upperValue = getValueSpecificationValue(upperValueSpecification);
		String lowerValue = getValueSpecificationValue(lowerValueSpecification);

		String[] boundaries = { lowerValue, upperValue };
		return boundaries;
	}

	public String getValueSpecificationValue(ValueSpecification valueSpecification) {

		String strValue = null;
		Object value = null;
		if (valueSpecification instanceof LiteralInteger) {
			// logger.debug("instanceof LiteralInteger");
			value = ((LiteralInteger) valueSpecification).getValue();

		} else if (valueSpecification instanceof LiteralUnlimitedNatural) {
			// logger.debug("instanceof LiteralUnlimitedNatural");
			value = ((LiteralUnlimitedNatural) valueSpecification).getValue();

		} else if (valueSpecification instanceof LiteralString) {
			// logger.debug("instanceof LiteralString");
			value = ((LiteralString) valueSpecification).getValue();
		}

		logger.debug("value: " + value);

		strValue = String.valueOf(value);

		if (strValue == "null") {
			strValue = null;
		}

		// logger.debug("getValueSpecificationValue: " + strValue);
		return strValue;
	}

	/**
	 * Adds a connector to the given element.
	 * 
	 * @param owner
	 *            the owner element
	 * @param connector
	 *            the conne
	 */
	private void addConnector(Class owner, Connector connector) {

		// Add the new connector to the list
		owner.getOwnedConnectors().add(connector);
	}

	/**
	 * Creates a connector, but doesn't add it to the owner.
	 * 
	 * @param owner
	 *            the owner element
	 * @return the created Connector
	 */
	private Connector createConnector(String connectorName) {

		Connector connector = UMLFactory.eINSTANCE.createConnector();
		connector.setName(connectorName);

		logger.debug("\n\nCreated " + connectorName + " Connector\n\n");
		return connector;
	}

	/**
	 * Creates an end to the given connector.
	 * 
	 * @param owner
	 *            the owner Connector
	 * @param sourceOwner
	 *            the component instance owning the port
	 * @param sourcePort
	 *            the port to be connected
	 * @return
	 */
	public ConnectorEnd createConnectorEnd(Connector owner, Property sourceOwner, ConnectableElement sourcePort) {
		final ConnectorEnd end = owner.createEnd();

		end.setRole(sourcePort);
		end.setPartWithPort(sourceOwner);
		return end;
	}

	public Parameter createFunctionBehaviorParameter(FunctionBehavior owner, String parameterName, Type parameterType,
			String[] multiplicity, boolean isInput) {

		logger.debug("\n\n\n Creating functionBehaviorParameter " + parameterName + " for owner " + owner);
		logger.debug("\n\n\n");

		final Parameter parameter = owner.createOwnedParameter(parameterName, parameterType);
		parameter.setDirection(isInput ? ParameterDirectionKind.IN_LITERAL : ParameterDirectionKind.OUT_LITERAL);

		setAttributeMultiplicity(parameter, multiplicity);

		logger.debug("\n\nCreated " + parameterName + " functionBehaviorParameter\n\n");
		return parameter;
	}

	public Object clone(Object original) {
		EObject context = (EObject) original;
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		EObject copy = copier.copy(context);
		copier.copyReferences();
		return copy;
	}

	public Constraint createFormalProperty(final Namespace owner, String formalPropertyName) {

		// Contract contract = getContract(umlContract);
		// final String formalPropertyName = prefix_name + "_" +
		// umlContract.getName();
		final String propertyName = formalPropertyName;

		/*
		 * TransactionalEditingDomain domain =
		 * TransactionUtil.getEditingDomain(formalPropertyOwner);
		 * domain.getCommandStack().execute(new RecordingCommand(domain) {
		 * 
		 * @Override protected void doExecute() {
		 */
		Constraint umlNewConstraint = owner.createOwnedRule(propertyName);
		UMLUtils.applyStereotype(umlNewConstraint, FORMAL_PROP);
		/*
		 * } });
		 */
		return owner.getOwnedRule(propertyName);
	}

	/**
	 * Creates an empty FunctionBehavior belonging to the given owner
	 * 
	 * @param owner
	 *            the owner class of the functionBehavior
	 * @param functionBehaviorName
	 *            the name of the functionBehavior
	 * @return the newly created FunctionBehavior
	 */
	public FunctionBehavior createFunctionBehavior(Class owner, String functionBehaviorName) {

		logger.debug("\n\n\n Creating functionBehavior " + functionBehaviorName + " for owner " + owner);
		logger.debug("\n\n\n");

		final FunctionBehavior functionBehavior = (FunctionBehavior) owner.createOwnedBehavior(functionBehaviorName,
				UMLPackage.eINSTANCE.getFunctionBehavior());

		logger.debug("\n\nCreated " + functionBehaviorName + " FunctionBehavior\n\n");
		return functionBehavior;
	}

	/**
	 * Creates a PrioritizedTransition and sets it the given priority.
	 * 
	 * @param transition
	 *            the Transition to be stereotyped
	 * @param priority
	 *            the priority to assign
	 * @return
	 */
	public PrioritizedTransition createPrioritizedTransition(Transition transition, Integer priority) {
		final Stereotype prioritizedTransitionStereotype = findStereotype(transition.getNearestPackage(),
				PRIORITIZED_TRANSITION);
		if (prioritizedTransitionStereotype != null) {
			if (!transition.isStereotypeApplied(prioritizedTransitionStereotype)) {
				transition.applyStereotype(prioritizedTransitionStereotype);
			}
			final PrioritizedTransition prioritizedTransition = (PrioritizedTransition) transition
					.getStereotypeApplication(prioritizedTransitionStereotype);
			prioritizedTransition.setPriority(priority);
			return prioritizedTransition;
		}
		return null;
	}

	/**
	 * Returns the input Parameters of the given FunctionBehavior
	 * 
	 * @param owner
	 *            the FunctionBehavior to analyze
	 * @return the list of input Parameters
	 */
	public EList<Parameter> getOwnedInputParameters(FunctionBehavior owner) {
		EList<Parameter> inputParameters = new BasicEList<Parameter>();

		for (Parameter parameter : owner.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.IN_LITERAL) {
				inputParameters.add(parameter);
			}
		}
		return inputParameters;
	}

	public Parameter createFunctionBehaviorParameter(FunctionBehavior owner, Type parameterType, String[] multiplicity,
			boolean isInput) {

		// Create the name
		String parameterName = null;
		if (isInput) {
			parameterName = DEFAULT_PARAMETER_IN_NAME + (getOwnedInputParameters(owner).size() + 1); // Incremental
			// name
		} else {
			parameterName = DEFAULT_PARAMETER_OUT_NAME; // There could be only
														// one
			// output
		}

		return createFunctionBehaviorParameter(owner, parameterName, parameterType, multiplicity, isInput);
	}

	public Port createNonStaticPort(Class owner, String portName, Type portType, String[] multiplicityBounds,
			boolean isInput, Stereotype flowportStereotype) {
		Port umlPort = UMLFactory.eINSTANCE.createPort();
		umlPort.setName(portName);
		umlPort.setType(portType);
		owner.getOwnedPorts().add(umlPort);
		umlPort.applyStereotype(flowportStereotype);
		umlPort.setAggregation(AggregationKind.get(AggregationKind.COMPOSITE));
		FlowPort flowPort = (FlowPort) umlPort.getStereotypeApplication(flowportStereotype);
		flowPort.setDirection(isInput ? FlowDirection.IN : FlowDirection.OUT);

		setAttributeMultiplicity(umlPort, multiplicityBounds);

		// This version is nicer but a little slower
		// Port umlPort = owner.createOwnedPort(portName,
		// portType);
		// Stereotype stereotype = UMLUtils.applyStereotype(umlPort, FLOWPORT);
		// umlPort.setAggregation(AggregationKind.get(AggregationKind.COMPOSITE));
		// FlowPort flowPort = (FlowPort)
		// umlPort.getStereotypeApplication(stereotype);
		// flowPort.setDirection(isInput? FlowDirection.IN: FlowDirection.OUT);
		logger.debug("\n\nCreated " + portName + " Port\n\n");
		return umlPort;
	}

	public Port createStaticPort(Class owner, String portName, Type portType, String[] multiplicityBounds,
			Stereotype flowPortStereotype) {

		Port umlPort = UMLFactory.eINSTANCE.createPort();
		umlPort.setName(portName);
		umlPort.setType(portType);
		owner.getOwnedPorts().add(umlPort);
		umlPort.applyStereotype(flowPortStereotype);
		umlPort.setAggregation(AggregationKind.get(AggregationKind.COMPOSITE));
		FlowPort flowPort = (FlowPort) umlPort.getStereotypeApplication(flowPortStereotype);
		flowPort.setDirection(FlowDirection.INOUT);
		umlPort.setIsStatic(true);

		setAttributeMultiplicity(umlPort, multiplicityBounds);

		return umlPort;
	}

	public RedefinableTemplateSignature createRedefinableTemplateSignature(Class owner, String parameterName) {
		RedefinableTemplateSignature redefinableTemplateSignature = UMLFactory.eINSTANCE
				.createRedefinableTemplateSignature();
		redefinableTemplateSignature.setName("redefinableTemplateSignature");

		TemplateParameter templateParameter = UMLFactory.eINSTANCE.createTemplateParameter();
		redefinableTemplateSignature.getOwnedParameters().add(templateParameter);

		LiteralString stringParameter = UMLFactory.eINSTANCE.createLiteralString();
		stringParameter.setName(parameterName);
		stringParameter.setOwningTemplateParameter(templateParameter);
		stringParameter.setTemplateParameter(templateParameter);
		stringParameter.setValue("0");
		templateParameter.setDefault(stringParameter);
		templateParameter.setParameteredElement(stringParameter);

		owner.setOwnedTemplateSignature(redefinableTemplateSignature);

		return redefinableTemplateSignature;
	}

	public String createDelegationConstraintText(String variableIdTextName, String constraintText,
			String iterConditionText) {

		final StringBuffer delegationText = new StringBuffer();

		delegationText.append(variableIdTextName + " := " + constraintText);
		if (iterConditionText != null && iterConditionText.length() > 0) {
			delegationText.append(" " + iterConditionText);
		}
		return delegationText.toString();
	}

	public Connector getExistingConnector(EList<Connector> connectors, String variablePortOwner,
			String variablePortName, String constraintPortOwner, String constraintPortName) {

		// Loop on all the connectors to find one with same values
		for (Connector connector : connectors) {
			final EList<ConnectorEnd> ends = connector.getEnds();
			if (ends.size() == 2) {

				// Check the first end
				final Property sourceOwner = ends.get(0).getPartWithPort(); // Should
																			// be
																			// the
																			// owner
																			// of
																			// the
																			// port
				final Port sourcePort = (Port) ends.get(0).getRole(); // Should
																		// be
																		// the
																		// port

				if (sourcePort.getName().equals(constraintPortName)) {
					if (sourceOwner != null && sourceOwner.getName().equals(constraintPortOwner)) {
					} else if (sourceOwner == null && constraintPortOwner == null) {
					} else {
						continue;
					}
				} else {
					continue;
				}

				// One end is correct, go on with the second
				final Property targetOwner = ends.get(1).getPartWithPort(); // Should
																			// be
																			// the
																			// owner
																			// of
																			// the
																			// port
				final Port targetPort = (Port) ends.get(1).getRole(); // Should
																		// be
																		// the
																		// port

				if (targetPort.getName().equals(variablePortName)) {
					if (targetOwner != null && targetOwner.getName().equals(variablePortOwner)) {
					} else if (targetOwner == null && variablePortOwner == null) {
					} else {
						continue;
					}
				} else {
					continue;
				}

				// Connector found
				return connector;
			}
		}
		return null;
	}

	/**
	 * Create a public formal property
	 * 
	 * @param owner
	 *            the owner of the property
	 * @param assertionName
	 *            the name of the formal property
	 * @param assertionText
	 *            the text of the formal property
	 * @return the newly created formal property
	 */
	public Constraint createInterfaceFormalProperty(Class owner, String assertionName, String assertionText) {

		final Constraint umlConstraint = createFormalProperty(owner, assertionName);
		final LiteralString newLs = UMLFactory.eINSTANCE.createLiteralString();
		final ValueSpecification vs = umlConstraint.createSpecification("ConstraintSpec", null, newLs.eClass());
		umlConstraint.setSpecification(vs);

		setLiteralStringTextInUMLConstraint(umlConstraint, assertionText);

		return umlConstraint;
	}

	/**
	 * Create a private formal property
	 * 
	 * @param owner
	 *            the owner of the property
	 * @param assertionName
	 *            the name of the formal property
	 * @param assertionText
	 *            the text of the formal property
	 * @return the newly created formal property
	 */
	public Constraint createRefinementFormalProperty(Class owner, String assertionName, String assertionText) {

		final Constraint umlConstraint = createFormalProperty(owner, assertionName);
		final LiteralString newLs = UMLFactory.eINSTANCE.createLiteralString();
		final ValueSpecification vs = umlConstraint.createSpecification("ConstraintSpec", null, newLs.eClass());
		umlConstraint.setSpecification(vs);
		umlConstraint.setVisibility(VisibilityKind.PRIVATE_LITERAL);

		setLiteralStringTextInUMLConstraint(umlConstraint, assertionText);

		return umlConstraint;
	}

	public void setTextInUMLConstraint(final Constraint umlConstraint, final String formalPropertyText,
			final String language) {

		logger.debug("saveFormalProperty: " + formalPropertyText);
		// Constraint umlConstraint =
		// formalProperty.getBase_Constraint();
		if (umlConstraint.getSpecification() instanceof LiteralString) {
			setLiteralStringTextInUMLConstraint(umlConstraint, formalPropertyText);
		} else if (umlConstraint.getSpecification() instanceof OpaqueExpression) {
			setOpaqueExpressionTextInUMLConstraint(umlConstraint, formalPropertyText, language);

		}
	}

	public void setLiteralStringTextInUMLConstraint(final Constraint umlConstraint, final String formalPropertyText) {
		/*
		 * TransactionalEditingDomain domain =
		 * TransactionUtil.getEditingDomain(umlConstraint);
		 * domain.getCommandStack().execute(new RecordingCommand(domain) {
		 * 
		 * @Override protected void doExecute() {
		 */
		if (umlConstraint.getSpecification() instanceof LiteralString) {
			LiteralString litString = (LiteralString) umlConstraint.getSpecification();
			litString.setValue(formalPropertyText);
			umlConstraint.setSpecification(litString);
		}
		/*
		 * } });
		 */
	}

	public void setOpaqueExpressionTextInUMLConstraint(final Constraint umlConstraint, final String formalPropertyText,
			final String language) {
		/*
		 * TransactionalEditingDomain domain =
		 * TransactionUtil.getEditingDomain(umlConstraint);
		 * domain.getCommandStack().execute(new RecordingCommand(domain) {
		 * 
		 * @Override protected void doExecute() {
		 */
		if (umlConstraint.getSpecification() instanceof OpaqueExpression) {
			// logger.debug("saveFormalProperty OpaqueExpression");
			OpaqueExpression opaqueExpr = (OpaqueExpression) umlConstraint.getSpecification();
			// opaqueExpr.getLanguages().
			setOpaqueExpressionBodyForLanguage(opaqueExpr, language, formalPropertyText);

		}
		/*
		 * } });
		 */
	}

	private void setOpaqueExpressionBodyForLanguage(org.eclipse.uml2.uml.OpaqueExpression opaqueExpression,
			String language, String body) {
		// checks both lists by size
		checkAndCorrectListsOfBodyOwner(opaqueExpression);
		// checks if language exists, if not, creates one
		if (!opaqueExpression.getLanguages().contains(language)) {
			// opaqueExpression.getLanguages().add(0, language);
			// opaqueExpression.getBodies().add(0, body);
			opaqueExpression.getLanguages().add(language);
			opaqueExpression.getBodies().add(body);
		} else {
			// retrieve the index of the given language in the opaque Expression
			int index = opaqueExpression.getLanguages().indexOf(language);
			// sets the body at the given index in the list of bodies.
			opaqueExpression.getBodies().set(index, body);
		}
	}

	/**
	 * Deletes an element from the model.
	 * 
	 * @param element
	 *            the element to remove
	 * @throws Exception
	 */
	public void deleteElementInTheModel(NamedElement element) throws Exception {

		// Give the focus to the ModelExplorerView
		ModelExplorerView modelExplorerView = getModelExplorerView();
		modelExplorerView.setFocus();

		// Select the requested element
		List<Object> elements = new ArrayList<Object>();
		elements.add(element);
		modelExplorerView.revealSemanticElement(elements);

		IHandler deleteHandler = getActiveHandlerFor(IWorkbenchCommandConstants.EDIT_DELETE);
		deleteHandler.execute(new ExecutionEvent());
	}

	/**
	 * Returns the handler for the given command.
	 * 
	 * @param commandId
	 *            the command
	 * @return the handler
	 */
	private IHandler getActiveHandlerFor(final String commandId) {
		final ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getService(ICommandService.class);
		commandService.refreshElements(commandId, null);
		final Command cmd = commandService.getCommand(commandId);
		return cmd.getHandler();
	}

	// Needed to bring out a reference from the inner class...
	ModelExplorerView modelExplorerView;

	/**
	 * Returns the ModelExplorerView.
	 * 
	 * @return
	 */
	private ModelExplorerView getModelExplorerView() {

		Display.getDefault().syncExec(new Runnable() {

			public void run() {
				final IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				// we look for the modelexplorer
				IViewPart modelexplorer;
				try {
					modelexplorer = activeWorkbenchWindow.getActivePage().showView(ModelExplorerPageBookView.VIEW_ID);
				} catch (PartInitException ex) {
					ex.printStackTrace(System.out);
					return;
				}
				final ModelExplorerPageBookView view = (ModelExplorerPageBookView) modelexplorer;
				final ModelExplorerPage page = (ModelExplorerPage) view.getCurrentPage();
				final IViewPart viewer = page.getViewer();
				modelExplorerView = (ModelExplorerView) viewer;
			}
		});
		return modelExplorerView;
	}

	/**
	 * Removes an element from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the element to remove
	 */
	public void removeElement(EList<Class> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a function behavior from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the function behavior to remove
	 */
	public void removeFunctionBehavior(EList<Behavior> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a FunctionBehavior parameter from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the function behavior parameter to
	 *            remove
	 */
	public void removeFunctionBehaviorParameter(EList<Parameter> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a formal property from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the formal property to remove
	 */
	public void removeFormalProperty(EList<Constraint> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a named element from the given list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the element to remove
	 */
	public void removeNamedElement(EList<?> members, String qualifiedElement) {
		for (Object object : members) {
			NamedElement element = (NamedElement) object;
			if (element.getQualifiedName().equals(qualifiedElement)) {
				try {
					// ((Element) element).destroy(); //TODO: investigate this
					// line!
					deleteElementInTheModel(element);
				} catch (Exception e) {
					e.printStackTrace();
				}
				members.remove(element);
				break;
			}
		}
	}

	/**
	 * Removes a property from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the property to remove
	 */
	public void removeProperty(EList<Property> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a property from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the property to remove
	 */
	public void removeConnector(EList<Connector> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a port from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the port to remove
	 */
	public void removePort(EList<NamedElement> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	/**
	 * Removes a Macro Definition from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the macro to remove
	 */
	public void removeMacroDefinition(EList<Constraint> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	public Association createUmlAssociation(Class owner, String subComponentName, Type type, String[] multiplicity) {

		final String associationName = DEFAULT_ASSOCIATION_NAME
				+ (countPackageAssociations(owner.getNearestPackage()) + 1);
		// I should create an Association between the elements
		// and not a Component Instance!

		return createAssociation(owner, associationName, subComponentName, type, multiplicity);

	}

	/**
	 * Returns the number or defined associations for the given package.
	 * 
	 * @param pkg
	 *            the package to analyze
	 * @return the number of associations found in package
	 */
	private int countPackageAssociations(Package pkg) {
		int counter = 0;

		EList<NamedElement> namedList = pkg.getOwnedMembers();
		for (NamedElement namedElement : namedList) {
			if (namedElement instanceof Association) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Creates an association between the given owner and element. It will also
	 * create the relative component instance inside the owner element.
	 * 
	 * @param owner
	 *            the parent Class
	 * @param elementName
	 *            the name of the end element
	 * @param elementType
	 *            the type of the end element
	 * @return the created Association
	 */
	public Association createAssociation(Class owner, String associationName, String elementName, Type elementType,
			String[] multiplicity) {
		logger.debug("createAssociation");

		logger.debug("\n\n\n Creating association " + associationName + " for owner " + owner);
		logger.debug("elementName = " + elementName + " with type " + elementType.getName() + " [" + multiplicity[0]
				+ "," + multiplicity[1] + "]");
		logger.debug("\n\n\n");

		org.eclipse.uml2.uml.Package package_ = owner.getNearestPackage();
		Association association = (Association) package_.createOwnedType(null, UMLPackage.Literals.ASSOCIATION);
		Property subComponentInstance = buildAssociationEndInternal(association, elementName, elementType, null, true,
				(AggregationKind) AggregationKind.get(AggregationKind.COMPOSITE));
		buildAssociationEndInternal(association, owner.getName().toLowerCase(), owner, null, false,
				(AggregationKind) AggregationKind.get(AggregationKind.NONE));
		if (associationName != null) {
			association.setName(associationName);
		}

		owner.getOwnedAttributes().add(subComponentInstance);

		// Create the association and adds it to the owning package
		// the method owner.createAssociation does not allow to set multiplicity
		// equal to null
		/*
		 * final Association association = owner.createAssociation( true,
		 * AggregationKind.get(AggregationKind.COMPOSITE), elementName, 1, 1,
		 * elementType, false, AggregationKind.get(AggregationKind.NONE),
		 * owner.getName().toLowerCase(), 1, 1);
		 * association.setName(associationName);
		 */
		logger.debug("createAssociation done");

		if (!isOneInstance(multiplicity)) {
			logger.debug("!isOneInstance");
			setAttributeMultiplicity(subComponentInstance, multiplicity);
		}
		// Add SysML Nature on the new Association
		ElementUtil.addNature(association, SysMLElementTypes.SYSML_NATURE);

		logger.debug("\n\nCreated " + associationName + " Association\n\n");
		return association;
	}

	/*
	 * public static Association createAssociation(Type type, boolean
	 * end1IsNavigable, AggregationKind end1Aggregation, String end1Name, int
	 * end1Lower, int end1Upper, Type end1Type, boolean end2IsNavigable,
	 * AggregationKind end2Aggregation, String end2Name, int end2Lower, int
	 * end2Upper) { org.eclipse.uml2.uml.Package package_ =
	 * type.getNearestPackage(); if (package_ == null) { throw new
	 * IllegalStateException(); } if (end1Aggregation == null) { throw new
	 * IllegalArgumentException(String.valueOf(end1Aggregation)); } if
	 * (end2Aggregation == null) { throw new
	 * IllegalArgumentException(String.valueOf(end2Aggregation)); } Association
	 * association = (Association) package_.createOwnedType(null,
	 * UMLPackage.Literals.ASSOCIATION); createAssociationEnd(type, association,
	 * end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper,
	 * end1Type); createAssociationEnd(end1Type, association, end2IsNavigable,
	 * end2Aggregation, end2Name, end2Lower, end2Upper, type); return
	 * association; }
	 * 
	 * protected static Property createAssociationEnd(Class type, Association
	 * association, boolean isNavigable, AggregationKind aggregation, String
	 * name, int lower, int upper, Type endType) { EList<Property>
	 * ownedAttributes = type.getOwnedAttributes(); Property associationEnd =
	 * type.createOwnedProperty(ownedAttributes == null || !isNavigable ?
	 * association : type, name, endType, lower, upper);
	 * associationEnd.setAggregation(aggregation); if (isNavigable) { if
	 * (ownedAttributes == null) {
	 * association.getNavigableOwnedEnds().add(associationEnd); } else {
	 * association.getMemberEnds().add(associationEnd); } } return
	 * associationEnd; }
	 */

	private Property buildAssociationEndInternal(final Association assoc, final String name, final Type type,
			final Integer[] multi, final Boolean navigable, final AggregationKind aggregation) {
		// The attribute 'targetScope' of an AssociationEnd in UML1.x is no
		// longer supported in UML2.x

		Property property = UMLFactory.eINSTANCE.createProperty();
		property.setType((Type) type);
		property.setAssociation((Association) assoc);
		if (name != null) {
			property.setName(name);
		}
		if (navigable != null) {
			property.setIsNavigable(navigable);
			if (!(Boolean) navigable) {
				((Association) assoc).getOwnedEnds().add(property);
			}
		}
		if (aggregation != null) {
			property.setAggregation((AggregationKind) aggregation);
		}

		if (multi != null) {
			if (multi[0] != null) {
				property.setLower(multi[0]);
			}
			if (multi[1] != null) {
				property.setUpper(multi[1]);
			}
		}

		return property;
	}

	private boolean isOneInstance(String[] multiplicityBoundariesAsExpressons) {
		logger.debug("isOneInstance");
		return (((multiplicityBoundariesAsExpressons[0] == null) && (multiplicityBoundariesAsExpressons[1] == null))
				|| (multiplicityBoundariesAsExpressons[0] == "") && (multiplicityBoundariesAsExpressons[1] == ""))
				|| (isEqualToOne(multiplicityBoundariesAsExpressons[0])
						&& isEqualToOne(multiplicityBoundariesAsExpressons[1]));
	}

	private boolean isEqualToOne(String expression) {
		return isInteger(expression) && (Integer.valueOf(expression) == 1);
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}

	/**
	 * Removes a delegation constraint from the list.
	 * 
	 * @param members
	 *            the list of members
	 * @param qualifiedElement
	 *            the qualified name of the delegation constraint to remove
	 */
	public void removeDelegationConstraint(EList<Constraint> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	public boolean equalMultiplicityBoundaries(String[] newMultiplicityRange, String[] multiplicityRange) {
		logger.debug("equalMultiplicityBoundaries [0]: " + newMultiplicityRange[0] + " " + multiplicityRange[0]);
		logger.debug("equalMultiplicityBoundaries [1]: " + newMultiplicityRange[1] + " " + multiplicityRange[1]);
		boolean equalLowerValue = equals(newMultiplicityRange[0], multiplicityRange[0]);
		boolean equalUpperValue = equals(newMultiplicityRange[1], multiplicityRange[1]);
		logger.debug(equalLowerValue + " - " + equalUpperValue);
		return (equalLowerValue && equalUpperValue);

	}

	private boolean equals(String text1, String text2) {
		// logger.debug("(text1 == text2): " + (text1 == text2));
		// logger.debug("text1.equals(text2): "+text1.equals(text2) );
		return ((text1 == text2) && (text2 == null)) || ((text1 != null) && (text2 != null) && text1.equals(text2));
	}

	public void setAttributeMultiplicity(MultiplicityElement property, String[] newMultiplicityRange) {
		logger.debug("setAttributeMultiplicity: " + newMultiplicityRange[0] + " " + newMultiplicityRange[1]);
		if (newMultiplicityRange[0] != null) {
			property.setLowerValue(createLiteralStringWithValue(newMultiplicityRange[0]));
		} else {
			property.setLowerValue(null);
		}

		if (newMultiplicityRange[1] != null) {
			property.setUpperValue(createLiteralStringWithValue(newMultiplicityRange[1]));
		} else {
			property.setUpperValue(null);
		}
	}

	private LiteralString createLiteralStringWithValue(String value) {
		LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setValue(value);
		return literalString;
	}

	/**
	 * Returns the list of Parameter Assumptions of the given element.
	 * 
	 * @param umlElement
	 *            the element to analyze
	 * @return the list of Parameter Assumptions as Constraints
	 */
	public EList<Constraint> getParameterAssumptionsAsConstraintsUml(Element umlElement) {
		EList<Constraint> constraints = new BasicEList<Constraint>();

		if (isBlock(umlElement) || isCompType(umlElement) || isComponentImplementation(umlElement)) {
			//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(PARAMETER_ASSUMPTIONS, umlElement);
			for (Constraint umlConstraint : ((Class) umlElement).getOwnedRules()) {
				if ((umlConstraint.getAppliedStereotype(PARAMETER_ASSUMPTIONS)!=null)) {
					constraints.add((Constraint) umlConstraint);
				}
			}
		}

		if (isComponentInstance(umlElement)) {
			constraints.addAll(getParameterAssumptionsAsConstraintsUml(getUmlType((Property) umlElement)));
		}

		return constraints;
	}

	/**
	 * Checks if the given element is a Parameter Assumptions.
	 * 
	 * @param umlConstraint
	 *            the constraint
	 * @return true if the given element is a Parameter Assumptions.
	 */
	public boolean isParameterAssumptions(Element umlConstraint) {		
		if (umlConstraint instanceof Constraint) {
			//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(PARAMETER_ASSUMPTIONS, umlConstraint);
			return (umlConstraint.getAppliedStereotype(PARAMETER_ASSUMPTIONS)!=null);
		}
		return false;
	}

	/**
	 * Creates a new Parameter Assumptions element.
	 * 
	 * @param owner
	 *            the owning element
	 * @param parameterAssumptionsExpression
	 *            the expression
	 * @param parameterAssumptionsStereotype
	 *            the stereotype to apply
	 * 
	 * @return
	 */
	public Constraint createParameterAssumptions(Class owner, String parameterAssumptionsExpression,
			Stereotype parameterAssumptionsStereotype) {
		final int numParameterAssumptions = getParameterAssumptionsAsConstraintsUml(owner).size();
		final String parameterAssumptionsName = DEFAULT_PAR_ASSUMPTION_PREFIX + (numParameterAssumptions + 1);

		logger.debug("\n\n\n Creating Parameter Assumption " + parameterAssumptionsName + " for owner " + owner);
		logger.debug("\n\n\n");

		final Constraint newUMLConstraint = owner.createOwnedRule(parameterAssumptionsName);
		newUMLConstraint.applyStereotype(parameterAssumptionsStereotype);

		final LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setName(DEFAULT_PAR_ASSUMPTION_LITERAL_STRING_NAME);
		literalString.setValue(parameterAssumptionsExpression);
		newUMLConstraint.setSpecification(literalString);

		logger.debug("\n\nCreated " + parameterAssumptionsName + " Parameter Assumption\n\n");
		return newUMLConstraint;
	}

	/* Should be no more used */
	public Element createUmlConstraint(Class owner, String parameterAssumptionsText) {
		int numParameterAssumptions = getParameterAssumptionsAsConstraintsUml(owner).size();
		String parameterAssumptionsName = DEFAULT_PAR_ASSUMPTION_PREFIX + (numParameterAssumptions + 1);

		logger.debug("\n\n\n Creating constraint " + parameterAssumptionsName + " for owner " + owner);
		logger.debug("\n\n\n");

		final Constraint newUMLConstraint = owner.createOwnedRule(parameterAssumptionsName);
		final LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setName(DEFAULT_PAR_ASSUMPTION_LITERAL_STRING_NAME);
		literalString.setValue(parameterAssumptionsText);
		newUMLConstraint.setSpecification(literalString);

		logger.debug("\n\nCreated " + parameterAssumptionsName + " Constraint\n\n");
		return newUMLConstraint;
	}

	/**
	 * Returns the Constraint associated to the ParameterAssumptions with the
	 * given expression
	 * 
	 * @param parameterAssumptionsExpression
	 *            the expression to find
	 * @param owner
	 *            the owning element
	 * @return the UML Constraint found
	 */
	public Constraint getParameterAssumptionsFromExpression(String parameterAssumptionsExpression, Class owner) {
		//Stereotype stereotype = StereotypeUtil.getCHESSStereotype(PARAMETER_ASSUMPTIONS, owner);
		for (Constraint umlConstraint : ((Class) owner).getOwnedRules()) {
			if ((umlConstraint.getAppliedStereotype(PARAMETER_ASSUMPTIONS)!=null)
					&& getConstraintBodyStr(umlConstraint, null).equals(parameterAssumptionsExpression)) {
				return umlConstraint;
			}
		}
		return null;
	}

	public void removeParameterAssumptions(EList<Constraint> members, String qualifiedElement) {
		removeNamedElement(members, qualifiedElement);
	}

	public String[] getUmlFunctionBehaviorOutputMultiplicity(FunctionBehavior uninterpretedFunction) {
		for (Parameter parameter : uninterpretedFunction.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.OUT_LITERAL) {
				return getAttributeMultiplicity(parameter);
			}
		}
		return null;
	}

	public EList<String[]> getUmlFunctionBehaviorInputMultiplicities(FunctionBehavior uninterpretedFunction) {
		EList<String[]> inputMultiplicities = new BasicEList<String[]>();

		for (Parameter parameter : uninterpretedFunction.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.IN_LITERAL) {
				inputMultiplicities.add(getAttributeMultiplicity(parameter));
			}
		}
		return inputMultiplicities;
	}

	/**
	 * Returns the properties of the component that are only local to it.
	 * 
	 * @param component
	 * @return
	 */
	public EList<Property> getLocalProperties(Element component) {
		final EList<Property> localProperties = new BasicEList<Property>();

		if (isComponentInstance(component)) {
			component = getUmlType((Property) component);
		}

		if (isBlock(component) || (isCompType(component) || (isComponentImplementation(component)))) {
			final Class umlClass = (Class) component;
			final EList<Property> attributes = umlClass.getOwnedAttributes();
			for (final Property umlProperty : attributes) {
				//FIXME stereotype
				if (umlProperty != null && !isComponentInstance(umlProperty) && !isPort(umlProperty)
						&& !ContractEntityUtil.getInstance().isContractProperty(umlProperty)) {
					localProperties.add(umlProperty);
				}
			}
		}
		return localProperties;
	}

	/**
	 * Returns the name of a local property.
	 * 
	 * @param property
	 *            the property
	 * @return the property name
	 */
	public String getLocalPropertyName(Property property) {
		if (property != null) {
			return property.getName();
		}
		return null;
	}

	/**
	 * Returns the list of enumerations as a single string.
	 * 
	 * @param enumeration
	 *            the enumeration
	 * @return the list of values
	 */
	private String getEnumTypeValuesAsStr(Enumeration enumeration) {
		final StringJoiner enumValues = new StringJoiner(", ", "[", "]");

		for (final String value : getListValuesForEnumeratorType(enumeration)) {
			enumValues.add(value);
		}
		return enumValues.toString();
	}

	/**
	 * Returns the type of a local property, taking care of range and
	 * enumerations.
	 * 
	 * @param property
	 *            the property
	 * @return the property type
	 */
	public String getLocalPropertyType(Property property) {
		if (property != null) {
			final Type propertyType = property.getType();

			if (propertyType != null) {
				if (isRangeType(propertyType)) {
					String[] range = getLowerUpperBoundsForRangeType(propertyType);
					return propertyType.getName() + " - Range [" + range[0] + " .. " + range[1] + "]";
				} else if (isEnumerationType(propertyType)) {

					return propertyType.getName() + " - Enum " + getEnumTypeValuesAsStr((Enumeration) propertyType);
				} else {
					return propertyType.getName();
				}
			}
		}
		return null;
	}

	/**
	 * Creates a new Macro Definition element.
	 * 
	 * @param owner
	 *            the owning element
	 * @param macroDefinitionName
	 *            the name of the macro
	 * @param macroDefinitionExpression
	 *            the expression
	 * @param macroDefinitionStereotype
	 *            the stereotype to apply
	 * 
	 * @return the Constraint element
	 */
	public Constraint createMacroDefinition(Class owner, String macroDefinitionName, String macroDefinitionExpression,
			Stereotype macroDefinitionStereotype) {
		logger.debug("\n\n\n Creating Macro Definition " + macroDefinitionName + " for owner " + owner);
		logger.debug("\n\n\n");

		final Constraint newUMLConstraint = owner.createOwnedRule(macroDefinitionName);
		newUMLConstraint.applyStereotype(macroDefinitionStereotype);

		final LiteralString literalString = UMLFactory.eINSTANCE.createLiteralString();
		literalString.setName(DEFAULT_MACRO_DEFINITION_STRING_NAME);
		literalString.setValue(macroDefinitionExpression);
		newUMLConstraint.setSpecification(literalString);

		logger.debug("\n\nCreated " + macroDefinitionName + " Macro Definition\n\n");
		return newUMLConstraint;
	}

	/**
	 * Updates the expression of the given Macro Definition, if needed.
	 * 
	 * @param umlConstraint
	 *            the Macro Definition as Constraint
	 * @param macroDefinitionExpression
	 *            the new expression
	 * @param mapMacroDefinitionsToKeep
	 *            the map of existing Macro Definitions
	 */
	public void updateMacroDefinition(Constraint umlConstraint, String macroDefinitionExpression, String language) {

		// Get the current expression
		final String constraintExpression = getConstraintBodyStr(umlConstraint, language);

		// If the expression is different, save it, otherwise go on
		if (!macroDefinitionExpression.equals(constraintExpression)) {
			setLiteralStringTextInUMLConstraint(umlConstraint, macroDefinitionExpression);
		}
	}

	public Class getSystemElement(Model model) throws Exception {

		if (model != null) {
			TreeIterator<EObject> allElements = model.eResource().getAllContents();
			//Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(SYSTEM, model);
			if (allElements != null) {
				Collection<org.eclipse.uml2.uml.Class> classes = EcoreUtil
						.getObjectsByType(iterator2Collection(allElements), UMLPackage.eINSTANCE.getClass_());

				for (Class c : classes) {
					if ((c.getAppliedStereotype(SYSTEM)!=null)) {
						return c;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the System component of the given package, if any.
	 * 
	 * @param pkg
	 *            the package containing the architecture
	 * @return the System component, or null if any or more than one are found
	 */
	public Class getSystemComponent(Package pkg) {
		boolean found = false;
		Element systemElement = null;

		if (pkg != null) {
			final EList<Element> ownedElements = pkg.getOwnedElements();
			//Stereotype stereotype = StereotypeUtil.getCHESSContractStereotype(SYSTEM, pkg);
			for (Element element : ownedElements) {
				if ((element.getAppliedStereotype(SYSTEM)!=null)) {
					if (!found) {
						systemElement = element;
						found = true;
					} else {
						return null;
					}
				}
			}
		}
		if (found) {
			return (Class) systemElement;
		} else {
			return null;
		}
	}

	public EList<String> getParametersListFromInstantiatedArchitectureConfiguration(
			InstantiatedArchitectureConfiguration instantiatedArchitectureConfiguration) {
		return instantiatedArchitectureConfiguration.getParameterList();
	}

	public EList<Operation> getUmlOperations(Element umlElement) {

		if (isComponentInstance((Element) umlElement)) {
			umlElement = ((Property) umlElement).getType();
		}

		if (umlElement instanceof Class) {
			Class umlClass = (Class) umlElement;
			return umlClass.getOwnedOperations();
		}

		return null;
	}

	public EList<Operation> getUmlOperations(Element umlElement, String language) {

		EList<Operation> operations = null;

		if (isComponentInstance((Element) umlElement)) {
			umlElement = ((Property) umlElement).getType();
		}

		if (umlElement instanceof Class) {
			Class umlClass = (Class) umlElement;
			if (!umlClass.getOwnedOperations().isEmpty()) {
				operations = new BasicEList<Operation>();
			}
			for (Operation operation : umlClass.getOwnedOperations()) {
				if (getUmlOperationBody(operation, language) != null) {
					operations.add(operation);
				}
			}
		}

		return operations;
	}

	public String getUmlOperationName(Operation operation) {
		return operation.getName();
	}

	public EList<?> getUmlOperationInputTypes(Operation operation) {
		EList<Type> inputTypes = new BasicEList<Type>();

		for (Parameter parameter : operation.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.IN_LITERAL) {
				inputTypes.add(parameter.getType());
			}
		}
		return inputTypes;
	}

	public String getUmlOperationBody(Operation operation, String language) {
		if (!operation.getMethods().isEmpty()) {
			Behavior behavior = operation.getMethods().get(0);
			if (behavior instanceof OpaqueBehavior) {
				return getOpaqueBehaviorBody((OpaqueBehavior) behavior, language);
			} else if (behavior instanceof FunctionBehavior) {
				return getFunctionBehaviorBody((FunctionBehavior) behavior, language);
			}
		}
		return null;
	}

	public Type getUmlOperationOutputType(Operation operation) {
		for (Parameter parameter : operation.getOwnedParameters()) {
			if (parameter.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
				return parameter.getType();
			}
		}
		return null;
	}

	/**
	 * Gets the value of the 'Body' attribute for the
	 * <code>FunctionBehavior</code> for a given language.
	 *
	 * @param language
	 *            the language in which the body is written
	 * @return the value of 'Body' at the index i
	 */
	public String getFunctionBehaviorBody(FunctionBehavior functionBehavior, String language) {
		return getBodyForLanguageOfBodyOwner(functionBehavior, language);
	}

	/**
	 * Gets the value of the 'Body' attribute for the
	 * <code>OpaqueBehavior</code> for a given language.
	 *
	 * @param language
	 *            the language in which the body is written
	 * @return the value of 'Body' at the index i
	 */
	public String getOpaqueBehaviorBody(OpaqueBehavior opaqueBehavior, String language) {
		return getBodyForLanguageOfBodyOwner(opaqueBehavior, language);
	}

	/**
	 * Returns the body for a bodyOwner for the given language
	 *
	 * @param bodyOwner
	 *            the bodyOwner to edit.
	 * @param language
	 *            the language in which the body is written
	 * @return the body for the given language or the empty string if the
	 *         language was not found
	 */
	public String getBodyForLanguageOfBodyOwner(BodyOwner bodyOwner, String language) {
		String body = null;
		if (language == null) {
			if (!bodyOwner.getBodies().isEmpty()) {
				body = bodyOwner.getBodies().get(0);
			}
		} else {
			// retrieve the index of the given language in the opaque Expression
			int index = bodyOwner.getLanguages().indexOf(language);
			if (index != -1) {
				// language found. return the corresponding body in the bodies
				// list.
				// List should be synchronized, ie having the same size, but be
				// sure...
				if (index < bodyOwner.getBodies().size()) {
					body = bodyOwner.getBodies().get(index);
				}
			}
		}
		return body;
	}

	/**
	 * sets the body for a bodyOwner for the given language.
	 * <p>
	 * If the language was already defined, it replaces the corresponding body.
	 * If the language was not already defined, it adds it to the list of
	 * languages and adds the corresponding body.
	 * <p>
	 * A utility method,
	 * {@link OpaqueExpression#checkAndCorrectLists(org.eclipse.uml2.uml.OpaqueExpression)}
	 * is used to correct the language and body lists.
	 *
	 * @param bodyOwner
	 *            the opaque expression to edit.
	 * @param language
	 *            the language in which the body is written
	 * @param body
	 *            the body to save
	 */
	public void setBodyForLanguageOfBodyOwner(BodyOwner bodyOwner, String language, String body) {
		// checks both lists by size
		checkAndCorrectListsOfBodyOwner(bodyOwner);
		// checks if language exists, if not, creates one
		if (!bodyOwner.getLanguages().contains(language)) {
			bodyOwner.getLanguages().add(language);
			bodyOwner.getBodies().add(body);
		} else {
			// retrieve the index of the given language in the opaque Expression
			int index = bodyOwner.getLanguages().indexOf(language);
			// sets the body at the given index in the list of bodies.
			bodyOwner.getBodies().set(index, body);
		}
	}

	/**
	 * Checks body and languages list of a bodyOwner.
	 * <p>
	 * It returns <code>true</code> if both lists have the same size. It returns
	 * <code>false</code> if one of the list was bigger than the other one. In
	 * this latter case, one of the list was corrected, ie enough elements where
	 * added in the list
	 *
	 * @param bodyOwner
	 *            the bodyOwner to check
	 * @return <code>true</code> if both lists already had the same size,
	 *         <code>false</code> in other cases.
	 */
	private boolean checkAndCorrectListsOfBodyOwner(BodyOwner bodyOwner) {
		// both lists, languages and bodies, should have the same size
		final int bodySize = bodyOwner.getBodies().size();
		final int languageSize = bodyOwner.getLanguages().size();
		// check both size
		// if equals, lists are supposed synchronized, it is ok
		// if less body than languages, add bodies
		// if more body, add enough languages
		if (bodySize == languageSize) {
			return true;
		} else {
			final int difference = languageSize - bodySize;
			if (difference > 0) {
				// more languages strings than body strings, add enough bodies
				for (int i = 0; i < difference; i++) {
					bodyOwner.getBodies().add("");
				}
			} else {
				// more body strings than language strings, add enough languages
				for (int i = 0; i < (-difference); i++) {
					bodyOwner.getLanguages().add("");
				}
			}
			// lists had to be modified, return false...
			return false;
		}
	}

	public EList<Property> getBlockTypeAttributes(Class blockAsClass) {
		EList<Property> attributes = new BasicEList<Property>();

		for (Property umlProperty : blockAsClass.getOwnedAttributes()) {
			if (!isPort(umlProperty)) {
				if (isBlockTypeAttribute(umlProperty)) {
					attributes.add(umlProperty);
				}
			}
		}

		return attributes;
	}

	public String getAttributeVisibility(Property attribute) {
		return attribute.getVisibility().getName();
	}

	public boolean isBlockTypeAttribute(String attributeName, Class blockAsClass) {
		if (blockAsClass != null) {
			for (Property umlProperty : blockAsClass.getOwnedAttributes()) {
				if (!isPort(umlProperty)) {
					if (isBlockTypeAttribute(umlProperty) && (umlProperty.getName().equals(attributeName))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean isBlockTypeAttribute(Property umlProperty) {
		return (umlProperty.getType() != null) && (isBlock(umlProperty.getType()));
	}

	/*
	 * public boolean isConcurrentOperation(String operationName, Class
	 * blockType) {
	 * 
	 * if (blockType != null) { logger.debug("isConcurrentOperation: " +
	 * operationName + " class: " + blockType.getName()); for (Operation
	 * operation : blockType.getOperations()) {
	 * 
	 * logger.debug("operation.getName(): " + operation.getName());
	 * logger.debug("operation.getConcurrency(): " +
	 * operation.getConcurrency());
	 * logger.debug("CallConcurrencyKind.CONCURRENT_LITERAL: " +
	 * CallConcurrencyKind.CONCURRENT_LITERAL); logger.
	 * debug("operation.getConcurrency().getLiteral().equals(CallConcurrencyKind.CONCURRENT_LITERAL) "
	 * + operation.getConcurrency().getLiteral().equals(CallConcurrencyKind.
	 * CONCURRENT_LITERAL));
	 * logger.debug("operation.getName().equals(operationName)) " +
	 * operation.getName().equals(operationName));
	 * 
	 * if (operation.getConcurrency().equals(CallConcurrencyKind.
	 * CONCURRENT_LITERAL) && (operation.getName().equals(operationName))) {
	 * logger.debug("TRUE"); return true; } } } return false; }
	 */

	/**
	 * Return the first block in the given package
	 * 
	 * @param currPackage
	 *            the package where to look for
	 * @param blockName
	 *            the name of the block to retrieve
	 * @param ignoreCase
	 * @return the block
	 */
	public Class getBlockType(Package currPackage, String blockName, boolean ignoreCase) {
		// PackageableElement element =
		// currPackage.getPackagedElement(blockName);
		PackageableElement element = currPackage.getPackagedElement(blockName, ignoreCase,
				UMLPackage.eINSTANCE.getClass_(), false);
		if (isBlock(element)) {
			return (Class) element;
		}
		return null;
	}

	public Class getAttributeBlockType(String attributeName, Class block) {
		// logger.debug("getAttributeBlockType: " + block + " , " +
		// attributeName);
		for (Property property : block.getAttributes()) {
			// logger.debug("property.getName(): " + property.getName());
			// logger.debug("isBlockTypeAttribute(property): " +
			// isBlockTypeAttribute(property));
			if (property.getName().equals(attributeName) && (isBlockTypeAttribute(property))) {
				// logger.debug("OK!");
				return (Class) property.getType();
			}
		}
		return null;
	}

	public Type getOperationType(String operationName, Class block) {
		final Operation operation = getOperation(operationName, block);
		if (operation != null) {
			return getUmlOperationOutputType(operation);
		}
		// // logger.debug("getOperationType: " + block + " , " +
		// operationName);
		// for (Operation operation : block.getOwnedOperations()) {
		// // logger.debug("operation.getName(): " + operation.getName());
		// if (operation.getName().equals(operationName)) {
		// // logger.debug("OK!");
		// return getUmlOperationOutputType(operation);
		// }
		// }
		return null;
	}

	/**
	 * Returns the first operation found with the given name. <br>
	 * This is a very trivial method, no additional checks are done.
	 * 
	 * @param operationName
	 *            the name of the Operation
	 * @param block
	 *            the owner class
	 * @return the Operation
	 */
	public Operation getOperation(String operationName, Class block) {
		return block.getOwnedOperation(operationName, null, null);
		// logger.debug("getOperationType: " + block + " , " + operationName);
		// for (Operation operation : block.getOwnedOperations()) {
		// logger.debug("operation.getName(): " + operation.getName());
		// if (operation.getName().equals(operationName)) {
		// logger.debug("OK!");
		// return operation;
		// }
		// }
		// return null;
	}

	/**
	 * Returns the first property found with the given name. <br>
	 * This is a very trivial method, no additional checks are done.
	 * 
	 * @param propertyName
	 *            the name of the Property
	 * @param block
	 *            the owner class
	 * @return the Property
	 */
	public Property getProperty(String propertyName, Class block) {
		return block.getOwnedAttribute(propertyName, null);
	}

	/**
	 * Returns the list of properties for the given class.
	 * 
	 * @param block
	 *            the owner class
	 * @return the list of properties
	 */
	public EList<Property> getProperties(Class block) {
		return block.getOwnedAttributes();
	}

	public boolean isAttribute(String attributeName, Class blockAsClass) {
		if (blockAsClass != null) {
			Property umlProperty = blockAsClass.getOwnedAttribute(attributeName, null);
			if ((umlProperty != null) && (!isPort(umlProperty))) {
				return true;
			}
			/*
			 * for (Property umlProperty : blockAsClass.getOwnedAttributes()) {
			 * if (umlProperty.getName().equals(attributeName)) { if
			 * (!isPort(umlProperty)) { return true; } } }
			 */
		}
		return false;
	}

	public boolean isOperation(String operationName, Class blockAsClass) {
		if (blockAsClass != null) {
			Operation umlOperation = blockAsClass.getOwnedOperation(operationName, null, null);
			if (umlOperation != null) {
				return true;
			}
		}
		return false;
	}

	public boolean containsEnumeration(Package currPackage, boolean searchInNestedPackages) {

		final EList<Type> types = currPackage.getOwnedTypes();
		for (Type type : types) {
			if (type instanceof Enumeration) {
				return true;
			}
		}

		if (searchInNestedPackages) {
			for (Package nestedPackage : currPackage.getNestedPackages()) {
				if (containsEnumeration(nestedPackage, searchInNestedPackages))
					return true;
			}
		}
		return false;
	}

	public Type getAttributeType(String attributeName, Class block) {
		// logger.debug("getAttribute of block: " + block + " , " +
		// attributeName);
		for (Property property : block.getAttributes()) {
			// logger.debug("property.getName(): " + property.getName());
			if (property.getName().equals(attributeName)) {
				// logger.debug("OK!");
				return property.getType();
			}
		}
		return null;
	}

	public Type getParameterType(int paramIndex, String methodName, Class retrieveBlockType) {
		// logger.debug("getParameterType: " + retrieveBlockType + " , " +
		// methodName + " , " + paramIndex);
		Operation operation = getOperation(methodName, retrieveBlockType);
		// logger.debug("getParameterType operation: " + operation);
		if ((operation != null) // && (operation.getMethods() != null) &&
								// (!operation.getMethods().isEmpty())
		) {

			if (operation.inputParameters() != null) {
				EList<Parameter> params = operation.inputParameters();
				if ((!params.isEmpty())) {
					Parameter par = params.get(paramIndex);
					if (par != null) {
						// logger.debug("getParameterType par: " + par);
						return par.getType();
					}
				}
			}
		}
		return null;
	}

	public String getCallEventOperationName(Trigger trigger) {
		if (trigger.getEvent() instanceof CallEvent) {
			return ((CallEvent) trigger.getEvent()).getOperation().getName();
		}

		return null;
	}

	public Collection<CallEvent> getAllCallEvent(Class currBlock) {
		Model model = currBlock.getModel();
		TreeIterator<EObject> allElements = model.eResource().getAllContents();
		if (allElements != null) {
			Collection<CallEvent> callEvents = EcoreUtil.getObjectsByType(iterator2Collection(allElements),
					UMLPackage.eINSTANCE.getCallEvent());
			return callEvents;
		}
		return null;
	}

	public String getCallEventOperationName(CallEvent callEvent) throws Exception {
		if (callEvent.getOperation() != null) {
			return callEvent.getOperation().getName();
		}
		throw new Exception("The callEvent " + callEvent.getQualifiedName() + " has no associated operation");
	}

	public EList<String> getOperationsNames(Class component) {
		EList<String> operationsNames = new BasicEList<String>();
		for (Operation operation : component.getOwnedOperations()) {
			String operationName = operation.getName();
			operationsNames.add(operationName);
		}
		return operationsNames;
	}

	public EList<String> getAttributesNames(Class component) {
		EList<String> attributesNames = new BasicEList<String>();
		for (Property attribute : component.getOwnedAttributes()) {
			String attributeName = attribute.getName();
			if (!isPort(attribute)) {
				attributesNames.add(attributeName);
			}
		}
		return attributesNames;
	}

	public EList<Parameter> getOperationParameters(String operationName, Class parentClass) {
		Operation op = parentClass.getOwnedOperation(operationName, null, null);
		if (op != null) {
			return op.getOwnedParameters();
		}
		return null;
	}

	public Operation getCallEventOperation(CallEvent callEvent) throws Exception {
		if (callEvent.getOperation() != null) {
			return callEvent.getOperation();
		}
		throw new Exception("The callEvent " + callEvent.getQualifiedName() + " has no associated operation");
	}

	public EList<String> getParametersNames(Operation operation) {
		EList<String> parametersNames = new BasicEList<String>();
		for (Parameter par : operation.getOwnedParameters()) {
			parametersNames.add(par.getName());
		}
		return parametersNames;
	}

	public Object getParameterType(String paramName, String methodName, Class retrieveBlockType) {
		Operation operation = getOperation(methodName, retrieveBlockType);
		if ((operation != null)) {
			if (operation.inputParameters() != null) {
				Parameter par = operation.getOwnedParameter(paramName, null);
				if (par != null) {
					// logger.debug("getParameterType par: " + par);
					return par.getType();
				}
			}
		}
		return null;
	}

	public List<String> getMethodArgumentNames(String methodName, Class retrieveBlockType) {
		List<String> args = new ArrayList<String>();
		Operation operation = getOperation(methodName, retrieveBlockType);
		if ((operation != null)) {
			if (operation.inputParameters() != null) {
				for (Parameter par : operation.inputParameters()) {
					args.add(par.getName());
				}
			}
		}
		return args;
	}

	@SuppressWarnings("unchecked")
	public Collection<Enumeration> getAllEnumeratives(Package packageElement) throws Exception {
		return (Collection<Enumeration>) EObjectUtil.getAllElements(UMLPackage.eINSTANCE.getEnumeration(),
				packageElement);
	}

	/**
	 * Returns all the classes in the model.
	 * <p>
	 * BEWARE: all the classes, not only the classes in the given package
	 * 
	 * @param packageElement
	 * @return
	 * @throws Exception
	 */
	public Collection<Class> getAllClasses(Package packageElement) throws Exception {
		Collection<Class> classElements = null;
		if (packageElement != null) {
			TreeIterator<EObject> allElements = packageElement.eResource().getAllContents();
			if (allElements != null) {
				classElements = getClassObjects(iterator2Collection(allElements));
			}
			return classElements;
		}
		throw new Exception("Element does not exist.");
	}

	public Object getParameterType(String paramName, Operation operation) {
		if ((operation != null)) {
			if (operation.inputParameters() != null) {
				Parameter par = operation.getOwnedParameter(paramName, null);
				if (par != null) {
					// logger.debug("getParameterType par: " + par);
					return par.getType();
				}
			}
		}
		return null;
	}

	public Collection<Operation> getAllOperations(Package packageElement) throws Exception {
		if (packageElement != null) {
			TreeIterator<EObject> allElements = packageElement.eResource().getAllContents();
			Collection<org.eclipse.uml2.uml.Operation> operations = EcoreUtil
					.getObjectsByType(iterator2Collection(allElements), UMLPackage.eINSTANCE.getOperation());
			return operations;
		}
		throw new Exception("Element does not exist.");
	}

	public static <T> Collection<T> getClassObjects(Collection<EObject> objects) {
		Collection<T> result = new ArrayList<T>();
		for (EObject object : objects) {
			if (UMLPackage.eINSTANCE.getClass_().isInstance(object) && object.eContainer() instanceof Package) {
				@SuppressWarnings("unchecked")
				T t = (T) object;
				result.add(t);
			}
		}
		return result;
	}

	/**
	 * Returns true if the visibility of the given element is private.
	 * 
	 * @param e
	 *            the NamedElement
	 * @return
	 * @throws Exception
	 *             in case no visibility is set
	 */
	public boolean isVisibilityPrivate(NamedElement e) throws Exception {
		if (e.isSetVisibility()) {
			return (e.getVisibility() == VisibilityKind.PRIVATE_LITERAL);
		}
		throw new Exception("Element does not have any visibility");
	}

	/**
	 * Returns true if the visibility of the given element is priprotected.
	 * 
	 * @param e
	 *            the NamedElement
	 * @return
	 * @throws Exception
	 *             in case no visibility is set
	 */
	public boolean isVisibilityProtected(NamedElement e) throws Exception {
		if (e.isSetVisibility()) {
			return (e.getVisibility() == VisibilityKind.PROTECTED_LITERAL);
		}
		throw new Exception("Element does not have any visibility");
	}

	/**
	 * Returns true if the visibility of the given element is public.
	 * 
	 * @param e
	 *            the NamedElement
	 * @return
	 * @throws Exception
	 *             in case no visibility is set
	 */
	public boolean isVisibilityPublic(NamedElement e) throws Exception {
		if (e.isSetVisibility()) {
			return (e.getVisibility() == VisibilityKind.PUBLIC_LITERAL);
		}
		throw new Exception("Element does not have any visibility");
	}

	/**
	 * Returns all the direct and indirect elements of the given package.
	 * 
	 * @param pkg
	 *            the package to navigate
	 * @return
	 */
	public EList<Element> getAllPackageElements(Package pkg) {
		return pkg.allOwnedElements();
	}

	public List<String> getClassNames(List<?> classes) {
		List<String> names = new ArrayList<String>();
		for (Object block : classes) {
			if(block instanceof Class){
			names.add(((Class)block).getName());
			}
		}
		return names;
	}
}