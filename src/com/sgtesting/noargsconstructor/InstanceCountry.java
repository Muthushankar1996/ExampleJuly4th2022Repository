package com.sgtesting.noargsconstructor;

class  Country{
	String countryname;
	int noofstates;
	int noofpopulation;
	{
countryname="India";
noofstates=29;
noofpopulation=1380000000;
System.out.println("countryname:"+countryname);
System.out.println("noofstates:"+noofstates);
System.out.println("noofpopulation:"+noofpopulation);
System.out.println("+");
}
}
class State
{
	String statename;
    String capitalname;
	int noofdistricts;
	{
statename="karnataka";
capitalname="bengaluru";
noofdistricts=2;
System.out.println("statename:"+statename);
System.out.println("capitalname:"+capitalname);
System.out.println("noofdistricts:"+noofdistricts);
System.out.println("+");
}
}
class Village
{
	String villagename;
	int noofstreet;
	int noofpeople;
	{
villagename="hebbal";
noofstreet=24;
noofpeople=5000;
System.out.println("villagename:"+villagename);
System.out.println("noofstreet:"+noofstreet);
System.out.println("noofpeople:"+noofpeople);
}
}
public class InstanceCountry{
	public static void main(String[] args) {
		Country obj1=new Country();
		State obj2=new State();
		Village obj3=new Village();	
	}
}
