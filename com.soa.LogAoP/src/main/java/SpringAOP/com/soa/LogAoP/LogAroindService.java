package SpringAOP.com.soa.LogAoP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogAroindService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Log log= LogFactory.getLog(LogAroindService.class);
		log.info(log);
		return null;
	}
	
	
	

}
