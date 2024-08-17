package class_setter_getter;

public class Employee {
String EmpName, EmpBranch;
int EmpId;

public void SetName(String EmpName)
{this.EmpName=EmpName;	
}
public void Setbranch(String EmpBranch)
{this.EmpBranch=EmpBranch;	
}
public void SetEMpId(int EmpId)
{this.EmpId=EmpId;	
}


public String getName()
{
	return EmpName;
}
public int getEmpID()
{
	return EmpId;
}
public String getBranch()
{
	return EmpBranch;
}
}
