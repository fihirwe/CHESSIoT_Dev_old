/*---------------------------------------------------------------------
--                           Marte2Mast                              --
--      Converter of Schedulability analysis models made with UML2   --
--   and The UML Profile for MARTE to MAST, the Analysis Suite for   --
--                      Real-Time Applications                       --
--                                                                   --
--                     Copyright (C) 2011-2012                       --
--                 University of Padova, ITALY	                     --
--                                                                   --
--                                                                   --
--  Authors: Alessandro Zovi		azovi@math.unipd.it				 --
--                                                                   --
-- This program is free software; you can redistribute it and/or     --
-- modify it under the terms of the GNU General Public               --
-- License as published by the Free Software Foundation; either      --
-- version 2 of the License, or (at your option) any later version.  --
--                                                                   --
-- This program is distributed in the hope that it will be useful,   --
-- but WITHOUT ANY WARRANTY; without even the implied warranty of    --
-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU --
-- General Public License for more details.                          --
--                                                                   --
-- You should have received a copy of the GNU General Public         --
-- License along with this program; if not, write to the             --
-- Free Software Foundation, Inc., 59 Temple Place - Suite 330,      --
-- Boston, MA 02111-1307, USA.                                       --
--                                                                   --
---------------------------------------------------------------------*/
package it.unipd.chess.m2m.marte2mast.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import it.unipd.chess.m2m.marte2mast.Activator;

//Author Alessandro Zovi
public class Marte2mastPreferenceInitializer extends
		AbstractPreferenceInitializer {

	public Marte2mastPreferenceInitializer() {}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceUtils.USE_GMAST_PREFERENCE, PreferenceUtils.DEFAULT_USE_GMAST);
		store.setDefault(PreferenceUtils.TOOLS_PREFERENCE, "offset_based");
		store.setDefault(PreferenceUtils.TECNIQUE_PREFERENCE, PreferenceUtils.DEFAULT_TECNIQUE);
		store.setDefault(PreferenceUtils.STOP_FACTOR_PREFERENCE, PreferenceUtils.DEFAULT_STOP_FACTOR);
		store.setDefault(PreferenceUtils.CEILING_PREFERENCE, true);
		store.setDefault(PreferenceUtils.SLACK_PREFERENCE, true);
	}

}
