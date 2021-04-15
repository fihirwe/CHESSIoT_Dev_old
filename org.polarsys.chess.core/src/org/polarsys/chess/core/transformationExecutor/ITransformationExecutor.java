/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.transformationExecutor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.uml2.uml.Package;

/**
 * This interface defines the transformation to execute.
 *
 */
public interface ITransformationExecutor {
	/**
	 * Executes the transformation.
	 * 
	 * @param modelFile  the input model for the transformation
	 * @param transformationDirectory  the directory where the output of the transformation will be created
	 * @param monitor  the progress monitor
	 * @param psmPackage  the PSM package to use as input for the transformation
	 * @return  the resulting status of the transformation
	 * @throws Exception  when something went wrong during the transformation
	 */
	public String execute(IFile modelFile, IFolder transformationDirectory,
			IProgressMonitor monitor, Package psmPackage) throws Exception;
}
