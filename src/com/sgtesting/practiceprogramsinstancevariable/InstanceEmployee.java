package com.sgtesting.practiceprogramsinstancevariable;

class  Employee{
	String employeename;
	String employeerole;
	int employeeid;
}
class Department
{
	String departmentname;
	String managername;
	int departmentid;
}
class Insurance
{
	String companyname;
	int insuranceid;
	int validtill;
}
public class InstanceEmployee{
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.employeename="Akshay";
		obj1.employeerole="Sr Developer";
		obj1.employeeid=900;
		System.out.println("employeename:"+obj1.employeename);
		System.out.println("employeerole:"+obj1.employeerole);
		System.out.println("employeeid:"+obj1.employeeid);
		System.out.println("+++++++++");
		Insurance obj2=new Insurance();
		obj2.companyname="new india";
		obj2.insuranceid=860056;
		obj2.validtill=2025;
		System.out.println("companyname:"+obj2.companyname);
		System.out.println("insuranceid:"+obj2.insuranceid);
		System.out.println("validtill:"+obj2.validtill);
		System.out.println("+++++++++++");
		Department obj3=new Department();
		obj3.departmentname="civil";
		obj3.managername="MS";
		obj3.departmentid=2226;
		System.out.println("departmentname:"+obj3.departmentname);
		System.out.println("managername:"+obj3.managername);
		System.out.println("departmentid:"+obj3.departmentid);
	}
}
