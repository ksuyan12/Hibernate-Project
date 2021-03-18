package com.subidha;

public class StoreData {    
public static void main(String[] args) {    
        
    
	 Address add = new Address();
	 add.setZipCode("3290");
	 add.setCity("birgunj"); 
	 
	 Laptop lap = new Laptop();
	 lap.setLname("hp");
	 
//	  EmployeeManagement.addEmployee("santosh", "Kc", add,  lap);
//	  EmployeeManagement.updateEmployee(2, "Santosh", "Chaudhary");
	  
//	  EmployeeManagement.deleteEmployee(151);
	 EmployeeManagement.readEmployee();
	 

    
}    
}