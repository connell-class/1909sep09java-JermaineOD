package com.sleep;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sleep.model.Book;

public class Driver {

	public static void main(String[] args) {
		Session sess = new Configuration().configure
				("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Book b = new Book();
		System.out.println("Zoid is the best inna real life!");
		b.setHaspictures(true);
		b.setTitle("Zoid is the Wickidest");
		Transaction t = sess.beginTransaction();
		sess.persist(b);
		t.commit();
		
		
	}
}
