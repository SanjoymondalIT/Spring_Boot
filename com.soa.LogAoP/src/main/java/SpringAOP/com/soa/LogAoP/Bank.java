package SpringAOP.com.soa.LogAoP;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {
	String name="ABC";
	int amt=1000;
	public void deposit(String s, int d) {
	Log l= LogFactory.getLog(Bank.class);
	l.info("Inside Deposit");
	if(name.equals(s))
	{
		amt= amt+d;
	}
	else
		System.out.println(" Amount not found");
	
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", amt=" + amt + "]";
	}
	
	
}
