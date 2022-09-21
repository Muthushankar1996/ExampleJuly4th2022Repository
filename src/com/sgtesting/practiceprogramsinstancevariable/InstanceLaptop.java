package com.sgtesting.practiceprogramsinstancevariable;

class  Laptop{
	String laptopname;
	String laptopcolor;
	int nooflaptop;
}
class Desktop
{
	String desktopname;
	String desktopcolor;
	int noofdesktop;
}
class Mobile
{
	String mobilename;
	String mobilecolor;
	int noofmobile;
}
public class InstanceLaptop{
	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		obj1.laptopname="Apple";
		obj1.laptopcolor="Grey";
		obj1.nooflaptop=5;
		System.out.println("laptopname:"+obj1.laptopname);
		System.out.println("laptopcolor:"+obj1.laptopcolor);
		System.out.println("nooflaptop:"+obj1.nooflaptop);
		System.out.println("+++++++++");
		Desktop obj2=new Desktop();
		obj2.desktopname="lenovo";
		obj2.desktopcolor="white";
		obj2.noofdesktop=2;
		System.out.println("desktopname:"+obj2.desktopname);
		System.out.println("desktopcolor:"+obj2.desktopcolor);
		System.out.println("noofdesktop:"+obj2.noofdesktop);
		System.out.println("+++++++++++");
		Mobile obj3=new Mobile();
		obj3.mobilename="oneplus";
		obj3.mobilecolor="black";
		obj3.noofmobile=1;
		System.out.println("mobilename:"+obj3.mobilename);
		System.out.println("mobilecolor:"+obj3.mobilecolor);
		System.out.println("noofmobile:"+obj3.noofmobile);
	}
}
