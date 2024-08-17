package com.soa.SpringDemo;

public class StandardHoreImplement implements StandardHour{

	@Override
	public String sayWelcome(Customer customer) {
		
		return "Welcome " + customer.getfName()+ " " + customer.getlName();
	}
	public void init()
	{
		System.out.println(" Initialize StandardHour");
	}
	
	public void destroy()
	{
		System.out.println("Treminate StandardHour");
	}

}
