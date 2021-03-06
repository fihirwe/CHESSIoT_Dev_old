/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.service.core.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.uml2.uml.Class;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;

/**
 * Utility class for generating transformations file names.
 * 
 * @author cristofo
 *
 */

// Replaced File.separator with "/" because the URI object does not support the
// backslash "\" (that is returned by File.separator for Windows platforms).
public class FileNamesUtil {
	private static final String XML_EXT = ".xml";
	
	public static final String UML_EXT = ".uml";
	public static final String OSS_EXT = ".oss";
	public static final String SMV_EXT = ".smv";
	public static final String FEI_EXT = ".fei";
	public static final String OCRA_FOLD = "NuSMV3-OCRA";
	public static final String XSAP_FOLD = "NuSMV3-XSAP";
	public static final String RES_FOLD = "Results";
	public static final String FILES_FOLD = "Files";
	public static final String TEMP_FOLD = "Temp";
	
	private static FileNamesUtil fileNamesUtil;
	private final AnalysisResultUtil analysisResultUtil = AnalysisResultUtil.getInstance();

	public static FileNamesUtil getInstance() {
		if (fileNamesUtil == null) {
			fileNamesUtil = new FileNamesUtil();
		}
		return fileNamesUtil;
	}

	/**
	 * Computes the folder for xSAP material.
	 * 
	 * @param editor
	 *            the active editor
	 * @return
	 */
	public IFolder computeXSapFolder(IEditorPart editor) {
		final IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
		final IFile inputfile = input.getFile();
		final IProject project = inputfile.getProject();
		IFolder folder = project.getFolder(XSAP_FOLD);
		return folder;
	}

	/**
	 * Gives the current date and time formatted in a certain way.
	 * 
	 * @return the string representing the current date and time
	 */
	private String getDate() {
		final String pattern = "yyyy-MM-dd-HH-mm-ss";
		final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(new Date());
	}

	/**
	 * Computes the absolute file name for the fault tree.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @param index
	 *            an index to differentiate the generated file
	 * @return
	 */
	public String computeFtFileName(IEditorPart editor, String modelSystemName, int index) {
		final String resPath;
		final String fileName;

		//if (storeResult) {

			resPath = analysisResultUtil.getResultDir();

			fileName = resPath + File.separator + "extended_" + modelSystemName + "_" + Analysis.FTA_ANALYSIS
					+ "_c" + index + "_" + getDate() + XML_EXT;
		/*} else {
			final IFolder folder = computeXSapFolder(editor);
			final IFolder resFolder = folder.getFolder(CommandsCommon.RES_FOLD);
			resPath = resFolder.getLocation().toString();
			fileName = resPath + File.separator + "extended_" + modelSystemName + "_c" + index + "_ft" + XML_EXT;

		}*/
		return fileName;
	}

	/**
	 * Computes the absolute file name for the FMEA table.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @return
	 */
	public String computeFmeaFileName(IEditorPart editor, String modelSystemName) {
		final String resPath;
		final String fileName;

	//	if (storeResult) {

			resPath = analysisResultUtil.getResultDir();

			fileName = resPath + File.separator + modelSystemName + "_" + Analysis.FMEA_ANALYSIS + "_"
					+ getDate() + XML_EXT;
	/*	} else {
			final IFolder folder = computeXSapFolder(editor);
			final IFolder resFolder = folder.getFolder(CommandsCommon.RES_FOLD);
			resPath = resFolder.getLocation().toString();
			fileName = resPath + File.separator + modelSystemName + "_fmea_table" + XML_EXT;
		}*/
		return fileName;
	}

	/**
	 * Computes the absolute file name for the extended SMV.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @return
	 */
	public String computeExtendedSmvFileName(IEditorPart editor, String modelSystemName) {
		final IFolder folder = computeXSapFolder(editor);
		final IFolder tempFolder = folder.getFolder(TEMP_FOLD);
		final String tempFiles = tempFolder.getLocation().toString();
		final String fileName = tempFiles + "/" + "extended_" + modelSystemName + SMV_EXT;
		return fileName;
	}

	/**
	 * Computes the absolute file name for the expanded FEI.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @return
	 */
	public String computeExpandedFeiFileName(IEditorPart editor, String modelSystemName) {
		final IFolder folder = computeXSapFolder(editor);
		final IFolder tempFolder = folder.getFolder(TEMP_FOLD);
		final String tempFiles = tempFolder.getLocation().toString();
		final String fileName = tempFiles + "/" + "expanded_" + modelSystemName + XML_EXT;
		return fileName;
	}

