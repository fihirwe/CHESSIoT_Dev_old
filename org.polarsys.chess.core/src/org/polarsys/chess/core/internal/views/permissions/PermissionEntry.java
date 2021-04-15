/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
--                                                                   --
--                    Copyright (C) 2016                             --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Authors: Alessandro Zovi          azovi@math.unipd.it             --
--          Laura Baracchi           laura.baracchi@intecs.it        --
--          Stefano Puri             stefano.puri@intecs.it          --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.core.internal.views.permissions;

import org.polarsys.chess.chessmlprofile.Core.Domain;


/**
 * The Class PermissionEntry.
 *
 * @author Alessandro Zovi
 */
public class PermissionEntry {
	
	/** The Constant WRITABLE. */
	public static final byte WRITABLE = 0;
	
	/** The Constant OWNER. */
	public static final byte OWNER = 1;
	
	/** The Constant VISIBLE. */
	public static final byte VISIBLE = 2;
	
	/** The Constant DOMAIN. */
	public static final byte DOMAIN = 3;
	
	/** The domain atr. */
	public static String OWNER_ATR = "owner", VISIBLE_ATR = "visible", WRITE_ATR = "write", DOMAIN_ATR = "domain";
	
	/** The id. */
	private EntryId id;
	
	/** The owner. */
	private boolean owner;
	
	/** The visible. */
	private boolean visible;
	
	/** The write. */
	private boolean write;
	
	/** The domain. */
	private Domain domain;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public EntryId getId() {
		return id;
	}

	/**
	 * Check permission.
	 *
	 * @param permission the permission
	 * @return true, if successful
	 */
	public boolean checkPermission(byte permission){
		if(permission == OWNER)
			return owner;
		if(permission == WRITABLE)
			return write;
		if(permission == VISIBLE)
			return visible;
		return false;
	}
	
	/**
	 * Gets the domain.
	 *
	 * @return the domain
	 */
	public Domain getDomain() {
		return domain;
	}
	
	/**
	 * Checks if is owner.
	 *
	 * @return true, if is owner
	 */
	public boolean isOwner() {
		return owner;
	}

	/**
	 * Checks if is writeable.
	 *
	 * @return true, if is writeable
	 */
	public boolean isWriteable() {
		return write;
	}
	
	/**
	 * Checks if is visible.
	 *
	 * @return true, if is visible
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * Instantiates a new permission entry.
	 *
	 * @param id the id
	 * @param owner the owner
	 * @param write the write
	 * @param visible the visible
	 * @param domain the domain
	 */
	public PermissionEntry(EntryId id, boolean owner, boolean write, boolean visible, Domain domain) {
		this.id = id;
		this.owner = owner;
		this.write = write;
		this.visible = visible;
		this.domain = domain;
	}
	
	/**
	 * Match.
	 *
	 * @param id the id
	 * @return the permission entry
	 */
	public PermissionEntry match(EntryId id){
		if (this.id.match(id))
			return this;
		return null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer(30);
		s.append(id.toString());
		s.append('|');
		
		s.append(owner? 'o' : '-');
		s.append(write? "rw" : "r-");
		s.append(visible? 'v' : '-');	
		return s.toString();
	}
	
	/**
	 * Gets the permission type.
	 *
	 * @param permission the permission
	 * @return the permission type
	 */
	public static String getPermissionType(byte permission) {
		switch (permission) {
		case OWNER:
			return "OWNER";
		case VISIBLE:
			return "VISIBLE";
		case WRITABLE:
			return "WRITE";
		case DOMAIN:
			return "DOMAIN";
		default:
			return "";
		}
	}
}
