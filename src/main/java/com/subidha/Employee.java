package com.subidha;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@SequenceGenerator(name="eseq", initialValue=100, allocationSize = 1)
public class Employee {  
@Id	
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eseq")
private int id; 
private String firstName,lastName;  

@Autowired
private Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@OneToMany
private Laptop laptop;

public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
  
}
