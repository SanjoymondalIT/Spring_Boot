package com.soa.SpringAOP;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BankSbi {

	private String acc= "sbi1234";
	private int amt= 1000;
	
	public int deposit(String acc, int amt) {
		
		System.out.println(" Deposite method of bank class  gets called");
		if(acc.equals(this.acc))
		{
			this.amt+= amt;
			return this.amt;
			
		}
		
		return amt;	
	}
	
	
	
			
}
