package com.saanj.test;

public class Airtel implements Sim {

	@Override
	public void call() {
		System.out.println("Calling from  Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Data from Airtel");
		
	}

}
