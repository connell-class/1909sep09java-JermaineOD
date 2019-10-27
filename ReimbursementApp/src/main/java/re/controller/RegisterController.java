package re.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import re.model.User;
import re.service.Registration;


public class RegisterController {
	
	
	public static String RegisterUser(HttpServletRequest req) {
		String page = null;
		
		System.out.println(req.getRequestURI());
		Registration regis = new Registration();
		System.out.println(req.getMethod());
		//if (req.getMethod().toLowerCase().equals("post")) {
			System.out.println("3rd");
			
			String username = req.getParameter("username");
			String password = req.getParameter("user_password");
			String lastName = req.getParameter("last_name");
			String firstName = req.getParameter("first_name");
			String email = req.getParameter("user_email");
			int role = 3;
			//int role = Integer.parseInt(req.getParameter("role_id"));
			
			System.out.println(username);
	
		
		try {
			User us = new User(username,password,lastName,firstName,email,role);
			page =regis.RegisterUser(us);
			System.out.println(us.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//}
	
		return page;
	}
	
	public static String toRegister(HttpServletRequest req) {
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			System.out.println("toRegister");

			return "html/register.html";
		}
		return "html/register.html";
	}
	
	
	
	
}
