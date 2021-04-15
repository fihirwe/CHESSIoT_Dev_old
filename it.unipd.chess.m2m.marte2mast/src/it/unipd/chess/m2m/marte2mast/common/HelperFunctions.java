package it.unipd.chess.m2m.marte2mast.common;

/*---------------------------------------------------------------------
 --                           Marte2Mast                              --
 --      Converter of Schedulability analysis models made with UML2   --
 --   and The UML Profile for MARTE to MAST, the Analysis Suite for   --
 --                      Real-Time Applications                       --
 --                                                                   --
 --                     Copyright (C) 2010-2011                       --
 --                 Universidad de Cantabria, SPAIN                   --
 --                                                                   --
 --                                                                   --
 --           URL: http://mast.unican.es/umlmast/marte2mast           --
 --                                                                   --
 --  Authors: Alvaro Garcia Cuesta   alvaro@binarynonsense.com        --
 --           Julio Medina           julio.medina@unican.es           --
 --                                                                   --
 -- This program is free software; you can redistribute it and/or     --
 -- modify it under the terms of the GNU General Public               --
 -- License as published by the Free Software Foundation; either      --
 -- version 2 of the License, or (at your option) any later version.  --
 --                                                                   --
 -- This program is distributed in the hope that it will be useful,   --
 -- but WITHOUT ANY WARRANTY; without even the implied warranty of    --
 -- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU --
 -- General Public License for more details.                          --
 --                                                                   --
 -- You should have received a copy of the GNU General Public         --
 -- License along with this program; if not, write to the             --
 -- Free Software Foundation, Inc., 59 Temple Place - Suite 330,      --
 -- Boston, MA 02111-1307, USA.                                       --
 --                                                                   --
 ---------------------------------------------------------------------*/

import it.unipd.chess.m2m.marte2mast.Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SaExecHost;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.Assign;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ComputingResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.SchedulableResource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Scheduler;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.core.util.uml.UMLUtils;
import org.polarsys.chess.core.util.uml.ValueNFP;
import org.polarsys.chess.validator.constraints.StringParser;

/**
 * This class contains a series of helper functions for things like extracting
 * properties from UML stereotypes, parsing VSL formatted strings, copying
 * files...
 */
public class HelperFunctions {

	// ////////////////////////////////////////////////////////////////
	// ////////helper functions used from acceleo and java/////////////
	// ////////////////////////////////////////////////////////////////

	private static SwSchedulableResource stereotypeApplication;

	/**
	 * Checks if a UML element has a stereotype with the provided name and
	 * returns it.
	 *
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 *
	 * @return the Stereotype with the provided name if it exists, or null if it
	 *         doesn't
	 */
	public static Stereotype getAppliedStereotype(Element theElement,
			String stereotypeName) {
		EList<Stereotype> appliedStereotypes = theElement
				.getAppliedStereotypes();
		for (int i = 0; i < appliedStereotypes.size(); i++) {
			if (appliedStereotypes.get(i).getName().equals(stereotypeName)) {
				return appliedStereotypes.get(i);
			}
		}// end for stereos
		return null;
	}// end getAppliedStereotype

	/**
	 * Checks if a UML element has a stereotype with the provided name and
	 * returns the value of given property.
	 *
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want
	 *
	 * @return the the value of the property if it exists, or null if it doesn't
	 */
	public static Object getStereotypeProperty(Element theElement,
			String stereotypeName, String propertyName) {
		Stereotype theStereotype = getAppliedStereotype(theElement,
				stereotypeName);
		if (theStereotype != null) {
			if (theElement.getValue(theStereotype, propertyName) != null)
				if (!theElement.getValue(theStereotype, propertyName)
						.toString().equals("[]"))
					return theElement.getValue(theStereotype, propertyName);
		}
		return null;
	}// end getStereotypeProperty

	/**
	 * Work In Progress: Checks if a UML element has a stereotype with the
	 * provided name and changes the value of given property to the provided
	 * one.
	 *
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want to change
	 * 
	 * @param singleValueProperty
	 *            true if property only allows one value: [0..1]
	 * 
	 * @param overwrite
	 *            delete previous content?
	 * 
	 * @param theValue
	 *            new value for the property
	 */
	public static void setStereotypeProperty(Element theElement,
			String stereotypeName, String propertyName, String theValue,
			boolean singleValueProperty, boolean overwrite) {

		Stereotype theStereotype = getAppliedStereotype(theElement,
				stereotypeName);
		if (theStereotype != null) {
			// if ("SaStep".equals(stereotypeName)){
			// SaStep saStep = UMLUtils.getStereotypeApplication(theElement,
			// SaStep.class);
			// if("respT".equals(propertyName)){
			// saStep.getRespT().add(theValue);
			// }
			// if("blockT".equals(propertyName)){
			// saStep.setBlockT(theValue);
			// }
			// }
			// else if ("SaEndtoEndFlow".equals(stereotypeName)){
			// SaEndtoEndFlow saEndtoEndFlow =
			// UMLUtils.getStereotypeApplication(theElement,
			// SaEndtoEndFlow.class);
			// if("end2EndT".equals(propertyName)){
			// saEndtoEndFlow.getEnd2EndT().add(theValue);
			// }
			// if("schSlack".equals(propertyName)){
			// saEndtoEndFlow.setSchSlack(theValue);
			// }
			// }
			// else if ("GaLatencyObs".equals(stereotypeName)){
			// GaLatencyObs gaLatencyObs =
			// UMLUtils.getStereotypeApplication(theElement,
			// GaLatencyObs.class);
			// if("latency".equals(propertyName)){
			// gaLatencyObs.getLatency().add(theValue);
			// }
			// if("maxJitter".equals(propertyName)){
			// gaLatencyObs.getMaxJitter().add(theValue);
			// }
			// }
			// else if ("SaExecHost".equals(stereotypeName)){
			// SaExecHost saExecHost =
			// UMLUtils.getStereotypeApplication(theElement, SaExecHost.class);
			// if("schSlack".equals(propertyName)){
			// saExecHost.setSchSlack(theValue);
			// }
			// if("schedUtiliz".equals(propertyName)){
			// saExecHost.setSchedUtiliz(theValue);
			// }
			// if("utilization".equals(propertyName)){
			// saExecHost.getUtilization().add(theValue);
			// }
			// }
			// else if ("SaCommHost".equals(stereotypeName)){
			// SaCommHost saCommHost =
			// UMLUtils.getStereotypeApplication(theElement, SaCommHost.class);
			// if("schSlack".equals(propertyName)){
			// saCommHost.setSchSlack(theValue);
			// }
			// if("utilization".equals(propertyName)){
			// saCommHost.getUtilization().add(theValue);
			// }
			// }
			// else if ("SaAnalysisContext".equals(stereotypeName)){
			// SaAnalysisContext saAnalysisContext =
			// UMLUtils.getStereotypeApplication(theElement,
			// SaAnalysisContext.class);
			// if("isSched".equals(propertyName)){
			// saAnalysisContext.setIsSched(theValue);
			// }
			// }
			// else
			{

				// TODO: return the new value
				// //WORKS:
				// EDataTypeUniqueEList data = (EDataTypeUniqueEList)
				// getStereotypeProperty(theElement, stereotypeName,
				// "execTime");
				// data.clear();
				// data.add(theValue);
				// theElement.setValue(theStereotype, propertyName, data);
				// //WORKS:
				String oldValue = null;
				String newValue = theValue;
				if (singleValueProperty) {
					theElement.setValue(theStereotype, propertyName, newValue);
				} else {
					if (!overwrite) {
						if (getStereotypeProperty(theElement, stereotypeName,
								propertyName) != null) {
							oldValue = getStereotypeProperty(theElement,
									stereotypeName, propertyName).toString();
						}
						if (oldValue != null && !oldValue.equals("")
								&& !oldValue.equals("[]")) {
							// //substring "hamburger".substring(4, 8) returns
							// "urge"
							if (oldValue.substring(0, 1).equals("[")
									&& oldValue.substring(
											oldValue.length() - 1,
											oldValue.length()).equals("]")) {
								oldValue = oldValue.substring(1,
										oldValue.length() - 1);
							}
							newValue = oldValue + "," + newValue;
						}
					}// end don't overwrite
					Vector<String> data = new Vector<String>();
					data.add(newValue);
					theElement.setValue(theStereotype, propertyName, data);
				}
				Log.println(propertyName
						+ " updated for "
						+ ((theElement instanceof NamedElement) ? ((NamedElement) theElement)
								.getQualifiedName() : theElement.toString())
								+ ": " + theValue);
			}
		}// end if stereotype
	}// end setStereotypeProperty

