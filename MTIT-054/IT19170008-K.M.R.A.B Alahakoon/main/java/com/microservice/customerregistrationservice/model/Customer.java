package com.microservice.customerregistrationservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
 
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long ID;
  
  @Column(name="name")
  private String name;
  
  @Column(name="age")
  private int age;
  
  @Column(name="gender")
  private String gender;
  
  public Customer() {
	super();
}
public Customer(long id, String name, int age, String gender) {
	super();
	ID = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public long getID() {
	return ID;
}
public void setID(long iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
