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
package org.polarsys.chess.service.core.model;

import java.util.Collection;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.sysml.portandflows.FlowDirection;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.polarsys.chess.contracts.profile.chesscontract.ContractProperty;
import org.polarsys.chess.contracts.profile.chesscontract.ContractRefinement;
import org.polarsys.chess.contracts.profile.chesscontract.util.ContractEntityUtil;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;

import eu.fbk.eclipse.standardtools.utils.core.model.AbstractSystemModel;
import eu.fbk.eclipse.standardtools.utils.core.utils.StringArrayUtil;

public class ChessSystemModel implements AbstractSystemModel {

	private static ChessSystemModel chessToOCRAModelRunner;

	public static ChessSystemModel getInstance() {
		if (chessToOCRAModelRunner == null) {
			chessToOCRAModelRunner = new ChessSystemModel();
		}
		return chessToOCRAModelRunner;
	}

//	private final Logger logger = Logger.getLogger(ChessSystemModel.class);

	private ContractEntityUtil contractEntityUtil = ContractEntityUtil.getInstance();
	private EntityUtil entityUtil = EntityUtil.getInstance();

	@Override
	public String[] getLowerUpperBoundsForRangeType(Object rangeType) {
		return entityUtil.getLowerUpperBoundsForRangeType((Type) rangeType);
	}

	/*@Override
	public String[] getLowerUpperBoundsForRangeTypeParameter(Object rangeTypeParameter) {
		if (rangeTypeParameter instanceof Parameter) {
			return entityUtil.getLowerUpperBoundsForRangeType(((Parameter) rangeTypeParameter).getType());
		}
		return null;
	}	 */
	

	@Override
	public String[] getValuesForEnumeratorType(Object enumTypePort) {
		return entityUtil.getValuesForEnumeratorType((Type) enumTypePort);
	}

	/*@Override
	public String[] getValuesForEnumeratorTypeParameter(Object enumType) {
		return entityUtil.getValuesForEnumeratorType((Type) enumType);
	}*/

	@Override
	public String getComponentTypeName(Object component) {

		if (entityUtil.isBlock((Element) component)) {
			return entityUtil.getComponentName((Element) component);
		}
		return null;
	}

