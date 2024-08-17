package com.soa.SpringDemo;

public class Customer {
	private String fName, lName;
	private int age;
	
	public void init()
	{
		System.out.println(" Initialize Customer");
	}
	
	public void destroy()
	{
		System.out.println("Treminate Customer");
	}
	
	
	public Customer ()
	{	System.out.println(this);
	}

	
	public Customer(String fName, String lName, int age) {
		//super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}


	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