	/**
	 * Computes the absolute file name for the fms.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @return
	 */
	public String computeFmsFileName(IEditorPart editor, String modelSystemName) {
		final IFolder folder = computeXSapFolder(editor);
		final IFolder tempFolder = folder.getFolder(TEMP_FOLD);
		final String tempFiles = tempFolder.getLocation().toString();
		final String fileName = tempFiles + "/" + "fms_" + modelSystemName + XML_EXT;
		return fileName;
	}

	/**
	 * Computes the target folder for files.
	 * 
	 * @param editor
	 *            the active editor
	 * @return
	 */
	public String computeFileTargetFolder(IEditorPart editor) {
		final IFolder folder = computeXSapFolder(editor);
		final IFolder files = folder.getFolder(FILES_FOLD);
		final File target = files.getLocation().toFile();
		return target.toString();
	}

	/**
	 * Computes the absolute file name of the SMV.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @return
	 */
	public String computeSmvFileName(IEditorPart editor, String modelSystemName) {
		return computeFileTargetFolder(editor) + "/" + modelSystemName + SMV_EXT;
	}

	/**
	 * Computes the absolute file name of the FEI.
	 * 
	 * @param editor
	 *            the active editor
	 * @param modelSystemName
	 *            the model name
	 * @return
	 */
	public String computeFeiFileName(IEditorPart editor, String modelSystemName) {
		return computeFileTargetFolder(editor) + "/" + modelSystemName + FEI_EXT;
	}

	/**
	 * Returns the qualified name of the given component, as string.
	 * 
	 * @param component
	 *            the component
	 * @return the qualified name with replaced colons
	 */
	private String computeQualifiedName(Class component) {
		String name = component.getQualifiedName();
		return name.replace("::", "_");
	}

	/**
	 * Computes the file name for the Contract-based fault tree analysis.
	 * 
	 * @param systemComponent
	 *            the root component of the analysis
	 * @return
	 */
	public String computeContractFaultTreeFileName(Class systemComponent) {
		final String resPath = analysisResultUtil.getResultDir();
		return resPath + File.separator + computeQualifiedName(systemComponent) + "_"
				+ Analysis.CONTRACT_BASED_FTA_ANALYSIS + "_" + getDate() + XML_EXT;
	}

	/**
	 * Computes the file name for the Contract refinement analysis.
	 * 
	 * @param systemComponent
	 *            the root component of the analysis
	 * @return
	 */
	public String computeContractRefinementFileName(Class systemComponent) {
		final String resPath = analysisResultUtil.getResultDir();
		return resPath + File.separator + computeQualifiedName(systemComponent) + "_"
				+ Analysis.CONTRACT_REFINEMENT_ANALYSIS + "_" + getDate() + XML_EXT;
	}

	/**
	 * Computes the file name for the Composite Contract Implementation
	 * analysis.
	 * 
	 * @param systemComponent
	 *            the root component of the analysis
	 * @return
	 */
	public String computeContractCompositeImplementationFileName(Class systemComponent) {
		final String resPath = analysisResultUtil.getResultDir();
		return resPath + File.separator + computeQualifiedName(systemComponent) + "_"
				+ Analysis.CONTRACT_COMPOSITE_IMPLEMENTATION_ANALYSIS + "_" + getDate() + XML_EXT;
	}

	/**
	 * Computes the file name for the Property Validation analysis.
	 * 
	 * @param systemComponent
	 *            the root component of the analysis
	 * @return
	 */
	public String computePropertyValidationFileName(Class systemComponent) {
		final String resPath = analysisResultUtil.getResultDir();
		return resPath + File.separator + computeQualifiedName(systemComponent) + "_"
				+ Analysis.PROPERTY_VALIDATION_ANALYSIS + "_" + getDate() + XML_EXT;
	}

	/**
	 * Computes the file name for the Contract Property Validation analysis.
	 * 
	 * @param systemComponent
	 *            the root component of the analysis
	 * @return
	 */
	public String computeContractPropertyValidationFileName(Class systemComponent) {
		final String resPath = analysisResultUtil.getResultDir();
		return resPath + File.separator + computeQualifiedName(systemComponent) + "_"
				+ Analysis.CONTRACT_PROPERTY_VALIDATION_ANALYSIS + "_" + getDate() + XML_EXT;
	}

	/**
	 * Computes the file name for the Model Checking analysis.
	 * 
	 * @param systemComponent
	 *            the root component of the analysis
	 * @return
	 */
	public String computeModelCheckingFileName(Class systemComponent) {
		final String resPath = analysisResultUtil.getResultDir();
		return resPath + File.separator + computeQualifiedName(systemComponent) + "_"
				+ Analysis.MODEL_CHECKING_ANALYSIS + "_" + getDate() + XML_EXT;
	}
}
