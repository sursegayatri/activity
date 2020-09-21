package com.db.demo;


public class Employee {
	
	
    String eid;
	
	 String name;
	 double salary;
	
	public Employee( String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee ["+" name=" + name + ", salary=" + salary + "]";
	}
}
