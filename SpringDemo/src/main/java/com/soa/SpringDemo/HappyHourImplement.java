package com.soa.SpringDemo;

public class HappyHourImplement implements HappyHour{

	@Override
	public String sayWelcome(Customer customer) {
		// TODO Auto-generated method stub
		return "Welcome  " + customer.getfName()+ " " + customer.getlName()+ " to Happy Hour ";
	}
	public void init()
	{
		System.out.println(" Initialize HappyHour");
	}
	
	public void destroy()
	{
		System.out.println("Treminate HappyHour");
	}

}
