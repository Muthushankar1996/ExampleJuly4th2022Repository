package com.sgtesting.noargsconstructor;

class  Laptop{
	String laptopname;
	String laptopcolor;
	int nooflaptop;
	{
		laptopname="Apple";
		laptopcolor="Grey";
		nooflaptop=5;
		System.out.println("laptopname:"+laptopname);
		System.out.println("laptopcolor:"+laptopcolor);
		System.out.println("nooflaptop:"+nooflaptop);
		System.out.println("+++++++++");
	}
	}
class Desktop
{
	String desktopname;
	String desktopcolor;
	int noofdesktop;
	{
		desktopname="lenovo";
		desktopcolor="white";
		noofdesktop=2;
		System.out.println("desktopname:"+desktopname);
		System.out.println("desktopcolor:"+desktopcolor);
		System.out.println("noofdesktop:"+noofdesktop);
		System.out.println("+++++++++++");
	}
	}
class Mobile
{
	String mobilename;
	String mobilecolor;
	int noofmobile;
	{
		mobilename="oneplus";
		mobilecolor="black";
		noofmobile=1;
		System.out.println("mobilename:"+mobilename);
		System.out.println("mobilecolor:"+mobilecolor);
		System.out.println("noofmobile:"+noofmobile);
	}
	}
public class InstanceLaptop{
	public static void main(String[] args) {
		Laptop obj1=new Laptop();
		Desktop obj2=new Desktop();
		Mobile obj3=new Mobile();
	}
}
