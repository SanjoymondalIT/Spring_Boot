package com.soa.Dependency.Injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	@Bean
	public Address addrs()
	{
		Address ad= new Address();
		ad.setCity("BBSR");
		ad.setPin(750310);
		return ad;
	}
	@Bean
	public Address addrs1()
	{
		Address ad= new Address("BBSR",75030);
		return ad;
	}
	
	
	@Bean
	public Teacher teach()
	{   Teacher t= new Teacher();
		t.setAdd(addrs());
		t.setEmpID(1234);
		t.setName("Vijay");
		return t;
		
	}
	@Bean
	public Teacher teach11()
	{   Teacher t= new Teacher(1235,"Ajay", addrs1());
		return t;
		
	}
	
}
