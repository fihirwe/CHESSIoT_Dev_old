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

package org.polarsys.chess.core.internal.views.permissions;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This class implements an identifier for a permission entry. The identifier
 * represent a way to identify a type of a model element. In this sense the
 * identifier is static, it cannot represent an actual artifact of the model
 * since it works at metamodel level (i.e. it can identify a "Class" but not the
 * "Person" class, however it can identify a class with a stereotype "Person").
 * 
 * An identifier is defined by a triple whose first two values define a TYPE
 * either by a combination of both or by each one on its own. The first value is
 * the UML element type name, the second one is the stereotype name. A TYPE
 * therefore represents an UML element or a Profile element. In the first case
 * the first value must be a metaclass name representing an UML element and
 * optionally the second value is the stereotype name associated with that UML
 * element. In the second case the first value is not set while the second one
 * is the stereotype name. The third value of the triple is the owned feature
 * which is either a UML feature owned by the UML element or a stereotype
 * attribute defined in the stereotype depending on the former two cases.
 * 
 * Examples:
 * <ul>
 * <li>An UML Component without a stereotype [Component, -, -]</li>
 * <li>An UML Class with any associated stereotype and an owned feature type (an
 * Operation): [Class, *, Operation])</li>
 * <li>A stereotype and one of its owned attributes [*, Person, age]</li>
 * </ul>
 * 
 * 
 * 
 */
public class EntryId {
	
	/** The none. */
	public static String ANY = "*", NONE = "-";

	/** The any entry. */
	public static EntryId anyEntry = new EntryId(ANY, ANY, ANY);

	/** The feature. */
	String feature; // eClass().getName();
	
	/** The stereotype. */
	String stereotype; // Stereotype.getName();
	
	/** The type. */
	String type; // eClass().getName();

	/** The type atr. */
	public static String FEATURE_ATR = "ft", STEREOTYPE_ATR = "st",
			TYPE_ATR = "el";

	/**
	 * Instantiates a new entry id.
	 *
	 * @param type the type
	 * @param stereotype the stereotype
	 * @param feature the feature
	 */
	public EntryId(String type, String stereotype, String feature) {
		this.type = type == null ? NONE : type;
		this.stereotype = stereotype == null ? NONE : stereotype;
		this.feature = feature == null ? NONE : feature;
	}

