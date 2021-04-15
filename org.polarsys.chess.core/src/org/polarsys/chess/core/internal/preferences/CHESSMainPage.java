/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Author: Alessandro Zovi         azovi@math.unipd.it               --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.core.internal.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * The Class CHESSMainPage.
 */
public class CHESSMainPage extends PreferencePage implements
		IWorkbenchPreferencePage {

	/**
	 * Instantiates a new CHESS main page.
	 */
	public CHESSMainPage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new CHESS main page.
	 *
	 * @param title the title
	 */
	public CHESSMainPage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new CHESS main page.
	 *
	 * @param title the title
	 * @param image the image
	 */
	public CHESSMainPage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
