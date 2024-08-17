package com.aspect.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class TranscitionService {

	@AfterReturning(pointcut="execution(public int Totalbalance(int,int))",
			returning="result")
	public void Transcition(JoinPoint jp,int result)
	{
	
		System.out.println(jp.getSignature());
		System.out.println(jp.getTarget());
		System.out.println(jp.getArgs()[0]);
		System.out.println(jp.getArgs()[1]);
		//System.out.println("After Transcition Provided :"+result);
		
	}

}
