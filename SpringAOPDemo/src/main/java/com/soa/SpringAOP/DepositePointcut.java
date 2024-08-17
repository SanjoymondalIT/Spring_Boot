package com.soa.SpringAOP;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositePointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		Log l= LogFactory.getLog(DepositePointcut.class);
		l.info(" inside matches method");
		String methodname= "deposite";
		if(methodname.equals(method.getName()))
			return true;
		return false;
	}

}
