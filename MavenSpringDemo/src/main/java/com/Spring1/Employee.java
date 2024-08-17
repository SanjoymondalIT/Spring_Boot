package com.Spring1;

public class Employee 
{ 	private String fName;
	private int age;
	
	public Employee()
	{
		
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", age=" + age + "]";
	}



}
