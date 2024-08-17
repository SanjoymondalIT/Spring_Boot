package class_setter_getter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeApp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Employee e1=(Employee) context.getBean("Emp"); 
		e1.SetName("Akash");
		System.out.println("My name is"+e1.getName());
	}
}
