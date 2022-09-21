package com.sgtesting.parameterisedconstructor;

class  Employee{
	String employeename;
	String employeerole;
	int employeeid;
	Employee(String en,String er,int ei)
	{
		employeename="en";
		employeerole="er";
		employeeid=ei;
		System.out.println("employeename:"+employeename);
		System.out.println("employeerole:"+employeerole);
		System.out.println("employeeid:"+employeeid);
		System.out.println("+++++++++");
	}
}
class Department
{
	String departmentname;
	String managername;
	int departmentid;
	Department(String dn,String mn,int di)
	{
		departmentname="dn";
		managername="mn";
		departmentid=di;
		System.out.println("departmentname:"+departmentname);
		System.out.println("managername:"+managername);
		System.out.println("departmentid:"+departmentid);
	}
}
class Insurance
{
	String companyname;
	int insuranceid;
	int validtill;
	Insurance(String cn,int ii,int vt)
	{
		companyname="cn";
		insuranceid=ii;
		validtill=vt;
		System.out.println("companyname:"+companyname);
		System.out.println("insuranceid:"+insuranceid);
		System.out.println("validtill:"+validtill);
		System.out.println("+++++++++++");

	}
}
public class InstanceEmployee{
	public static void main(String[] args) {
		Employee obj1=new Employee("akshay","software er",888);
		Employee obj2=new Employee("aravind","analyst",988);
		Employee obj3=new Employee("barath","mechanical er",898);

		Insurance obj4=new Insurance("new india",676,2025);
		Insurance obj5=new Insurance("bajaj",679,2023);
		Insurance obj6=new Insurance("lic",678,2028);

		Department obj7=new Department("civil","raju",56);
		Department obj8=new Department("mech","manu",156);
		Department obj9=new Department("cs","sanu",562);
	}
}
