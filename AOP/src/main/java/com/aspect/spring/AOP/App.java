package com.aspect.spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
      Bank b=context.getBean(Bank.class);
		b.deposite();
      //b.Totalbalance(300,500);
	}

}
