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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.core.internal.views.commands.CreateViewsCommand;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.util.uml.ProfileUtils;
import org.polarsys.chess.core.util.uml.ResourceUtils;

/**
 * This class wraps the CHESSIoT profile resource and is used for loading the profile and 
 * applying its stereotypes.
 * 
 * @author Stefano Puri
 *
 */

public class CHESSIoTProfileManager  extends ModelCreationCommandBase {	
	
	public static final String CHESSIoTProfilePathmap = "pathmap://resources/org.polarsys.chess.iot.profile/CHESSIoT.profile.uml";

	private static Profile chessIoTProfile;

	private static CHESSIoTProfileManager instance;

	//private static  ModelSet modelSet = ;                                       

	private CHESSIoTProfileManager() {
	}

	public static CHESSIoTProfileManager loadCHESSIoTProfile(ResourceSet rs) {
				
		if (instance == null){
			instance = new CHESSIoTProfileManager();
		}
		chessIoTProfile = (Profile)PackageUtil.loadPackage(URI.createURI(CHESSIoTProfilePathmap), rs);
		System.out.println("CHESSIoT: loaded profile "+chessIoTProfile);
		
		
		
		
		return instance;
	}
	
	
//	public static Model getCHESSModelApplied(){
//		System.err.println("getCHESSModelApplied is called!! ");
//		Model currentModel = null;
////		if (CreateViewsCommand.getModelSet() != null) {
////			currentModel = ResourceUtils.getModel(UmlUtils.getUmlModel(CreateViewsCommand.getModelSet())
////					.getResource());
////			new CHESSProfileManager(CreateViewsCommand.getModelSet());
////			System.err.println("getCHESSModelApplied is called!! "+currentModel.getName()+"chessIoTProfile "+chessIoTProfile.getName());
////			PackageUtil.applyProfile(currentModel, chessIoTProfile, true);
////		}
//		return currentModel; 
//	}

	public Profile getCHESSIoTProfile() {
		return chessIoTProfile;
	}
	
	public void applyCHESSIoTProfileTo(Package element, boolean withSubProfiles){
		PackageUtil.applyProfile(element, chessIoTProfile, true);
	}

	@Override
	protected EObject createRootElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected void initializeModel(EObject owner) {
		
	}
}