	/**
	 * Checks if a UML element has a stereotype with the provided name
	 *
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 * 
	 * @return <code>true</code> if the element has the stereotype
	 *         <code>false</code> if it doesn't
	 */
	public static boolean hasStereotype(Element theElement,
			String stereotypeName) {
		if (getAppliedStereotype(theElement, stereotypeName) != null)
			return true;
		return false;
	}// end hasStereotype

	/**
	 * Returns the name of a stereotype's enumeration literal's value. This
	 * method is no longer used or updated.
	 *
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotype
	 *            the name of the stereotype we want
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want
	 * 
	 * @return the name of the enumeration literal
	 */
	public static Object getStereotypeEnumLiteralName(Element theElement,
			String stereotype, String propertyName) {
		// getStereotypeProperty doesn't do what I want, i.e returns things like
		// uml.EnumerationLiteral (name: FixedPriority, visibility: <unset>),
		// [TODO] NOT used anymore???
		Stereotype stereotypeFound = getAppliedStereotype(theElement,
				stereotype);
		if (stereotypeFound == null) {
			return null;
		} else {
			EnumerationLiteral theValue = (EnumerationLiteral) theElement
					.getValue(stereotypeFound, propertyName);
			return theValue.getName();
		}
	}// end getStereotypeEnumLiteralName

	// // extract client or supplier's name from a dependency (link)
	// public static Object getLinkData(Element theElement, String type) {
	// Dependency dep = (Dependency) theElement;
	// dep.getRelatedElements();
	// if(type.equals("client")){
	// return dep.getClient(null).getName();
	// }else{
	// return dep.getSupplier(null).getName();
	// }
	// //http://help.eclipse.org/help33/index.jsp?topic=/org.eclipse.uml2.doc/references/javadoc/org/eclipse/uml2/uml/Dependency.html
	// }//end getLinkData

	// //work in progress
	// public static Object getExecution(Element theElement) {
	// ExecutionOccurrenceSpecification dep = (ExecutionOccurrenceSpecification)
	// theElement;
	// EList<Lifeline> life = dep.getCovereds();
	// return life;
	// }//work in progress
	// public static Object getMessage(Element theElement) {
	// MessageOccurrenceSpecification dep = (MessageOccurrenceSpecification)
	// theElement;
	// EList<Lifeline> life = dep.getCovereds();
	// Lifeline theLife = life.get(0);
	// return theLife.getName();
	// }

	/**
	 * Extract the ecore class' implementation (I think that's what it is :))
	 * referenced by the stereotype's property. For example, useful when
	 * getStereotypeProperty returns something like: GRM.Scheduler (eClass:
	 * org.eclipse.emf.ecore.impl.EClassImpl@13fed2e (name: Scheduler)[...]
	 * 
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want
	 * 
	 * @return the referenced object pointed by the stereotype property
	 */
	public static Object getStereotypeReference(Element theElement,
			String stereotypeName, String propertyName) {

		// note for myself: looks like getValue returns an implementation...

		Stereotype stereotypeFound = getAppliedStereotype(theElement,
				stereotypeName);

		if (stereotypeFound == null) {
			return null;
		} else {
			// based on what I found here:
			// http://www.openarchitectureware.org/bugzilla/show_bug.cgi?id=1706
			Object obj = theElement.getValue(stereotypeFound, propertyName);
			if (obj == null) {
				return null;
			}
			if (obj instanceof EObject) {
				EObject eObj = (EObject) obj;
				// eCrossReferences: returns a list view of the cross referenced
				// objects.
				// This will be the list of EObjects determined by the contents
				// of the reference
				// features of this object's meta class, excluding containment
				// features and their opposites.
				// ref:
				// http://publib.boulder.ibm.com/infocenter/rtnlhelp/v6r0m0/topic/org.eclipse.emf.doc/references/javadoc/org/eclipse/emf/ecore/EObject.html#eCrossReferences()
				EList<EObject> references = eObj.eCrossReferences();
				for (EObject item : references) {
					if (item.eContainingFeature() != null) {
						return item;
					}// end if
				}// end for
			}
			// shouldn't get here:
			return null;
		}// end else stereotypeFound == null
	}// end getStereotypeReference

	/**
	 * Same as getStereotypeReference but returning just the name of the
	 * referenced element
	 * 
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want
	 * 
	 * @return the referenced object's name
	 */
	public static Object getStereotypeReferenceName(Element theElement,
			String stereotypeName, String propertyName) {
		// same as above, but this one returns just the name
		// [TODO] add error checking!!!!
		NamedElement elemm = (NamedElement) getStereotypeReference(theElement,
				stereotypeName, propertyName);
		if (elemm == null) {
			return null;
		}
		return elemm.getName();
	}// end getStereotypeReferenceName

	/**
	 * Uses getStereotypeReference and getStereotypeProperty to return the value
	 * of a stereotype's property from an element referenced in another
	 * element's stereotype's property.
	 * 
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 * 
	 * @param propertyName
	 *            the name of the property containing the referenced element
	 * 
	 * @param propertyNameRef
	 *            the name of the referenced element's property whose value we
	 *            want
	 * 
	 * @return the the value of the property if it exists, or null if it doesn't
	 */
	// needed this one for acceleo 3; couldn't concatenate them in the template
	// ([TODO] i'll look into this latter :P)
	public static Object getStereotypeReferenceProperty(Element theElement,
			String stereotypeName, String propertyName,
			String stereotypeNameRef, String propertyNameRef) {

		return getStereotypeProperty(
				(Element) getStereotypeReference(theElement, stereotypeName,
						propertyName), stereotypeNameRef, propertyNameRef);

	}// end

	/**
	 * Same case as with getStereotypeReferenceName BUT used when the stereotype
	 * stores a list of "references" instead of just one.
	 * 
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want
	 * 
	 * @return the referenced object's name list
	 */
	// example: SAM.SaSharedResource (eClass:
	// org.eclipse.emf.ecore.impl.EClassImpl@1daebc7 (name:
	// SaSharedResource)[...])SAM.SaSharedResource (eClass:
	// org.eclipse.emf.ecore.impl.EClassImpl@1daebc7 (name: SaSharedRe[...])
	@SuppressWarnings("unchecked")
	public static Object getStereotypeRefListNames(Element theElement,
			String stereotypeName, String propertyName) {
		Stereotype stereotypeFound = getAppliedStereotype(theElement,
				stereotypeName);
		if (stereotypeFound == null) {
			return null;
		} else {
			EList<Object> objList = (EList<Object>) theElement.getValue(
					stereotypeFound, propertyName);
			Object obj = null;
			String outputString = "";
			for (int num = 0; num < objList.size(); num++) {
				if ((obj = objList.get(num)) instanceof Object) {
					EObject eObj = (EObject) obj;
					EList<EObject> references = eObj.eCrossReferences();
					for (EObject item : references) {
						if (item.eContainingFeature() != null) {
							NamedElement elemm = (NamedElement) item;
							outputString = outputString + elemm.getName();
							if (num < objList.size() - 1) {
								outputString = outputString + ", ";
							}
						}// end if
					}// end for
				} else {
					return null;// not an object??!!!!
				}
			}
			return outputString;
		}
	}// end getStereotypeRefListNames

