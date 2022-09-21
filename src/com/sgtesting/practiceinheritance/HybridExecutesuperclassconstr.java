package com.sgtesting.practiceinheritance;

class building1
{
	building1(String bn,int age)
	{
		System.out.println("name of the building:"+bn);
		System.out.println("age of the building:"+age);
	}
	building1(String type)
	{
		System.out.println("type of building:"+type);	
	}
}
class building2 extends building1
{
	building2(String location)
	{
		super(location);
	}
}
class building3 extends building2
{
	building3(String ratings)
	{
		super(ratings);
	}
}
class building4 extends building1
{
	building4(String direction)
	{
		super(direction);
	}
}
public class HybridExecutesuperclassconstr {

	public static void main(String args[])
	{
		building1 o=new building1("anandabhavana",60);
		building4 o3=new building4("residensial");

	}
}


