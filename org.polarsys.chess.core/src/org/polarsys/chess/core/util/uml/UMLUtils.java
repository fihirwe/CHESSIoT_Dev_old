/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Author: Alessandro Zovi         azovi@math.unipd.it 		         --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
 */

package org.polarsys.chess.core.util.uml;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaEndtoEndFlow;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaExecHost;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaStep;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.ClientServerKind;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.ClientServerPort;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Assign;
import org.eclipse.papyrus.infra.emf.utils.BusinessModelResolver;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.uml.tools.model.UmlModel;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.internal.impl.DependencyImpl;
import org.polarsys.chess.chessmlprofile.ComponentModel.ComponentImplementation;
import org.polarsys.chess.chessmlprofile.ComponentModel.FunctionalPartition;
import org.polarsys.chess.chessmlprofile.Core.CHGaResourcePlatform;
import org.polarsys.chess.chessmlprofile.Core.PSMPackage;
import org.polarsys.chess.chessmlprofile.Predictability.ARINCComponentModel.ARINCFunction;
import org.polarsys.chess.chessmlprofile.Predictability.ARINCComponentModel.ARINCProcess;
import org.polarsys.chess.chessmlprofile.Predictability.DeploymentConfiguration.HardwareBaseline.CH_HwProcessor;
import org.polarsys.chess.chessmlprofile.Predictability.RTComponentModel.CHRtPortSlot;
import org.polarsys.chess.chessmlprofile.Predictability.RTComponentModel.CHRtSpecification;
import org.polarsys.chess.chessmlprofile.Safety.CriticalityLevel;
import org.polarsys.chess.chessmlprofile.util.Constants;
import org.polarsys.chess.core.notifications.ResourceNotification;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.util.AnalysisResultData;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.util.EndToEndResultData;
import org.polarsys.chess.core.util.HWAnalysisResultData;
import org.polarsys.chess.core.views.ViewUtils;

/**
 * This class contains a list of utility methods to deal with UML models.
 *
 */
public class UMLUtils {

	/**
	 * Returns the XML ID (UUID) of a model element.
	 * It may be useful for external tools to precisely refer to a model element.
	 * 
	 * @param el  the model element
	 * @return  the UUID
	 */
	public static String getElementID(Element el){
		Resource resource = el.eResource();
		if(resource != null)
			return resource.getURIFragment(el);
		return null;
	}

	/**
	 * Checks if the given operation is public.
	 * 
	 * @param operation  the operation
	 * @return true if it is public
	 */
	public static boolean hasPublicVisibility(Operation operation) {
		if (operation.getVisibility().getValue() == VisibilityKind.PUBLIC)
			return true;
		return false;
	}

	/**
	 * Checks if two parameters are the same.
	 * 
	 * @param param  the source parameter
	 * @param aux  the target paramater 
	 * @return true if they are the same
	 */
	public static boolean areParametersEqual(Parameter param, Parameter aux) {
		// parameter's name
		if (!param.getName().equals(aux.getName()))
			return false;

		// parameter's direction
		if (param.getDirection().getValue() != aux.getDirection().getValue())
			return false;

		// parameter's visibility
		if (param.getVisibility().getValue() != aux.getVisibility().getValue())
			return false;

		if (param.isException() != aux.isException())
			return false;

		if (param.isMultivalued() != aux.isMultivalued())
			return false;

		if (param.isOrdered() != aux.isOrdered())
			return false;

		if (param.isSetDefault() != aux.isSetDefault())
			return false;

		if (param.isUnique() != aux.isUnique())
			return false;

		if (param.isStream() != aux.isStream())
			return false;

		if (param.getEffect().getValue() != aux.getEffect().getValue())
			return false;

		if (param.lowerBound() != aux.lowerBound())
			return false;

		if (param.upperBound() != aux.upperBound())
			return false;
		return true;
	}

	/**
	 * Copy the source operation data to the target operation.
	 * 
	 * @param source  the source operation
	 * @param target  the target operation
	 */
	public static void copyOperation(Operation source, Operation target) 
	{
		for (Parameter param : source.getOwnedParameters()) {
			Parameter p = target.createOwnedParameter(param.getName(), param.getType());
			p.setDirection(param.getDirection());
			p.setEffect(param.getEffect());
			p.setDefaultValue(param.getDefaultValue());
			p.setDefault(param.getDefault());
			p.setIsException(param.isException());
			p.setIsOrdered(param.isOrdered());
			p.setIsStream(param.isStream());
			p.setIsUnique(param.isUnique());
			p.setLower(param.getLower());
			p.setLowerValue(param.getLowerValue());
			p.setTemplateParameter(param.getTemplateParameter());
			p.setUpper(param.getUpper());
			p.setUpperValue(param.getUpperValue());
			p.setVisibility(param.getVisibility());
		}
		target.setVisibility(source.getVisibility());
		target.setConcurrency(source.getConcurrency());
		target.setIsQuery(source.isQuery());
		target.setIsLeaf(source.isLeaf());
		target.setIsStatic(source.isStatic());
		//target.getRedefinedOperations().add(source);
	}

	/*	public static boolean isOperationEquals(Operation source, Operation target) {
		// check the parameters
		Parameter param, aux;
		EList<Parameter> targetList = target.getOwnedParameters();
		// check their order
		if (targetList.size() != source.getOwnedParameters().size())
			return false;

		if (source.getVisibility().getValue() != target.getVisibility()
				.getValue())
			return false;

		if (source.isQuery() != target.isQuery())
			return false;

		if (source.isLeaf() != target.isLeaf())
			return false;

		if (source.isStatic() != target.isStatic())
			return false;

		if (source.getConcurrency().getValue() != target.getConcurrency()
				.getValue())
			return false;

		for (int i = 0; i < targetList.size(); i++) {
			param = targetList.get(i);
			aux = source.getOwnedParameter(param.getName(), param.getType());
			if (aux == null)
				return false;
			// aux = targetList.get(i);
			if (param != null && aux != null) {
				if (!isParameterEquals(param, aux))
					return false;
			}
		}

		return true;
	}*/


	/**
	 * If parameter 'p' is null checks if the operations are the same, that is if they have the same signature.
	 * If parameter 'p' is not null returns true only if the target operation plus 'p' has the same signature of the source operation.
	 * 
	 * 
	 * @param source  the source operation
	 * @param target  the target operation
	 * @param p  the parameter
	 * @return true if the operations are equal
	 */
	public static boolean areOperationsEqual(Operation source, Operation target, Parameter p)
	{

		if ( !source.getName().equalsIgnoreCase(target.getName()))
			return false;

		// check the parameters
		Parameter param, aux;
		EList<Parameter> targetList = target.getOwnedParameters();
		EList<Parameter> sourceList = source.getOwnedParameters();
		// check their order


		if ( p == null )
		{
			if (targetList.size() != sourceList.size())
				return false;
		}
		else 
			if (targetList.size() + 1 != sourceList.size())
				return false;

		if (source.getVisibility().getValue() != target.getVisibility()
				.getValue())
			return false;

		if (source.isQuery() != target.isQuery())
			return false;

		if (source.isLeaf() != target.isLeaf())
			return false;

		if (source.isStatic() != target.isStatic())
			return false;

		if (source.getConcurrency().getValue() != target.getConcurrency()
				.getValue())
			return false;

		for (int i = 0; i < targetList.size(); i++) {
			param = targetList.get(i);
			aux = source.getOwnedParameter(param.getName(), param.getType());
			if (aux == null)
				return false;
			// aux = targetList.get(i);
			if (param != null && aux != null) {
				if (!areParametersEqual(param, aux))
					return false;
			}
		}

		return true;
	}


	/**
	 * Checks if the list of parameters of two operations are equal.
	 * If 'p' is not null returns true only if source operation deprived of 'p' has the same list of parameters
	 * of the target operation.
	 * 
	 * @param source  the source operation
	 * @param target  the target operation
	 * @param p  the parameter
	 * @return  true if the operation parameters are equal
	 */
	public static boolean areParametersEquals(Operation source, Operation target, Parameter p)	{
		EList<Parameter> targetList = target.getOwnedParameters();

		if (targetList.size() != source.getOwnedParameters().size())
			return false;

		for (Parameter param : targetList) {
			if (p != null && p.getName().equalsIgnoreCase(param.getName()))
				continue;
			Parameter aux = source.getOwnedParameter(param.getName(),
					param.getType());
			if (aux == null)
				return false;
			if (!areParametersEqual(param, aux))
				return false;
		}
		return true;
	}

	/**
	 * Checks if the parameters of two operations are the same.
	 *
	 * @param source the source
	 * @param target the target
	 * @return true, if successful
	 */
	public static boolean areParametersEquals(Operation source, Operation target)
	{
		return areParametersEquals(source,target,null);
	}

	/**
	 * Checks if two operations are equal.
	 * 
	 * @param source  one operation
	 * @param target  the other
	 * @return true if they are equal
	 */
	public static boolean isOperationEquals(Operation source, Operation target) {
		return UMLUtils.areOperationsEqual(source, target, null);
	}

	/**
	 * Checks if there given Component offers an operation that is equal
	 * of the operation given.
	 * 
	 * @param component  the component
	 * @param operation  the operation
	 * @return true if there is an operation that equals the given one
	 */
	public static boolean isOperationContained(Classifier component,
			Operation operation) {
		for (Operation op : component.getOperations()) {
			// check the name
			if (op.getName().equals(operation.getName())) {
				if (isOperationEquals(op, operation))
					return true;
			}
		}
		return false;
	}

	/**
	 * Retrieves all the clients of a given {@link Interface}.
	 * 
	 * @param interfce  the interface
	 * @return the list of clients
	 */
	public static EList<NamedElement> getInterfaceClients(Interface interfce){
		EList<NamedElement> relationships = new BasicEList<NamedElement>();
		for (Relationship rel : interfce.getRelationships()) {
			if (rel instanceof InterfaceRealization) {
				InterfaceRealization intRel = (InterfaceRealization) rel;
				relationships.addAll(intRel.getClients());
			}
		}
		return relationships;
	}

