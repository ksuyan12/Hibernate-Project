package com.subidha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeManagement {
	static Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
	static SessionFactory factory = con.buildSessionFactory();
	static Session session;  
	public static void updateEmployee(Integer id, String fn, String ln) {	
		session = factory.openSession();
		Transaction t = session.beginTransaction();  
		Employee emp = (Employee) session.get(Employee.class, id);
	  emp.setFirstName(fn);
	  emp.setLastName(ln);
	  session.update(emp);
		
	   t.commit(); 
	    
	   session.close(); 
	}
	public static void deleteEmployee(Integer id) {	
		session = factory.openSession();
		Transaction t = session.beginTransaction();  
		Employee emp = (Employee) session.get(Employee.class, id);
	  
	   session.delete(emp);		
	   t.commit(); 
	    
	   session.close(); 
	}
	

}
