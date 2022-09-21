package com.sgtesting.practiceprogramsinstancevariable;

class  Country{
	String countryname;
	int noofstates;
	int noofpopulation;
}
class State
{
	String statename;
    String capitalname;
	int noofdistricts;
}
class Village
{
	String villagename;
	int noofstreet;
	int noofpeople;
}
public class InstanceCountry{
	public static void main(String[] args) {
		Country obj1=new Country();
		obj1.countryname="India";
		obj1.noofstates=29;
		obj1.noofpopulation=1380000000;
		System.out.println("countryname:"+obj1.countryname);
		System.out.println("noofstates:"+obj1.noofstates);
		System.out.println("noofpopulation:"+obj1.noofpopulation);
		System.out.println("+");
		State obj2=new State();
		obj2.statename="karnataka";
		obj2.capitalname="bengaluru";
		obj2.noofdistricts=2;
		System.out.println("statename:"+obj2.statename);
		System.out.println("capitalname:"+obj2.capitalname);
		System.out.println("noofdistricts:"+obj2.noofdistricts);
		System.out.println("+");
		Village obj3=new Village();
		obj3.villagename="hebbal";
		obj3.noofstreet=24;
		obj3.noofpeople=5000;
		System.out.println("villagename:"+obj3.villagename);
		System.out.println("noofstreet:"+obj3.noofstreet);
		System.out.println("noofpeople:"+obj3.noofpeople);
	}
}
