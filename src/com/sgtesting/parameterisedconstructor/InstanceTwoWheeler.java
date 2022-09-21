package com.sgtesting.parameterisedconstructor;

class  Twowheelers{
	String twowheelername;
	String twowheelercolor;
	int nooftwowheeler;
	Twowheelers(String tn,String tc,int nw)
	{
		twowheelername="tn";
		twowheelercolor="tc";
		nooftwowheeler=nw;
		System.out.println("twowheelername:"+twowheelername);
		System.out.println("twowheelercolor:"+twowheelercolor);
		System.out.println("nooftwowheeler:"+nooftwowheeler);
		System.out.println("+");
	}
	}
class Fourwheelers
{
	String fourwheelername;
	String fourwheelercolor;
	int nooffourwheeler;
	Fourwheelers(String fn,String fc,int nw)
	{
		fourwheelername="fn";
		fourwheelercolor="fc";
		nooffourwheeler=nw;
		System.out.println("fourwheelername:"+fourwheelername);
		System.out.println("fourwheelercolor:"+fourwheelercolor);
		System.out.println("nooffourwheeler:"+nooffourwheeler);
		System.out.println("+");
	}
	}
class Heavyvehicles
{
	String heavyvehiclename;
	String heavyvehiclecolor;
	int noofheavyvehicle;
	Heavyvehicles(String hn,String hc,int nc)
	{
		heavyvehiclename="hn";
		heavyvehiclecolor="hc";
		noofheavyvehicle=nc;
		System.out.println("heavyvehiclename:"+heavyvehiclename);
		System.out.println("heavyvehiclecolor:"+heavyvehiclecolor);
		System.out.println("noofheavyvehicle:"+noofheavyvehicle);
	}
	}
public class InstanceTwoWheeler{
	public static void main(String[] args) {
		Twowheelers obj1=new Twowheelers("ninja","black",1);
		Twowheelers obj2=new Twowheelers("pulsar","grey",1);
		Twowheelers obj3=new Twowheelers("apache","black",2);
		
		Fourwheelers obj4=new Fourwheelers("seltos","blue",5);
		Fourwheelers obj5=new Fourwheelers("toyato","grey",2);
		Fourwheelers obj6=new Fourwheelers("bmw","blue",5);
		
		Heavyvehicles obj7=new Heavyvehicles("leyland","yellow",3);
		Heavyvehicles obj8=new Heavyvehicles("tataace","white",2);
		Heavyvehicles obj9=new Heavyvehicles("ape","blue",1);
		
	}
}
