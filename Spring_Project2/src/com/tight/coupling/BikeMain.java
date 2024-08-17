package com.tight.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Bike b1= (Bike) context.getBean("honda");
		b1.BikeName();
		Bike b2= (Bike) context.getBean("hero");
		b2.BikeName();
		
		Bike bike1= new Hero();
		Bike bike2= new Honda();
		Rider Ride1= new Rider();
		Ride1.setRider(bike2);
		Ride1.RiderBikeName();
		Rider Ride2= new Rider();
		Ride2.setRider(bike1);
		Ride2.RiderBikeName();
		//Rider ride= new Rider();
		//ride.RiderBikeName();

	}

}
