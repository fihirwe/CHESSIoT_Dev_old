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

package org.polarsys.chess.core.constraint;

import java.util.ArrayList;

import org.polarsys.chess.core.preferences.FilterableConstraint;

/**
 * This class contains the list of all the constraints used for the model validation.
 *
 */
public class ConstraintList {
	
	/** The list. */
	private static ArrayList <FilterableConstraint> list = new ArrayList<FilterableConstraint>();
	
	/**
	 * Adds the.
	 *
	 * @param c the c
	 */
	static void add(IConstraint c) {
		list.add(new FilterableConstraint(c));
	}
	
	/**
	 * Get the list of all the constraints.
	 *
	 * @return the list
	 */
	public static ArrayList<FilterableConstraint> getList(){
		return list;
	}
}
