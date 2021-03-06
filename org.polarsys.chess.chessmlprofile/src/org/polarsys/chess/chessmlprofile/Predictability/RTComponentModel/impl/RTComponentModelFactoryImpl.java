/*****************************************************************************
 * Copyright (c) 2011 - 2014 University of Padova, Intecs
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 *
 *****************************************************************************/
package org.polarsys.chess.chessmlprofile.Predictability.RTComponentModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.chess.chessmlprofile.Predictability.RTComponentModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RTComponentModelFactoryImpl extends EFactoryImpl implements RTComponentModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RTComponentModelFactory init() {
		try {
			RTComponentModelFactory theRTComponentModelFactory = (RTComponentModelFactory)EPackage.Registry.INSTANCE.getEFactory(RTComponentModelPackage.eNS_URI);
			if (theRTComponentModelFactory != null) {
				return theRTComponentModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RTComponentModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTComponentModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RTComponentModelPackage.CH_RT_SPECIFICATION: return createCHRtSpecification();
			case RTComponentModelPackage.CH_RT_PORT_SLOT: return createCHRtPortSlot();
			case RTComponentModelPackage.RUN_TIME_SUPPORT: return createRunTimeSupport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHRtPortSlot createCHRtPortSlot() {
		CHRtPortSlotImpl chRtPortSlot = new CHRtPortSlotImpl();
		return chRtPortSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunTimeSupport createRunTimeSupport() {
		RunTimeSupportImpl runTimeSupport = new RunTimeSupportImpl();
		return runTimeSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHRtSpecification createCHRtSpecification() {
		CHRtSpecificationImpl chRtSpecification = new CHRtSpecificationImpl();
		return chRtSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTComponentModelPackage getRTComponentModelPackage() {
		return (RTComponentModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RTComponentModelPackage getPackage() {
		return RTComponentModelPackage.eINSTANCE;
	}

} //RTComponentModelFactoryImpl
