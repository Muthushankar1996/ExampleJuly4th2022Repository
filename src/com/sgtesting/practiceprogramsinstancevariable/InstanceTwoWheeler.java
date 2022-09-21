package com.sgtesting.practiceprogramsinstancevariable;

class  Twowheelers{
	String twowheelername;
	String twowheelercolor;
	int nooftwowheeler;
}
class Fourwheelers
{
	String fourwheelername;
	String fourwheelercolor;
	int nooffourwheeler;
}
class Heavyvehicles
{
	String heavyvehiclename;
	String heavyvehiclecolor;
	int noofheavyvehicle;
}
public class InstanceTwoWheeler{
	public static void main(String[] args) {
		Twowheelers obj1=new Twowheelers();
		obj1.twowheelername="ninjaz900";
		obj1.twowheelercolor="Green";
		obj1.nooftwowheeler=1;
		System.out.println("twowheelername:"+obj1.twowheelername);
		System.out.println("twowheelercolor:"+obj1.twowheelercolor);
		System.out.println("nooftwowheeler:"+obj1.nooftwowheeler);
		System.out.println("+");
		Fourwheelers obj2=new Fourwheelers();
		obj2.fourwheelername="maruthi800";
		obj2.fourwheelercolor="white";
		obj2.nooffourwheeler=2;
		System.out.println("wowheelername:"+obj2.fourwheelername);
		System.out.println("fourwheelercolor:"+obj2.fourwheelercolor);
		System.out.println("nooffourwheeler:"+obj2.nooffourwheeler);
		System.out.println("+");
		Heavyvehicles obj3=new Heavyvehicles();
		obj3.heavyvehiclename="leyland";
		obj3.heavyvehiclecolor="yellow";
		obj3.noofheavyvehicle=1;
		System.out.println("heavyvehiclename:"+obj3.heavyvehiclename);
		System.out.println("heavyvehiclecolor:"+obj3.heavyvehiclecolor);
		System.out.println("noofheavyvehicle:"+obj3.noofheavyvehicle);
	}
}
