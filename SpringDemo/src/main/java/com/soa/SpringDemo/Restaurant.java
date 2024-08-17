package com.soa.SpringDemo;
import java.time.LocalTime;
public class Restaurant {
	private Customer customer;
	private HappyHour happyHour;
	private StandardHour standardHour;
	
	public void init()
	{
		System.out.println(" Initialize Restaurant");
	}
	
	public void destroy()
	{
		System.out.println("Treminate Restaurant");
	}
	public Restaurant()
	{
		System.out.println(this);
	}
	public Restaurant(Customer customer, HappyHour happyHour, StandardHour standardHour) {
		//super();
		this.customer = customer;
		this.happyHour = happyHour;
		this.standardHour = standardHour;
	}

	public void welcomeCustome()
	{
		if(LocalTime.now().getHour()>=12 && LocalTime.now().getHour()<=17)
			{System.out.println(happyHour.sayWelcome(customer));    
			}
		else
			System.out.println(standardHour.sayWelcome(customer));
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public HappyHour getHappyHour() {
		return happyHour;
	}
	public void setHappyHour(HappyHour happyHour) {
		this.happyHour = happyHour;
	}
	public StandardHour getStandardHour() {
		return standardHour;
	}
	public void setStandardHour(StandardHour standardHour) {
		this.standardHour = standardHour;
	}
	
}