	/**
	 * Retrieves all the {@link ComponentImplementation} of a given Component.
	 * 
	 * @param comp  the component
	 * @return the list of {@link ComponentImplementation}
	 */
	public static EList<Component> getComponentImplementations(Component comp){
		EList<Component> list = new BasicEList<Component>();
		//DONE using comp.getNearestPackage() is NOT SAFE, use a recursive search on the ViewUtils.getView(comp)
		EList<Component> compImpls = retrieveComponentImplementations(ViewUtils.getView(comp));
		for (Component el : compImpls) {	
			for (Dependency dep : el.getClientDependencies()) {
				if (dep instanceof Realization) {
					if (dep.getSupplier(comp.getName()) != null)
						list.add(el);
				}
			}
		}
		return list;
	}

	/**
	 * Retrieves all the {@link ComponentImplementation} of a given Package.
	 *
	 * @param pkg  the package
	 * @return all the {@link ComponentImplementation}
	 */
	private static EList<Component> retrieveComponentImplementations(Package pkg) {
		EList<Component> comps = new BasicEList<Component>();
		for (Element el : pkg.getOwnedElements()) {
			if (el instanceof Component && isComponentImplementation(el)){
				comps.add((Component) el);
			}
			if (el instanceof Package){
				EList<Component> list = retrieveComponentImplementations((Package) el); 
				if (!list.isEmpty())
					comps.addAll(list);
			}
		}
		return comps;
	}

	/**
	 * Checks if the given object is a {@link ComponentType}.
	 * 
	 * @param el  the element
	 * @return true if it is a {@link ComponentType}
	 */
	public static boolean isComponentType(Object el) {
		if (el instanceof Component && ((Element) el).getAppliedStereotype(Constants.COMPONENT_TYPE) != null)
			return true;
		return false;
	}

	/**
	 * Checks if the given object is a {@link ComponentImplementation}.
	 * 
	 * @param el  the element
	 * @return true if it is a {@link ComponentImplementation}
	 */
	public static boolean isComponentImplementation(Object el) {
		if (el instanceof Component && ((Element) el).getAppliedStereotype(Constants.COMPONENT_IMPLEMENTATION) != null)
			return true;
		return false;
	}


	/**
	 * Retrieves the list of {@link ClientServerPort} of a given Component.
	 * 
	 * @param component  the component
	 * @return the list of {@link ClientServerPort}
	 */
	public static EList<ClientServerPort> getComponentClientServerPorts(final Component component) {
		EList<ClientServerPort> ports = new BasicEList<ClientServerPort>();
		for (Element e : component.getOwnedElements()) {
			if (e instanceof Port) {
				Port p = (Port) e;
				for (EObject st : p.getStereotypeApplications()) {
					if (st instanceof ClientServerPort){
						ClientServerPort csp = (ClientServerPort) st;
						ports.add(csp);
					}
				}
			}
		}
		return ports;
	}

	/**
	 * Retrieves all the {@link Dependency} of a given Component.
	 * 
	 * @param comp the component
	 * @return the list of {@link Dependency}
	 */
	public static EList<Dependency> computeDependenciesToRemove(Component comp) {
		EList<Dependency> cDependencies = comp.getClientDependencies();
		EList<Interface> cDependentInterfaces = new BasicEList<Interface>();
		Map<Interface, Dependency> cDependenciesToRemoveMap = new HashMap<Interface, Dependency>();
		for (Dependency dependency : cDependencies) {
			//it MUST BE exactly a Dependency since a InterfaceRealization is a subtype of Dependency :(
			if (dependency.getClass().equals(DependencyImpl.class)){
				for (NamedElement el : dependency.getSuppliers()) {
					//There's MUST be one and only interface per dependency relationship
					if (el instanceof Interface){
						cDependentInterfaces.add((Interface)el);
						cDependenciesToRemoveMap.put((Interface)el, dependency);
					}

				}
			}
		}

		EList<ClientServerPort> ports = UMLUtils.getComponentClientServerPorts(comp);

		EList<Interface>  portInts = new BasicEList<Interface>();
		for (ClientServerPort csp : ports) {
			if (csp.getKind() == ClientServerKind.REQUIRED || csp.getKind() == ClientServerKind.PROREQ) {
				portInts.addAll(csp.getReqInterface());
			}
		}

		if (portInts != null)
			cDependentInterfaces.removeAll(portInts);
		EList<Dependency> cDependenciesToRemove = new BasicEList<Dependency>();
		for (Interface el : cDependentInterfaces) {
			Dependency dep = cDependenciesToRemoveMap.get(el);
			if (dep != null){
				cDependenciesToRemove.add(dep);
			}
		}
		return cDependenciesToRemove;
	}

	/**
	 * Retrieves all the {@link InterfaceRealization} of a given Component.
	 *
	 * @param comp  the component
	 * @return the list of {@link InterfaceRealization}
	 */
	public static EList<InterfaceRealization> computeRealizationsToRemove(
			Component comp) {
		EList<InterfaceRealization> cRealizations = comp.getInterfaceRealizations();
		EList<Interface> cRealizedInterfaces = new BasicEList<Interface>();
		Map<Interface, InterfaceRealization> cRealizationsToRemoveMap = new HashMap<Interface, InterfaceRealization>();
		for (InterfaceRealization ir : cRealizations) {
			//it MUST BE exactly a Dependency since a InterfaceRealization is a subtype of Dependency :(
			cRealizedInterfaces.add(ir.getContract());
			cRealizationsToRemoveMap.put(ir.getContract(), ir);
		}

		EList<ClientServerPort> ports = UMLUtils.getComponentClientServerPorts(comp);

		EList<Interface>  portInts = new BasicEList<Interface>();
		for (ClientServerPort csp : ports) {
			if (csp.getKind() == ClientServerKind.PROVIDED || csp.getKind() == ClientServerKind.PROREQ) {
				portInts.addAll(csp.getProvInterface());
			}
		}

		if (portInts != null)
			cRealizedInterfaces.removeAll(portInts);
		EList<InterfaceRealization> cRealizationsToRemove = new BasicEList<InterfaceRealization>();
		for (Interface el : cRealizedInterfaces) {
			InterfaceRealization dep = cRealizationsToRemoveMap.get(el);
			if (dep != null){
				cRealizationsToRemove.add(dep);
			}
		}
		return cRealizationsToRemove;
	}

	/**
	 * Checks if the given object represents a Client/Server port.
	 * 
	 * @param el  the element
	 * @return true if the object is a Client/Server port
	 */
	public static boolean isClientServerPort(final Object el) {
		if(el instanceof Port && ((Element) el).getAppliedStereotype(Constants.CLIENTSERVER_PORT) != null)
			return true;
		return false;
	}

	/**
	 * Returns the CHRtSpecification of the given element.
	 * Returns null if the element is not a the comment
	 * 
	 * @param el  the element
	 * @return the CHRtSpecification application
	 */
	public static Stereotype getCHRtSpecification(final Object el) {
		if(el instanceof Comment)
			return ((Element) el).getAppliedStereotype(Constants.CHRT_SPECIFICATION);
		return null;
	}

	/**
	 * Retrieves all the CHRTSpecification {@link Comment}s given a Package and a Port.
	 * If the Port is not given it retrieves all the comments.
	 * 
	 * @param pkg  the package
	 * @param portFilter  the port, can be null
	 * @return the list of comments
	 */
	public static EList<Comment> getCHRtSpecificationComments(Package pkg, Port portFilter) {
		EList<Comment> chrtspecs = new BasicEList<Comment>();
		for (Element el : pkg.getOwnedElements()) {

			if (!(el instanceof Component)) continue;

			for (Comment comm : el.getOwnedComments()) {
				Stereotype chrtspecification;
				if ((chrtspecification = getCHRtSpecification(comm)) != null) {
					if (portFilter!=null){
						if (comm.getValue(chrtspecification, Constants.CHRTSPEC_PARTWITHPORT) != null
								&& comm.getValue(chrtspecification,	Constants.CHRTSPEC_PARTWITHPORT).equals(portFilter)) {
							chrtspecs.add(comm);
						}
					} else {
						chrtspecs.add(comm);
					}
				}
			}

		}
		return chrtspecs;
	}

	/**
	 * Returns the stereotype object given the stereotype class and the model element.
	 *  
	 *
	 * @param <T> the generic type
	 * @param element  the element
	 * @param stereotypeClass the stereotype class
	 * @return  the stereotype object
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T getStereotypeApplication(
			final Element element, final java.lang.Class<T> stereotypeClass) {
		for (EObject stereoApplication : element.getStereotypeApplications()) {
			if (stereotypeClass.isInstance(stereoApplication)) {
				return (T) stereoApplication;
			}
		}
		return null;
	}

	/**
	 * Retrieves all the {@link Component} implementing the given interface.
	 *
	 * @param interfce the {@link Interface}
	 * @return the list of Components or an empty list
	 */
	public static EList<Component> getAllInterfaceComponents(final Interface interfce) {
		EList<Component> list = new BasicEList<Component>();
		for (NamedElement el : getInterfaceClients(interfce)) {
			if (el instanceof Component && isComponentType(el)) {
				list.add((Component) el);
				EList<Component> compList = getComponentImplementations((Component) el);
				if (!compList.isEmpty())
					list.addAll(compList);
			}

		};
		return list;
	}

	/**
	 * Returns the {@link Stereotype} of a given element based on the qualified name, or null.
	 * 
	 * @param element  the element
	 * @param qualifiedName  the qualified name
	 * @return the stereotype or null
	 */
	public static Stereotype getStereotype(final Element element,
			final String qualifiedName) {
		Stereotype str = element.getApplicableStereotype(qualifiedName);
		return str;
	}

