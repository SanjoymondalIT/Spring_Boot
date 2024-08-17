package com.soa.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	int stdid;
	String name;
	@Autowired
	@Qualifier("adrs1")
	StudentAddress add;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentAddress getAdd() {
		return add;
	}
	public void setAdd(StudentAddress add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", add=" + add + "]";
	}
	

}
