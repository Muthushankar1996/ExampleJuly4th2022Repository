package com.sgtesting.noargsconstructor;

class  Twowheelers{
	String twowheelername;
	String twowheelercolor;
	int nooftwowheeler;
	{
		twowheelername="ninjaz900";
		twowheelercolor="Green";
		nooftwowheeler=1;
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
	{
		fourwheelername="maruthi800";
		fourwheelercolor="white";
		nooffourwheeler=2;
		System.out.println("wowheelername:"+fourwheelername);
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
	{
		heavyvehiclename="leyland";
		heavyvehiclecolor="yellow";
		noofheavyvehicle=1;
		System.out.println("heavyvehiclename:"+heavyvehiclename);
		System.out.println("heavyvehiclecolor:"+heavyvehiclecolor);
		System.out.println("noofheavyvehicle:"+noofheavyvehicle);
	}
	}
public class InstanceTwoWheeler{
	public static void main(String[] args) {
		Twowheelers obj1=new Twowheelers();
		Fourwheelers obj2=new Fourwheelers();
		Heavyvehicles obj3=new Heavyvehicles();
	}
}
