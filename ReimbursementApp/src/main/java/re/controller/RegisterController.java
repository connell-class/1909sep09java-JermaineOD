package re.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import re.model.User;


public class RegisterController extends HttpServlet {
	
	
	public static String RegisterUser(HttpServletRequest req) {
			
		System.out.println(req.getRequestURI());
		
		System.out.println(req.getMethod());
		if (req.getMethod().toLowerCase().equals("post")) {
			System.out.println("3rd");
			
			String username = req.getParameter("username");
			String password = req.getParameter("user_password");
			String lastName = req.getParameter("last_name");
			String firstName = req.getParameter("first_name");
			String email = req.getParameter("user_email");
			int role = Integer.parseInt(req.getParameter("role_id"));
			
			User us = new User(username,password,lastName,firstName,email,role);
		
		
		
		
		
		
		
		
		
		
		
		
		

	
		}
		return "/html/register.html";
	}
}