	/**
	 * Applies the {@link Stereotype} to a given element based on the qualified name.
	 * It returns the applied stereotype or null.
	 * 
	 * @param element  the element
	 * @param qualifiedName  the qualified name
	 * @return the stereotype applied or null
	 */
	public static Stereotype applyStereotype(final Element element,
			final String qualifiedName) {
		Stereotype str = getStereotype(
				element,
				qualifiedName);
		if (str != null)
			element.applyStereotype(str);
		return str;
	}


	/**
	 * Returns the list of assignments found in viewName where 
	 * the source anything and the target is a Processor Instance.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the all 2 core assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getAll2CoreAssignments(Model umlModel,
			String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);

		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				// get them all
				assignments.add(a);
			}
		}
		return assignments;
	}	


	/**
	 * Returns the list of assignments found in viewName where 
	 * the source is a Component Instance and the target is a Processor Instance.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the component 2 core assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getComponent2CoreAssignments(Model umlModel,
			String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);

		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);
					// SOURCE must be a Component
					// TARGET must be a Processor
					if (elementIsProcessorInstance(assignmentTarget)) {
						if(elementIsComponentInstance(assignmentSource)) {
							InstanceSpecification componentInst = (InstanceSpecification) assignmentSource;
							if (isComponentInstance(componentInst)) {
								assignments.add(a);
							}
						}
					}	
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return assignments;
	}	



	/**
	 * Returns the list of assignments found in viewName where 
	 * the source is a Partition Instance and the target is a Processor Instance.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the all partition assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getAllPartitionAssignments(Model umlModel,
			String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);
					// SOURCE must be a Partition
					// TARGET must be a Processor
					if (elementIsPartitionInstance(assignmentSource) && 
							elementIsProcessorInstance(assignmentTarget)) {		
						assignments.add(a);
					}
					// SOURCE must be a Component
					// TARGET must be a Partition
					if (elementIsPartitionInstance(assignmentTarget)) {
						if(elementIsComponentInstance(assignmentSource)) {
							InstanceSpecification componentInst = (InstanceSpecification) assignmentSource;
							if (isComponentInstance(componentInst)) {
								assignments.add(a);
							}
						}
					}
				}
				catch (Exception e) {
					continue;
				}
			}	
		}
		return assignments;
	}	


	/**
	 * Returns all the assignments that have the input functional partition 
	 * either in the To field (Component to Partition Assignment), or
	 * in the From field (Partition to ProcessorAssignment).
	 *
	 * @param umlModel the uml model
	 * @param functPart the funct part
	 * @return the partition assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getPartitionAssignments(Model umlModel, FunctionalPartition functPart) 
			throws ModelError {

		// We look for the Assignments from Partition to Core in the Deployment View
		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				Constants.DEPLOYMENT_VIEW_NAME);
		EList<Element> allDeplViewElems = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : allDeplViewElems) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);
					// SOURCE must be a Partition
					// TARGET must be a Processor
					if (elementIsPartitionInstance(assignmentSource)) { 
						if(elementIsProcessorInstance(assignmentTarget)) {	
							// Check if the involved partition is functPart
							InstanceSpecification instSpecSource = (InstanceSpecification)assignmentSource;

							if (instSpecSource.getClassifiers().get(0).equals(functPart.getBase_Component())) {						
								assignments.add(a);
							}
						}
					}
				}
				catch (Exception e) {
					continue;
				}
			}
		}

		// We look for the Assignments from Component to Partition in the Component View
		parent = CHESSProfileManager.getViewByStereotype(umlModel,
				Constants.COMPONENT_VIEW_NAME);
		EList<Element> allCompViewElems = parent.allOwnedElements();		

		for (Element element : allCompViewElems) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);

					// SOURCE must be a Component
					// TARGET must be a Partition
					if (elementIsPartitionInstance(assignmentTarget)) {
						if(elementIsComponentInstance(assignmentSource)) {
							InstanceSpecification instSpecSource = (InstanceSpecification) assignmentSource;
							if (isComponentInstance(instSpecSource)) {
								InstanceSpecification instSpecTarget = (InstanceSpecification)assignmentTarget;

								// its type should be the same as the input functional Partition							
								if (instSpecTarget.getClassifiers().get(0).equals(functPart.getBase_Component())) {								
									assignments.add(a);
								}
							}
						}
					}	
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return assignments;
	}


	/**
	 * Returns the list of assignments found in viewName where 
	 * the source is a Partition Instance and the target is a Processor Instance.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the partition 2 core assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getPartition2CoreAssignments(Model umlModel,
			String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);
					// SOURCE must be a Partition
					// TARGET must be a Processor
					if (elementIsPartitionInstance(assignmentSource) && 
							elementIsProcessorInstance(assignmentTarget)) {		
						assignments.add(a);
					}
				}
				catch (Exception e) {
					continue;
				}
			}	
		}
		return assignments;
	}	

	/**
	 * Returns the list of assignments found in viewName where 
	 * the source is a Slot Instance and the target is a Processor Instance.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the task 2 core assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getTask2CoreAssignments(Model umlModel,
			String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);
					// SOURCE must be a Task
					// TARGET must be a Processor
					if (elementIsSlotInstance(assignmentSource) && 
							elementIsProcessorInstance(assignmentTarget)) {		
						assignments.add(a);
					}
				}
				catch (Exception e) {
					continue;
				}
			}	
		}
		return assignments;
	}	

	/**
	 * Returns the list of assignments found in viewName where 
	 * the source is a Component Instance .
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the component assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getComponentAssignments(Model umlModel, String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);				
					// SOURCE must be a Component
					// TARGET can be anything

					if(elementIsComponentInstance(assignmentSource)) {
						InstanceSpecification componentInst = (InstanceSpecification) assignmentSource;
						if (isComponentInstance(componentInst)) {
							assignments.add(a);
						}
					}
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return assignments;
	}	

	/**
	 * Gets the resource platform component.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the resource platform component
	 * @throws ModelError the model error
	 */
	public static Component getResourcePlatformComponent(Model umlModel, String viewName) throws ModelError {
		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);

		if(parent == null)
			throw new ModelError(viewName+" not found.");

		/* breath-first search */
		final LinkedList<Element> breadthFirstList = new LinkedList<Element>();

		breadthFirstList.addAll(parent.getOwnedElements());
		while (!breadthFirstList.isEmpty()) {
			final Element t = breadthFirstList.poll();

			if (t instanceof Component) {
				Component candidate = (Component) t;
				CHGaResourcePlatform a = UMLUtils.getStereotypeApplication(
						candidate, CHGaResourcePlatform.class);
				if (a != null)
					return candidate;
			}
			for (final Element e : t.getOwnedElements()) {
				breadthFirstList.addLast(e);
			}
		}

