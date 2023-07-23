package com.listinterface;

public class Employee {
	int id;
	public String name;
	String salary;
	
	public Employee(int id,String name,String salary) {
		
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	public Employee(int id2, String name2, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
