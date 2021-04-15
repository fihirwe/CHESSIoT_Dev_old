package org.polarsys.chess.iot.generator.services;

import java.util.List;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

public class UML2Services {
	public boolean hasStereotype(Class clazz, String stereotypeName) {
		List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
		if(stereotypes.size()==0){
//			System.err.println("NOTHING GENERATED FOR "+clazz.getName());
//			System.out.println(stereotypes.size());
			return false;
		}
		else{
			for (Stereotype stereotype : stereotypes) {
				if (stereotype.getName().equals(stereotypeName)) {
					return true;
				}
			}
		}


		return false;
	}

	public String getMillisecond(){
		Date date = new Date();
		String time = new SimpleDateFormat("-yyyy-MM-dd-HH-mm-ss", Locale.ENGLISH).format(date);
		return String.valueOf(time);

	}
	
	public String printMe(String a){
		System.err.println("here "+a);
		return "Success";
	}
	
	
}