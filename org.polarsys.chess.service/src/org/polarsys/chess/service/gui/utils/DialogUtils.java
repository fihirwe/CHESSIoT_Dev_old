/*******************************************************************************
 * Copyright (C) 2017 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alberto Debiasi - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.service.gui.utils;

import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import eu.fbk.eclipse.standardtools.utils.ui.utils.DirectoryUtil;

/**
 * 
 *
 */
public class DialogUtils {

	private DirectoryUtil directoryUtils = DirectoryUtil.getInstance();
	private static DialogUtils exportDialogUtils;

	public static DialogUtils getInstance() {
		if (exportDialogUtils == null) {
			exportDialogUtils = new DialogUtils();
		}
		return exportDialogUtils;
	}

	
	
	public String getDirectoryNameFromDialog() throws Exception {	
		return getDirectoryNameFromDialog("Select the directory");
	}

	public String getDirectoryNameFromDialog(String title) throws Exception {
		return getDirectoryNameFromDialog(title, directoryUtils.getCurrentProjectDir());
	}
	
	public String getDirectoryNameFromDialog(String title, String path) throws Exception {
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		final DirectoryDialog directoryDialog = new DirectoryDialog(shell);
		directoryDialog.setText(title);
		directoryDialog.setFilterPath(path);
		String directoryName = directoryDialog.open();

		return directoryName;
	}
	
	public String getFileNameFromDialog() throws Exception {	
		return getFileNameFromDialog("Select the file",null);
	}

	public String getFileNameFromDialog(String title, String filterExtension) throws Exception {
		final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

		final FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText(title);
		fileDialog.setFilterPath(directoryUtils.getCurrentProjectDir());
		if(filterExtension!=null){
			String[] extensions = {filterExtension};
			fileDialog.setFilterExtensions(extensions);
		}
		String directoryName = fileDialog.open();

		return directoryName;
	}
	
}
