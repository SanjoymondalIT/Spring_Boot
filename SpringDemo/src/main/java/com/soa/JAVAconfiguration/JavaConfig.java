package com.soa.JAVAconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	
	@Bean
	//@Scope("prototype")
	public Student stud()
	{
		Student st= new Student();
		st.setName("Rahul");
		st.setRoll(123);
		return st;
	}
	
	@Bean
	//@Scope("prototype")
	public Student stud1()
	{
		Student st1= new Student();
		st1.setName("Ajay");
		st1.setRoll(1582);
		st1.setDept("BDC");
		return st1;
	}

}
