package com.sgtesting.practiceinheritance;

class students
{
	students(String sn)
	{
		System.out.println("name of the student:"+sn);
	}
}
class students2 extends student
{
	students2(String branch)
	{
		super(branch);

	}
}
class students3 extends student
{
	students3(String pwd)
	{
		super(pwd);
	}
}
public class HhAvailableSuperclassconstr {
	public static void main(String args[])
	{
		student o1=new student("rakesh");


	}
}

