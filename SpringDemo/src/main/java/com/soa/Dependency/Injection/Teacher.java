package com.soa.Dependency.Injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	int EmpID;
	String Name;
	@Autowired
	Address add;
	
	public Teacher()
	{
		
	}
	public Teacher(int empID, String name, Address add) {
		
		EmpID = empID;
		Name = name;
		this.add = add;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Teacher [EmpID=" + EmpID + ", Name=" + Name + ", address=" + add + "]";
	}
	

}
