package com.aspect.spring.AOP;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class SecurityService {
	@Before("mypointcutname()")
	public void security1(JoinPoint jp)
	{
		System.out.println(jp.getSignature());
		System.out.println("Security1 Provided");
	}
	@Before("mypointcutname()")
	public void security2()
	{
		
		System.out.println("Security2 Provided");
	}
	@Pointcut("execution(void deposite(..))")
	public void mypointcutname()
	{
		
	}
	

}
