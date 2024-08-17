package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//Teacher teacher= new Teacher()
public class Teacher {
	@Value("${teacher.name}")
	String name;
	


	@Override
	public String toString() {
		return name;
		
	}
	
	

}
