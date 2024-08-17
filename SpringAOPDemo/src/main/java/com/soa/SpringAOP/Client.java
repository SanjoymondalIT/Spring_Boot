package com.soa.SpringAOP;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String args[]) throws AccountNotFoundException
	{
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("aopbean.xml");
		BankSbi bproxy= (BankSbi)context.getBean("proxy", BankSbi.class);
	
	}
	
}
