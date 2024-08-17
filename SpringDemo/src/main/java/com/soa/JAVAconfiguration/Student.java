package com.soa.JAVAconfiguration;

public class Student {
	String name;
	int roll;
	String Dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", Dept=" + Dept + "]";
	}
	
	

}