	/**
	 * Returns a list containing the operations included in the given property's
	 * value, the value of the propertyName parameter should always be
	 * "subUsage" in this context but it's left as user defined to allow the
	 * method to be used in other cases.
	 * 
	 * @param theElement
	 *            UML element with the applied stereotype
	 *
	 * @param stereotypeName
	 *            the name of the stereotype we want, usually "SaStep"
	 * 
	 * @param propertyName
	 *            the name of the property whose value we want, should be
	 *            "subUsage" in this context.
	 * 
	 * @return a list of operations
	 */
	@SuppressWarnings("unchecked")
	public static List<Operation> getSubUsage(Element theElement,
			String stereotypeName, String propertyName) {
		Vector<Operation> simpleOperations = new Vector<Operation>();
		Stereotype stereotypeFound = getAppliedStereotype(theElement,
				stereotypeName);
		if (stereotypeFound == null) {
			return null;
		} else {
			EList<Object> objList = (EList<Object>) theElement.getValue(
					stereotypeFound, propertyName);
			Object obj = null;
			for (int num = 0; num < objList.size(); num++) {
				if ((obj = objList.get(num)) instanceof Object) {
					EObject eObj = (EObject) obj;
					EList<EObject> references = eObj.eCrossReferences();
					boolean skip = false;
					for (EObject item : references) {
						if (item.eContainingFeature() != null) {
							NamedElement elemm = (NamedElement) item;
							if (elemm instanceof Operation) {
								// TODO: find out -> don't know why, but they
								// are duplicated??????????????
								// Log.debugPrintln("operation named" +
								// elemm.getName());
								// UGLY HACK!!:
								if (!skip) {
									simpleOperations.add((Operation) elemm);
									skip = true;
								} else {
									skip = false;
								}
							}
						}// end if
					}// end for
				} else {
					return null;// not an object??!!!!
				}
			}
			return simpleOperations;
		}
	}//

	/**
	 * Given a UML element it returns a name composed of the last 2 element of
	 * its qualified name: element__fatherelement (if it has no father element
	 * it simply returns the 'normal' name)
	 * 
	 * @return the elements long name
	 */
	public static String getElementLongName(Element theElement) {
		// Log.println("getElementLongName: ");
		String qualifiedName = ((NamedElement) theElement).getQualifiedName();
		if (qualifiedName != null) {
			String[] nameParts = qualifiedName.split("::");
			if (nameParts.length > 1) {
				return nameParts[nameParts.length - 2] + "__"
						+ nameParts[nameParts.length - 1];
			} else {
				return ((NamedElement) theElement).getName();
			}
		}
		return null;
	}// end getElementLongName

	/**
	 * Returns the element with the given long name (case insensitive) if it
	 * finds it among the children of the element or itself.
	 * 
	 * <p>
	 * See also: getElementLongName.
	 * 
	 * @param theElement
	 *            root element to check
	 * 
	 * @param elementLongName
	 *            the name of the element we are looking for
	 * 
	 * @return the element with the given name if one was , null if not
	 */
	public static Element getElementWithLongName(Element theElement,
			String elementLongName) {
		Element foundElement = null;
		String elementNameLowerCase = elementLongName.toLowerCase();
		if (theElement instanceof NamedElement
				&& getElementLongName(theElement) != null) {//
			if (getElementLongName(theElement).toLowerCase().equals(
					elementNameLowerCase)) {
				return theElement;
			}
		}
		EList<Element> ownedElements = theElement.getOwnedElements();
		for (Element anElement : ownedElements) {
			foundElement = getElementWithLongName(anElement, elementLongName);
			if (foundElement != null) {
				return foundElement;
			}
		}// end for
		return null;
	}// getElementWithLongName

	// // DELETE this one, it's an old version, it's here just as a reference
	// for me (AGC)
	// @SuppressWarnings("unchecked")
	// public static Object getStereotypeReference2(Element theElement, String
	// stereotypeName,
	// String propertyName) {
	// Stereotype stereotypeFound = getAppliedStereotype(theElement,
	// stereotypeName);
	// if (stereotypeFound == null) {
	// return null;
	// } else {
	// EList<Object> objList = (EList<Object>)
	// theElement.getValue(stereotypeFound, propertyName);
	// Object obj = null;
	// for(int num=0; num<objList.size() ;){
	// if ( (obj = objList.get(num)) instanceof Object) {
	// EObject eObj = (EObject) obj;
	// EList<EObject> references = eObj.eCrossReferences();
	// for (EObject item : references) {
	// if (item.eContainingFeature()!= null) {
	// return item;
	// }//end if
	// }//end for
	// }else{
	// return "not an object!!!!";
	// }
	// }
	// return null;
	// }
	// }//end getStereotypeReference2

	/**
	 * Given a NamedElement it returns its name. Used from Acceleo.
	 */
	public static String getElementShortName(Element theElement) {
		if (theElement instanceof NamedElement) {
			return ((NamedElement) theElement).getName();
		} else {
			return "";
		}
	}// end getElementShortName

	/**
	 * Returns the element with the given name (case insensitive) if it finds it
	 * among the children of the element or itself.
	 * 
	 * 
	 * @param theElement
	 *            root element to check
	 * 
	 * @param elementName
	 *            the name of the element we are looking for
	 * 
	 * @return the element with the given name if one was , null if not
	 */
	public static Element getElementWithShortName(Element theElement,
			String elementName) {
		// TODO fix?
		// Element foundElem = null;
		// if(theElement instanceof NamedElement && ((NamedElement)
		// theElement).getName().equalsIgnoreCase(elementName)){
		// foundElem = theElement;
		// }else{
		// for (Element elem : theElement.allOwnedElements()) {
		// if(elem instanceof NamedElement && ((NamedElement)
		// elem).getName().equalsIgnoreCase(elementName)){
		// foundElem = elem;
		// }
		// }
		// }
		// return foundElem;
		Element foundElement = null;
		String elementNameLowerCase = elementName.toLowerCase();
		if (theElement instanceof NamedElement
				&& getElementShortName(theElement) != null) {//
			if (getElementShortName(theElement).toLowerCase().equals(
					elementNameLowerCase)) {
				return theElement;
			}
		}
		EList<Element> ownedElements = theElement.getOwnedElements();
		for (Element anElement : ownedElements) {
			foundElement = getElementWithShortName(anElement, elementName);
			if (foundElement != null) {
				return foundElement;
			}
		}// end for
		return null;
	}// getElementWithShortName

	/**
	 * Returns the VSL formated text corresponding to the NFP_Duration composed
	 * of the given data. null if you don't want to use a parameter.
	 * 
	 * @param worst
	 * @param best
	 * @param value
	 * @param statQ
	 * @param mode
	 * @return the VSL formatted text
	 */
	public static String generateNFP_DurationText(String worst, String best,
			String value, String unit, String statQ, String mode) {
		String theText = "";
		boolean atLeastOne = false;
		if (worst != null || best != null || value != null) {// could also check
			// if = ""
			theText += "(";
			// ////
			if (worst != null) {
				theText += "worst=" + worst;
				atLeastOne = true;
			}
			if (best != null) {
				if (atLeastOne)
					theText += ",";
				theText += "best=" + best;
				atLeastOne = true;
			}
			if (value != null) {
				if (atLeastOne)
					theText += ",";
				theText += "value=" + value;
				atLeastOne = true;
			}

			if (unit != null) {
				if (atLeastOne)
					theText += ",";
				theText += "unit=" + unit;
				atLeastOne = true;
			}

			if (statQ != null) {
				if (atLeastOne)
					theText += ",";
				theText += "statQ=" + statQ;
				atLeastOne = true;
			}
			if (mode != null) {
				if (atLeastOne)
					theText += ",";
				theText += "mode=" + mode;
				atLeastOne = true;
			}

			// ////
			theText += ")";
		}
		return theText;
	}// generateNFP_DurationText

	// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Returns a string containing the name of the tool, date, time & user name
	 */
	public static Object printHeaderData(Element theElement) {
		// refs:
		// http://technofriends.in/2008/05/01/how-to-print-datetime-in-a-given-format-in-java/
		// http://www.rgagnon.com/javadetails/java-0048.html
		Date todaysDate = new java.util.Date();
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd/MM/yyyy - HH:mm:ss");
		String formattedDate = formatter.format(todaysDate);
		return "Generated using 'Marte2Mast Converter' @ " + formattedDate
				+ " - user: " + System.getProperty("user.name");
	}// end printHeaderData

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ///////PARSE
	// VSL////////////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// TODO: improve the regular expressions
	/**
	 * Some properties can store multiple values. This method returns the fist
	 * valid one, in our case: the one with no statQ=calc
	 * 
	 * @param inputText
	 *            text to check
	 * 
	 * @return the first valid VSL expression
	 */
	public static String parseGetFirstValidVSL(String inputText) {
		// e.g. [ (statQ=calc) , ( value =2.0 ), (value= 3.8,statq=calc)] -> (
		// value =2.0 )

		Vector<String> splittedText = new Vector<String>();
		String outText = null;
		if (inputText == null) {
			return null;
		}
		// SPLIT
		String regex = "(\\(.*?\\))"; // ? -> non greedy
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		while (matcher.find()) {
			if (matcher.groupCount() > 0) {
				splittedText.add(matcher.group(1));
			}
		}
		// SELECT FIRST VALID
		if (splittedText == null || splittedText.size() == 0) {
			return null;
		}
		// check if there is one with no statQ=calc
		for (int i = 0; i < splittedText.size(); i++) {
			String inText = splittedText.get(i);
			String regexStatQ = "statQ\\s*=\\s*calc"; // ? -> non greedy
			pattern = Pattern.compile(regexStatQ);
			matcher = pattern.matcher(inText);
			if (!matcher.find()) {
				return inText;
			}
		}// no? -> then, take the first one with statQ=calc
		for (int i = 0; i < splittedText.size(); i++) {
			String inText = splittedText.get(i);
			String regexStatQ = "statQ\\s*=\\s*calc"; // ? -> non greedy
			pattern = Pattern.compile(regexStatQ);
			matcher = pattern.matcher(inText);
			if (matcher.find()) {
				return inText;
			}
		}
		// END
		splittedText.clear();
		return outText;
	}// parseGetFirstValidVSL

