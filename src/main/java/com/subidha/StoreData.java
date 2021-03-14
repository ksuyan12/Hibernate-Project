package com.subidha;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;  
  
    
public class StoreData {    
public static void main(String[] args) {    
        
    
//Employee e1=new Employee();    
//e1.setId(115);    
//e1.setFirstName("Pratap");    
//e1.setLastName("Kc");    
	 //Create typesafe ServiceRegistry object    
 //   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
 // EmployeeManagement.updateEmployee(113, "Santosh", "Chaudhary");   
	
  EmployeeManagement.deleteEmployee(113);   
	
    
    
    
}    
}