	@Override
	public boolean isRangeType(Object type) {
		return entityUtil.isRangeType((Type)type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getContractsOfComponent(java.lang.Object)
	 */
	@Override
	public EList<?> getContractsOfComponent(Object component) {
		return contractEntityUtil.getContractProperties((Class) component);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getComponentType(java.lang.Object)
	 */
	@Override
	public String getComponentInstanceTypeName(Object component) {

		if (entityUtil.isBlock((Element) component)) {
			return "";
		}

		if (entityUtil.isComponentInstance((Element) component)) {
			return ((Class) ((Property) component).getType()).getName();
		}

		return null;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getPortName(java.lang.Object)
	 */
	@Override
	public String getPortName(Object port) {
		// return ((Port)port).getQualifiedName().replaceAll("::", "_");
		return entityUtil.getPortName((Port) port);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getConnectorName(java.lang.Object)
	 */
	@Override
	public String getConnectorEndName(Object connector) {
		if (((ConnectorEnd) connector).getRole() != null) {
			return ((ConnectorEnd) connector).getRole().getName();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getContractDefinitionsText(java.lang.Object)
	 */
	@Override
	public String getContractDefinitionsText(Object component) throws Exception {

		List<Property> listCp = null;
		if (entityUtil.isComponentInstance((Element) component)) {
			Class componentType = (Class) (((Property) component).getType());
			listCp = contractEntityUtil.getContractPropertiesAsUMLProperties(componentType);
		} else if ((// entityUtil.isSystem((Element) component)||
		(entityUtil.isBlock((Element) component)))) {
			listCp = contractEntityUtil.getContractPropertiesAsUMLProperties((Class) component);
		}
		String definitions = "";
		if (listCp != null) {
			for (Property contractProperty : listCp) {
				String currContract = contractEntityUtil.convertContractPropertyInStr(contractProperty);
				definitions = definitions.concat(currContract);
			}
		}
		return definitions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getOrcaFormulaConstraintText(java.lang.Object)
	 */
	@Override
	public String getFormulaConstraintText(Object formulaConstraint) {
		return ((Constraint) formulaConstraint).getSpecification().stringValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getFormulaConstraints(java.lang.Object)
	 */
	@Override
	public EList<Constraint> getFormulaConstraints(Object component) {
		return entityUtil.getDelegationConstraintsAsUMLConstraints((Element) component);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getInputPorts(java.lang.Object)
	 */
	@Override
	public EList<Port> getNonStaticInputPorts(Object component) {
		return new BasicEList<Port>(entityUtil.getUmlPorts((Element) component, FlowDirection.IN_VALUE, false));
	}

	@Override
	public EList<?> getNonStaticPorts(Object component) {
		return entityUtil.getUmlPorts((Element) component, false);
	}

	


	@Override
	public String getUninterpretedFunctionName(Object function) {
		if (function instanceof FunctionBehavior) {
			return entityUtil.getUmlFunctionBehaviorName((FunctionBehavior) function);
		}
		return null;
	}
	
	/*@Override
	public Object getUninterpretedFunctionType(Object function) {
		if (function instanceof FunctionBehavior) {
			return entityUtil.getFunctionBehaviorType((FunctionBehavior) function);
		}
		return null;
	}*/
	
/*	@Override
	public EList<?>	getUninterpretedFunctionInputParameters(Object function) {
		if (function instanceof FunctionBehavior) {
			return entityUtil.getUMLFunctionBehaviorInputParameters((FunctionBehavior) function);
		}
		return null;
	}
	@Override
	public Object getUninterpretedFunctionOutputParameter(Object function) {
		if (function instanceof FunctionBehavior) {
			return entityUtil.getUMLFunctionBehaviorOutputParameter((FunctionBehavior) function);
							  
		}
		return null;
	}
	*/

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getOutputPorts(java.lang.Object)
	 */
	@Override
	public EList<Port> getNonStaticOutputPorts(Object component) {
		int direction = FlowDirection.OUT_VALUE;
		return new BasicEList<Port>(entityUtil.getUmlPorts((Element) component, direction, false));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getGenericPorts(java.lang.Object)
	 */
	@Override
	public EList<Port> getNonStaticGenericPorts(Object component) {
		int direction = FlowDirection.INOUT_VALUE;
		return new BasicEList<Port>(entityUtil.getUmlPorts((Element) component, direction, false));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getConnectionSource(java.lang.Object)
	 */
	@Override
	public Object getConnectorSource(Object connection) throws Exception {

		ConnectorEnd source = ((Connector) connection).getEnds().get(0);
		ConnectorEnd target = ((Connector) connection).getEnds().get(1);
		Element sourceOwner = source.getPartWithPort();
		Element targetOwner = target.getPartWithPort();

		Element sourcePort = source.getRole();
		Element targetPort = target.getRole();

		if (sourcePort == null) {
			throw new Exception("The connection '" + ((Connector) connection).getName() + "' of the component '"
					+ entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have a source port");
		}

		if (targetPort == null) {
			throw new Exception("The connection '" + ((Connector) connection).getName() + "' of the component '"
					+ entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have a target port");
		}

		Integer sourceDir = entityUtil.getPortDirection(sourcePort);
		Integer targetDir = entityUtil.getPortDirection(targetPort);

		if (sourceDir == null) {
			throw new Exception("The source port of the connection '" + ((Connector) connection).getName()
					+ "' of the component '" + entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have assiociated a port");
		}

		if (targetDir == null) {
			throw new Exception("The target port of the connection '" + ((Connector) connection).getName()
					+ "' of the component '" + entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have assiociated a port");
		}

		if ((sourceOwner == null) && (sourceDir == FlowDirection.IN_VALUE)) {
			return source;
		}
		if ((targetOwner == null) && (targetDir == FlowDirection.IN_VALUE)) {
			return target;
		}
		if ((sourceOwner != null) && (sourceDir == FlowDirection.OUT_VALUE)) {
			return source;
		}
		if ((targetOwner != null) && (targetDir == FlowDirection.OUT_VALUE)) {
			return target;
		}

		return ((Connector) connection).getEnds().get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getConnectionTarget(java.lang.Object)
	 */
	@Override
	public Object getConnectorTarget(Object connection) throws Exception {

		ConnectorEnd source = ((Connector) connection).getEnds().get(0);
		ConnectorEnd target = ((Connector) connection).getEnds().get(1);
		Element sourceOwner = source.getPartWithPort();
		Element targetOwner = target.getPartWithPort();

		Element sourcePort = source.getRole();
		Element targetPort = target.getRole();

		if (sourcePort == null) {
			throw new Exception("The connection '" + ((Connector) connection).getName() + "' of the component '"
					+ entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have a source port");
		}

		if (targetPort == null) {
			throw new Exception("The connection '" + ((Connector) connection).getName() + "' of the component '"
					+ entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have a target port");
		}

		Integer sourceDir = entityUtil.getPortDirection(sourcePort);
		Integer targetDir = entityUtil.getPortDirection(targetPort);

		if (sourceDir == null) {
			throw new Exception("The source port of the connection '" + ((Connector) connection).getName()
					+ "' of the component '" + entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have assiociated a port");
		}

		if (targetDir == null) {
			throw new Exception("The target port of the connection '" + ((Connector) connection).getName()
					+ "' of the component '" + entityUtil.getComponentName(entityUtil.getOwner((Connector) connection))
					+ "' does not have assiociated a port");
		}

		if ((sourceOwner == null) && (sourceDir == FlowDirection.OUT_VALUE)) {
			return source;
		}
		if ((targetOwner == null) && (targetDir == FlowDirection.OUT_VALUE)) {
			return target;
		}
		if ((sourceOwner != null) && (sourceDir == FlowDirection.IN_VALUE)) {
			return source;
		}
		if ((targetOwner != null) && (targetDir == FlowDirection.IN_VALUE)) {
			return target;
		}

		return ((Connector) connection).getEnds().get(1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getConnectionsPorts(java.lang.Object)
	 */
	@Override
	public EList<Connector> getConnectionsPorts(Object component) {
		if (
		// entityUtil.isSystem((Element) component)||
		(entityUtil.isBlock((Element) component))) {
			return ((Class) component).getOwnedConnectors();
		} else if (entityUtil.isComponentInstance((Element) component)) {
			return ((Class) ((Property) component).getType()).getOwnedConnectors();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getSourceConnectorOwner(java.lang.Object)
	 */
	@Override
	public Object getConnectorEndOwner(Object connectorEnd) {
		if (connectorEnd != null) {
			return ((ConnectorEnd) connectorEnd).getPartWithPort();
		}
		return null;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getComponentInstanceName(java.lang.Object)
	 */
	@Override
	public String getComponentInstanceName(Object component) {
		if (entityUtil.isComponentInstance((Element) component)) {
			return ((Property) component).getName().replaceAll("::", "_");
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getContract(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object getContract(Object component, String contractName) {
		if (entityUtil.isComponentInstance((Element) component)) {
			Class compClass = ((Class) ((Property) component).getType());
			return contractEntityUtil.getContractProperty(contractEntityUtil
					.getPropertyOfUmlComponentWithContractPropertyType(compClass, contractName));
		} else if (
		// entityUtil.isSystem((Element) component)||
		(entityUtil.isBlock((Element) component))) {			
			Property property = contractEntityUtil
					.getPropertyOfUmlComponentWithContractPropertyType((Class) component, contractName);
			if (property != null) {
				return contractEntityUtil.getContractProperty(property);
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getContractName(java.lang.Object)
	 */
	@Override
	public String getContractInstanceName(Object contractProperty) throws Exception {

		if (contractProperty instanceof ContractProperty) {
			Type contractType = ((ContractProperty) contractProperty).getBase_Property().getType();

			if (contractType != null) {
				return ((ContractProperty) contractProperty).getBase_Property().getType().getName();
			} else {
				throw new Exception(
						"The ContractProperty \"" + ((ContractProperty) contractProperty).getBase_Property().getName()
								+ "\" does not have a type.");
			}
		} else {
			throw new Exception("The element \"" + contractProperty + "\" is not a contract property.");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getComponentName(java.lang.Object)
	 */
	@Override
	public String getComponentName(Object component) {
		return entityUtil.getComponentName((Element) component);
	}

	@Override
	public Object getComponentType(Object component) {
		if (entityUtil.isComponentInstance((Element) component)) {
			return entityUtil.getUmlType((Property) component);
		} else if (component instanceof Class) {
			return component;
		}
		return null;
	}

	@Override
	public String getContractQualifiedName(Object contract) {
		return contractEntityUtil.getContractQualifiedName((Class) contract);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getContractRefinements(java.lang.Object)
	 */
	@Override
	public EList<ContractRefinement> getContractRefinements(Object parentContract) {
		return ((ContractProperty) parentContract).getRefinedBy();
	}

	@Override
	public String getContractRefinementName(Object contractRefinement) {
		return ((ContractRefinement) contractRefinement).getBase_DataType().getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getComponentOfContractRefinement(java.lang.Object)
	 */
	@Override
	public Object getComponentInstanceOfContractRefinement(Object contractRefinement) {
		return ((ContractRefinement) contractRefinement).getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getContractOfContractRefinement(java.lang.Object)
	 */
	@Override
	public Object getContractInstanceOfContractRefinement(Object contractRefinement) {
		return ((ContractRefinement) contractRefinement).getContract();
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# getSubComponents(java.lang.Object)
	 */
	@Override
	public EList<Property> getSubComponentsInstances(Object component) {
		if ((
		// entityUtil.isSystem((Element) component)||
		(entityUtil.isBlock((Element) component)))) {
			return new BasicEList<Property>(entityUtil.getSubComponentsInstances((Class) component));
		} else if (entityUtil.isComponentInstance((Element) component)) {
			return new BasicEList<Property>(
					entityUtil.getSubComponentsInstances((Class) ((Property) component).getType()));
		}
		return null;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see eu.fbk.eclipse.standardtools.ModelTranslatorToOcra.dsl.run.model.
	 * ToolToOCRAModel# isContractOwnerEqualToComponent(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	public boolean isContractInstanceOwnerEqualToComponent(Object contract, Object component) {

		//logger.debug("isContractInstanceOwnerEqualToComponent, contractProperty name: "
			//	+ ((ContractProperty) contract).getBase_Property().getName());

		Element contractOwner = entityUtil.getOwner(((ContractProperty) contract).getBase_Property());
		Element componentType = (((Property) component).getType());
		return contractOwner == componentType;
	}

	

	@Override
	public String getOwnerName(Object element) {
		return entityUtil.getComponentName(entityUtil.getOwner((Element) element));
	}

	/*@Override
	public boolean isNullPort(Object attribute) {
		return (((Property) attribute).getType() == null);
	}*/

	@Override
	public boolean isInputPort(Object port) {
		return entityUtil.isInputPort((Port) port);
	}

	@Override
	public boolean isOutputPort(Object port) {
		return entityUtil.isOutputPort((Port) port);
	}

	@Override
	public boolean isInOutPort(Object port) {
		return entityUtil.isInOutPort((Port) port);
	}



	
	

	@Override
	public String getConstraintQualifiedName(Object constraint) {
		return entityUtil.getQualifiedName((NamedElement) constraint);
	}

	@Override
	public String getComponentQualifiedName(Object component) {
		return entityUtil.getQualifiedName((NamedElement) component);
	}


	@Override
	public EList<?> getStaticPorts(Object component) {
		return entityUtil.getUmlPorts((Element) component, true);
	}
	

	
	/*@Override
	public boolean isNullFunctionParameter(Object parameter) {
		if (parameter instanceof Parameter) {
			return (((Parameter) parameter).getType() == null);
		}
		return false;
	}*/



	@Override
	public String getInterfaceAssertionBody(Object interfaceAssertion, String language) {
		return entityUtil.getConstraintBodyStr((Constraint) interfaceAssertion, language);
	}

	@Override
	public EList<?> getInterfaceAssertions(Object component) {
		return entityUtil.getInterfaceFormalPropertiesAsConstraints((Element) component);
	}

	@Override
	public String getInterfaceAssertionName(Object interfaceAssertion) {
		return entityUtil.getConstraintName((Constraint) interfaceAssertion);
	}

	@Override
	public String getRefinementAssertionName(Object refinementAssertion) {
		return entityUtil.getConstraintName((Constraint) refinementAssertion);
	}

	@Override
	public String getRefinementAssertionBody(Object refinementAssertion, String language) {
		return entityUtil.getConstraintBodyStr((Constraint) refinementAssertion, language);
	}

	@Override
	public EList<?> getRefinementAssertions(Object component) {
		return entityUtil.getRefinementFormalPropertiesAsConstraints((Element) component);
	}

	@Override
	public String getAssertionQualifiedName(Object formalProperty) {
		return entityUtil.getConstraintQualifiedName((Constraint)formalProperty);
	}

	@Override
	public String getDefineName(Object define) {
		return entityUtil.getConstraintName((Constraint) define);
	}

	@Override
	public String getDefineBody(Object define, String language) {
		return entityUtil.getConstraintBodyStr((Constraint) define, language);
	}

	@Override
	public boolean isAssertion(Object constraint) {		
		return entityUtil.isFormalProperty((Constraint)constraint);
	}

	@Override
	public boolean isInterfaceAssertion(Object constraint) {
		return entityUtil.isInterfaceFormalProperty((Constraint)constraint);
	}

	@Override
	public EList<String> getEnumValues(Object component) {
		return entityUtil.getEnumValuesFromComponentAttributes((Element) component);
	}

	@Override
	public EList<?> getDefines(Object component) {
		return entityUtil.getMacroDefinitionsAsUMLConstraints((Element) component);
	}
	
	@Override
	public boolean isDefine(Object element) {
		return entityUtil.isMacroDefinition((Element) element);
	}
	
	@Override
	public Object getNearestOwnerComponent(Object element) {
		Element owner = entityUtil.getOwner((Element) element);

		if (!(owner instanceof Class)) {
			return null;
		}
		// block added to manage formal properties with contract as owner
		if (contractEntityUtil.isContract(owner)) {
			owner = (Class) entityUtil.getOwner(owner);
		}
		
		return owner;
	}

	@Override
	public String[] getSubComponentsName(Object component) {
		return entityUtil.getSubComponentsName((Class) component);
	}

	@Override
	public Object getSubComponent(Object component, String subCompName) {
		return entityUtil.getSubComponent((Element)component, subCompName);
	}

	@Override
	public EList<?> getUninterpretedFunctions(Object component) {
		return entityUtil.getUmlFunctionBehaviors((Element)component);
	}

	@Override
	public EList<String> getEnumValuesFromAttributes(Object component) {
		return entityUtil.getEnumValuesFromComponentAttributes((Element)component);
	}

	@Override
	public Object getPortType(Object attribute) {
		return entityUtil.getAttributeType((Property)attribute);
	}

	@Override
	public boolean isBooleanType(Object type) {
		return entityUtil.isBooleanType((Type)type);
	}

	@Override
	public boolean isContinuousType(Object type) {
		return entityUtil.isContinuousType((Type)type);
	}

	@Override
	public boolean isEnumType(Object type) {
		return entityUtil.isEnumerationType((Type)type);
	}

	@Override
	public boolean isEventType(Object type) {
		return entityUtil.isEventType((Type)type);
	}

	@Override
	public boolean isIntType(Object type) {
		return entityUtil.isIntegerType((Type)type);
	}

	@Override
	public boolean isNumberType(Object type) {
		//return entityUtil.isNumberType((Type)type);
		return false;
	}

	@Override
	public boolean isRealType(Object type) {
		return entityUtil.isRealType((Type)type);
	}

	@Override
	public boolean isWordType(Object type) {
		//return entityUtil.isWordType((Type)type);
		return false;
	}

	@Override
	public Object getUninterpretedFunctionOutputType(Object uninterpretedFunction) {
		return entityUtil.getUmlFunctionBehaviorOutputType((FunctionBehavior)uninterpretedFunction);
	}

	@Override
	public EList<?> getUninterpretedFunctionInputTypes(Object uninterpretedFunction) {
		return entityUtil.getUmlFunctionBehaviorInputTypes((FunctionBehavior)uninterpretedFunction);
	}

	/*@Override
	public Object getFunctionParameterType(Object parameter) {
		return entityUtil.getParameterType((Parameter) parameter);
	}

	@Override
	public String getFunctionParameterName(Object parameter) {
		return entityUtil.getParameterName((Parameter) parameter);
	}

	@Override
	public Object getUninterpretedFunctionParameterOwner(Object parameter) {
		return entityUtil.getParameterOwner((Parameter) parameter);
	}
*/
	@Override
	public boolean isRefinementAssertion(Object formalProperty) {
		return entityUtil.isRefinementFormalProperty((Element) formalProperty);
	}


	@Override
	public String[] getComponentInstanceMultiplicityBoundaries(Object component) throws Exception{
		return entityUtil.getComponentInstanceMultiplicity((Property) component);
	}

	@Override
	public String[] getPortMultiplicityBoundaries(Object port) {
		return entityUtil.getAttributeMultiplicity((Property) port);
	}
	
	/**
	 * Returns the type of the given port, as string.
	 */
	@Override
	public String getPortTypeAsStringName(Object activePackage, String componentName, String portName) {
		
		if (activePackage instanceof Package) {
			final Package pkg = (Package) activePackage;
			
			// Get the component with the given name
			final Class element = (Class) pkg.getOwnedMember(componentName, false, UMLFactory.eINSTANCE.createClass().eClass());
			
			// Get the port
			final Port port = element.getOwnedPort(portName, null);
			
			return port.getType().getName();
		}
		
		return null;
	}

	@Override
	public EList<?> getParameterAssumptions(Object component) {
		
		return entityUtil.getParameterAssumptionsAsConstraintsUml((Element) component);
	}

	@Override
	public String getParameterAssumptionsBody(Object parameterAssumption, String language) {
		return entityUtil.getConstraintBodyStr((Constraint) parameterAssumption, language);
	}

	@Override
	public boolean isParameterAssumptions(Object element) {
		return entityUtil.isParameterAssumptions((Element) element);
	}

	@Override
	public String[] getUninterpretedFunctionOutputMultiplicity(Object uninterpretedFunction) {
		return entityUtil.getUmlFunctionBehaviorOutputMultiplicity((FunctionBehavior) uninterpretedFunction);
	}

	@Override
	public EList<String[]> getUninterpretedFunctionInputMultiplicities(Object uninterpretedFunction) {
		return entityUtil.getUmlFunctionBehaviorInputMultiplicities((FunctionBehavior) uninterpretedFunction);
	}

	@Override
	public String[] getComponentInstanceRangeOfContractRefinement(Object contractRefinement) {
		String lower =  ((ContractRefinement) contractRefinement).getLowerIndexOfInstance();
		String upper =  ((ContractRefinement) contractRefinement).getUpperIndexOfInstance();
		return new String[]{lower,upper};
	}

	@Override
	public EList<?> getLocalAttributes(Object component) {
		return entityUtil.getLocalProperties((Element) component);
	}
	
	@Override
	public String getLocalAttributeName(Object attribute) {
		return entityUtil.getLocalPropertyName((Property) attribute);
	}

	@Override
	public String getLocalAttributeType(Object attribute) {
		return entityUtil.getLocalPropertyType((Property) attribute);
	}

	@Override
	public String getAnalysisContextName(Object ctx) {
		return ((AnalysisContextElement)ctx).getBase_Component().getQualifiedName();		
	}

	@Override
	public String getModelCheckingAnalysisContextType(Object ctx) {
		return StringArrayUtil.getConditionValue( ((AnalysisContextElement)ctx).getConditions(),  AnalysisResultUtil.CHECK_TYPE);
	}

	@Override
	public String getModelCheckingAnalysisContextProperty(Object ctx) {
		return StringArrayUtil.getConditionValue( ((AnalysisContextElement)ctx).getConditions(),  AnalysisResultUtil.PROPERTY);
	}

	@Override
	public String getValidationPropertyAnalysisContextType(Object ctx) {
		return StringArrayUtil.getConditionValue( ((AnalysisContextElement)ctx).getConditions(),  AnalysisResultUtil.CHECK_TYPE);
	}

	@Override
	public String getValidationPropertyAnalysisContextExpression(Object ctx) {
		return StringArrayUtil.getConditionValue( ((AnalysisContextElement)ctx).getConditions(),  AnalysisResultUtil.PROPERTY);
	}

	@Override
	public String getValidationPropertyAnalysisContextComponent(Object ctx) {
		return StringArrayUtil.getConditionValue( ((AnalysisContextElement)ctx).getConditions(),  AnalysisResultUtil.SELECTED_COMPONENTS);
	}

	@Override
	public String[] getValidationPropertyAnalysisContextSelectedProperties(Object ctx) {
		return StringArrayUtil.getConditionValue( ((AnalysisContextElement)ctx).getConditions(),  AnalysisResultUtil.SELECTED_PROPERTIES).split(",");
	}

	@Override
	public String getInstantiatedArchitectureConfigurationName(Object instantiatedArchitectureConfiguration) {		
		return entityUtil.getInstantiatedArchitectureConfigurationName((InstantiatedArchitectureConfiguration)instantiatedArchitectureConfiguration);
	}

	@Override
	public EList<String> getParametersListFromInstantiatedArchitectureConfiguration(
			Object instantiatedArchitectureConfiguration) {
		return entityUtil.getParametersListFromInstantiatedArchitectureConfiguration((InstantiatedArchitectureConfiguration)instantiatedArchitectureConfiguration);

	}

	@Override
	public EList<?> getOperations(Object component) {
		return entityUtil.getUmlOperations((Element)component);
	}

	@Override
	public String getOperationName(Object operation) {
		if (operation instanceof Operation) {
			return entityUtil.getUmlOperationName((Operation) operation);
		}
		return null;
	}

	@Override
	public Object getOperationOutputType(Object operation) {
		return entityUtil.getUmlOperationOutputType((Operation)operation);
	}

	@Override
	public EList<?> getOperationInputTypes(Object operation) {
		return entityUtil.getUmlOperationInputTypes((Operation)operation);
	}

	@Override
	public String getOperationBody(Object operation, String language) {
		return entityUtil.getUmlOperationBody((Operation)operation, language);
	}

	@Override
	public EList<?> getBlockTypeAttributes(Object component) {
		return EntityUtil.getInstance().getBlockTypeAttributes((Class)component);
	}

	@Override
	public String getLocalAttributeVisibility(Object blockTypeAttribute) {
		return EntityUtil.getInstance().getAttributeVisibility((Property)blockTypeAttribute);
	}

	@Override
	public Object getAttributeType(Object attribute) {
		return ((Property)attribute).getType();
	}

	@Override
	public boolean isBlockTypeAttribute(String attributeName, Object blockAsClass) {		
		return EntityUtil.getInstance().isBlockTypeAttribute(attributeName, (Class)blockAsClass);
	}

	@Override
	public boolean isBlockType(Object type) {		
		return EntityUtil.getInstance().isBlock((Element)type);
	}
	
	@Override
	public Object getAttributeBlockType(String attributeName, Object block) {
		return EntityUtil.getInstance().getAttributeBlockType(attributeName,(Class)block);
	}

	@Override
	public Object getAttributeType(String attributeName, Object block) {
		if(block instanceof Class){
		return EntityUtil.getInstance().getAttributeType(attributeName,(Class)block);
		}
		return null;
	}
	
	@Override
	public boolean isCommandOperation(String methodName, Object block) {
		return false;
	}

	@Override
	public boolean isAttribute(String attributeName, Object block) {
		return EntityUtil.getInstance().isAttribute(attributeName, (Class)block);
	}

	@Override
	public boolean isOperation(String operationName, Object block) {
		return EntityUtil.getInstance().isOperation(operationName, (Class)block);
	}

	@Override
	public boolean isEnumValue(String name, Object enumType) {
		return EntityUtil.getInstance().isEnumValue(name, (Type)enumType);
	}

	@Override
	public String getQualifiedName(Object element) {
		return ((NamedElement)element).getQualifiedName();
	}

	@Override
	public Object getOperationReturnType(String operationName, Object block) {
		return EntityUtil.getInstance().getOperationType(operationName, (Class)block);
	}

	@Override
	public Object getParameterType(int paramIndex, String methodName, Object retrieveBlockType) {		
		return EntityUtil.getInstance().getParameterType(paramIndex, methodName, (Class)retrieveBlockType);
	}

/*	@Override
	public boolean isCallEvent(String idName, Object currBlock) {
return EntityUtil.getInstance().isCallEventByOperationName(idName,currBlock);
	}

	@Override
	public Object getCallEvent(String idName, Object currBlock) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public String getCallEventOperationName(Object callEvent) throws Exception {
		return EntityUtil.getInstance().getCallEventOperationName((CallEvent)callEvent);
	}

	@Override
	public String getCallEventName(Object callEvent) {
		return ((CallEvent)callEvent).getName();
		
	}

	@Override
	public Collection<?> getAllCallEvent(Object block) {
		return EntityUtil.getInstance().getAllCallEvent((Class)block);
	}

	@Override
	public String getName(Object element) {
		return ((NamedElement)element).getName();
	}

	@Override
	public EList<String> getOperationsNames(Object component) {
		return EntityUtil.getInstance().getOperationsNames((Class)component);
	}

	@Override
	public EList<String> getAttributesNames(Object component) {
		return EntityUtil.getInstance().getAttributesNames((Class)component);
	}

	@Override
	public boolean isCallEvent(Object element) {
		return element instanceof CallEvent;
	}

	@Override
	public Object getCallEventParameterType(String paramterName, Object callEvent) {
		System.out.println(callEvent);
		if(isCallEvent(callEvent)){
			System.out.println("isCallEvent. operation: "+((CallEvent)callEvent).getOperation());
			Parameter par = ((CallEvent)callEvent).getOperation().getOwnedParameter(paramterName, null);
			if(par != null){
				return par.getType();
			}
			
		}
		return null;
	}

	@Override
	public Object getCallEventOperation(Object callEvent) throws Exception {
		return EntityUtil.getInstance().getCallEventOperation((CallEvent)callEvent);
	}
	
	@Override
	public Object getParameterType(String paramName, String methodName, Object retrieveBlockType) {
		return EntityUtil.getInstance().getParameterType(paramName, methodName, (Class)retrieveBlockType);
	}

}
