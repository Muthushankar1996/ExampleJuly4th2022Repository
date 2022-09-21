package com.sgtesting.constructoroverloading;

class Fruits
{
	Fruits(String Fname,int cost)
	{
		System.out.println("fruit name:"+Fname);
		System.out.println("cost:"+cost);
	}
	Fruits(String Sname)
	{
		System.out.println("shopname:"+Sname);
	}
	Fruits(int number)
	{
		System.out.println("numberof fruits:"+number);
	}
}

public class Constructorfruits {

	public static void main(String[] args) {
		Fruits o1=new Fruits("apple",20);
		Fruits o2=new Fruits("sg enterprises");
		Fruits o3=new Fruits(3000);

	}

}



