/**
 */
package org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Message;

import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.CHESSIoTSoftwarePackage;
import org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.Payload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl#getPayloadName <em>Payload Name</em>}</li>
 *   <li>{@link org.polarsys.chess.iot.profile.CHESSIoT.CHESSIoTSoftware.impl.PayloadImpl#getBase_Comment <em>Base Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayloadImpl extends MinimalEObjectImpl.Container implements Payload {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The default value of the '{@link #getPayloadName() <em>Payload Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYLOAD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayloadName() <em>Payload Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadName()
	 * @generated
	 * @ordered
	 */
	protected String payloadName = PAYLOAD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Comment() <em>Base Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Comment()
	 * @generated
	 * @ordered
	 */
	protected Comment base_Comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CHESSIoTSoftwarePackage.Literals.PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.PAYLOAD__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.PAYLOAD__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.PAYLOAD__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPayloadName() {
		return payloadName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadName(String newPayloadName) {
		String oldPayloadName = payloadName;
		payloadName = newPayloadName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.PAYLOAD__PAYLOAD_NAME, oldPayloadName, payloadName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getBase_Comment() {
		if (base_Comment != null && base_Comment.eIsProxy()) {
			InternalEObject oldBase_Comment = (InternalEObject)base_Comment;
			base_Comment = (Comment)eResolveProxy(oldBase_Comment);
			if (base_Comment != oldBase_Comment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CHESSIoTSoftwarePackage.PAYLOAD__BASE_COMMENT, oldBase_Comment, base_Comment));
			}
		}
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetBase_Comment() {
		return base_Comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Comment(Comment newBase_Comment) {
		Comment oldBase_Comment = base_Comment;
		base_Comment = newBase_Comment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHESSIoTSoftwarePackage.PAYLOAD__BASE_COMMENT, oldBase_Comment, base_Comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.PAYLOAD__CONTENT:
				return getContent();
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case CHESSIoTSoftwarePackage.PAYLOAD__PAYLOAD_NAME:
				return getPayloadName();
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_COMMENT:
				if (resolve) return getBase_Comment();
				return basicGetBase_Comment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.PAYLOAD__CONTENT:
				setContent((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case CHESSIoTSoftwarePackage.PAYLOAD__PAYLOAD_NAME:
				setPayloadName((String)newValue);
				return;
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_COMMENT:
				setBase_Comment((Comment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.PAYLOAD__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case CHESSIoTSoftwarePackage.PAYLOAD__PAYLOAD_NAME:
				setPayloadName(PAYLOAD_NAME_EDEFAULT);
				return;
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_COMMENT:
				setBase_Comment((Comment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CHESSIoTSoftwarePackage.PAYLOAD__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_MESSAGE:
				return base_Message != null;
			case CHESSIoTSoftwarePackage.PAYLOAD__PAYLOAD_NAME:
				return PAYLOAD_NAME_EDEFAULT == null ? payloadName != null : !PAYLOAD_NAME_EDEFAULT.equals(payloadName);
			case CHESSIoTSoftwarePackage.PAYLOAD__BASE_COMMENT:
				return base_Comment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Content: ");
		result.append(content);
		result.append(", payloadName: ");
		result.append(payloadName);
		result.append(')');
		return result.toString();
	}

} //PayloadImpl