		throw new ModelError("CHGaResourcePlatform not found in "+viewName+" view.");
	}


	/**
	 * Looks inside the input package pack, and returns a Component stereotyped as CHGaResourcePlatform .
	 *
	 * @param umlModel the uml model
	 * @param pack the pack
	 * @return the resource platform component in package
	 * @throws ModelError the model error
	 */
	public static Component getResourcePlatformComponentInPackage(Model umlModel, 
			Package pack) throws ModelError {

		/* breath-first search */
		final LinkedList<Element> breadthFirstList = new LinkedList<Element>();

		breadthFirstList.addAll(pack.getOwnedElements());
		while (!breadthFirstList.isEmpty()) {
			final Element t = breadthFirstList.poll();

			if (t instanceof Component) {
				Component candidate = (Component) t;
				CHGaResourcePlatform a = UMLUtils.getStereotypeApplication(
						candidate, CHGaResourcePlatform.class);
				if (a != null)
					return candidate;
			}
			for (final Element e : t.getOwnedElements()) {
				breadthFirstList.addLast(e);
			}
		}

		throw new ModelError("CHGaResourcePlatform not found in "+pack.getName()+" package.");
	}


	/**
	 * Returns TRUE if the element is a processor instance, FALSE otherwise.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public static boolean elementIsProcessorInstance(Element element) {
		if (!(element instanceof InstanceSpecification)) {
			return false;
		}
		InstanceSpecification is = (InstanceSpecification) element;
		if (is.getQualifiedName() != null
				&& isProcessorInstance(is)) {
			return true;
		}		
		return false;
	}

	/**
	 * Returns TRUE if the instanceSpecification is a processor instance, FALSE otherwise.
	 *
	 * @param e the e
	 * @return true, if is processor instance
	 */
	public static boolean isProcessorInstance(InstanceSpecification e) {
		for (Classifier c : e.getClassifiers()) {
			if (UMLUtils.getStereotypeApplication(c, CH_HwProcessor.class) != null)
				return true;
		}
		return false;
	}

	/**
	 * Returns TRUE if the element is a component instance, false otherwise.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public static boolean elementIsComponentInstance(Element element) {
		if (!(element instanceof InstanceSpecification)) {
			return false;
		}
		InstanceSpecification is = (InstanceSpecification) element;
		if (is.getQualifiedName() != null
				&& isComponentInstance(is)) {
			return true;
		}		
		return false;
	}

	/**
	 * Returns TRUE if the InstanceSpecification is a component instance, false otherwise.
	 *
	 * @param e the e
	 * @return true, if is component instance
	 */
	public static boolean isComponentInstance(InstanceSpecification e) {
		for (Classifier c : e.getClassifiers()) {
			if (UMLUtils.getStereotypeApplication(c,
					ComponentImplementation.class) != null)
				return true;
		}
		return false;
	}


	/**
	 * Returns the number of CPUs to which the InstanceSpecification is assigned .
	 *
	 * @param i the instance specification
	 * @param theDeploymentElem the deployment for which the count is performed
	 * @param assignments the assignments
	 * @return the number of CPUs to which the InstanceSpecification is assigned for the given deployment
	 */
	public static int isAssigned2HowManyProcessingUnits(InstanceSpecification i, 
			Element theDeploymentElem, EList<Assign> assignments) {		

		int count = 0;
		for (Assign theAssignment : assignments) {			
			if (theAssignment != null) {
				try {
					Element toElem = theAssignment.getTo().get(0);
					if (theAssignment.getFrom().contains((Object)i) &&
							elementIsProcessorInstance(theAssignment.getTo().get(0))) {
						Element chgaResPlat = toElem.getOwner();
						if (theDeploymentElem.equals(chgaResPlat)) {
							count++;
						}
					}
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return count;
	}


	/**
	 * Returns the number of CPUs or FunctionalPartitions to which the InstanceSpecification is assigned .
	 *
	 * @param i the instance specification
	 * @param theDeploymentElem the deployment for which the count is performed
	 * @param assignments the assignments
	 * @return the number of CPUs or FunctionalPartitions to which the InstanceSpecification is assigned for the given deployment
	 */
	public static int isAssigned2HowManyProcessingUnitsOrPartitions(InstanceSpecification i, 
			Element theDeploymentElem, EList<Assign> assignments) {	

		int count = 0;
		for (Assign theAssignment : assignments) {			
			if (theAssignment != null) {
				try {
					Element toElem = theAssignment.getTo().get(0);
					if (theAssignment.getFrom().contains((Object)i) &&
							(elementIsProcessorInstance(toElem) ||
									elementIsPartitionInstance(toElem))) {
						Element chgaResPlat = toElem.getOwner();
						if(chgaResPlat.equals(theDeploymentElem)) {
							count++;
						}
					}
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return count;
	}


	/**
	 * Returns the number of FunctionalPartitions to which the InstanceSpecification is assigned .
	 *
	 * @param i the i
	 * @param assignments the assignments
	 * @return the int
	 */
	public static int isAssigned2HowManyPartitions(InstanceSpecification i, EList<Assign> assignments) {	
		int count = 0;
		for (Assign theAssignment : assignments) {			
			if (theAssignment != null) {
				try {
					Element toElem = theAssignment.getTo().get(0);
					if (theAssignment.getFrom().contains((Object)i) &&
							(elementIsProcessorInstance(toElem) ||
									elementIsPartitionInstance(toElem))) {
						count++;
					}
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return count;
	}

	/**
	 * Returns the list of all partition instances in the model.
	 *
	 * @param umlModel the uml model
	 * @return the all partition instances
	 * @throws ModelError the model error
	 */
	public static EList<InstanceSpecification> getAllPartitionInstances(
			Model umlModel) throws ModelError {

		Package cmpv = CHESSProfileManager.getViewByStereotype(umlModel,
				CHESSProfileManager.COMPONENT_VIEW);

		if(cmpv==null)
			throw new ModelError("Component view not found.");

		cmpv = getResourcePlatformPackage(cmpv);

		if(cmpv==null)
			throw new ModelError("CHGaResourcePlatform not found in Component View.");


		EList<Element> all = cmpv.allOwnedElements();
		EList<InstanceSpecification> partitions = new BasicEList<InstanceSpecification>();
		for (Element element : all) {
			if (!(element instanceof InstanceSpecification)) continue;

			InstanceSpecification is = (InstanceSpecification) element;

			if (!(is.getQualifiedName() != null
					&& isPartitionInstance(is))) continue;
			partitions.add(is);
		}

		if(partitions.size()==0)
			throw new ModelError("Partition Instances not found.");

		return partitions;
	}

	/**
	 * Gets the resource platform package.
	 *
	 * @param cmpv the cmpv
	 * @return the resource platform package
	 */
	public static Package getResourcePlatformPackage(Package cmpv) {
		/* breath-first search */
		final LinkedList<Package> breadthFirstList = new LinkedList<Package>();
		breadthFirstList.addFirst(cmpv);
		while (!breadthFirstList.isEmpty()) {
			final Package candidate = breadthFirstList.poll();
			CHGaResourcePlatform a = UMLUtils.getStereotypeApplication(
					candidate, CHGaResourcePlatform.class);

			if (a != null)
				return candidate;

			for (final Package p : candidate.getNestedPackages()) {
				breadthFirstList.addLast(p);
			}
		}
		return null;
	}


	/**
	 * Gets the all resource platform package.
	 *
	 * @param cmpv the cmpv
	 * @return the all resource platform package
	 */
	public static EList<Package> getAllResourcePlatformPackage(Package cmpv) {
		/* breath-first search */

		EList<Package> result = new BasicEList<Package>();

		final LinkedList<Package> breadthFirstList = new LinkedList<Package>();
		breadthFirstList.addFirst(cmpv);
		while (!breadthFirstList.isEmpty()) {
			final Package candidate = breadthFirstList.poll();
			CHGaResourcePlatform a = UMLUtils.getStereotypeApplication(
					candidate, CHGaResourcePlatform.class);

			if (a != null) {
				result.add(candidate);
				//return candidate;
			}

			for (final Package p : candidate.getNestedPackages()) {
				breadthFirstList.addLast(p);
			}
		}
		//return null;
		return result;
	}


	/**
	 * Returns TRUE if the instance specification is a partition instance.
	 *
	 * @param e the e
	 * @return true, if is partition instance
	 */
	public static boolean isPartitionInstance(InstanceSpecification e) {
		for (Classifier c : e.getClassifiers()) {

			if (UMLUtils.getStereotypeApplication(c, FunctionalPartition.class) != null)
				return true;

		}
		return false;
	}

	/**
	 * Element is partition instance.
	 *
	 * @param element the element
	 * @return true if the element is a partition instance, false otherwise
	 */
	public static boolean elementIsPartitionInstance(Element element) {
		if (!(element instanceof InstanceSpecification)) {
			return false;
		}
		InstanceSpecification is = (InstanceSpecification) element;
		if (is.getQualifiedName() != null
				&& isPartitionInstance(is)) {
			return true;
		}		
		return false;
	}


	/**
	 * Check if this Partition is assigned to a CPU .
	 *
	 * @param i the i
	 * @param assignments the assignments
	 * @return true, if is assigned 2 core
	 */
	public static boolean isAssigned2Core(InstanceSpecification i,
			EList<Assign> assignments) {
		for (Assign theAssignment : assignments) {			
			if (theAssignment != null) {
				try {
					if (theAssignment.getFrom().contains((Object)i) &&
							elementIsProcessorInstance(theAssignment.getTo().get(0))) {	
						return true;
					}
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return false;
	}

	/**
	 * Check if this Partition has at least a component assigned to it.
	 *
	 * @param i the i
	 * @param assignments the assignments
	 * @return true, if successful
	 */
	public static boolean hasComponentAssigned(InstanceSpecification i,
			EList<Assign> assignments) {
		for (Assign theAssignment : assignments) {			
			if (theAssignment != null) {
				try {
					if (theAssignment.getTo().contains((Object)i) &&
							elementIsPartitionInstance(theAssignment.getTo().get(0))) {	
						return true;
					}
				} 
				catch (Exception e) {
					continue;
				}
			}
		}
		return false;
	}


	/**
	 * Returns the list of assignments found in viewName  .
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getAssignments(Model umlModel, String viewName) throws ModelError {

		// LB 20150928 look in all the package (some models may not have the CHGAResourcePlatform component)
		//Component rpc = getResourcePlatformComponent(umlModel, viewName);
		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				assignments.add(a);							
			}
		}
		return assignments;
	}	

	/**
	 * Element is slot instance.
	 *
	 * @param element the element
	 * @return true, if successful
	 */
	public static boolean elementIsSlotInstance(Element element) {
		return element instanceof Slot;
	}

	/**
	 * Verifies if element is a CHRtPortSlot Slot.
	 *
	 * @param elem the elem
	 * @return true, if successful
	 */
	public static boolean elementIsCHRtPortSlot(Element elem) {
		if (!elementIsSlotInstance(elem)) {
			return false;
		}
		if(elem.getAppliedStereotype(Constants.CH_CHRtPortSlot) != null) {
			return true;
		}
		return false;
	}


	/**
	 * Returns the list of all Component Instances found in the Component View if onlyTerminal is FALSE, 
	 * Returns the list of all terminal Component Instances found in the Component View if onlyTerminal is TRUE. 
	 *
	 * @param umlModel the uml model
	 * @param onlyTerminal the only terminal
	 * @return the all component instances
	 * @throws ModelError the model error
	 */
	public static EList<InstanceSpecification> getAllComponentInstances(
			Model umlModel, boolean onlyTerminal) throws ModelError {

		Package cmpv = CHESSProfileManager.getViewByStereotype(umlModel,
				CHESSProfileManager.COMPONENT_VIEW);

		if(cmpv==null)
			throw new ModelError("Component view not found.");

		cmpv = UMLUtils.getResourcePlatformPackage(cmpv);

		if(cmpv==null)
			throw new ModelError("CHGaResourcePlatform not found in Component View.");


		EList<Element> all = cmpv.allOwnedElements();
		EList<InstanceSpecification> components = new BasicEList<InstanceSpecification>();
		for (Element element : all) {
			if (!(element instanceof InstanceSpecification)) continue;

			InstanceSpecification is = (InstanceSpecification) element;

			if (!(is.getQualifiedName() != null
					&& UMLUtils.isComponentInstance(is))) continue;
			if (onlyTerminal) {
				// 20160601 Only consider leaf elements
				if (!UMLUtils.isLeafComponentInstance(is)) {
					continue;
				}
			}
			components.add(is);

		}
		if(components.size()==0)
			throw new ModelError("Component Instances not found.");

		return components;
	}


	/**
	 * Checks if is leaf component instance.
	 *
	 * @param instSpec the inst spec
	 * @return true if the Instance Specification does not contain any ComponentImplementations (i.e. it is a leaf)
	 * false otherwise
	 */
	public static boolean isLeafComponentInstance(InstanceSpecification instSpec) {
		if (instSpec.getOwnedElements().size()  > 0) {	
			//System.out.println("Looking at instSpec="+instSpec.getName());
			EList<Element> theOwnedElems = instSpec.getOwnedElements();
			for (Element theOwnedElem : theOwnedElems) {												
				if (theOwnedElem instanceof Slot) {								
					Slot theSlot = (Slot)theOwnedElem;								
					EList<ValueSpecification> valSpecs = theSlot.getValues();								

					for (ValueSpecification valSpec: valSpecs) {																		
						if (valSpec instanceof InstanceValue){
							InstanceSpecification theInstance = ((InstanceValue) valSpec).getInstance();										
							for (Classifier instClassifier : theInstance.getClassifiers()) {
								if (instClassifier instanceof Component) {
									Component instComp = (Component) instClassifier;
									// Is the component a ComponentImplementation?
									Stereotype compImplStereo = instComp.getAppliedStereotype(Constants.COMPONENT_IMPLEMENTATION);
									if (compImplStereo != null) {
										// This is not a leaf component, as it is parent of some ComponentImplementation
										return false;
									}
								}
							}
						}
					}
				}					
			}
		}
		return true;
	}

	/**
	 * Looks for all the Component to Functional Partition Assignments in the specified View.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the component 2 partition assignments
	 * @throws ModelError the model error
	 */
	public static EList<Assign> getComponent2PartitionAssignments(Model umlModel,
			String viewName) throws ModelError {
		// LB 20150708 we now look for assignments in the CHGA resource platform component
		//Package cmpv = CHESSProfileManager.getViewByStereotype(umlModel, viewName);
		//cmpv = QueryUtils.getResourcePlatformPackage(cmpv);


		//Component rpc = QueryUtils.getResourcePlatformComponent(umlModel, viewName);
		// LB 20150928 look in all the package (some models may not have the CHGAResourcePlatform component)
		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<Assign> assignments = new BasicEList<Assign>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.ASSIGN)!=null)) {
				stereo = element.getAppliedStereotype(Constants.ASSIGN);
				EObject eobj = element.getStereotypeApplication(stereo);
				Assign a = (Assign)eobj;
				try {
					Element assignmentSource = a.getFrom().get(0);
					Element assignmentTarget = a.getTo().get(0);
					// SOURCE must be a Component
					// TARGET must be a Partition
					if (elementIsPartitionInstance(assignmentTarget)) {
						if(elementIsComponentInstance(assignmentSource)) {
							InstanceSpecification componentInst = (InstanceSpecification) assignmentSource;
							if (isComponentInstance(componentInst)) {
								assignments.add(a);
							}
						}
					}		
				}
				catch (Exception e) {
					continue;
				}
			}
		}
		return assignments;
	}	

	/**
	 * Returns the root instance in the package .
	 *
	 * @param thePack is the Package owning the set of InstanceSpecification
	 * @return the root InstanceSpecification
	 * //the assumptions are: 
	 * 1) the package owns the InstanceSpecification, 
	 * 2) there is only one root instance in the package, 
	 * 3) the name of a root instances must not contain the '.' character
	 * 4) the name of a child instance must contain the '.' character (<namespace>.<name of the instance>)
	 */
	public static InstanceSpecification getRootInstanceInPackage(Package thePack) {		
		EList<Element> allElems = thePack.allOwnedElements();
		String elementName = "";
		for (Element elem : allElems) {
			if (elem instanceof InstanceSpecification) {
				InstanceSpecification instSpec = (InstanceSpecification)elem;
				elementName = instSpec.getName();
				if (!elementName.contains(".")) {
					return instSpec;
				}
			}
		}
		return null;
	}

	/**
	 * Returns the value of the field identified by the match parameter within the s string 
	 * The s string is expected to be in the form: name1=value1,name2=value2,name3=value3
	 * with or without surrounding parenthesis.
	 *
	 * @param s the s
	 * @param match the match
	 * @return the value
	 */
	public static String getValue(String s, String match) {

		if (s== null)
			return"";

		String found = null;
		String[] splits = s.split(",");
		for (String split : splits) {
			if(split.contains(match)){
				String[] ssplits = split.split("=");
				for (String str : ssplits) {
					if(!str.contains(match)){
						found =  str;
					}
				}
			}
		}
		if(found != null){
			found = found.trim();
			if (found.startsWith("(")){
				found = found.substring(1, found.length());
			}
			if (found.endsWith(")")){
				found = found.substring(0, found.length()-1);
			}
		}
		return found;
	}

	/**
	 * Returns the response time and unit
	 * if rldl is expressed in ms by the user convert blockT in ms too
	 * if rldl is expressed in us by the user convert blockT in us too.
	 *
	 * @param rldlUnit the rldl unit
	 * @param opSaStep the op sa step
	 * @return the response time string
	 */
	private static String getResponseTimeString(String rldlUnit, SaStep opSaStep) {
		String respT = "";
		String respUnit = "";
		String respValue ="";

		//		String rldl = spec.getRlDl();
		//		String rldlUnit = getValue(rldl, "unit");

		if(!opSaStep.getRespT().isEmpty()){
			respT = opSaStep.getRespT().get(0);
			respUnit = getValue(respT, "unit");
			respValue = getValue(respT, "worst");
		}


		//if rldl is expressed in ms by the user convert blockT in ms too
		if(respValue != null && !respValue.isEmpty() && rldlUnit.equals("ms")){
			double conv = Float.parseFloat(respValue)*1000;
			conv = Math.round(conv*100)/100.0d;
			respValue = Double.toString(conv);
			respUnit = "ms";
		}

		//if rldl is expressed in us by the user convert blockT in us too
		if(respValue != null && !respValue.isEmpty() && rldlUnit.equals("us")){
			double conv = Float.parseFloat(respValue)*1000000;
			conv = Math.round(conv*100)/100.0d;
			respValue = Double.toString(conv);
			respUnit = "us";
		}

		return respValue + respUnit;
	}

	/**
	 * Returns the blocking time and unit
	 * if rldl is expressed in ms by the user convert blockT in ms too
	 * if rldl is expressed in us by the user convert blockT in us too.
	 *
	 * @param rldlUnit the rldl unit
	 * @param opSaStep the op sa step
	 * @return the blocking time string
	 */
	public static String getBlockingTimeString(String rldlUnit, SaStep opSaStep){
		String blockT = "";
		String blockUnit = "";
		String blockValue ="";

		//		String rldl = spec.getRlDl();
		//		String rldlUnit = getValue(rldl, "unit");

		blockT = opSaStep.getBlockT();
		blockUnit = getValue(blockT, "unit");
		blockValue = getValue(blockT, "worst");


		//if rldl is expressed in ms by the user convert blockT in ms too
		if(blockValue != null && !blockValue.isEmpty() && rldlUnit.equals("ms")){
			double conv = Float.parseFloat(blockValue)*1000;
			conv = Math.round(conv*100)/100.0d;
			blockValue = Double.toString(conv);
			blockUnit = "ms";
		}

		//if rldl is expressed in us by the user convert blockT in us too
		if(blockValue != null && !blockValue.isEmpty() && rldlUnit.equals("us")){
			double conv = Float.parseFloat(blockValue)*1000000;
			conv = Math.round(conv*100)/100.0d;
			blockValue = Double.toString(conv);
			blockUnit = "us";
		}

		return blockValue + blockUnit;
	}

	/**
	 * Returns the list of AnalysisResultData contained in the PSM Package.
	 *
	 * @param contextClass the context class
	 * @return the analysis results
	 */
	public static List<AnalysisResultData> getAnalysisResults(Class contextClass){

		List<AnalysisResultData> listData = new ArrayList<AnalysisResultData>();
		Model model = contextClass.getModel();
		Package psm = ViewUtils.getCHESSPSMPackage(model);

		if(contextClass.getAppliedStereotype(Constants.MARTE_SaAnalysisContext) == null
				){
			return listData;
		}

		String saAnalysisName = contextClass.getQualifiedName();
		//		SaAnalysisContext saAnalysisCtx = (SaAnalysisContext) contextClass.getStereotypeApplication(contextClass.getAppliedStereotype(Constants.MARTE_SaAnalysisContext));
		Package psmPackage;

		SaEndtoEndFlow saEndtoEndFlow = null;
		SaStep saStep = null;
		SaAnalysisContext psmAnalysisContext = null;

		for (Package pkg: psm.getNestedPackages()){
			Stereotype stereo = pkg.getAppliedStereotype(Constants.CH_PsmPackage);
			if(stereo != null){
				PSMPackage psmPkg = (PSMPackage) pkg.getStereotypeApplication(stereo);
				//the following condition could be done directly comparing the objects and not their names
				if(psmPkg.getAnalysisContext().getBase_NamedElement().getQualifiedName().equals(saAnalysisName)){
					psmPackage = pkg;
					//					platform = ((CHGaResourcePlatform) psmPkg.getAnalysisContext().getPlatform().get(0)).getBase_Package();
					Slot slot = null;
					InstanceSpecification componentInstance = null;
					Comment chrtComm = null;
					//					Activity pimsaEndtoEndFlow = null;
					//ASSUMPTION psmPackage owns a AnalysisContext Package
					Package psmAnalysisContextPack = (Package) psmPackage.getOwnedMember("AnalysisContext");
					Class psmAnalysisContextClass = null;
					for (Element elem : psmAnalysisContextPack.getOwnedElements()){
						if (!(elem instanceof Class))
							continue;
						psmAnalysisContextClass = (Class) elem;
						psmAnalysisContext = (SaAnalysisContext) psmAnalysisContextClass.getStereotypeApplication(psmAnalysisContextClass.getAppliedStereotype(Constants.MARTE_SaAnalysisContext));
					}

					for (Element elem: psmAnalysisContextClass.allOwnedElements()){
						if (! (elem instanceof Activity))
							continue;
						Activity activity = (Activity) elem;
						if (elem.getAppliedStereotype(Constants.MARTE_EndtoEndFlow) == null)
							continue;

						psmAnalysisContext = (SaAnalysisContext) psmAnalysisContextClass.getStereotypeApplication(psmAnalysisContextClass.getAppliedStereotype(Constants.MARTE_SaAnalysisContext));
						saEndtoEndFlow = (SaEndtoEndFlow) elem.getStereotypeApplication(elem.getAppliedStereotype(Constants.MARTE_EndtoEndFlow));
						//assumption: one SaStep inside each SaEndtoEndFlow
						for (ActivityNode node: activity.getNodes()){
							if (node.getAppliedStereotype(Constants.MARTE_SaStep) == null)
								continue;
							saStep = (SaStep) node.getStereotypeApplication(node.getAppliedStereotype(Constants.MARTE_SaStep));
							//now obtain the link to the originating PIM
							//ASSUMPTION: constraints are generated under the contextClass to store information about traceability to PIM
							//ASSUMPTION: constrained elements are: SaEndtoEndFlow Activity, ChRtPortSlot Slot or InstanceSpecification, CHRtSpecification Comment.
							for (Constraint constr : psmAnalysisContextClass.getOwnedRules()){
								if (!constr.getConstrainedElements().contains(activity))
									continue;
								for (Element constrained : constr.getConstrainedElements()){
									if (constrained instanceof Slot)
										slot = (Slot) constrained;
									if (constrained instanceof Comment)
										chrtComm = (Comment) constrained;
									if (constrained instanceof InstanceSpecification)
										componentInstance = (InstanceSpecification) constrained;
								}
							}

							if (chrtComm == null || (slot == null && componentInstance==null)){
								break;
							}

							//ASSUMPTION chrtComm not null; slot or componentInstance not null
							CHRtSpecification chrt = (CHRtSpecification) chrtComm.getStereotypeApplication(chrtComm.getApplicableStereotype(Constants.CHRT_SPECIFICATION));

							AnalysisResultData resultData = new AnalysisResultData();
							InstanceSpecification inst =  (slot!=null ? slot.getOwningInstance() : componentInstance);

							resultData.instSpec = inst;
							resultData.ctxOP = (Operation) chrt.getContext();
							resultData.instance = inst.getName();
							resultData.context = chrt.getContext().getName();
							ActivityNode initial = activity.getNode("InitialNode1");
							Stereotype initialStereo = initial.getAppliedStereotype(Constants.GAWORKLOADEVENT);
							GaWorkloadEvent workload = (GaWorkloadEvent) initial.getStereotypeApplication(initialStereo);
							resultData.arrival = workload.getPattern();
							String rldlValue = "";
							String rldlUnit = "";
							if(saEndtoEndFlow.getEnd2EndD() != null && !saEndtoEndFlow.getEnd2EndD().isEmpty()){
								resultData.rldl = saEndtoEndFlow.getEnd2EndD().get(0);										
								////
								if (resultData.rldl != null) {
									rldlValue = getValue(resultData.rldl, "value");
									rldlUnit = getValue (resultData.rldl, "unit");						
									resultData.rldl = rldlValue + rldlUnit;		
								}
								////								

							}
							if(saStep.getConcurRes() != null){
								EList<String> schedParams = saStep.getConcurRes().getSchedParams();
								if(schedParams != null && !schedParams.isEmpty()){
									String schedParam = schedParams.get(0);
									resultData.priority = schedParam;
								}
							}
							if(saStep.getSubUsage() != null && !saStep.getSubUsage().isEmpty()){
								Operation operation = (Operation) saStep.getSubUsage().get(0).getBase_NamedElement();
								SaStep opSaStep = (SaStep) operation.getStereotypeApplication(operation.getAppliedStereotype(Constants.MARTE_SaStep));
								if(opSaStep.getExecTime() != null && !opSaStep.getExecTime().isEmpty()){
									resultData.localWCET = opSaStep.getExecTime().get(0);
								}
								resultData.respT = getResponseTimeString(rldlUnit, opSaStep);
								
								
								resultData.blockT = getBlockingTimeString(rldlUnit, opSaStep);
							}
							
							//back propagation run time monitoring
							//TODO
							if (resultData.respT.isEmpty()){
								
								//TODO assumption: we are in the runtime monitoring case... :(
								
								//try with this...
								Stereotype latencyObs = null;
								GaLatencyObs obs = null;
								for (Constraint constr : activity.getOwnedRules()){
									latencyObs = constr.getAppliedStereotype(Constants.GALATENCYOBS);
									if (latencyObs != null){
										obs = (GaLatencyObs) constr.getStereotypeApplication(latencyObs);
										String s = obs.getLatency().get(0);
										resultData.respT = s;
									}
								
								}
								
								//override exec time
								if(saStep.getExecTime() != null && !saStep.getExecTime().isEmpty()){
									resultData.localWCET = saStep.getExecTime().get(0);
								}
								//override blocking time
								if(saStep.getBlockT() != null && !saStep.getBlockT().isEmpty()){
									resultData.blockT = saStep.getBlockT();
								}
							}
							
							
							//end back
							

							//							String rldl = chrt.getRlDl();
							//							String rldlValue = getValue(rldl, "value");
							//							String rldlUnit = getValue (rldl, "unit");
							//							resultData.rldl = rldlValue + rldlUnit;	

							String respT = "";
							String respValue ="";
							String respUnit ="";

							if (saEndtoEndFlow.getEnd2EndT().size()>0){
								respT = saEndtoEndFlow.getEnd2EndT().get(0);
								respValue = getValue(respT, "worst");
							}

							//if rldl is expressed in ms by the user convert respT in ms too
							if(respValue != null && !respValue.isEmpty() && rldlUnit.equals("ms")){
								double conv = Float.parseFloat(respValue)*1000;
								conv = Math.round(conv*100)/100.0d;
								respValue = Double.toString(conv);
								respUnit = "ms";
							}

							//if rldl is expressed in us by the user convert respT in us too
							if(respValue != null && !respValue.isEmpty() && rldlUnit.equals("us")){
								double conv = Float.parseFloat(respValue)*1000000;
								conv = Math.round(conv*100)/100.0d;
								respValue = Double.toString(conv);
								respUnit = "us";
							}

							String responseTime = respValue + respUnit;

							if (!respValue.isEmpty() && !rldlValue.isEmpty() ){
								if(Float.parseFloat(respValue) <= Float.parseFloat(rldlValue)){
									resultData.isSched= "YES";
								}else{
									resultData.isSched= "NO";
								}
							}

							listData.add(resultData);
						}

					}
				}
			}
		}
		return listData;

	}

	/**
	 * Returns the HW results for Schedulability analysis.
	 *
	 * @param contextClass the context class
	 * @return the HW analysis results
	 */
	public static List<HWAnalysisResultData> getHWAnalysisResults(Class contextClass){

		List<HWAnalysisResultData> listData = new ArrayList<HWAnalysisResultData>();
		Model model = contextClass.getModel();
		Package psm = ViewUtils.getCHESSPSMPackage(model);

		if(contextClass.getAppliedStereotype(Constants.MARTE_SaAnalysisContext) == null
				){
			return listData;
		}

		String saAnalysisName = contextClass.getQualifiedName();
		Package psmPackage;

		SaExecHost host = null;

		for (Package pkg: psm.getNestedPackages()){
			Stereotype stereo = pkg.getAppliedStereotype(Constants.CH_PsmPackage);
			if(stereo != null){
				PSMPackage psmPkg = (PSMPackage) pkg.getStereotypeApplication(stereo);
				System.out.println("Pkg QN="+psmPkg.getAnalysisContext().getBase_NamedElement().getQualifiedName());
				if(psmPkg.getAnalysisContext().getBase_NamedElement().getQualifiedName().equals(saAnalysisName)){
					psmPackage = pkg;
					//ASSUMPTION psmPackage owns a AnalysisContext Package
					Package psmHostPack = (Package) psmPackage.getOwnedMember("Host");
					for (Element elem: psmHostPack.getOwnedElements()){
						if (elem.getAppliedStereotype(Constants.MARTE_SaExecHost) == null)
							continue;
						host = (SaExecHost) elem.getStereotypeApplication(elem.getAppliedStereotype(Constants.MARTE_SaExecHost));
						HWAnalysisResultData data = new HWAnalysisResultData();
						data.hw_instance = ((Class) elem).getName();
						if (host.getUtilization().size()>0){
							data.hw_utilization = host.getUtilization().get(0);
						}
						listData.add(data);
					}

				}
			}
		}
		return listData;
	}


	/**
	 * Gets the endto end analysis results.
	 *
	 * @param contextClass <<SaAnalysisContext>> entity used to perform the end to end response time analysis
	 * @return get analysis results data for end to end sequence scenarios attached to the given contextClass
	 */
	public static List<EndToEndResultData> getEndtoEndAnalysisResults(Class contextClass){

		List<EndToEndResultData> listData = new ArrayList<EndToEndResultData>();
		Model model = contextClass.getModel();
		Package psm = ViewUtils.getCHESSPSMPackage(model);

		if(contextClass.getAppliedStereotype(Constants.MARTE_SaAnalysisContext) == null
				){
			return listData;
		}

		String saAnalysisName = contextClass.getQualifiedName();
		Package psmPackage;

		for (Package pkg: psm.getNestedPackages()){
			Stereotype stereo = pkg.getAppliedStereotype(Constants.CH_PsmPackage);
			if(stereo != null){
				PSMPackage psmPkg = (PSMPackage) pkg.getStereotypeApplication(stereo);
				if(psmPkg.getAnalysisContext().getBase_NamedElement().getQualifiedName().equals(saAnalysisName)){
					psmPackage = pkg;

					//ASSUMPTION psmPackage owns a AnalysisContext Package
					Package psmAnalysisContextPack = (Package) psmPackage.getOwnedMember("AnalysisContext");
					Class psmAnalysisContextClass = null;
					for (Element temp : psmAnalysisContextPack.getOwnedElements()){
						if (!(temp instanceof Class))
							continue;
						psmAnalysisContextClass = (Class) temp;

						for (Element elem: psmAnalysisContextClass.allOwnedElements()){
							if (! (elem instanceof Activity))
								continue;
							Activity activity = (Activity) elem;
							if (elem.getAppliedStereotype(Constants.MARTE_EndtoEndFlow) == null)
								continue;						
							//check if the the current PSM endToEndFlow activity refers to a PIM endToEndFlow
							SaEndtoEndFlow pimEndtoEndFlow = null;
							//check for the constraint that binds the current endToEndFlow activity to the PIM entities
							for (Constraint constr : psmAnalysisContextClass.getOwnedRules()){
								if (!constr.getConstrainedElements().contains(activity))
									continue;				
								for (Element constrained : constr.getConstrainedElements()){
									if (constrained instanceof Activity){				
										if (constrained != activity){
											if (constrained.getAppliedStereotype(Constants.MARTE_EndtoEndFlow) != null &&
													constrained.getAppliedStereotype(Constants.GAWORKLOADBEHAVIOR) != null){
												pimEndtoEndFlow = (SaEndtoEndFlow) constrained.getStereotypeApplication(constrained.getAppliedStereotype(Constants.MARTE_EndtoEndFlow));
												break;
											}
										}
									}
								}
								if (pimEndtoEndFlow!= null)
									break;
							}
							if (pimEndtoEndFlow!= null){
								SaEndtoEndFlow psmEndtoEndFlow = (SaEndtoEndFlow) activity.getStereotypeApplication(activity.getAppliedStereotype(Constants.MARTE_EndtoEndFlow));

								EndToEndResultData data = new EndToEndResultData();
								data.scenarioName = activity.getName();
								if (pimEndtoEndFlow.getEnd2EndD().size()>0) {
									data.deadline = pimEndtoEndFlow.getEnd2EndD().get(0);
								}
								if (psmEndtoEndFlow.getEnd2EndT().size()>0) {
									data.respTime = psmEndtoEndFlow.getEnd2EndT().get(0);
								}
								listData.add(data);							
							}
						}
					}
				}
			}
		}
		return listData;
	}	


	/**
	 * <pre>
	 * Get the selected element, the first selected element if several are selected or null
	 * if no selection or the selection is not an {@link EObject}.
	 *
	 * @return selected {@link EObject} or null
	 * </pre>
	 *
	 */
	public static EObject getSelectedElement() {
		EObject eObject = null;
		Object selection = null;


		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWorkbenchWindow != null) {
			// Get current selection
			selection = activeWorkbenchWindow.getSelectionService().getSelection();

			// Get first element if the selection is an IStructuredSelection
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				selection = structuredSelection.getFirstElement();
			}

			// Treat non-null selected object (try to adapt and return EObject)
			if (selection != null) {
				if (selection instanceof IAdaptable) {
					selection = EMFHelper.getEObject(selection);
				}

				Object businessObject = BusinessModelResolver.getInstance().getBusinessModel(selection);
				if (businessObject instanceof EObject) {
					eObject = (EObject) businessObject;
				}
			}
		}
		return eObject;
	}

	/**
	 * <pre>
	 * Get the selected element, the first selected element if several are selected or null
	 * if no selection or the selection is not an {@link EObject}.
	 *
	 * @return selected {@link EObject} or null
	 * </pre>
	 *
	 */
	public static EList<EObject> getTwoSelectedElements() {
		EObject eObject1 = null;
		EObject eObject2 = null;
		Object selection = null;
		Object selection1 = null;
		Object selection2 = null;
		EList<EObject> result = new BasicEList<EObject>();

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWorkbenchWindow != null) {
			// Get current selection
			selection = activeWorkbenchWindow.getSelectionService().getSelection();

			// Get first element if the selection is an IStructuredSelection
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				if (structuredSelection.size()!=2) {
					// it will return null because two elements must be selected
					return result;
				}
				Iterator iterator = structuredSelection.iterator();				
				if (iterator.hasNext()) {
					selection1 = iterator.next();
				}
				if (iterator.hasNext()) {
					selection2 = iterator.next();
				}
			}

			// Treat non-null selected object (try to adapt and return EObject)
			if (selection1 != null) {
				if (selection1 instanceof IAdaptable) {
					selection1 = EMFHelper.getEObject(selection1);
				}

				Object businessObject1 = BusinessModelResolver.getInstance().getBusinessModel(selection1);
				if (businessObject1 instanceof EObject) {
					eObject1 = (EObject) businessObject1;					
				}
			}
			result.add(eObject1);

			if (selection2 != null) {
				if (selection2 instanceof IAdaptable) {
					selection2 = EMFHelper.getEObject(selection2);
				}

				Object businessObject2 = BusinessModelResolver.getInstance().getBusinessModel(selection2);
				if (businessObject2 instanceof EObject) {
					eObject2 = (EObject) businessObject2;					
				}
			}
			result.add(eObject2);

		}
		return result;
	}


	/**
	 * Returns a list of the NFPValues (value and unit) of the toSearch field, 
	 * or [value=-1.0, unit=] if the field is not present in the string that is parsed.
	 *
	 * @param str The string to be parsed.
	 * @param toSearch Name of the field whose value and unit are to be returned
	 * @return the all nfp values
	 */
	public static List<ValueNFP> getAllNfpValues(String str, String toSearch) {

		List<ValueNFP> result = new ArrayList<ValueNFP>();

		String[] array = str.split("[()=, ]");
		for(int i=0; i<array.length-1; i++) {
			if (array[i].equalsIgnoreCase(toSearch)) {
				for(int j=i+1; j<array.length; j++) {
					if(array[j].equalsIgnoreCase("value")) {
						String d = array[j+1];
						ValueNFP res = new ValueNFP();
						res.value = Double.valueOf(d.trim());	

						for(int k=j+1; k<array.length; k++) {
							if(array[k].equalsIgnoreCase("unit")) {
								res.unit = array[k+1].trim();	
								result.add(res);
								break;
							}							
						}
						break;
					}
				}

			}
		} 
		return result;
	}




	/**
	 * Returns the NFPValue (value and unit) of the toSearch field, 
	 * or [value=-1.0, unit=] if the field is not present in the string that is parsed.
	 *
	 * @param str The string to be parsed.
	 * @param toSearch Name of the field whose value and unit are to be returned
	 * @return the nfp value
	 */
	public static ValueNFP getNfpValue(String str, String toSearch) {

		ValueNFP res = new ValueNFP();
		String[] array = str.split("[()=, ]");
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i].equalsIgnoreCase(toSearch) && array[j].equalsIgnoreCase("value")) {
					String d = array[j+1];
					res.value = Double.valueOf(d.trim());	

					for(int k=i+1; k<array.length; k++) {
						if(array[k].equalsIgnoreCase("unit")) {
							res.unit = array[k+1].trim();	
							break;
						}
					}
					return res;
				}
			}			
		} 
		res.value = -1.0;
		res.unit = "";
		return res;
	}

	/**
	 * Adds the field named in toSearch with its value and unit to the input NFPValue string
	 * if it was not there. Otherwise it updates its value and unit.
	 *
	 * @param str The NFPValue string to be updated
	 * @param toSearch The name of the field
	 * @param value The value to be set
	 * @param units The unit to be set
	 * @return the string
	 */
	public static String setNfpValue(String str, String toSearch, Double value, String units) {

		String res = new String();
		String toBeAdded = toSearch + "=(value=" + value.toString() + ", unit=" + units + ")";

		// empty NFP
		if(str == null || str.isEmpty() || str.trim().matches("\\(( *)\\)") )
		{
			res = "(" + toBeAdded + ")";
			return res;
		}

		// property has already another value specified
		if( str.contains(toSearch) )
		{
			res = str.replaceFirst(toSearch + "( *)=( *)\\((.[^\\)]*)\\)", toBeAdded);
		}
		else //otherwise
		{
			int index = str.lastIndexOf(')');
			res = str.substring(0, index) + ", " + toBeAdded + str.substring(index);
		}
		return res;
	}

	/**
	 * Returns the first NFPValue (value, unit) found in the input string  .
	 *
	 * @param value The string to be parsed
	 * @return the value NFP
	 */
	public static ValueNFP getValueNFP(String value) {
		ValueNFP res = new ValueNFP();
		res.value = -1.0;
		res.unit = "";

		String[] array = value.split("[()=,]");
		for(int i=0; i<array.length-1; i++) {
			if(array[i].trim().equalsIgnoreCase("value")) {
				String d = array[i+1].trim();
				res.value = Double.valueOf(d);			
			}
		}

		for(int i=0; i<array.length-1; i++) {
			if(array[i].trim().equalsIgnoreCase("unit")) {
				res.unit = array[i+1].trim();		
			}
		}

		return res;
	}

	/**
	 * Converts into seconds .
	 *
	 * @param value The value to be converted
	 * @param units The unit in which the value to be converted is originally expressed
	 * @return The Double value in seconds
	 */
	public static Double toSeconds(Double value, String units)
	{
		Double res = value;

		if(units == null|| units.trim().equalsIgnoreCase("s"))
			res *= 1.0;
		else if(units.trim().equalsIgnoreCase("ms"))
			res *= 1e-3;
		else if(units.trim().equalsIgnoreCase("us"))
			res *= 1e-6;
		else if(units.trim().equalsIgnoreCase("ns"))
			res *= 1e-9;
		else if(units.trim().equalsIgnoreCase("min"))
			res *= 60;
		else if(units.trim().equalsIgnoreCase("hrs"))
			res *= 360;
		else if(units.trim().equalsIgnoreCase("dys"))
			res *= 360 * 24;

		return res;
	}


	/**
	 * Returns the CHRTSpecification of the ARINCProcess owning the ARINCFunction referred by the given CHRtSpecification (context field) .
	 *
	 * @param instSpec the inst spec
	 * @param arincFunctionSpec the CHRtSpecification referring the ARINCFunction
	 * @return the arinc process specification
	 * @throws ModelError the model error
	 */
	public static CHRtSpecification getArincProcessSpecification(InstanceSpecification instSpec, CHRtSpecification arincFunctionSpec) 
			throws ModelError {

		String theArincFunctName = "";
		BehavioralFeature behavFeatFromArincFunctSpec = arincFunctionSpec.getContext();
		if (behavFeatFromArincFunctSpec.getAppliedStereotype(Constants.CH_ARINCFunction)!=null) {
			Stereotype arincFunctionStereo = behavFeatFromArincFunctSpec.getAppliedStereotype(Constants.CH_ARINCFunction);
			ARINCFunction arincFunction = (ARINCFunction) behavFeatFromArincFunctSpec.getStereotypeApplication(arincFunctionStereo);
			theArincFunctName = ((NamedElement) arincFunction.getBase_Operation()).getName();
		}
		else {
			throw new ModelError("Error: the input arincFunctionSpec has a context that is not an ARINCFunction");
		}

		//instance.getPOrtSlots
		EList<Slot> slotList = instSpec.getSlots();
		for (Slot slot : slotList) {
			//look at all the chrtspecifications of the port slot   
			if (slot.getAppliedStereotype(Constants.CH_CHRtPortSlot)!=null) {
				Stereotype chrtPortSlotStereo = slot.getAppliedStereotype(Constants.CH_CHRtPortSlot);
				CHRtPortSlot chrtPortSlot = (CHRtPortSlot) slot.getStereotypeApplication(chrtPortSlotStereo);
				EList<CHRtSpecification> chrtspecs = chrtPortSlot.getCH_RtSpecification();
				for (CHRtSpecification chrtspec : chrtspecs) {
					BehavioralFeature behavFeat = chrtspec.getContext();
					if (behavFeat.getAppliedStereotype(Constants.CH_ARINCProcess)!=null ) {
						Stereotype arincProcessStereo = behavFeat.getAppliedStereotype(Constants.CH_ARINCProcess);
						ARINCProcess arincProcess = (ARINCProcess) behavFeat.getStereotypeApplication(arincProcessStereo);
						String opGroupsString = arincProcess.getOperationsGroups();
						// if in its OperationGroups it contains the (name of the) ARUNCFunction referred to by arincFunctionSpec
						if (opGroupsString!=null && opGroupsString.contains(theArincFunctName)) {
							return chrtspec;											 
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the CHRtSpecification for an ARINCFunction, 
	 * deriving it from the CHRtSpecification of the related CHRtProcess
	 * and the occurrencyKind of the ARINCFunction itself.
	 *
	 * @param instance  The InstanceSpecification instance of ARINCComponentImpl owning the given ARINCFunction
	 * @param arincFunctChrtspec the arinc funct chrtspec
	 * @return the updated arinc fun chrt spec
	 * @throws ModelError the model error
	 */
	public static CHRtSpecification getUpdatedArincFunChrtSpec (InstanceSpecification instance, 
			CHRtSpecification arincFunctChrtspec) throws ModelError {

		CHRtSpecification arincProcessChrtspec = getArincProcessSpecification(instance, arincFunctChrtspec);

		if (arincProcessChrtspec == null){
			CHESSProjectSupport.printlnToCHESSConsole("ERROR: Unable to retrieve the ARICProcess from the ARINCFunction "+arincFunctChrtspec);
			return null;
		}

		CHRtSpecification chrtspec = arincFunctChrtspec;
		String occurrencyKindArincProc = arincProcessChrtspec.getOccKind();
		String occurrencyKindArincFunct = arincFunctChrtspec.getOccKind();

		//clean the ArincFunction occKind if necessary
		if (occurrencyKindArincFunct.contains(Constants.CHRTSPEC_OCCKIND_PERIODIC) || occurrencyKindArincFunct.contains(Constants.CHRTSPEC_OCCKIND_SPORADIC)){
			occurrencyKindArincFunct = "("+occurrencyKindArincFunct.substring(occurrencyKindArincFunct.indexOf("phase"));
		}

		if (!occurrencyKindArincProc.matches("\\s*periodic\\s*(\\(\\s*period\\s*=\\s*\\(\\s*value\\s*=\\s*(\\w*\\.?\\w*)\\s*,\\s*unit\\s*=\\s*(\\w*\\.?\\w*)\\s*\\)\\s*\\))")) {
			// The ARINCProcess must have a CHRtSpecification with occurrencyKind that looks like the following:
			// periodic(period=(value=100,unit=ms))
			throw new ModelError("Unexpected Occurrency Kind for ARINCProcess: "+occurrencyKindArincProc);

		}
		String newOccurrencyKind = occurrencyKindArincProc.substring(0, occurrencyKindArincProc.lastIndexOf(")"));
		newOccurrencyKind += ","+occurrencyKindArincFunct.substring(1);
		//newOccurrencyKind += ")";


		//get the rate divider of the ARINCFunction and apply it to derive the actual period of he arinc function
		int ratediv = 1;
		BehavioralFeature behavFeat = arincFunctChrtspec.getContext();
		if (behavFeat.getAppliedStereotype(Constants.CH_ARINCFunction)!=null ) {
			Stereotype arincFunctionStereo = behavFeat.getAppliedStereotype(Constants.CH_ARINCFunction);
			ARINCFunction arincFunction = (ARINCFunction) behavFeat.getStereotypeApplication(arincFunctionStereo);
			ratediv= arincFunction.getRateDivider();
		}else{
			throw new ModelError("ARINCProcess not found for "+behavFeat);
		}
		ValueNFP nfp = UMLUtils.getNfpValue(occurrencyKindArincProc, "period");
		newOccurrencyKind = UMLUtils.setNfpValue(newOccurrencyKind, "period", nfp.value*ratediv, nfp.unit);

		chrtspec.setOccKind(newOccurrencyKind);

		return chrtspec;
	}


	/**
	 * This function returns the list of all the CHrtSpecifications in the given View of the model.
	 *
	 * @param umlModel the uml model
	 * @param viewName the view name
	 * @return the all chrt specs
	 * @throws ModelError the model error
	 */
	public static EList<CHRtSpecification> getAllChrtSpecs(Model umlModel,
			String viewName) throws ModelError {

		Package parent = CHESSProfileManager.getViewByStereotype(umlModel,
				viewName);
		EList<Element> all = parent.allOwnedElements();
		EList<CHRtSpecification> chrtSpecs = new BasicEList<CHRtSpecification>();
		Stereotype stereo = null;
		for (Element element : all) {
			if((element.getAppliedStereotype(Constants.CHRT_SPECIFICATION)!=null)) {
				stereo = element.getAppliedStereotype(Constants.CHRT_SPECIFICATION);
				EObject eobj = element.getStereotypeApplication(stereo);
				CHRtSpecification chrtSpecification = (CHRtSpecification)eobj;
				chrtSpecs.add (chrtSpecification);
			}	
		}
		return chrtSpecs;
	}	


	/**
	 * Checks that the Context has two CHGaResourcePlatforms specified in the Platform field,
	 * one must be in the ComponentView and one in the DeploymentView,
	 * the one in the DeploymentView must contain a CH_HWProcessor.
	 *
	 * @param saAnalysisContext the sa analysis context
	 * @param umlModel the uml model
	 * @return true if the Context points to a SW and a HW instance in the Platform field
	 */
	public static boolean checkPlatformsInContext(SaAnalysisContext saAnalysisContext, Model umlModel) {
		boolean result = false;

		EList<GaResourcesPlatform> thePlatforms = saAnalysisContext.getPlatform();
		int count = 0;
		int countInDeploymentView = 0;
		int countInComponentView = 0;		

		for (GaResourcesPlatform thePlatform : thePlatforms) {
			if (thePlatform instanceof CHGaResourcePlatform) {
				count++;
			}
			Package instancePkg = ((CHGaResourcePlatform) thePlatform).getBase_Package();
			EList<Package> owningPkgs = instancePkg.allOwningPackages();
			for (Package pack : owningPkgs) {
				if (pack.equals(CHESSProfileManager.getViewByStereotype(umlModel, Constants.DEPLOYMENT_VIEW_NAME))) {
					countInDeploymentView++;
				}
				else {
					if (pack.equals(CHESSProfileManager.getViewByStereotype(umlModel, Constants.COMPONENT_VIEW_NAME))) {
						countInComponentView++;
					}
				}
			}
		}
		if (count==2 && countInDeploymentView==1 && countInComponentView==1) {
			result = true;
		}

		return result;		
	}	

	/**
	 * Checks that at least one Partition or Task is allocated on a Core that is owned by one of the HW instances in input.
	 *
	 * @param chHwProcList the ch hw proc list
	 * @param umlModel the uml model
	 * @return true if Checks that at least one Partition or Task is allocated on a Core that is owned by one of the HW instances in input
	 * @throws ModelError the model error
	 */
	public static boolean checkAllocationToCores(List<CH_HwProcessor> chHwProcList, Model umlModel) throws ModelError {
		boolean result = false;

		// Look for assignments that involve one of the HW system instances in input
		for (CH_HwProcessor chHwProc : chHwProcList) {
			EList<Assign> all2CoresAssignments = getAll2CoreAssignments(umlModel, Constants.DEPLOYMENT_VIEW_NAME);
			for (Assign assignment : all2CoresAssignments) {
				EList<Element> destinations = assignment.getTo();
				for (Element assignmentTarget : destinations) {
					if (elementIsProcessorInstance(assignmentTarget)) {
						Stereotype chHwProcStereo = assignmentTarget.getAppliedStereotype(Constants.CH_HWPROCESSOR);
						CH_HwProcessor theAssignmentChHwProc = (CH_HwProcessor) assignmentTarget.getStereotypeApplication(chHwProcStereo);
						if (chHwProc.equals(theAssignmentChHwProc)) {
							return true;
						}
					}
				}						
			}
		}
		return result;
	}



}
