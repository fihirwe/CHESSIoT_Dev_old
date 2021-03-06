/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
--                                                                   --
--                    Copyright (C) 2016                             --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Authors: Alessandro Zovi          azovi@math.unipd.it             --
--          Laura Baracchi           laura.baracchi@intecs.it        --
--          Stefano Puri             stefano.puri@intecs.it          --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.core.internal.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.chessmlprofile.Core.Domain;
import org.polarsys.chess.core.internal.views.permissions.EntryId;
import org.polarsys.chess.core.internal.views.permissions.PermissionEntry;
import org.polarsys.chess.core.internal.views.permissions.PermissionList;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;
import org.polarsys.chess.core.views.ViewUtils;

/**
 * The Class InternalViewUtils.
 */
public class InternalViewUtils {

	/**
	 * Gets the name of the stereotype of the package that represents the design view.
	 * 
	 * @param pkg  the package 
	 * @return the stereotype name or null
	 */
	public static /*Nullable*/String getViewName(final Package pkg) {
		Stereotype s = InternalViewUtils.getViewStereotypeApplied(pkg);
		return s != null ? s.getName() : null;
	}

	/**
	 * Gets the view stereotype applied.
	 *
	 * @param pkg the pkg
	 * @return the view stereotype applied
	 */
	public static Stereotype getViewStereotypeApplied(Package pkg) {
		if (pkg == null)
			return null;
		EList<Stereotype> list = pkg.getAppliedStereotypes();
		for (Stereotype stereotype : list) {
			if (ViewUtils.isViewStereotype(stereotype)) {
				return stereotype;
			}
		}
		return null;
	}

	/**
	 * Gets the view with throws.
	 *
	 * @param ob the ob
	 * @return the view with throws
	 * @throws Exception the exception
	 */
	public static Package getViewWithThrows(EObject ob) throws Exception {
		if (ob == null)
			throw new Exception("containing object is null");
		Package pkg = null;
		if (ob instanceof Package) {
			pkg = (Package) ob;
	
			if (InternalViewUtils.hasViewStereotypeApplied(pkg))
				return pkg;
		}
	
		return getViewWithThrows(ob.eContainer());
	}

	/**
	 * Checks for view stereotype applied.
	 *
	 * @param pkg the pkg
	 * @return true, if successful
	 */
	public static boolean hasViewStereotypeApplied(Package pkg) {
		EList<Stereotype> list = pkg.getAppliedStereotypes();
		for (Stereotype stereotype : list) {
			if (ViewUtils.isViewStereotype(stereotype)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if is element writable.
	 *
	 * @param element the element
	 * @param currentView the current view
	 * @return true, if is element writable
	 */
	@Deprecated
	public static boolean isElementWritable(Element element, DesignView currentView) {
		Package view = null;
		if ((view = ViewUtils.getView(element.eContainer())) != null
				&& currentView != null) {
			String viewName = getViewName(view);
			return currentView.isEnabled(viewName);
		}
		return true;
	}

	/**
	 * Checks if is view.
	 *
	 * @param notifier the notifier
	 * @return true, if is view
	 */
	public static boolean isView(EObject notifier) {
		if (notifier instanceof Package
				&& hasViewStereotypeApplied((Package) notifier))
			return true;
		if (CHESSProfileManager.CHESS_VIEWS_LIST.contains((notifier.eClass().getName())))
			return true;
		return false;
	}

	/**
	 * Gets the CHESS requirement package.
	 *
	 * @param theModel the the model
	 * @return the CHESS requirement package
	 */
	public static Package getCHESSRequirementPackage(Model theModel) {
		for (Element p : theModel.allOwnedElements()) {
			if (p instanceof Package)
				if (ViewUtils.isRequirementView((Package)p))
					return (Package) p;
		}
		return (Package)theModel;
	}

	/**
	 * Gets the CHESS system package.
	 *
	 * @param theModel the the model
	 * @return the CHESS system package
	 */
	public static Package getCHESSSystemPackage(Model theModel) {
		for (Element p : theModel.allOwnedElements()) {
			if (p instanceof Package)
				if (ViewUtils.isSystemView((Package)p))
					return (Package) p;
		}
		return (Package)theModel;
	}

	/**
	 * Gets the CHESS component package.
	 *
	 * @param theModel the the model
	 * @return the CHESS component package
	 */
	public static Package getCHESSComponentPackage(Model theModel) {
		for (Element p : theModel.allOwnedElements()) {
			if (p instanceof Package)
				if (ViewUtils.isComponentView((Package)p))
					return (Package) p;
		}
		return (Package)theModel;
	}

	/**
	 * Checks the .
	 *
	 * @param designView the design view
	 * @param entryId the entry id
	 * @param permission  the permission type, i.e  {@link PermissionEntry#OWNER}
	 * @param theDomain the the domain
	 * @return true, if successful
	 */
	public static boolean checkPermission(DesignView designView, EntryId entryId, byte permission, Domain theDomain) {
		//TODO code must be refactored to avoid continuous generation of permissions!
		if (entryId.isANY())
			return true;
		PermissionList l = designView.getEnabledPermissions(theDomain);
		if (l != null && !l.checkPermission(entryId, permission))
			return false;
		return true;
	}
	
	
	/**
	 * Check permission.
	 *
	 * @param viewName the view name
	 * @param entryId the entry id
	 * @param permission the permission
	 * @param currentView the current view
	 * @param theDomain the the domain
	 * @return true, if successful
	 */
	public static boolean checkPermission(String viewName, EntryId entryId, byte permission, DesignView currentView, Domain theDomain) {
		//TODO code must be refactored to avoid continuous generation of permissions!
		if (entryId.isANY())
			return true;
		PermissionList l = currentView.getEnabledPermissions(viewName, theDomain);
		if (l != null && !l.checkPermission(entryId, permission))
			return false;
		return true;
	}
	
	

}
