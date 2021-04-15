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

import it.unipd.chess.m2m.marte2mast.Activator;

//Author Alessandro Zovi
public class PreferenceUtils {
	public static String getCommandLineOptions() {
		StringBuilder s = new StringBuilder();
		boolean space = false;
		if (Activator.getDefault().getPreferenceStore().getBoolean(VERBOSE_PREFERENCE)){
			s.append(VERBOSE_PREFERENCE);
			space = true;
		}
		if (Activator.getDefault().getPreferenceStore().getBoolean(LOCAL_EDF_PREFERENCE)){
			if (space)
				s.append(' ');
			s.append(LOCAL_EDF_PREFERENCE);
			
			space = true;
		}
		if (Activator.getDefault().getPreferenceStore().getBoolean(CEILING_PREFERENCE)){
			if (space)
				s.append(' ');
			s.append(CEILING_PREFERENCE);
			space = true;
		}
		if (Activator.getDefault().getPreferenceStore().getBoolean(SLACK_PREFERENCE)){
			if (space)
				s.append(' ');
			s.append(SLACK_PREFERENCE);
			space = true;
		}
		
		if (!Activator.getDefault().getPreferenceStore().getString(TECNIQUE_PREFERENCE).equals(DEFAULT_TOOLS)){
			if (space)
				s.append(' ');
			s.append(ASSIGN_PARAMETERS_PREFERENCE).append(' ').append(TECNIQUE_PREFERENCE).append(' ').append(Activator.getDefault().getPreferenceStore().getString(TECNIQUE_PREFERENCE));
			space = true;
		}
		
		if (Activator.getDefault().getPreferenceStore().getInt(STOP_FACTOR_PREFERENCE) != DEFAULT_STOP_FACTOR){
			if (space)
				s.append(' ');
			s.append(STOP_FACTOR_PREFERENCE).append(' ').append(Activator.getDefault().getPreferenceStore().getInt(STOP_FACTOR_PREFERENCE));
			space = true;
		}
		String op = Activator.getDefault().getPreferenceStore().getString(OPERATION_SLACK_PREFERENCE);
		if ( op != null && !(op=op.trim()).isEmpty()){
			if (space)
				s.append(' ');
			s.append(OPERATION_SLACK_PREFERENCE).append(' ').append(op);
			space = true;
		}
		
		return s.toString();
	}
	
	public static String getTools() {
		return Activator.getDefault().getPreferenceStore().getString(TOOLS_PREFERENCE);
	}
	
	public static boolean useGMAST() {
		return Activator.getDefault().getPreferenceStore().getBoolean(PreferenceUtils.USE_GMAST_PREFERENCE);
	}
	

	//The identifiers for the preferences	
	public static final String USE_GMAST_PREFERENCE = "commandline";
	//The default values for the preferences
	public static final String DEFAULT_USE_GMAST = "false";


	public static final String TOOLS_PREFERENCE = "tools";
	public static final String DEFAULT_TOOLS = "default";
	public static final String DEFAULT_TECNIQUE = "default";
	public static final int DEFAULT_STOP_FACTOR = 0;


	public static final String VERBOSE_PREFERENCE = "-v";
	public static final String LOCAL_EDF_PREFERENCE = "-l";
	public static final String CEILING_PREFERENCE = "-c";
	public static final String ASSIGN_PARAMETERS_PREFERENCE = "-p";
	public static final String TECNIQUE_PREFERENCE = "-t"; //hospa pd npd annealing monoprocessor
	public static final String STOP_FACTOR_PREFERENCE = "-f"; //integer number
	public static final String SLACK_PREFERENCE = "-s";
	public static final String OPERATION_SLACK_PREFERENCE = "-os";
	public static final String FILE_NAME_PREFERENCE = "-d";
}
