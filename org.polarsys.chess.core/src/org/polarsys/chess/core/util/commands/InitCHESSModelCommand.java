/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.util.commands;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.internal.extensionpoint.AddProfileHandler;
import org.polarsys.chess.core.internal.views.commands.CreateViewsCommand;

/**
 * This class extends the {@link RecordingCommand} class to implement the command to initialize a
 * CHESS model.
 *
 */
public class InitCHESSModelCommand extends RecordingCommand {

	/** The model set. */
	private ModelSet modelSet;

	/**
	 * Initializes the command.
	 * 
	 * @param editingDomain  the editing domain where the command takes place
	 * @param modelSet  the model set where the command works in
	 */
	public InitCHESSModelCommand(TransactionalEditingDomain editingDomain, ModelSet modelSet) {
			super(editingDomain);
			this.modelSet = modelSet;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute() {
		
		EObject  owner = getRootElement(UmlUtils.getUmlResource(modelSet));
		CreateViewsCommand.viewsToModel((Model)owner, modelSet/*, chess, marte, sysml*/);	
		
		//let external plugins to add additional profiles
		AddProfileHandler h = new AddProfileHandler();
		IExtensionRegistry reg =  Platform.getExtensionRegistry();
		h.executeAddProfile(reg, (Model)owner, modelSet);
		
	}
	
	/**
	 * Gets the root element.
	 *
	 * @param modelResource the model resource
	 * @return the root element
	 */
	protected EObject getRootElement(Resource modelResource) {
		EObject rootElement = null;
		if(modelResource != null && modelResource.getContents() != null && modelResource.getContents().size() > 0) {
			Object root = modelResource.getContents().get(0);
			if(root instanceof EObject) {
				rootElement = (EObject)root;
			}
		}
		return rootElement;
	}

}
