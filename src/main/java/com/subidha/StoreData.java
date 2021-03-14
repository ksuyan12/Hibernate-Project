package com.subidha;

public class StoreData {    
public static void main(String[] args) {    
        
    
//Employee e1=new Employee();    
//e1.setId(115);    
//e1.setFirstName("Pratap");    
//e1.setLastName("Kc");    
	 //Create typesafe ServiceRegistry object    
 //   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
 // EmployeeManagement.updateEmployee(113, "Santosh", "Chaudhary");
	 Address add = new Address();
	add.setZipCode("1000");
	 add.setCity("butwal");
	  EmployeeManagement.addEmployee(103, "Rachna", "kc", add);

    
}    
}