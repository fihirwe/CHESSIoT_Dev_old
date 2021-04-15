/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.util.uml;

/**
 * The Class ModelError.
 */
public class ModelError extends Exception {

	/**
	 * Instantiates a new model error.
	 *
	 * @param message the message
	 */
	public ModelError(String message) {
		super(message);
	}
	
	/**
	 * Instantiates a new model error.
	 *
	 * @param messageFormat the message format
	 * @param args the args
	 */
	public ModelError(String messageFormat, Object... args) {
		super(String.format(messageFormat, args));
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3470869043917284064L;

}
