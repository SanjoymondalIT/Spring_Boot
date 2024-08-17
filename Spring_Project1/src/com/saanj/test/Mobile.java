package com.saanj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Sim sim=(Sim) context.getBean("air");
		Sim sim1=(Sim) context.getBean("voda");
		Sim sim2=(Sim) context.getBean("jio");
		sim.call();
		sim.data();
		sim1.call();
		sim1.data();
		sim2.call();
		sim2.data();
		
		
	}

}
