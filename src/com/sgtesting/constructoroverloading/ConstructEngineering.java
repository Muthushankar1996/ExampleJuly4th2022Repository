package com.sgtesting.constructoroverloading;

//constructor loading = same constructor name as class name ,with differnet parameters varying
class Engineering
{
	Engineering(String sname,int rollno)
	{
		System.out.println("student name:"+sname);
		System.out.println("college rooms:"+rollno); 
	}
	Engineering(String bname)
	{
		System.out.println("branch name:"+bname);
	}
	Engineering(int roomno)
	{
		System.out.println("room no:"+roomno);
	}

}


public class ConstructEngineering {

	public static void main(String[] args) {
		Engineering o1=new Engineering("logu",30);
		Engineering o2=new Engineering("mechanical");
		Engineering o3=new Engineering(40);
	}

}

