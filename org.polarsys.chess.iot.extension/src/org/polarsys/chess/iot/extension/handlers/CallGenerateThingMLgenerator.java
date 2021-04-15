package org.polarsys.chess.iot.extension.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.chess.iot.generator.ui.thingml.GenerateThingML;

public class CallGenerateThingMLgenerator extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		GenerateThingML gen = new GenerateThingML();
		Object a= gen.execute(event);
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		return null;
	}
}
