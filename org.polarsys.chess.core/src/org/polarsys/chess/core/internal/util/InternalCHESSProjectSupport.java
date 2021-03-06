/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.internal.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;
import org.polarsys.chess.core.natures.CHESSNature;
import org.polarsys.chess.core.util.CHESSProjectSupport;

/**
 * The Class InternalCHESSProjectSupport.
 */
public class InternalCHESSProjectSupport {

	/**
	 * Adds the nature.
	 *
	 * @param project the project
	 * @throws CoreException the core exception
	 */
	public static void addNature(IProject project) throws CoreException {
		if (!project.hasNature(CHESSNature.NATURE_ID)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = CHESSNature.NATURE_ID;
			description.setNatureIds(newNatures);
	        project.setDescription(description, null);
		}
	}

	/**
	 * Creates the base project.
	 *
	 * @param projectName the project name
	 * @param location the location
	 * @return the i project
	 */
	public static IProject createBaseProject(String projectName, URI location) {
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
	
		if (!newProject.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = newProject.getWorkspace()
					.newProjectDescription(newProject.getName());
			if (location != null
					&& ResourcesPlugin.getWorkspace().getRoot()
							.getLocationURI().equals(location)) {
				projectLocation = null;
			}
			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if (!newProject.isOpen()) {
					newProject.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return newProject;
	}

	/**
	 * Adds the to project structure.
	 *
	 * @param newProject the new project
	 * @param paths the paths
	 * @throws CoreException the core exception
	 */
	@SuppressWarnings("unused")
	private static void addToProjectStructure(final IProject newProject,
			final String[] paths) throws CoreException {
		for (String path : paths) {
			IFolder etcFolder = newProject.getFolder(path);
			CHESSProjectSupport.createFolder(etcFolder);
		}
	}

	/**
	 * This is a copy of org.eclipse.core.internal.utils.FileUtil.
	 * Converts a URI to an IPath.  Returns null if the URI cannot be represented
	 * as an IPath.
	 * <p>
	 * Note this method differs from URIUtil in its handling of relative URIs
	 * as being relative to path variables.
	 *
	 * @param uri the uri
	 * @return the i path
	 */
	public static IPath toPath(URI uri) {
		if (uri == null)
			return null;
		final String scheme = uri.getScheme();
		// null scheme represents path variable
		if (scheme == null || EFS.SCHEME_FILE.equals(scheme))
			return new Path(uri.getSchemeSpecificPart());
		return null;
	}

	/**
	 * Gets the plugin install location.
	 *
	 * @param pluginId the plugin id
	 * @return the plugin install location
	 * @throws Exception the exception
	 */
	public static String getPluginInstallLocation(String pluginId) throws Exception {
		Bundle bundle = Platform.getBundle(pluginId);
		URL locationUrl = FileLocator.find(bundle,new Path("/"), null);
		URL fileUrl = FileLocator.toFileURL(locationUrl);
		return fileUrl.getFile();
	}

	/**
	 * Gets the name without extension.
	 *
	 * @param inputFile the input file
	 * @return the name without extension
	 */
	public static String getNameWithoutExtension(IFile inputFile) {
		String inputName = inputFile.getName();
		int extensionIndex = inputName.lastIndexOf('.');
		if (extensionIndex != -1)
			inputName = inputName.substring(0, extensionIndex);
		return inputName;
	}

	/**
	 * File copy.
	 *
	 * @param in the in
	 * @param out the out
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void fileCopy(InputStream in, FileOutputStream out)
			throws IOException {
		byte[] buf = new byte[8192];
		while (true) {
			int length = in.read(buf);
			if (length < 0)
				break;
			out.write(buf, 0, length);
		}
	
		try {
			in.close();
		} catch (IOException ignore) {
		}
		try {
			out.close();
		} catch (IOException ignore) {
		}
	}

	/**
	 * Gets the bundle contents.
	 *
	 * @param activator the activator
	 * @param path the path
	 * @param collectedPaths the collected paths
	 * @return the bundle contents
	 */
	public static void getBundleContents(Plugin activator, String path,
			List<String> collectedPaths) {
		Enumeration<?> enums = activator.getBundle().getEntryPaths(path);
	
		while (enums.hasMoreElements()) {
			Object object = enums.nextElement();
			Enumeration<?> tmpEnum = activator.getBundle().getEntryPaths(
					object.toString());
			if (tmpEnum != null)
				getBundleContents(activator, object.toString(), collectedPaths);
			else {
				collectedPaths.add(object.toString());
			}
		}
	}

	/**
	 * Gets the i file from absolute path.
	 *
	 * @param path the path
	 * @return the i file from absolute path
	 */
	public static IFile getIFileFromAbsolutePath(String path) {
		IPath location = Path.fromOSString(path);
		return ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(location);
	}

}
