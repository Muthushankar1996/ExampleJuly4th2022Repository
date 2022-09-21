package com.sgtesting.practiceinheritance;

class student
{
	student(String sname)
	{
		System.out.println("student name:"+sname);
	}
	student(int rollno)
	{
		System.out.println("student rollno:"+rollno);
	}
	student(String branch,int roomno)
	{
		System.out.println("name of branch:"+branch+"room no:"+roomno);
		
	}
}
class student2 extends student
{
	student2(String nm)
	{
		super(nm);
	}
	student2(int k)
	{
		super(k);
	}
	student2(String fname,String city)
	{
		super("mechanical",45);
		System.out.println("name of father:"+fname+"city name:"+city);
		
	}
}
class student3 extends student2
{
	student3(String nm)
	{
		super(nm);
	}
	student3(int k)
	{
		super(k);
	}
	student3(String fn,String ci)
	{
		super(fn,ci);
	}
}

public class ExecuteeachSuperclassconstr {

	public static void main(String[] args) {
       student3 kk=new student3("kailas","banglore");
       student3 kk2=new student3("jaggesh");
       student3 kk3=new student3(30);
	}

}


