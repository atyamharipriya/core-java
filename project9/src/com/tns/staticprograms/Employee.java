package com.tns.staticprograms;

public class Employee {
  private String name;
  private int id;
  
  static String companyName="Tns";
   
  
public Employee() {
	super();
}

public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ",company="+companyName+"]";
}
  
  
}
