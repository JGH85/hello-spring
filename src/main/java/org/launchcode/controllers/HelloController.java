package org.launchcode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchcode.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloForm(){
		return "helloform";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(HttpServletRequest request, Model model) {	
		
		//get name parameter from request
		String name = request.getParameter("name");
		
		if (name == "" || name == null){
			name = "anonymous one";
		}
		String language="";
		language = request.getParameter("language");
		if (language=="" || language==null){
			language="Elvish";
		}
		
		String message = HelloMessage.getMessage(name, language);
		model.addAttribute("message", message);
		return "hello";
	}
}
