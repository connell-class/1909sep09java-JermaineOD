package Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import Service.userService;

public class loginController  {
	public static String login(HttpServletRequest req) throws ClassNotFoundException  {
		
		
		String username= req.getParameter("username");
		String password=req.getParameter("password");
		
		userService us = new userService();
		us.CheckLogin(username, password);
		
		if(username.equals("re")) {
			
			System.out.println("error");
		}else {
			System.out.println(username);
			System.out.println("thii is a test in the loginn controll calsss"+username);
			
		}
		
//		ObjectMapper ob = new ObjectMapper();
			if(us.CheckLogin(username, password).equals("/html/index.html")){
				System.out.println("Login failed");
			}else {
				HttpSession session = req.getSession();
	            session.setAttribute("username", username);
	            session.setAttribute("password", password);
				
			}	
		
		return us.CheckLogin(username, password);
	}
	
	

}
