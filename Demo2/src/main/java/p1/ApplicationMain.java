package p1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 class ApplicationMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Student s1=(Student) context.getBean("stud"); 
		s1.Studentdetails();

	}

}
