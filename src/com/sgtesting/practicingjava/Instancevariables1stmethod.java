package com.sgtesting.practicingjava;

class Bag{
	String Bagname;
	String Bagcolour;
	int noofBag;
}
class Bat{
	String BatColor;
	int noofBat;
	int noofHandle;
}
public class Instancevariables1stmethod {

	public static void main(String[] args) {
	Bag obj1=new Bag();
	obj1.Bagname="Wildcraft";
	obj1.Bagcolour="Blue";
	obj1.noofBag=10;
	System.out.println("Bagname:"+obj1.Bagname);
	System.out.println("Bagcolour:"+obj1.Bagcolour);
	System.out.println("noofBag"+obj1.noofBag);
	Bat obj2=new Bat();
	obj2.BatColor="brown";
	obj2.noofBat=9;
	obj2.noofHandle=1;
	System.out.println("BatColor:"+obj2.BatColor);
	System.out.println("noofBat:"+obj2.noofBat);
	System.out.println("noofHandle:"+obj2.noofHandle);

	}

}
