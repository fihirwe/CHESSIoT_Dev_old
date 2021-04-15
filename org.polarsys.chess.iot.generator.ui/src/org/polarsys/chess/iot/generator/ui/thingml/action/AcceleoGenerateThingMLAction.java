/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.chess.iot.generator.ui.thingml.action;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.polarsys.chess.iot.generator.ui.Activator;
import org.polarsys.chess.iot.generator.ui.common.GenerateAll;

/**
 * Sample code generation.
 */
public class AcceleoGenerateThingMLAction extends ActionDelegate implements IActionDelegate {
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		if (files != null) {
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							IFile model = (IFile)filesIt.next();
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							try {
								IContainer target = model.getProject().getFolder("src-gen"+getMillisecond());
								GenerateAll generator = new GenerateAll(modelURI, target, getArguments());
								generator.doGenerate(monitor);
							} catch (IOException e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							} finally {
								model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected static List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}
	
	
	public static Object generateThingMLModel(IFile model, IProgressMonitor monitor){
		URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
		try {
			IContainer target = model.getProject().getFolder("src-gen-"+model.getProject().getName()+getMillisecond());
			GenerateAll generator = new GenerateAll(modelURI, target, getArguments());
			try {
				generator.doGenerate(monitor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			
			try {
				model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return modelURI;
	}
	
	public static String getMillisecond(){
		Date date = new Date();
		String time = new SimpleDateFormat("-yyyy-MM-dd-HH-mm-ss", Locale.ENGLISH).format(date);
		return String.valueOf(time);

	}
}