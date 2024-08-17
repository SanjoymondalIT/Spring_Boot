package SpringAOP.com.soa.LogAoP;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterAdvice;

public class LogAfter implements AfterAdvice{
	public void afterReturning(Object rv, Method m, Object []a, Object target)
	{
		Log l= LogFactory.getLog(Bank.class);
		l.info(" Inside After"+rv);
		
	}

}
