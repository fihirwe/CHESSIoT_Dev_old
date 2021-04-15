/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Authors: Alessandro Zovi         azovi@math.unipd.it 		     --
--			Stefano Puri											 --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.core.internal.views.commands;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.internal.extensionpoint.AddProfileHandler;
import org.polarsys.chess.core.profiles.CHESSProfileManager;
import org.polarsys.chess.core.profiles.MARTEProfileManager;
import org.polarsys.chess.core.profiles.SysMLProfileManager;
import org.polarsys.chess.core.util.uml.ResourceUtils;


/**
 * The Class CreateViewsCommand.
 */
public class CreateViewsCommand extends RecordingCommand {

	/** The model set. */
	private ModelSet modelSet;

	/**
	 * Instantiates a new creates the views command.
	 *
	 * @param rs the rs
	 */
	public CreateViewsCommand(ModelSet rs) {
		super(rs.getTransactionalEditingDomain());
		this.modelSet = rs;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		Model currentModel = null;
		if (modelSet != null) {
			currentModel = ResourceUtils.getModel(UmlUtils.getUmlModel(modelSet)
					.getResource());
			new CHESSProfileManager(modelSet);
		
		} 

		viewsToModel(currentModel, modelSet);
		
	}

	/**
	 * Views to model.
	 *
	 * @param currentModel the current model
	 * @param mset the mset
	 */
	public static void viewsToModel(Model currentModel, ModelSet mset) {
		CHESSProfileManager.createModel(currentModel);
		MARTEProfileManager.createModel(currentModel);
		SysMLProfileManager.createModel(currentModel);
		
		AddProfileHandler h = new AddProfileHandler();
		IExtensionRegistry reg =  Platform.getExtensionRegistry();
		h.executeAddProfile(reg, currentModel, mset);	
	}
	
}
