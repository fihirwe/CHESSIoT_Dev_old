/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Author: Alessandro Zovi         azovi@math.unipd.it 		         --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.core.resourcelistener;

import java.util.Enumeration;
import java.util.Hashtable;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.osgi.framework.Bundle;

/**
 * This class manages the resorceListener extension-point.
 *
 */
public class ResourceSetListenerManager extends ResourceSetListenerExtra {
	
	/** The listener registry. */
	// list of of listener
	private Hashtable<String, ResourceSetListenerExtra> listenerRegistry;
	
	/** The modellistenerid extension id. */
	// extension point ID	
	private String MODELLISTENERID_EXTENSION_ID = "org.polarsys.chess.resourceListener";

	/** The name id. */
	private String NAME_ID = "name";

	/** The realization id. */
	private String REALIZATION_ID = "realization";

	/**
	 * Instantiates a new resource set listener manager.
	 *
	 * @param serviceRegistry the service registry
	 */
	public ResourceSetListenerManager(ServicesRegistry serviceRegistry) {
		listenerRegistry = new Hashtable<String, ResourceSetListenerExtra>();
		this.sr = serviceRegistry;
		initializeListenerList();
	}

	/**
	 * Load all registered listeners for the model.
	 */
	private void initializeListenerList() {
		
		// Reading data from plugins
		IConfigurationElement[] configElements = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						MODELLISTENERID_EXTENSION_ID);
		
		for (int i = 0; i < configElements.length; i++) 
		{			
			inializeOneRule(configElements[i]);
		}
	}

	/**
	 * Load one listener.
	 *
	 * @param element            the extension point
	 */
	private void inializeOneRule(IConfigurationElement element) {
		String listenerName = element.getAttribute(NAME_ID);
		try {			
			ResourceSetListenerExtra listener = (ResourceSetListenerExtra) createExtension(
					element, element.getAttribute(REALIZATION_ID));
			
			listener.setRegistry(sr);
			listenerRegistry.put(listenerName, listener);			
		} catch (Exception e) {
			System.err
					.println("- " + listenerName + " can not be loaded: " + e);
			e.printStackTrace();
		}

	}

	/**
	 * Load an instance of a class.
	 *
	 * @param element  the extension point
	 * @param classAttribute  the name of the class to load
	 * @return the loaded Class
	 * @throws Exception  if the class is not loaded
	 */
	private static Object createExtension(final IConfigurationElement element,
			final String classAttribute) throws Exception {
		try {
			
			Bundle extensionBundle = Platform.getBundle(element
					.getDeclaringExtension().getNamespaceIdentifier());
			
			Class<?> clazz = extensionBundle.loadClass(classAttribute);
			
			Object obj = clazz.newInstance();
			return obj;
			// return element.createExecutableExtension(classAttribute);
		} catch (Exception e) {
			throw new Exception("unable to create Extension" + e);
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String out = "ModelListener: \n";
		Enumeration<String> keyenum = listenerRegistry.keys();
		// we will call to string in each class
		while (keyenum.hasMoreElements()) {
			Object aKey = keyenum.nextElement();
			out = out + "- " + aKey.toString() + " ("
					+ listenerRegistry.get(aKey).toString() + ")\n";
		}
		return out;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.transaction.ResourceSetListenerImpl#transactionAboutToCommit(org.eclipse.emf.transaction.ResourceSetChangeEvent)
	 */
	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event)
			throws RollbackException {
		Enumeration<String> registrykeys = listenerRegistry.keys();
		// we will call to string in each class
		Command c = null;
		CompoundCommand command = new CompoundCommand();
		while (registrykeys.hasMoreElements()) 
		{
			String registryKey = registrykeys.nextElement();
			c = listenerRegistry.get(registryKey).transactionAboutToCommit(event);
			//System.out.println(c);
			if ( c != null )
			{
				command.append(c);
				break;
			}
		}

		//return c == null ? super.transactionAboutToCommit(event) : c;
		return command.isEmpty() ? super.transactionAboutToCommit(event) : command;

	}
}