	/**
	 * Gets the feature.
	 *
	 * @return the feature
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * Gets the stereotype.
	 *
	 * @return the stereotype
	 */
	public String getStereotype() {
		return stereotype;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Match.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	public boolean match(EntryId id) {
		return match(id.getType(), id.getStereotype(), id.getFeature());
	}

	/**
	 * Match.
	 *
	 * @param type the type
	 * @param stereotype the stereotype
	 * @param feature the feature
	 * @return true, if successful
	 */
	public boolean match(String type, String stereotype, String feature) {
		return matcher(this.type, type) && matcher(this.stereotype, stereotype)
				&& matcher(this.feature, feature);
	}

	/**
	 * Matcher.
	 *
	 * @param a the a
	 * @param b the b
	 * @return true, if successful
	 */
	private boolean matcher(String a, String b) {
		if (a.equals(ANY) || b.equals(ANY))
			return true;
		return a.equalsIgnoreCase(b);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer(30);
		s.append('[');
		s.append(type == null ? NONE : type);
		s.append(',');
		s.append(stereotype == null ? NONE : stereotype);
		s.append(',');
		s.append(feature == null ? NONE : feature);
		s.append(']');
		return s.toString();
	}

	/**
	 * Generate entry id.
	 *
	 * @param el the el
	 * @param str the str
	 * @param feature the feature
	 * @return the entry id
	 */
	public static EntryId generateEntryId(Element el, Stereotype str,
			Feature feature) {
		String name = (el == null) ? null : el.eClass().getName();
		String strName = (str == null) ? null : str.getName();
		String ftName = (feature == null) ? null : feature.getName();
		return new EntryId(name, strName, ftName);
	}

	/**
	 * Compute stereotype entry ids.
	 *
	 * @param el the el
	 * @param ft the ft
	 * @param st the st
	 * @return the array list
	 */
	public static ArrayList<EntryId> computeStereotypeEntryIds(Object el,
			Object ft, Object st) {
		ArrayList<EntryId> ids = new ArrayList<EntryId>();
		String name = NONE, strName = NONE, ftName = NONE;

		if (st instanceof EObject) {
			strName = ((EObject) st).eClass().getName();
			// Element baseEl = UMLUtil.getBaseElement((EObject) st);
			// name = (baseEl == null)? null: baseEl.eClass().getName();
			ftName = getFeatureName(ft);
			ids.add(new EntryId(name, strName, ftName));
		}
		return ids;
	}

	/**
	 * Given an element and a feature compute a list of ids to match permission
	 * entries.
	 *
	 * @param el the el
	 * @param ft the ft
	 * @return the array list
	 */
	public static ArrayList<EntryId> computeEntryIds(Object el, Object ft) {
		ArrayList<EntryId> ids = new ArrayList<EntryId>();
		String name = NONE, strName = NONE, ftName = NONE;
		// it's a Stereotype
		if (el instanceof DynamicEObjectImpl) {

			strName = UMLUtil.getStereotype((DynamicEObjectImpl) el).getName();
			Element baseEl = UMLUtil.getBaseElement((DynamicEObjectImpl) el);
			// TODO investigate why baseEl is null when a model element is
			// removed. Perhaps we should check the oldValue??
			name = (baseEl == null) ? null : baseEl.eClass().getName();
			if (ft instanceof EAttribute) {
				ftName = ((EAttribute) ft).getName();
			}
			ids.add(new EntryId(name, strName, ftName));
		} else
		// if its a Component, Interface or Class
		if (el instanceof Classifier) {
			// (1)
			name = ((Classifier) el).eClass().getName();
			// Is it pointless to generate all the stereotype entries? No. It is
			// not the
			// same as put the ANY value
			// in the stereotype field. We cannot discern between the
			// stereotypes of a classifier upon its modification, but we can
			// create
			// a specific entry in the permission list to forbid the
			// modification of a specific stereotyped classifier
			// Instead when we modify a property of a stereotype, the
			// modification is
			// checked when the notification element (el) is a stereotype
			// itself.
			ftName = getFeatureName(ft);

			// EList<Stereotype> ss = ((Element) el).getAppliedStereotypes();
			// if (ss.isEmpty()){
			// Do not add stereotypes on the id
			ids.add(new EntryId(name, NONE, ftName));
			// }
			// else{
			// //if there are stereotypes generate the corresponding entries
			// for (Stereotype str : ((Element) el).getAppliedStereotypes()) {
			// ids.add(new EntryId(name, str.getName(), ftName));
			// }
			// }

			// (2)
			// name = ((Classifier) el).eClass().getName();
			// if (ft instanceof Feature) {
			// ftName = ((EAttribute) ft).getName();
			// }
			// ids.add(new EntryId(name, ANY, ftName));

		} else
		// it's a Package
		if (el instanceof Package) {
			name = ((Package) el).eClass().getName();
			// if (ft instanceof Feature) {
			// ftName = ((EAttribute) ft).getName();
			// }
			ids.add(new EntryId(name, NONE, getFeatureName(ft)));
		} else
		// it's a Feature
		if (el instanceof Feature) {
			EObject cont = ((Feature) el).eContainer();
			// TODO investigate why cont is null when a model element is
			// removed. Perhaps we should check the oldValue??
			name = null;
			// We need the feature type (i.e. Property, Operation), not the
			// name!!!
			// ftName = ((Feature) el).getName();
			ftName = ((Feature) el).eClass().getName();
			if (cont != null && cont instanceof Element) {
				name = cont.eClass().getName();
			}
			ids.add(new EntryId(name, NONE, ftName));
		}
		// TODO it there any other type elements of interest?
		else if (el instanceof Comment) {
			name = ((Comment) el).eClass().getName();
			ids.add(new EntryId(name, NONE, NONE));
		} else if (el instanceof Relationship) {
			name = ((Relationship) el).eClass().getName();
			ids.add(new EntryId(name, NONE, NONE));
		} else if (el instanceof InstanceSpecification) {
			name = ((InstanceSpecification) el).eClass().getName();
			ids.add(new EntryId(name, NONE, NONE));
		} else if (el instanceof Region) {
			name = ((Region) el).eClass().getName();
			ids.add(new EntryId(name, NONE, NONE));
		} else if (el instanceof Element) {
			name = ((Element) el).eClass().getName();
			ids.add(new EntryId(name, NONE, NONE));
		}
		// else if (el instanceof TypedElement) {
		// try {
		// name = ((Parameter) el).eContainer().eClass().getName();
		// } catch (Exception e) {
		// }
		// ftName = ((TypedElement) el).eClass().getName();
		// ids.add(new EntryId(NONE, NONE, ftName));
		// }
		// else {
		// // create a generic entry
		// ids.add(anyEntry);
		// }
		return ids;
	}

	/**
	 * Gets the feature name.
	 *
	 * @param ft the ft
	 * @return the feature name
	 */
	private static String getFeatureName(Object ft) {
		// UML stuff
		if (ft instanceof Element) {
			return ((Feature) ft).getName();
		}
		// ECore stuff
		if (ft instanceof EStructuralFeature) {
			return ((EStructuralFeature) ft).getName();
		}
		return NONE;
	}

	/**
	 * Compute entry ids.
	 *
	 * @param el the el
	 * @param ft the ft
	 * @return the array list
	 */
	public static ArrayList<EntryId> computeEntryIds_(Object el, Object ft) {
		ArrayList<EntryId> ids = new ArrayList<EntryId>();
		String name = NONE, strName = NONE, ftName = NONE;
		// it's a Stereotype
		if (el instanceof DynamicEObjectImpl) {
			strName = UMLUtil.getStereotype((DynamicEObjectImpl) el).getName();
			Element baseEl = UMLUtil.getBaseElement((DynamicEObjectImpl) el);
			// TODO investigate why baseEl is null when a model element is
			// removed. Perhaps we should check the oldValue??
			name = (baseEl == null) ? null : baseEl.eClass().getName();
			if (ft instanceof EAttribute) {
				ftName = ((EAttribute) ft).getName();
			}
			ids.add(new EntryId(name, strName, ftName));
		} else
		// if its a Component, Interface or Class
		if (el instanceof Classifier) {
			name = ((Classifier) el).eClass().getName();
			ftName = getFeatureName(ft);
			EList<Stereotype> ss = ((Element) el).getAppliedStereotypes();
			if (ss.isEmpty()) {
				ids.add(new EntryId(name, NONE, ftName));
			} else {
				// if there are stereotypes generate the corresponding entries
				for (Stereotype str : ((Element) el).getAppliedStereotypes()) {
					ids.add(new EntryId(name, str.getName(), ftName));
				}
			}
		}
		// // it's a Feature
		// else if (el instanceof Feature || el instanceof Parameter || el
		// instanceof InstanceValue) {
		// EObject cont = ((EObject) el).eContainer();
		// name = null;
		// if (cont!= null && cont instanceof Feature){
		// cont = (cont).eContainer();
		// }
		// // We need the feature type (i.e. Property, Operation), not the
		// name!!!
		// ftName = ((EObject) el).eClass().getName();
		// if(cont != null && cont instanceof Element){
		// name = cont.eClass().getName();
		// }
		// ids.add(new EntryId(name, NONE, ftName));
		// //ids.add(new EntryId(NONE, NONE, getFeatureName(ft)));
		// }
		else if (el instanceof Element && !(el instanceof ProfileApplication)) {
			name = ((Element) el).eClass().getName();
			ftName = getFeatureName(ft);
			EList<Stereotype> ss = ((Element) el).getAppliedStereotypes();
			if (ss.isEmpty()) {
				ids.add(new EntryId(name, NONE, ftName));
			} else {
				// if there are stereotypes generate the corresponding entries
				for (Stereotype str : ((Element) el).getAppliedStereotypes()) {
					ids.add(new EntryId(name, str.getName(), ftName));
				}
			}
		}

		else if (el instanceof EObject && isInSupportedProfiles((EObject) el)) {
			EObject e = (EObject) el;
			ids.add(new EntryId(NONE, e.eClass().getName(), getFeatureName(ft)));
		}
		return ids;
	}

	/**
	 * Checks if is any.
	 *
	 * @return true, if is any
	 */
	public boolean isANY() {
		return type.equals(ANY) && stereotype.equals(ANY)
				&& feature.equals(ANY);
	}

	/**
	 * Checks if is in supported profiles.
	 *
	 * @param el the el
	 * @return true, if is in supported profiles
	 */
	private static boolean isInSupportedProfiles(EObject el) {
		for (int i = 0; i < availableProfiles.length; i++) {
			if (el.getClass().getPackage().getName()
					.startsWith(availableProfiles[i]))
				return true;
		}
		return false;
	}

	/** The available profiles. */
	private static String[] availableProfiles = { "org.polarsys.chess" };

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {
		if (arg0 instanceof EntryId) {
			EntryId ei = (EntryId) arg0;
			return ei.getType().equals(this.getType())
					&& ei.getFeature().equals(this.getFeature())
					&& ei.getStereotype().equals(this.getStereotype());
		}
		return false;
	}
}
