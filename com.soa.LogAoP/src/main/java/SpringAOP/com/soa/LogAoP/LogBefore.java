package SpringAOP.com.soa.LogAoP;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBefore implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) {
		Log l= LogFactory.getLog(Bank.class);
		l.info("inside Before");
	}

}
