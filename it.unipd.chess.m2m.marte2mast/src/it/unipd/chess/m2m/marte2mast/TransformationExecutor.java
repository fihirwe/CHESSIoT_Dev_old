package it.unipd.chess.m2m.marte2mast;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.uml2.uml.Package;
import org.polarsys.chess.core.transformationExecutor.ITransformationExecutor;

public class TransformationExecutor implements ITransformationExecutor {

	public String execute(IFile modelFile, IFolder transformationDirectory,
			IProgressMonitor monitor, Package psmPackage) throws Exception {
		return AcceleoMarte2mast.runMarte2Mast(modelFile, transformationDirectory, monitor, psmPackage);
	}	
}
