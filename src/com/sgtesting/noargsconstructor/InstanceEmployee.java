package com.sgtesting.noargsconstructor;

class  Employee{
	String employeename;
	String employeerole;
	int employeeid;
	{
		employeename="Akshay";
		employeerole="Sr Developer";
		employeeid=900;
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
	{
		departmentname="civil";
		managername="MS";
		departmentid=2226;
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
	{
		companyname="new india";
		insuranceid=860056;
		validtill=2025;
		System.out.println("companyname:"+companyname);
		System.out.println("insuranceid:"+insuranceid);
		System.out.println("validtill:"+validtill);
		System.out.println("+++++++++++");

	}
}
public class InstanceEmployee{
	public static void main(String[] args) {
		Employee obj1=new Employee();

		Insurance obj2=new Insurance();

		Department obj3=new Department();

	}
}
