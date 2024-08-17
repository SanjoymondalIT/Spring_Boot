package com.soa.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public StudentAddress adds()
	{	StudentAddress ad= new StudentAddress();
		ad.setCity("BBSR");
		ad.setPin(750130);
		return ad;
		
	}
	
	@Bean
	public StudentAddress adds1()
	{	StudentAddress ad1= new StudentAddress();
		ad1.setCity("Khandagiri");
		ad1.setPin(750213);
		return ad1;
		
	}
	@Bean
	public Student std()
	{	Student s1= new Student();
		s1.setName("Raja");
		s1.setStdid(1234);	
		return s1;
	}
		
}
