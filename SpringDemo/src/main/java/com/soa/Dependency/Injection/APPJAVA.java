package com.soa.Dependency.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APPJAVA {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Teacher t= context.getBean("teach", Teacher.class);
		System.out.println(t.toString());
		
		Teacher t1= context.getBean("teach11", Teacher.class);
		System.out.println(t1.toString());
		
		
		

	}

}
