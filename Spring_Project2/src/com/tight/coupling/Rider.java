package com.tight.coupling;

public class Rider {
	Bike bike1;
	Bike bike2;
	Rider()
	{
		bike1= new Honda();
	}

	void RiderBikeName()
	{
		bike1.BikeName();
	}
	void setRider(Bike bike)
	{
		this.bike1=bike;
	}
}
