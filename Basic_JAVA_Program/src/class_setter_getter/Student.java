package class_setter_getter;

public class Student {
	String name,branch;
	int RegdNo;
	
public	Student()
	{
		
	}
public Student(String name, String branch)
	{	this.name=name;
		this.branch=branch;
	}
public	Student(String name, String branch, int RegdNo)
	{
		this.name=name;
		this.branch=branch;
		this.RegdNo=RegdNo;
	}
	
	public void SetName(String name)
	{	this.name=name;	
	}
	public void Setbranch(String branch)
	{	this.branch=branch;	
	}
	public void SetRegdNo(int RegdNo)
	{	this.RegdNo=RegdNo;	
	}
	
	
	public String getName()
	{
		return name;
	}
	public int getRegdNo()
	{
		return RegdNo;
	}
	public String getBranch()
	{
		return branch;
	}

}
