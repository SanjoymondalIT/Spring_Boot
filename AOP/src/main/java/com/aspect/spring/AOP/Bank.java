package com.aspect.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class Bank {
	
	void deposite()
	{
		System.out.println("Amount Deposited successfully");
	}
	public int Totalbalance(int currentbalance, int depositamount)
	{
		System.out.println("balance calculated");
		return currentbalance+depositamount;
	}

}
