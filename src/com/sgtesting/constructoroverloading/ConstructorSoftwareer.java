package com.sgtesting.constructoroverloading;

class Software
{
	Software(String Sname,int idno)
	{
		System.out.println("software name:"+Sname);
		System.out.println("id number:"+idno);
	}
	Software(String spname)
	{
		System.out.println("shop name:"+spname);	
	}
	Software(int salary)
	{
		System.out.println("salary:"+salary);
	}
}

public class ConstructorSoftwareer {

	public static void main(String[] args) {
		Software o1=new Software("browser",40);
		Software o2=new Software("Rakesh");
		Software o3=new Software(5000);

	}

}



