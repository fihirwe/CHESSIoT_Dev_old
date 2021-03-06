/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.core.internal.extensionpoint;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.Activator;
import org.polarsys.chess.core.extensionpoint.IAddProfile;


/**
 * The Class AddProfileHandler.
 */
public class AddProfileHandler {

	  /** The Constant ADDPROFILE_ID. */
  	private static final String ADDPROFILE_ID = 
	      "org.polarsys.chess.addprofile";
	  
	  /**
  	 * Execute add profile.
  	 *
  	 * @param registry the registry
  	 * @param owner the owner
  	 * @param resourceSet the resource set
  	 */
  	public void executeAddProfile(IExtensionRegistry registry, Model owner, ResourceSet resourceSet) {
		  evaluateAddProfile(registry, owner, resourceSet);
	  }
	  
	  /**
  	 * Evaluate add profile.
  	 *
  	 * @param registry the registry
  	 * @param owner the owner
  	 * @param resourceSet the resource set
  	 */
  	private void evaluateAddProfile(IExtensionRegistry registry, Model owner, ResourceSet resourceSet) {
	    IConfigurationElement[] config =
	        registry.getConfigurationElementsFor(ADDPROFILE_ID);
	    try {
	      for (IConfigurationElement e : config) {
	        System.out.println("Evaluating extension");
	        final Object o =
	            e.createExecutableExtension("class");
	        if (o instanceof IAddProfile) {
	        	addProfile(o, owner, resourceSet);
	        }
	      }
	    } catch (CoreException ex) {
	      System.out.println(ex.getMessage());
	      Activator.error("evaluateAddProfile error", ex);
	    }
	  }

	  /**
  	 * Adds the profile.
  	 *
  	 * @param o the o
  	 * @param owner the owner
  	 * @param resourceSet the resource set
  	 */
  	private void addProfile(final Object o, final Model owner, final ResourceSet resourceSet) {
	    ISafeRunnable runnable = new ISafeRunnable() {
	      @Override
	      public void handleException(Throwable e) {
	        System.out.println("Exception in client");
	        Activator.error("Exception in client", e);
	      }

	      @Override
	      public void run() throws Exception {
	    	((IAddProfile) o).addProfile(owner, resourceSet);
	       
	      }
	    };
	    SafeRunner.run(runnable);
	  }
	  
	  /**
  	 * Execute load profile.
  	 *
  	 * @param registry the registry
  	 * @param resourceSet the resource set
  	 */
  	public void executeLoadProfile(IExtensionRegistry registry, ResourceSet resourceSet) {
		  evaluateLoadProfile(registry, resourceSet);
	  }
	  
	  /**
  	 * Evaluate load profile.
  	 *
  	 * @param registry the registry
  	 * @param resourceSet the resource set
  	 */
  	private void evaluateLoadProfile(IExtensionRegistry registry, ResourceSet resourceSet) {
  		
  		
	    IConfigurationElement[] config =
	        registry.getConfigurationElementsFor(ADDPROFILE_ID);
	    try {
	      for (IConfigurationElement e : config) {
	    	  System.out.println("Evaluating extension");
	        final Object o =
	            e.createExecutableExtension("class");
	        if (o instanceof IAddProfile) {
	        	loadProfile(o, resourceSet);
	        }
	      }
	    } catch (CoreException ex) {
	      System.out.println(ex.getMessage());
	      Activator.error("EvaluateLoadProfile error", ex);
	    }
	  }
	  
	  /**
  	 * Load profile.
  	 *
  	 * @param o the o
  	 * @param resourceSet the resource set
  	 */
  	private void loadProfile(final Object o, final ResourceSet resourceSet) {
		    ISafeRunnable runnable = new ISafeRunnable() {
		      @Override
		      public void handleException(Throwable e) {
		        System.out.println("Exception in client");
		        Activator.error("Exception in client", e);
		      }

		      @Override
		      public void run() throws Exception {    	  
		    	  ((IAddProfile) o).loadProfile(resourceSet);
		      }
		    };
		    SafeRunner.run(runnable);
		  }
	  
	} 
	
