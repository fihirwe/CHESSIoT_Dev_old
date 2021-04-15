/*******************************************************************************
 * Copyright (C) 2021 

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * Author: Felicien Ihirwe
 *  Intecs Solutions
 ******************************************************************************/
package org.polarsys.chess.iot.generator.ui.util;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

public class ThingMLGenUtil {
	
	/**
	 * Utility method to get the active Eclipse project.
	 *
	 * @param editor the editor
	 * @return the active project
	 */
	public static IProject getActiveProject(IEditorPart editor) {
		IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
		IFile file = input.getFile();
		return file.getProject();
	}

}
