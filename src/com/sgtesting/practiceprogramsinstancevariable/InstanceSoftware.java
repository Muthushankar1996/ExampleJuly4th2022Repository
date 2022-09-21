package com.sgtesting.practiceprogramsinstancevariable;

class  Software{
	String softwarename;
	int softwareid;
	int noofusers;
}
class Hardware
{
	String hardwarename;
    int hardwareid;
	int noofbuyers;
}
public class InstanceSoftware{
	public static void main(String[] args) {
		Software obj2=new Software();
		obj2.softwarename="java";
		obj2.softwareid=90;
		obj2.noofusers=190873658;
		System.out.println("softwarename:"+obj2.softwarename);
		System.out.println("softwareid:"+obj2.softwareid);
		System.out.println("noofusers:"+obj2.noofusers);
		System.out.println("+");
		Hardware obj3=new Hardware();
		obj3.hardwarename="Harddisk";
		obj3.hardwareid=45;
		obj3.noofbuyers=50000;
		System.out.println("hardwarename:"+obj3.hardwarename);
		System.out.println("hardwareid:"+obj3.hardwareid);
		System.out.println("noofbuyers:"+obj3.noofbuyers);
	}
}
