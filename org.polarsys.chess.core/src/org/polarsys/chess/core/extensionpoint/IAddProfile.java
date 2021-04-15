/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.extensionpoint;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Model;

/**
 * The Interface IAddProfile.
 */
public interface IAddProfile {

	/**
	 * Applies a profile to the given model and resourceset.
	 *
	 * @param owner the owner
	 * @param resourceSet the resource set
	 */
	void addProfile(Model owner, ResourceSet resourceSet);

	/**
	 * Loads a profile for the given ResourceSet.
	 *
	 * @param resourceSet the resource set
	 */
	void loadProfile(ResourceSet resourceSet);

}