	/**
	 * VSL parsing: receives an IntegerInterval and returns the max or min value
	 * 
	 * <p>
	 * i.e. [0..34[
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 *
	 * @param marOrMin
	 *            "min" or "max"
	 * 
	 * @return the max or min value
	 */
	public static Object parseIntegerInterval(String inputText, String marOrMin) {

		if (inputText == null)
			return "MALFORMED INPUT";

		// i.e. [num..num]
		String regex = "([\\[,\\]])\\s*(\\d+)\\s*\\.\\.\\s*(\\d+)\\s*([\\[,\\]])";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		if (!matcher.find()) {
			Log.println("ERROR: can't parse IntegerInterval "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		if (marOrMin.equals("min") && matcher.groupCount() > 1) {
			if (matcher.group(1).equals("["))
				return matcher.group(2);
			else
				return Integer.parseInt(matcher.group(2)) + 1;
		} else if (marOrMin.equals("max") && matcher.groupCount() > 2) {
			if (matcher.group(4).equals("]"))
				return matcher.group(3);
			else
				return Integer.parseInt(matcher.group(3)) - 1;
		}
		return null;

	}// end getStereoIntegerInterval

	/**
	 * VSL parsing: utility function used by parse_NFPInteger
	 * 
	 * <p>
	 * i.e. [0..34[
	 * 
	 * @param propertiesText
	 *            VSL formatted input string
	 *
	 * @param propertyName
	 *            "value", "source", "statQ" ...
	 * 
	 * @return the parsed value of the property
	 */
	public static String parse_Integer(String propertiesText,
			String propertyName) {

		if (propertiesText == null)
			return "MALFORMED INPUT";

		String regex; // example: value=2,statQ=min
		Pattern pattern;
		Matcher matcher;

		if (propertyName.equals("value")) {

			regex = "\\s*" + propertyName + "\\s*=\\s*(\\d+)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);

			if (!matcher.find()) {
				Log.println("ERROR: NFP_Integer doesn't have a valid value for \"value\" "
						+ Log.getFileNameAndLineNumber(Thread.currentThread()
								.getStackTrace()[1]));
				return "MALFORMED INPUT";
			}

			return matcher.group(1);

		} else if (propertyName.equals("source")) {

			regex = "\\s*source\\s*=\\s*(est|meas|calc|req)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);

			// if(matcher.groupCount()<2)return "NOT FOUND";
			if (!matcher.find()) {
				Log.debugPrintln("WARNING: NFP_Integer doesn't have a valid value for \"source\" "
						+ Log.getFileNameAndLineNumber(Thread.currentThread()
								.getStackTrace()[1]));
				return "MALFORMED INPUT";
			}

			return matcher.group(1);

		} else if (propertyName.equals("statQ")) {

			regex = "\\s*statQ\\s*=\\s*(min|max)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);

			// if(matcher.groupCount()<2)return "NOT FOUND";
			if (!matcher.find()) {
				Log.debugPrintln("WARNING: NFP_Integer doesn't have a valid value for \"statQ\" "
						+ Log.getFileNameAndLineNumber(Thread.currentThread()
								.getStackTrace()[1]));
				return "MALFORMED INPUT";
			}

			return matcher.group(1);

		} else {
			Log.println("ERROR: can't parse NFP_Integer - not implemented "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "NOT IMPLEMENTED";
		}
	}

	/**
	 * VSL parsing: receives an NFP_Integer value and parses the selected
	 * property
	 * 
	 * <p>
	 * i.e. (value=6)
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 *
	 * @param propertyName
	 *            property whose value we want
	 * 
	 * @return the parsed value of the property
	 */
	public static String parseNFP_Integer(String inputText, String propertyName) {

		if (inputText == null)
			return "MALFORMED INPUT";
		// If it is a shorthand notation, just the number (e.g. "1")
		try {
			return Integer.valueOf(inputText).toString();
		} catch (Exception e) {
			// continue with normal parsing
		}
		inputText = parseGetFirstValidVSL(inputText);
		if (inputText == null) {
			return "MALFORMED INPUT";
		}

		String regex = "\\(([^\\(\\)]*)\\)"; // same example -> 1:
		// value=2,statQ=min | 2:
		// value=3,statQ=max
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		if (!matcher.find()) {
			Log.println("ERROR: can't parse NFP_Integer - No pattern match "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}

		return parse_Integer(matcher.group(1), propertyName);

	}

	/**
	 * VSL parsing: overloaded version of parseNFP_Integer used specifically for
	 * a required statQ
	 * 
	 * <p>
	 * example: (value=2,statQ=min),(value=3,statQ=max)
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 *
	 * @param propertyName
	 *            property whose value we want
	 * 
	 * @param statQ
	 *            required statQ of the property
	 * 
	 * @return the parsed value of the property
	 */
	public static String parseNFP_Integer(String inputText,
			String propertyName, String statQ) {

		if (inputText == null)
			return "MALFORMED INPUT";
		inputText = parseGetFirstValidVSL(inputText);
		if (inputText == null) {
			return "MALFORMED INPUT";
		}

		// ()[,()]* -> example: (value=2,statQ=min),(value=3,statQ=max)
		// doc matcher:
		// http://download.oracle.com/javase/1.4.2/docs/api/java/util/regex/Matcher.html

		// String regex = "\\((.*)\\)";
		String regex = "\\(([^\\(\\)]*)\\)"; // same example -> 1:
		// value=2,statQ=min | 2:
		// value=3,statQ=max
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);

		int hasMatched = 0;
		boolean foundStatQ = false;
		while (matcher.find()) {
			hasMatched++;
			if (parse_Integer(matcher.group(1), "statQ").equals(statQ)) {
				return parse_Integer(matcher.group(1), propertyName);
			}
		}
		if (hasMatched == 0 || foundStatQ) {
			Log.println("ERROR: can't parse NFP_Integer - No pattern match "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		return "MALFORMED INPUT";

	}// end parseNFP_Integer

	/**
	 * VSL parsing: receives an NFP_Real value and parses the selected property
	 * 
	 * <p>
	 * i.e. (value=0.6)
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 *
	 * @param propertyName
	 *            property whose value we want
	 * 
	 * @return the parsed value of the property
	 */
	public static String parseNFP_Real(String inputText, String propertyName) {

		if (inputText == null) {
			return "MALFORMED INPUT";
		}
		// If it is a shorthand notation, just the number (e.g. "1.0")
		try {
			return Double.valueOf(inputText).toString();
		} catch (Exception e) {
			// continue with normal parsing
		}

		inputText = parseGetFirstValidVSL(inputText);
		if (inputText == null) {
			return "MALFORMED INPUT";
		}

		String regex = "\\((.*)\\)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse NFP_Real "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}

		if (matcher.groupCount() < 1)
			return "";

		String propertiesText = matcher.group(1);

		regex = "\\s*" + propertyName + "\\s*=\\s*(\\d+\\.*\\d*)";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(propertiesText);

		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse NFP_Real "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}

		return matcher.group(1);

	}// end parseNFP_Real

	/**
	 * VSL parsing: receives an NFP_Duration value and parses the property
	 * selected
	 * 
	 * <p>
	 * i.e. (value=0.6,unit=ms)
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 *
	 * @param propertyName
	 *            property whose value we want
	 * 
	 * @return the parsed value of the property
	 */
	public static String parseNFP_Duration(String inputText, String propertyName) {

		if (inputText == null)
			return "MALFORMED INPUT";
		inputText = parseGetFirstValidVSL(inputText);
		if (inputText == null) {
			return "MALFORMED INPUT";
		}

		String regex = "\\((.*)\\)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse NFP_Duration "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		String propertiesText = matcher.group(1);

		if (propertyName.equals("source")) {

			regex = "\\s*source\\s*=\\s*([est|meas|calc|req])";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);

			// if(matcher.groupCount()<2)return "NOT FOUND";
			if (!matcher.find()) {
				Log.debugPrintln("WARNING: NFP_Duration doesn't have a valid value for \"source\" "
						+ Log.getFileNameAndLineNumber(Thread.currentThread()
								.getStackTrace()[1]));
				return "MALFORMED INPUT";
			}

			return matcher.group(1);

		} else if (propertyName.equals("value") || propertyName.equals("best")
				|| propertyName.equals("worst")) {

			// Extract Value
			String theValue, theUnit;
			regex = "\\s*" + propertyName + "\\s*=\\s*(\\d+\\.*\\d*)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);

			// if(matcher.groupCount()<2)return "NOT FOUND";
			if (!matcher.find()) {
				Log.debugPrintln("WARNING: can't parse NFP_Duration "
						+ Log.getFileNameAndLineNumber(Thread.currentThread()
								.getStackTrace()[1]));
				return "MALFORMED INPUT";
			}

			theValue = matcher.group(1);

			// MAST needs a real value not an integer (if the VSL is correct it
			// should be a real anyway,
			// but I check in case it isn't correctly formed)
			regex = "\\s*" + propertyName + "\\s*=\\s*(\\d+\\.+\\d+)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);
			if (!matcher.find()) {
				theValue += ".0";
			}

			// Extract Units
			regex = "\\s*unit\\s*=\\s*(\\w+)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);
			if (matcher.find()) {
				theUnit = matcher.group(1);
			} else {
				theUnit = "ms";
			}
			
//			float v = Float.parseFloat(theValue);
//			int newv = unitConversion(v, theUnit, Config.UNIFORM_DURATION_UNIT);

			if (theUnit.equals("s")) {
				return theValue;
			} else if (theUnit.equals("ms")) {
				return theValue + "E-3";
			} else if (theUnit.equals("us")) {
				return theValue + "E-6";
			} else if (theUnit.equals("ns")) {
				return theValue + "E-9";
			}

			Log.debugPrintln("WARNING: can't parse NFP_Duration "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";

		} else {
			Log.debugPrintln("WARNING: can't parse NFP_Duration "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "NOT IMPLEMENTED";
		}

	}// end parseNFP_Duration
	
	public static int unitConversion(double value, String fromUnit, String toUnit) {
		int toFactor = 1000000;
		
		if (toUnit.equalsIgnoreCase("s")) {
			toFactor = 1000000000;
		} else if (toUnit.equalsIgnoreCase("ms")) {
			toFactor = 1000000;
		} else if (toUnit.equalsIgnoreCase("us")) {
			toFactor = 1000;
		} else if (toUnit.equalsIgnoreCase("ns")) {
			toFactor = 1;
		}
		
		int fromFactor = 1000000;
		
		if (fromUnit.equalsIgnoreCase("s")) {
			fromFactor = 1000000000;
		} else if (fromUnit.equalsIgnoreCase("ms")) {
			fromFactor = 1000000;
		} else if (fromUnit.equalsIgnoreCase("us")) {
			fromFactor = 1000;
		} else if (fromUnit.equalsIgnoreCase("ns")) {
			fromFactor = 1;
		}
		
		double ratio = (double)fromFactor/toFactor;
		int intValue = (int) Math.round(value*ratio);
		return intValue;
	}

	/**
	 * VSL parsing: receives an NFP_DataTxRate value and parses the property
	 * selected
	 * 
	 * <p>
	 * i.e. (value=5000,unit=b/s)
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 *
	 * @param propertyName
	 *            property whose value we want
	 * 
	 * @return the parsed value of the property
	 */
	public static String parseNFP_DataTxRate(String inputText,
			String propertyName) {

		if (inputText == null)
			return "MALFORMED INPUT";

		String regex = "\\((.*)\\)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse NFP_DataTxRate "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		String propertiesText = matcher.group(1);

		if (propertyName.equals("value")) {

			String theValue, theUnit;
			regex = "\\s*value\\s*=\\s*(\\d+\\.*\\d*)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);
			// if(matcher.groupCount()<2)return "NOT FOUND";
			if (!matcher.find()) {
				Log.debugPrintln("WARNING: can't parse NFP_DataTxRate "
						+ Log.getFileNameAndLineNumber(Thread.currentThread()
								.getStackTrace()[1]));
				return "MALFORMED INPUT";
			}

			theValue = matcher.group(1);
			regex = "\\s*unit\\s*=\\s*([\\w/]+)";
			pattern = Pattern.compile(regex);
			matcher = pattern.matcher(propertiesText);
			if (matcher.find()) {
				theUnit = matcher.group(1);
			} else {
				theUnit = "b/s";
			}

			if (theUnit.equals("b/s")) {
				return theValue;
			} else if (theUnit.equals("Kb/s")) {
				return "" + Integer.parseInt(theValue) * 1024;
			} else if (theUnit.equals("Mb/s")) {
				return "" + Integer.parseInt(theValue) * 1024 * 1024;
			}

			Log.debugPrintln("WARNING: can't parse NFP_DataTxRate "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";

		} else {
			Log.debugPrintln("WARNING: can't parse NFP_DataTxRate "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "NOT IMPLEMENTED";
		}

	}// end parseNFP_DataTxRate

	/**
	 * VSL parsing: parse a SchedParams property
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 * 
	 * @param theType
	 *            i.e. periodic
	 *
	 * @param property
	 *            i.e. period
	 * 
	 * @return the parsed value of the property
	 */
	public static String parseSchedParams(String inputText, String theType,
			String property) {

		if (inputText == null)
			return "MALFORMED INPUT";

		String regex = theType + "\\s*\\((.*)\\)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse SchedParams( "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		String propertiesText = matcher.group(1);

		regex = "\\s*" + property + "=(.*)";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(propertiesText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse SchedParams( "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		return matcher.group(1);

	}// end parseSchedParams

	/**
	 * VSL parsing: extract context from SaAnalysisContext
	 * 
	 * @param inputText
	 *            VSL formatted input string
	 * 
	 * @param toolName
	 *            i.e. mast
	 *
	 * @param option
	 *            i.e. invoke
	 * 
	 * @return the parsed value
	 */
	public static String parseContext(String inputText, String toolName,
			String option) {

		if (inputText == null)
			return "MALFORMED INPUT";

		String regex = toolName + "\\s*,\\s*options\\s*=\\s*\\((.*)\\)\\)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse context( "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}

		String optionText = matcher.group(1);
		// Log.debugPrintln(optionText);

		regex = "\\s*" + option + "\\s*=([^,]*)";// [TODO] maybe check the rest
		// of the functions' regex
		// to be more like this
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(optionText);
		if (!matcher.find()) {
			Log.debugPrintln("WARNING: can't parse context( "
					+ Log.getFileNameAndLineNumber(Thread.currentThread()
							.getStackTrace()[1]));
			return "MALFORMED INPUT";
		}
		// Log.debugPrintln(matcher.group(1));
		return matcher.group(1);

	}// end parseContext

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Given a 'GaWorkloadEvent' stereotyped element, it returns the 'pattern'
	 * data (MARTE).
	 * 
	 * <p>
	 * i.e. periodic(period=(value=0.6,unit=ms))
	 * 
	 * @return the 'pattern' data, or null if no data was found
	 */
	public static String getArrivalPatternType(Element theElement) {

		if (getStereotypeProperty(theElement, "GaWorkloadEvent", "pattern") != null) {

			String theValue = getStereotypeProperty(theElement,
					"GaWorkloadEvent", "pattern").toString();
			String regex = "(\\w*)\\s*\\((.*)\\)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(theValue);
			if (!matcher.find())
				return null;
			return matcher.group(1);

		} else {
			return null;// not good :D
		}

	}// end parseArrivalPattern

	/**
	 * Calculates the packet overhead (MAST) given the 'blockT' and 'packetT'
	 * (MARTE).
	 * 
	 * @param theElement
	 *            'SaCommHost' stereotyped UML element
	 * 
	 * @return the packet overhead (worst/avg/best) text in MAST format
	 */
	public static Object getPacketOverhead(Element theElement) {
		String output = "";

		double maxBlockT = -1;// doc:
		// http://www.java-tips.org/java-se-tips/java.lang/conversion-from-string-to-float.html
		// float f = Float.valueOf(str).floatValue();
		// double aDouble = Double.parseDouble(aString);
		if (HelperFunctions.getStereotypeProperty(theElement, "SaCommHost",
				"blockT") != null) {
			if (!HelperFunctions.parseNFP_Duration(
					HelperFunctions.getStereotypeProperty(theElement,
							"SaCommHost", "blockT").toString(), "worst")
							.equals("MALFORMED INPUT")) {
				maxBlockT = Double.parseDouble(HelperFunctions
						.parseNFP_Duration(
								HelperFunctions.getStereotypeProperty(
										theElement, "SaCommHost", "blockT")
										.toString(), "worst"));
			} else if (!HelperFunctions.parseNFP_Duration(
					HelperFunctions.getStereotypeProperty(theElement,
							"SaCommHost", "blockT").toString(), "value")
							.equals("MALFORMED INPUT")) {// no worst value
				maxBlockT = Double.parseDouble(HelperFunctions
						.parseNFP_Duration(
								HelperFunctions.getStereotypeProperty(
										theElement, "SaCommHost", "blockT")
										.toString(), "value"));
			}
		}// blockT not null

		double maxPacketT = -1;
		if (HelperFunctions.getStereotypeProperty(theElement, "SaCommHost",
				"packetT") != null) {
			if (!HelperFunctions.parseNFP_Duration(
					HelperFunctions.getStereotypeProperty(theElement,
							"SaCommHost", "packetT").toString(), "worst")
							.equals("MALFORMED INPUT")) {
				maxPacketT = Double.parseDouble(HelperFunctions
						.parseNFP_Duration(
								HelperFunctions.getStereotypeProperty(
										theElement, "SaCommHost", "packetT")
										.toString(), "worst"));
			} else if (!HelperFunctions.parseNFP_Duration(
					HelperFunctions.getStereotypeProperty(theElement,
							"SaCommHost", "packetT").toString(), "value")
							.equals("MALFORMED INPUT")) {// no worst value
				maxPacketT = Double.parseDouble(HelperFunctions
						.parseNFP_Duration(
								HelperFunctions.getStereotypeProperty(
										theElement, "SaCommHost", "packetT")
										.toString(), "value"));
			}
		}// blockT not null

		if (maxBlockT >= 0 && maxPacketT >= 0) {
			output += ",\n		Packet_Worst_Overhead    => "
					+ (maxBlockT - maxPacketT);
			output += ",\n		Packet_Avg_Overhead      => "
					+ (maxBlockT - maxPacketT);
			output += ",\n		Packet_Best_Overhead     => "
					+ (maxBlockT - maxPacketT);
			output += "\n     -- Packet Overhead values may have to be tailored for non-deterministic overhead protocols";
			output += "\n     -- The current implementation is sufficient for CAN-Bus & serial lines";
		}

		return output;
	}// end getPacketOverhead()

	// ///////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////FILE
	// FUNCTIONS/////////////////////////////////////

	/**
	 * Used to copy the original .di and .notation files from the input model to
	 * the target folder AND modify them to match the new model name
	 * 
	 * @param fileBasePath
	 *            path to the original model file, without the ".uml" extension
	 * 
	 * @param oldModelName
	 *            original name of the model
	 * 
	 * @param newModelName
	 *            new name of the model
	 * 
	 * @param directoryPath
	 *            path of the target folder (where the files will be copied to)
	 * 
	 * @param overwrite
	 *            not used yet
	 * 
	 * @return <code>true</code> if successful, <code>false</code> if not
	 */
	public static boolean modifyAndSafeAuxFiles(String fileBasePath,
			String oldModelName, String newModelName, String directoryPath,
			boolean overwrite) {

		// refs: http://www.javapractices.com/topic/TopicAction.do?Id=42
		// http://www.java-tips.org/java-se-tips/java.util.regex/an-example-of-regular-expression-search-and-replace-pr.html
		// http://www.java2s.com/Code/Java/File-Input-Output/CopyfilesusingJavaIOAPI.htm
		// http://www.roseindia.net/java/beginners/CopyFile.shtml

		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		NL = "\n";// check what's better
		String aLine = "";
		Scanner scanner;
		File destinationDir = new File(directoryPath);
		// .DI
		String oldDIFilePath = fileBasePath + ".di";
		try {

			File originalDIFile = new File(oldDIFilePath);
			if (!originalDIFile.exists())
				return false;

			// scanner = new Scanner(new
			// FileInputStream(originalDIFile),"UTF8");
			scanner = new Scanner(new FileInputStream(originalDIFile));
			while (scanner.hasNextLine()) {
				aLine = scanner.nextLine() + NL;
				Pattern pattern = Pattern.compile(oldModelName);// should narrow
				// it more? i.e.
				// add href="...
				Matcher matcher = pattern.matcher(aLine);
				aLine = matcher.replaceAll(newModelName);
				text.append(aLine);
			}
			scanner.close();

			// Log.println(text.toString());

			File destinationDIFile = null;

			if (destinationDir.isDirectory()) {
				destinationDIFile = new File(destinationDir, newModelName
						+ ".di");
			} else {
				Log.println("copyFile2Directory: !destinationDir.isDirectory()");
				return false;
			}

			// are they the same?
			if (originalDIFile.getAbsolutePath().equals(
					destinationDIFile.getAbsolutePath())) {
				// nothing to do (TODO: this shouldn't happen, but i could save
				// in temp file and delete the old one)
				return true;
			}

			Writer out = new OutputStreamWriter(new FileOutputStream(
					destinationDIFile));
			// probably would be better do this line by line in terms of memory
			// usage...
			out.write(text.toString());
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// .NOTATION
		String oldNotationFilePath = fileBasePath + ".notation";
		try {

			File originalNotationFile = new File(oldNotationFilePath);
			if (!originalNotationFile.exists())
				return false;

			text = new StringBuilder();// I don't find a clean method

			scanner = new Scanner(new FileInputStream(originalNotationFile));
			while (scanner.hasNextLine()) {
				aLine = scanner.nextLine() + NL;
				Pattern pattern = Pattern.compile(oldModelName);// should narrow
				// it more? i.e.
				// add href="...
				Matcher matcher = pattern.matcher(aLine);
				aLine = matcher.replaceAll(newModelName);
				text.append(aLine);
			}
			scanner.close();

			// Log.println(text.toString());

			File destinationNotationFile = null;

			if (destinationDir.isDirectory()) {
				destinationNotationFile = new File(destinationDir, newModelName
						+ ".notation");
			} else {
				Log.println("copyFile2Directory: !destinationDir.isDirectory()");
				return false;
			}

			// are they the same?
			if (originalNotationFile.getAbsolutePath().equals(
					destinationNotationFile.getAbsolutePath())) {
				// nothing to do (TODO: this shouldn't happen, but i could save
				// in temp file and delete the old one)
				return true;
			}

			Writer out = new OutputStreamWriter(new FileOutputStream(
					destinationNotationFile));
			out.write(text.toString());
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}// modifyAndSafeFiles

	/**
	 * Copies a file to a given folder
	 * 
	 * @param filePath
	 *            path to the input file
	 * 
	 * @param directoryPath
	 *            path to the destination's folder
	 *
	 * @param overwrite
	 *            if the output file already exists: overwrite it?
	 * 
	 * @return <code>true</code> if successful, <code>false</code> if not
	 */
	public static boolean copyFile2Directory(String filePath,
			String directoryPath, boolean overwrite) {

		// refs:
		// http://www.java2s.com/Code/Java/File-Input-Output/CopyfilesusingJavaIOAPI.htm
		// http://www.roseindia.net/java/beginners/CopyFile.shtml

		File originalFile = new File(filePath);
		if (!originalFile.exists())
			return false;

		File destinationDir = new File(directoryPath);
		File destinationFile = null;

		if (destinationDir.isDirectory()) {
			destinationFile = new File(destinationDir, originalFile.getName());
		} else {
			Log.println("copyFile2Directory: !destinationDir.isDirectory()");
			return false;
		}

		// are they the same?
		if (originalFile.getAbsolutePath().equals(
				destinationFile.getAbsolutePath())) {
			// nothing to do
			return true;
		}

		if (destinationFile.exists()) {
			if (!destinationFile.canWrite()) {
				Log.println("copyFile2Directory: !destinationFile.canWrite()");
				return false;
			} else if (!overwrite) {
				Log.println("copyFile2Directory: !overwrite");
				return false;
			}
		}

		// COPY
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(originalFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Log.println("copyFile2Directory: input FileNotFoundException");
		}

		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(destinationFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Log.println("copyFile2Directory: output FileNotFoundException");
		}

		byte[] buffer = new byte[4096];
		int bytesRead;
		try {
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead); // write
			}
		} catch (IOException e) {
			e.printStackTrace();
			Log.println("copyFile2Directory: IOException");
		}
		return true;
	}// copyFile2Directory

	public static String fileName(Model model) {
		return uriToFileName(model.eResource().getURI());
	}

	public static String uriToFileName(URI uri) {
		return uri.lastSegment().replace(".uml", ".mast");
	}

	public static List<Classifier> getMulticoreProcessors(Package psm) {
		EList<Classifier> s = new BasicEList<Classifier>();
		for (Element el : psm.allOwnedElements()) {
			if (el instanceof Class) {
				Class c = (Class) el;
				if(hasStereotype(c, "SwSchedulableResource")){
					continue;
				}
				if (hasStereotype(c, "SaExecHost")
						|| hasStereotype(c, "SaCommHost")) {
					System.out.println(c.getName());
					Pattern pattern = Pattern.compile("(.*)(_core([0-9])*)");

					Matcher matcher = pattern.matcher(c.getName());

					if (matcher.find()) {
						System.out.println(matcher.group(1));
					} else {
						s.add(c);
					}
				}

			}
		}
		return s;
	}

	
	public static List<Classifier> getSupertasks(Package psm) {
		EList<Classifier> s = new BasicEList<Classifier>();
		for (Element el : psm.allOwnedElements()) {
			if (el instanceof Class) {
				Class c = (Class) el;
				if (hasStereotype(c, "SaExecHost")
						|| hasStereotype(c, "SaCommHost")) {
					System.out.println(c.getName());
					Pattern pattern = Pattern.compile(".*Supertask_[0-9]+.*", Pattern.CASE_INSENSITIVE);

					Matcher matcher = pattern.matcher(c.getName());

					if (matcher.find()) {
						s.add(c);
					}
				}
			}
		}
		return s;
	}

	public static boolean isRUNSystem(Package psm) {
		List<Classifier> s = getSupertasks(psm);
		return !s.isEmpty();
	}

	public static boolean isMulticore(Element cpu) {
		List<Classifier> s = getCores(cpu);
		return s.size() > 1;
	}


	public static List<Classifier> getSchedulingServers(Package psm) {
		EList<Classifier> s = new BasicEList<Classifier>();
		for (Element el : psm.allOwnedElements()) {
			if (el instanceof Class) {
				Class c = (Class) el;
				if (hasStereotype(c, "SwSchedulableResource")
						|| hasStereotype(c, "SchedulableResource")
						|| hasStereotype(c, "GaCommChannel")) {
					System.out.println(c.getName());

					s.add(c);
				}

			}
		}
		return s;
	}

	public static List<Classifier> getCores(Element cpu) {
		EList<Classifier> s = new BasicEList<Classifier>();
		for (Element el : cpu.allOwnedElements()) {
			if (el instanceof Class) {
				Class c = (Class) el;
				EList<Classifier> cc = c.getRedefinedClassifiers();
				for (Classifier classifier : cc) {
					if (hasStereotype(classifier, "SaExecHost")
							|| hasStereotype(classifier, "SaCommHost")) {
						s.add(classifier);
					}
				}
			}
		}
		if (s.isEmpty()) 
			s.add((Classifier) cpu);
		return s;
	}

	public static String printCores(Element cpu) {
		List<Classifier> s = getCores(cpu);
		ArrayList<String> r = new ArrayList<String>();
		for (Classifier el : s) {
			String string = String.format("(Type => Regular_Core_Processor, Name => %s)", el.getName());
			r.add(string);
		}
		StringBuilder builder = new StringBuilder();
		builder.append( r.remove(0));

		for( String ss : r) {
			builder.append( ",\n");
			builder.append( ss);
		}
		return builder.toString();
	}

	public static List<Classifier> getFunctionalPartitions(Package psm) {
		EList<Classifier> s = new BasicEList<Classifier>();
		Package p = psm.getNestedPackage("Partition");
		for (Element e : p.allOwnedElements()) {
			if (e instanceof Classifier) {
				Classifier c = (Classifier) e;
				boolean s1 = hasStereotype(c, "SaExecHost");
				boolean s2 = hasStereotype(c, "SwSchedulableResource");
				if (s1 && s2) {
					s.add(c);
				}
			}
		}
		return s;
	}

	public static List<Classifier> getSchedulableResources(Classifier partition) {
		EList<Classifier> s = new BasicEList<Classifier>();
		SaExecHost saExecHost = UMLUtils
				.getStereotypeApplication(partition,
						SaExecHost.class);
		for (SchedulableResource e : saExecHost.getSchedulableResources()) {
			s.add(e.getBase_Classifier());
		}
		return s;
	}

	public static Boolean functionalPartitions(Package psm) {
		return getFunctionalPartitions(psm).size() > 0;
	}

	public static String getPartitionHost(Classifier partition) {
		SaExecHost saExecHost = UMLUtils
				.getStereotypeApplication(partition,
						SaExecHost.class);
		ComputingResource host = saExecHost.getHost();
		return host.getBase_Classifier().getName();
	}

	public static String getRUNHost(Classifier supertask) {
		SaExecHost saExecHost = UMLUtils.getStereotypeApplication(supertask,
				SaExecHost.class);

		ComputingResource host = saExecHost.getHost();
		return host.getBase_Classifier().getName();
	}

	public static String getHostForSecondaryScheduler(Classifier partition) {
		SwSchedulableResource swSchedulableResource = UMLUtils
				.getStereotypeApplication(partition,
						SwSchedulableResource.class);
		Scheduler host = swSchedulableResource.getHost();
		return host.getBase_Classifier().getName();
	}

	public static String getMAFFromCore(Classifier core) {
		List<Classifier> functionalPartitions = getFunctionalPartitions((Package) core.getNearestPackage().getOwner());
		for (Classifier partition : functionalPartitions) {
			SaExecHost saExecHost = UMLUtils
					.getStereotypeApplication(partition,
							SaExecHost.class);
			if(saExecHost.getHost().getBase_Classifier().equals(core)){
				return getMAFFromPartition(partition);
			}
		}
		return "0.0";
	}

	public static String getMAFFromPartition(Classifier partition) {
		SwSchedulableResource swSchedulableResource = UMLUtils
				.getStereotypeApplication(partition,
						SwSchedulableResource.class);
		String v = swSchedulableResource.getSchedParams().get(0);

		StringParser sp = new StringParser();
		Double valuePattern = sp.getValuePattern(v, "MAF");
		return valuePattern.toString();
	}

	public static String getSchedulingTable(Classifier partition) {
		SwSchedulableResource swSchedulableResource = UMLUtils
				.getStereotypeApplication(partition,
						SwSchedulableResource.class);
		String v = swSchedulableResource.getSchedParams().get(0);

		StringParser sp = new StringParser();
		String valuePattern = sp.getComplexValuePattern(v, "SCHED_TABLE", "\"");

		/* Read pattern like: 
		 * (Offset=(value=0.0, unit=s), Length=(value=0.00175, unit=s)),(Offset=(value=0.025, unit=s), Length=(value=0.00175, unit=s)),(Offset=(value=0.05, unit=s), Length=(value=0.00175, unit=s)),(Offset=(value=0.075, unit=s), Length=(value=0.00175, unit=s))
		 * and transform it into the format that MAST wants
		 */
		String resDataForMast = getSchedTableDataForMast(valuePattern);

		//return valuePattern;
		return resDataForMast;
	}

	/**
	 * 
	 * @param inputString
	 * @return
	 */
	public static String getRealValue(String inputString) {
		// Extract Value
		String theValue = "";
		String regex = "\\s*value\\s*=\\s*(\\w+\\.*\\w*)";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputString);
		if (matcher.find()) {
			theValue = matcher.group(1);
		} 
		//System.out.println("theValue="+theValue);

		// MAST needs a real value not an integer (if the VSL is correct it
		// should be a real anyway,
		// but I check in case it isn't correctly formed)
		regex = "\\s*(\\d+\\.+\\d+)";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(theValue);
		if (!matcher.find()) {
			theValue += ".0";
		}
		//System.out.println("theValue="+theValue);
		return theValue;
	}

	/**
	 * Returns the value of the "unit" field in the input string. 
	 * If no value is specified, "s" (seconds) is assumed by default.
	 * @param inputString
	 * @return
	 */
	public static String getUnit(String inputString) {
		// Extract Unit		
		String theUnit = "";
		String regex = "\\s*unit\\s*=\\s*(\\w+)";
	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputString);
		if (matcher.find()) {
			theUnit = matcher.group(1);
		} else {
			theUnit = "s";
		}
		//System.out.println("theUnit="+theUnit);
		return theUnit;
	}

	/**
	 * Reads the input string from the Scheduling Table (in its proper format) and returns 
	 * it converted in the format that is needed by Mast. 
	 * Notice that values are followed by the indication of the used unit, 
	 * which must be one of the following:
	 * - s
	 * - ms
	 * - us
	 * - ns  
	 * @param value
	 * @return
	 */
	public static String getSchedTableDataForMast(String value) {		
		String result = "";
		
		List<ValueNFP> allOffsets = UMLUtils.getAllNfpValues(value, "Offset");
		List<ValueNFP> allLengths = UMLUtils.getAllNfpValues(value, "Length");

		int numOffsets = allOffsets.size();
		int numLengths = allLengths.size();
		if(numOffsets!=numLengths) {
			System.out.println("Error: numOffsets="+numOffsets+" but numLengths="+numLengths);
		}
		
		int count = 0;
		
		for (int i=0; i<numOffsets; i++) {
			if(i>0) {
				result+=",";
			}
			
			result+="(Offset=>"+convertToSeconds(allOffsets.get(i).value.toString(), allOffsets.get(i).unit)+
					", Length=>"+convertToSeconds(allLengths.get(i).value.toString(), allLengths.get(i).unit)+")";	
			
			if (count%8==0 ){
				result+=System.lineSeparator();
			}
			count++;
			
		}
		
		return result;
	}


	/**
	 * Reads the value in input and the unit and returns a String that represents the value in seconds
	 * @param theValue
	 * @param theUnit
	 * @return
	 */
	private static String convertToSeconds(String theValue, String theUnit) {
		if (theUnit.equals("s")) {
			return theValue;
		} else if (theUnit.equals("ms")) {
			return theValue + "E-3";
		} else if (theUnit.equals("us")) {
			return theValue + "E-6";
		} else if (theUnit.equals("ns")) {
			return theValue + "E-9";
		}
		System.out.println("ERROR! Unrecognized time unit: "+theUnit);
		return null;
	}

	public static String getRUNSupertaskUtilization(Classifier supertask) {
		//TODO test!
		SwSchedulableResource swSchedulableResource = UMLUtils
				.getStereotypeApplication(supertask,
						SwSchedulableResource.class);
		String v = swSchedulableResource.getSchedParams().get(0);

		StringParser sp = new StringParser();
		double valuePattern = sp.getValuePattern(v, "capacity");
		return Double.toString(valuePattern);
	}

}// end class HelperFunctions