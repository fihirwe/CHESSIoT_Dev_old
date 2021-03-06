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

package org.polarsys.chess.core.internal.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;

/**
 * This class is an extension of the MDT-Papyrus services registry.
 * It allows to add CHESS services at runtime and thus not statically via extension points like
 * the standard MDT-Papyrus services registry.
 * 
 * CHESS plugins which utilise this class have a seamless access to CHESS and MDT-Papyrus services.
 * 
 * @author Alessandro Zovi
 *
 */
//TODO remove, it is not used anymore
public class MainRegistry {
	
	/** The services registry. */
	public ServicesRegistry servicesRegistry;
	
	/** The map. */
	private Map<String, Object> map =  new HashMap<String, Object>();
	
	/**
	 * Instantiates a new main registry.
	 *
	 * @param serviceRegistry the service registry
	 */
	public MainRegistry(ServicesRegistry serviceRegistry) {
		this.servicesRegistry = serviceRegistry;
	}

	/**
	 * Adds the.
	 *
	 * @param key the key
	 * @param serviceInstance the service instance
	 */
	public void add(Class<?> key, Object serviceInstance){
		map.put(key.getName(), serviceInstance);
	}
	
	/**
	 * Gets the service.
	 *
	 * @param <S> the generic type
	 * @param key the key
	 * @return the service
	 */
	public <S> S getService(Class<S> key){
		S s = null;
		try {
			s = servicesRegistry.getService(key);
		} catch (ServiceException e) {
			s = (S) map.get(key.getName());
		}
		return s;
	}
}
