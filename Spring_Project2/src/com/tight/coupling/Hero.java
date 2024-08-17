package com.tight.coupling;

public class Hero implements Bike{

	@Override
	public void BikeName() {
		System.out.println("from Hero Family");
		
	}

	@Override
	public void BikePrice() {
System.out.println("Costly");
		
	}

}
