package com.soa.autowired;

public class StudentAddress {
	String city;
	int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "StudentAddress [city=" + city + ", pin=" + pin + "]";
	}
	
	

}
