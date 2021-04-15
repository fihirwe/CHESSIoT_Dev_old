package org.polarsys.chess.m2m.transformations;

import org.eclipse.core.resources.IFile;

/**
 * The Class TransformationResultsData.
 */
public class TransformationResultsData {
	
	/** The res. */
	public String res;
	
	/** The uml file. */
	public IFile umlFile;

	/**
	 * Instantiates a new transformation results data.
	 *
	 * @param res the res
	 * @param umlFile the uml file
	 */
	public TransformationResultsData(String res, IFile umlFile) {
		this.res = res;
		this.umlFile = umlFile;
	}
}