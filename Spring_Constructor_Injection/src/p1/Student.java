package p1;

public class Student {
	int RegdNo;
	String name;
	Branch B;

	Student(int RegdNo,String name, Branch B)
	{
	this.RegdNo=RegdNo;
	this.name=name;
	this.B=B;
	}
	
	void Studentdetails()
	{
		System.out.println(RegdNo+" " + name+" "+ B);
	}
}

