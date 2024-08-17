package class_setter_getter;
import java.util.Scanner;
public class StudentApp {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.name="Ratim";
		s1.branch="CSE";
		s1.RegdNo=1234;
		System.out.println("Student Name is  "+s1.name+" Branch is "+s1.branch+" with Registration No "+s1.RegdNo);
	s1.SetName("Saptam");
	s1.Setbranch("CSE");
	s1.SetRegdNo(1234);
	System.out.println("My name is "+s1.getName());
	System.out.println("Branch is "+s1.getBranch());
	System.out.println("with registration No  "+s1.getRegdNo());
	
	Student [] Studentarray= new Student[2];
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<2;i++)
	{
	Studentarray[i]=new Student();
	System.out.print("Enter name");
	Studentarray[i].name=sc.next();
	System.out.print("Enter Branch");
	Studentarray[i].branch=sc.next();
	System.out.print("Enter Regd No ");
	Studentarray[i].RegdNo=sc.nextInt();
	
	}
	
	for(int i=0;i<2;i++)
	{
		System.out.println(" Name "+Studentarray[i].getName());
		System.out.println(" Regd NO is  "+Studentarray[i].getRegdNo());
		System.out.println(" Branch Name is  "+Studentarray[i].getBranch());
	}
	
	Student s2= new Student("rajat","ECE", 1234);
	System.out.println(s2.name+"  "+s2.branch+" "+s2.RegdNo);
	Student s3= new Student("raja","EE");
	System.out.println(s3.name+"  "+s3.branch+" "+s3.RegdNo);
	
	sc.close();
	}

}
