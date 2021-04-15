/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.internal.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.polarsys.chess.core.util.CHESSProjectSupport;

/**
 * The Class InternalConsoleUtil.
 */
public class InternalConsoleUtil {

	/**
	 * Find console.
	 *
	 * @param name the name
	 * @return the message console
	 */
	public static MessageConsole findConsole(final String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }

	/**
	 * Find CHES sconsole.
	 *
	 * @return the message console stream
	 */
	public static MessageConsoleStream findCHESSconsole(){
		MessageConsole myConsole = findConsole(CHESSProjectSupport.CHESS_CONSOLE_NAME);
		return myConsole.newMessageStream();
	}

	/**
	 * Write log.
	 *
	 * @param message the message
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void writeLog(String message) throws FileNotFoundException {
		FileOutputStream out = new FileOutputStream(InternalConsoleUtil.getEclipseInstallLocation()
				+ "CHESSLOG");
		PrintStream p = new PrintStream(out);
		p.println(message);
		p.close();
	}

	/**
	 * Gets the eclipse install location.
	 *
	 * @return the eclipse install location
	 */
	public static String getEclipseInstallLocation() {
		if (System.getProperty("os.name").equals("Linux"))
			return System.getProperties().get("osgi.install.area").toString()
					.substring(5);
		else
			return System.getProperties().get("osgi.install.area").toString()
					.substring(6);
	}

}
