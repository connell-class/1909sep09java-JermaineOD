package com.driver;

import java.util.ArrayList;
import java.util.List;

import re.controller.SubmitReimbursement;
import re.dao.ReimbursementDao;
import re.dao.UserDao;
import re.model.Reimbursement;
import re.model.User;
import re.service.AuthenticateUser;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException {
		AuthenticateUser au = new AuthenticateUser();
		
		UserDao ud = new UserDao();
		//System.out.println(ud.getByLogin("ddfexe01"));
		ReimbursementDao rd = new ReimbursementDao();
		Reimbursement re =new Reimbursement(100,null,0,"I really needed it", 4,10,3); 
		SubmitReimbursement sub = new SubmitReimbursement();
		rd.sumbitReimburse(re);
		System.out.println(re);
		List<Reimbursement> rel = rd.getByAll();
		System.out.println(rd.getById(20));
		
		System.out.println(rel.toString());
		//int index = ud.number(4);
			System.out.println(ud.getByLogin("mitexe02","?").get(0).getLast_name());
			//System.out.println(ud.getById(3));
			//System.out.println(ud.getAllUser());
			//System.out.println(ud.getByUsername("a-kep001"));
			//System.out.println(rd.getById(20));
			//System.out.println(rd.getByAll());
			//System.out.println(rd.toString());
			//System.out.println(r.toString());
		List<User> ls = new ArrayList<>();
		//System.out.println(au.verifyUser("JODceo01", "?"));
		//System.out.println(ls.get(0).getUser_password());
}
}
