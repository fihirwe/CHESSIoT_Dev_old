package org.polarsys.chess.contracts.profile.chesscontract.util;

import org.eclipse.papyrus.uml.tools.utils.UMLUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

public class StereotypeUtil {

	private static Profile chessProfile;
	private static Profile chessContractProfile;
	private static Profile sysMLProfile;
	private static Profile marteProfile;
	private static int modelHashCode;
	
	public static Stereotype getCHESSStereotype(String name, Element element){

		if (modelHashCode == 0) {
			modelHashCode = element.getModel().hashCode();
		}
		
		//String projectName = element.getModel().eResource().getURI().segment(1);

		String[] names = name.split("::");
				
		if(!names[0].equals("CHESS")){
			return null;
		}
		
		//if (chessProfile == null || (modelHashCode != element.getModel().hashCode())) {
		//	modelHashCode = element.getModel().hashCode();
			chessProfile = element.getModel().getAppliedProfile(names[0]);			
		//}

		return getStereotype(names,chessProfile);
	}

	public static Stereotype getCHESSContractStereotype(String name, Element element){

		if (modelHashCode == 0) {
			modelHashCode = element.getModel().hashCode();
		}
		
		//String projectName = element.getModel().eResource().getURI().segment(1);

		String[] names = name.split("::");
		
		if(!names[0].equals("CHESSContract")){
			return null;
		}
		
		//if (chessContractProfile == null || (modelHashCode != element.getModel().hashCode())) {
		//	modelHashCode = element.getModel().hashCode();
			chessContractProfile = element.getModel().getAppliedProfile(names[0]);
		//}

		return getStereotype(names,chessContractProfile);
	}
		
	public static Stereotype getMarteStereotype(String name, Element element){

		if (modelHashCode == 0) {
			modelHashCode = element.getModel().hashCode();
		}
		
		//String projectName = element.getModel().eResource().getURI().segment(1);

		String[] names = name.split("::");
		
		if(!names[0].equals("MARTE")){
			return null;
		}

		return UMLUtil.findStereotype(element.getModel(), name);
		
	/*	if (marteProfile == null || (modelHashCode != element.getModel().hashCode())) {
			modelHashCode = element.getModel().hashCode();
			marteProfile = element.getModel().getAppliedProfile(names[0]);
		}

		for(Profile p : element.getModel().getAppliedProfiles()){
			System.out.println("profile: "+p);
		}
		
		System.out.println("marte profile: "+marteProfile);
		
		return getStereotype(names,marteProfile);*/
	}
		
	public static Stereotype getSysMLStereotype(String name, Element element){

		if (modelHashCode == 0) {
			modelHashCode = element.getModel().hashCode();
		}
		
		//String projectName = element.getModel().eResource().getURI().segment(1);

		String[] names = name.split("::");
		
		if(!names[0].equals("SysML")){
			return null;
		}
		
		//if (sysMLProfile == null || (modelHashCode != element.getModel().hashCode())) {
		//	modelHashCode = element.getModel().hashCode();
			sysMLProfile = element.getModel().getAppliedProfile(names[0]);
		//}

		return getStereotype(names,sysMLProfile);
	}
	
	private static Stereotype getStereotype(String[] names, Profile profile){
		org.eclipse.uml2.uml.Package currPackage = profile;
		
		if(names.length>2){
			for(int i = 1; i<names.length-1;i++){
				currPackage=currPackage.getNestedPackage(names[i]);
			}
		}		
		
		final String extrName = names[names.length-1];
		final Stereotype stereotype = currPackage.getOwnedStereotype(extrName);
		if (stereotype == null) {
			return null;
		}
		return stereotype;
	}
	
}
