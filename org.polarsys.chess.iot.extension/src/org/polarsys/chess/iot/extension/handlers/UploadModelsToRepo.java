package org.polarsys.chess.iot.extension.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.polarsys.chess.iot.extension.uploadmodels.FileUploadHTTP;

public class UploadModelsToRepo  extends AbstractHandler {

		@Override
		public Object execute(ExecutionEvent event) throws ExecutionException {
			FileUploadHTTP upload= new FileUploadHTTP();
			upload.doUpload();
			return null;

		}
}
