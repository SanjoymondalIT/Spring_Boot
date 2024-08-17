package com.saanj.test;

public class Vodafone implements Sim{

	@Override
	public void call() {
		System.out.println("Calling from  Vodafone");
		
	}

	@Override
	public void data() {
		System.out.println("Data from Vodafone");
		
	}

}
