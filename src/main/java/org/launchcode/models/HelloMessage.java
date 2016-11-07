package org.launchcode.models;

public class HelloMessage {

	public static String getMessage(String name, String language){
		String message= "";
		if (language.equals("English")){
			message = "Hello, " + name + "!";
		} else if (language.equals("Latin")){
			message = "Salve, " + name + "!";
		} else if (language.equals("German")){
			message = "Hallo, " + name + "!";
		} else if (language.equals("Spanish")){
			message = "¡Hola, " + name + "!";
		} else if (language.equals("French")){
			message = "Salut, " + name + "!";
		} else if (language.equals("Italian")){
			message = "Ciao, " + name + "!";
		} else if (language.equals("Elvish")){
			message = "A " + name + ", gi suilon!";
		} 
		
		
		return message;
	}
}
