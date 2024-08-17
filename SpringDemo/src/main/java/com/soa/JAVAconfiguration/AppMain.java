package com.soa.JAVAconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		Student st1= context.getBean("stud", Student.class);
		System.out.println(st1.toString());
	
		Student st2= context.getBean("stud", Student.class);
		st2.setName("Bikash");
		st2.setRoll(1234);
		System.out.println(st2.toString());
		Student st3= context.getBean("stud1", Student.class);
		System.out.println(st3.toString());

	}

}
