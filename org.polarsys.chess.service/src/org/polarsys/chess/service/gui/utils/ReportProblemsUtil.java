/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.service.gui.utils;

import java.util.HashMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * An utility class to post messages to the Problems tab.
 * 
 * @author cristofo
 *
 */
public class ReportProblemsUtil {
	
	/**
	 * Deletes all markers on this resource.
	 * @param resource the resource
	 * @throws CoreException
	 */
	public static void cleanResource(IResource resource) throws CoreException {
	    resource.deleteMarkers(null, true, IResource.DEPTH_INFINITE);		
	}
	
	/**
	 * Reports a warning in the Problems tab.
	 * @param resource the resource
	 * @param ownerField the name of the field to store the owner
	 * @param ownerName the name of the creator of this report
	 * @param msg the message to display
	 * @param lineNumber the line to select (or 0)
	 * @param charStart the start of selection (or 0)
	 * @param charEnd the end of seletion (or 0)
	 * @return the created IMarker
	 * @throws CoreException
	 * @throws NullPointerException
	 */
	public static IMarker reportWarning(IResource resource, String ownerField, String ownerName, String msg, int lineNumber, 
			int charStart, int charEnd) throws CoreException, NullPointerException {
		return reportMessage(resource, ownerField, ownerName, msg, lineNumber, charStart, charEnd, 
				IMarker.PROBLEM, IMarker.SEVERITY_WARNING);
	}

	/**
	 * Reports an error in the Problems tab.
	 * @param resource the resource
	 * @param ownerField the name of the field to store the owner
	 * @param ownerName the name of the creator of this report
	 * @param msg the message to display
	 * @param lineNumber the line to select (or 0)
	 * @param charStart the start of selection (or 0)
	 * @param charEnd the end of seletion (or 0)
	 * @return the created IMarker
	 * @throws CoreException
	 * @throws NullPointerException
	 */
	public static IMarker reportError(IResource resource, String ownerField, String ownerName, String msg, int lineNumber, 
			int charStart, int charEnd) throws CoreException, NullPointerException {
		return reportMessage(resource, ownerField, ownerName, msg, lineNumber, charStart, charEnd, 
				IMarker.PROBLEM, IMarker.SEVERITY_ERROR);
	}

	/**
	 * Reports an info in the Problems tab.
	 * @param resource the resource
	 * @param ownerField the name of the field to store the owner
	 * @param ownerName the name of the creator of this report
	 * @param msg the message to display
	 * @param lineNumber the line to select (or 0)
	 * @param charStart the start of selection (or 0)
	 * @param charEnd the end of seletion (or 0)
	 * @return the created IMarker
	 * @throws CoreException
	 * @throws NullPointerException
	 */
	public static IMarker reportInfo(IResource resource, String ownerField, String ownerName, String msg, int lineNumber, 
			int charStart, int charEnd) throws CoreException, NullPointerException {
		return reportMessage(resource, ownerField, ownerName, msg, lineNumber, charStart, charEnd, 
				IMarker.PROBLEM, IMarker.SEVERITY_INFO);
	}

	private static IMarker reportMessage(IResource resource, String ownerField, String ownerName, String msg, int lineNumber,
			int charStart, int charEnd, String type, int severity) throws CoreException, NullPointerException {
		if (resource == null) {
			throw new NullPointerException("Resource is null");
		}
		
		IMarker m = resource.createMarker(type);
		
		HashMap<String, Object> attributes = new HashMap<String, Object>();
		attributes.put(IMarker.PRIORITY, new Integer(IMarker.PRIORITY_HIGH));
		attributes.put(IMarker.SEVERITY, new Integer(severity));
		if (lineNumber > 0) attributes.put(IMarker.LINE_NUMBER, new Integer(lineNumber));
		attributes.put(IMarker.MESSAGE, msg);
		if (charStart > 0) attributes.put(IMarker.CHAR_START, new Integer(charStart)); // Note: this value is from the beginning of the document
		if (charEnd > 0) attributes.put(IMarker.CHAR_END, new Integer(charEnd)); // Note: this value is from the beginning of the document
//		m.setAttribute(IMarker.LOCATION, "whole file");	// This is a generic info about location
		attributes.put(ownerField, ownerName);
		m.setAttributes(attributes);
		return m;
	}
}
