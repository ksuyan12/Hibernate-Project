package com.subidha;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeManagement {
	static Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
	static SessionFactory factory = con.buildSessionFactory();
	static Session session;  
	
	public static void addEmployee(Integer id, String fn, String ln, Address address) {	
		session = factory.openSession();
	  Transaction t = session.beginTransaction();  
	  Employee e = new Employee();
	  e.setFirstName(fn);
	  e.setLastName(ln);
	  e.setId(id);
	  e.setAddress(address);
	  session.save(e);
	  t.commit(); 
	    
	   session.close(); 
	}
	public static void readEmployee() {	
		session = factory.openSession();
		Transaction t = session.beginTransaction();  
	  List emps = session.createQuery("From Employee").list();
	  Iterator itr = emps.iterator();
	  while(itr.hasNext()){
		  Employee e = (Employee) itr.next();
		 System.out.println(e.getFirstName() + " " + e.getLastName());  
	  }	
	   t.commit(); 
	    
	   session.close(); 
	}
	public static void updateEmployee(Integer id, String fn, String ln) {	
		session = factory.openSession();
		Transaction t = session.beginTransaction();  
		Employee emp = session.get(Employee.class, id);
	  emp.setFirstName(fn);
	  emp.setLastName(ln);
	  session.update(emp);
		
	   t.commit(); 
	    
	   session.close(); 
	}
	public static void deleteEmployee(Integer id) {	
		session = factory.openSession();
		Transaction t = session.beginTransaction();  
		Employee emp = session.get(Employee.class, id);
	  
	   session.delete(emp);		
	   t.commit(); 
	    
	   session.close(); 
	}
	

}
