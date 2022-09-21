package com.sgtesting.noargsconstructor;

class  Software{
	String softwarename;
	int softwareid;
	int noofusers;
{
	softwarename="java";
	softwareid=90;
	noofusers=190873658;
	System.out.println("softwarename:"+softwarename);
	System.out.println("softwareid:"+softwareid);
	System.out.println("noofusers:"+noofusers);
	System.out.println("+");
}
}
class Hardware
{
	String hardwarename;
    int hardwareid;
	int noofbuyers;
	{
		hardwarename="Harddisk";
		hardwareid=45;
		noofbuyers=50000;
		System.out.println("hardwarename:"+hardwarename);
		System.out.println("hardwareid:"+hardwareid);
		System.out.println("noofbuyers:"+noofbuyers);
	}
	}
public class InstanceSoftware{
	public static void main(String[] args) {
		Software obj2=new Software();
		Hardware obj3=new Hardware();
	}
}
