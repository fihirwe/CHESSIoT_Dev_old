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

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import it.unipd.chess.m2m.marte2mast.Activator;

//Author Alessandro Zovi
public class Marte2mastPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public Marte2mastPreferencePage() {
		super(GRID);
	}
	
	
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Marte2mast preference page");
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(PreferenceUtils.USE_GMAST_PREFERENCE,
				"&Use the external tool 'gmast'", getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(PreferenceUtils.TOOLS_PREFERENCE,
				"Analysis tool", 1,
				new String[][] {
				   { "Default", PreferenceUtils.DEFAULT_TOOLS },
				   //{ "Offset based optimized", "offset_based_optimized" },
				   { "Offset based with precedence", "offset_based_approx_w_pr"},
				   { "Offset based", "offset_based" },
				   { "Holistic", "holistic" },
				   
				   { "EDF within priorities", "edf_within_priorities" },
				   { "EDF monoprocessor", "edf_monoprocessor" },
				   
				   { "Varying priorities", "varying_priorities" },
				   { "Classic RM ", "classic_rm " },
				   { "Parse", "parse" },
				   
				   }, getFieldEditorParent()));
		
		addField(new BooleanFieldEditor(PreferenceUtils.VERBOSE_PREFERENCE, "Verbose", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceUtils.LOCAL_EDF_PREFERENCE, "Local EDF", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceUtils.CEILING_PREFERENCE, "Calculate Ceiling and Levels", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceUtils.SLACK_PREFERENCE, "Calculate Slacks", BooleanFieldEditor.SEPARATE_LABEL, getFieldEditorParent()));
		
		addField(new RadioGroupFieldEditor(PreferenceUtils.TECNIQUE_PREFERENCE,
				"Priority parameters assignement tecnique", 1,
				new String[][] {
				   { "Default", PreferenceUtils.DEFAULT_TECNIQUE },
				   { "HOSPA", "hospa" },
				   { "PD", "pd" },
				   { "NPD", "npd" },
				   { "Annealing", "annealing" },				   
				   { "Monoprocessor", "monoprocessor" },				   		   
				   }, getFieldEditorParent()));

		addField(new IntegerFieldEditor(PreferenceUtils.STOP_FACTOR_PREFERENCE, "Stop factor ('0' means 'do not consider the value')", getFieldEditorParent()));
		
		addField(new StringFieldEditor(PreferenceUtils.OPERATION_SLACK_PREFERENCE, "Slack for operation", getFieldEditorParent()));
		
//		addField(new FileFieldEditor(
//				PreferenceUtils.FILE_NAME_PREFERENCE,
//				"Description output:",
//				true,
//		 		getFieldEditorParent()));
	}
}