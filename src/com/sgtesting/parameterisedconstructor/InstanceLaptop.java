package com.sgtesting.parameterisedconstructor;

class  Laptop{
	String laptopname;
	String laptopcolor;
	int nooflaptop;
	Laptop(String ln,String lc,int nl)
	{
		laptopname="ln";
		laptopcolor="lc";
		nooflaptop=nl;
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
	Desktop(String dn,String dc,int nd)
	{
		desktopname="dn";
		desktopcolor="dc";
		noofdesktop=nd;
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
	Mobile(String mn,String mc,int nm)
	{
		mobilename="mn";
		mobilecolor="mc";
		noofmobile=nm;
		System.out.println("mobilename:"+mobilename);
		System.out.println("mobilecolor:"+mobilecolor);
		System.out.println("noofmobile:"+noofmobile);
	}
	}
public class InstanceLaptop{
	public static void main(String[] args) {
		Laptop obj1=new Laptop("lenovo","grey",5);
		Laptop obj2=new Laptop("asus","black",4);
		Laptop obj3=new Laptop("apple","white",2);
		
		Desktop obj4=new Desktop("apple","black",2);
		Desktop obj5=new Desktop("lg","black",7);
		Desktop obj6=new Desktop("samsung","black",5);
		
		Mobile obj7=new Mobile("oneplus","black",3);
		Mobile obj8=new Mobile("samsung","grey",3);
		Mobile obj9=new Mobile("vivo","white",5);
		
	}
}
