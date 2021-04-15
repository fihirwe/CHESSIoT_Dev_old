/*******************************************************************************
 *
 * Copyright (c) 2013, 2015 Intecs SpA 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Nicholas Pacini nicholas.pacini@intecs.it 
 * Stefano Puri stefano.puri@intecs.it
 * Laura Baracchi  laura.baracchi@intecs.it  
 * Initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.polarsys.chess.iot.extension.managers;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.Model;

import org.polarsys.chess.core.extensionpoint.IAddProfile;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.util.uml.ResourceUtils;

public class ApplyCHESSIoTProfile implements IAddProfile {

	public ApplyCHESSIoTProfile() {
	}

	@Override
	public void addProfile(Model owner, ResourceSet resourceSet) {
		CHESSIoTProfileManager chessiot = CHESSIoTProfileManager.loadCHESSIoTProfile(resourceSet);	
		if(chessiot== null){
			System.err.println(" Your model is nullllllllllllllllllllllllllllllllllllllll ---------------------------------");
		}
		if (owner != null)
			chessiot.applyCHESSIoTProfileTo(owner, true);
	}
	
	@Override
	public void loadProfile(ResourceSet resourceSet) {
		CHESSIoTProfileManager.loadCHESSIoTProfile(resourceSet);	
//		CHESSIoTProfileManager.getCHESSModelApplied();

		
		
	}

}
