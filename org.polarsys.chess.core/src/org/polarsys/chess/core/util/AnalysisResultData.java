/*******************************************************************************
 *
 * Copyright (c) 2015 Intecs SpA 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Laura Baracchi  laura.baracchi@intecs.it  - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.polarsys.chess.core.util;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Operation;

/**
 * Used to save and display the Schedulability Analysis result data.
 *
 * @author laura
 */
public class AnalysisResultData {
		
		/** The inst spec. */
		public InstanceSpecification instSpec = null;
		
		/** The ctx OP. */
		public Operation ctxOP = null;
		
		/** The instance. */
		public String instance ="";
		
		/** The context. */
		public String context ="";
		
		/** The arrival. */
		public String arrival ="";
		
		/** The local WCET. */
		public String localWCET="";
		
		/** The rldl. */
		public String rldl ="";
		
		/** The priority. */
		public String priority="";
		
		/** The resp T. */
		public String respT ="";
		
		/** The block T. */
		public String blockT="";
		
		/** The is sched. */
		public String isSched = "";
	}
