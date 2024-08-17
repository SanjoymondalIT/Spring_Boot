package com.soa.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("autowiredbean.xml");
		Student s= context.getBean("std", Student.class);
		System.out.println(s.toString());

	}

}
