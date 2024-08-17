package p1;

public class Student {
	int RegdNo;
	String name;
	

	Student(int RegdNo,String name)
	{
	this.RegdNo=RegdNo;
	this.name=name;
	
	}
	
	void Studentdetails()
	{
		System.out.println(RegdNo+" " + name+" ");
	}
}

