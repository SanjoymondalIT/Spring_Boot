package com.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Execute obj1= (Execute) context.getBean("execute1");
		Execute obj2= (Execute) context.getBean("execute2");
		System.out.println(obj1.getEmp());
		System.out.println(obj2.getEmp());
		

	}

}
