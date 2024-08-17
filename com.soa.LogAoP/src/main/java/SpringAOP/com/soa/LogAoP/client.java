package SpringAOP.com.soa.LogAoP;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =new ClassPathXmlApplicationContext("aopbean.xml");
System.out.println(" IoC Created");
Bank bproxy=context.getBean("bankproxy",Bank.class);
int amount=bproxy.deposit(" sbi123", 9000);
System.out.println(amount);
context.close();
	
	}

}
