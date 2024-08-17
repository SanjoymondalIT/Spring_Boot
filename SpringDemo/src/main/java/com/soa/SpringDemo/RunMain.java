package com.soa.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		  Restaurant obj=(Restaurant) context.getBean("restaurant");
		  obj.welcomeCustome();
		  
		 context.close();
	}

}
