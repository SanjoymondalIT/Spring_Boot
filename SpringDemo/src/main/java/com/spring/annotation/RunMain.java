package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soa.SpringDemo.Restaurant;

public class RunMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans1.xml");
		 Teacher t1=context.getBean("teacher",Teacher.class);
		  System.out.println(t1.toString());
	}

}
