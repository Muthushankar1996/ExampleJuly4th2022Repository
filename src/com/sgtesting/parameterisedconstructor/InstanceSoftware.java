package com.sgtesting.parameterisedconstructor;

class  Software{
	String softwarename;
	int softwareid;
	int noofusers;
	Software(String sn,int si,int nf)
{
	softwarename="sn";
	softwareid=si;
	noofusers=nf;
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
	Hardware(String hn,int hi,int nb)
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
		Software obj1=new Software("java",40,129);
		Software obj2=new Software("cad",449,150);
		Software obj3=new Software("sql",48,147);
		
		Hardware obj4=new Hardware("ram",34,124);
		Hardware obj5=new Hardware("harddisk",38,194);
		Hardware obj6=new Hardware("cpu",39,127);
	}
}
