package com.sgtesting.parameterisedconstructor;

class  Country{
	String countryname;
	int noofstates;
	int noofpopulation;
	Country(String cn,int ns,int np)
	{
		countryname="cn";
		noofstates=ns;
		noofpopulation=np;
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
	State(String sn,String cn,int nd)
	{
		statename="sn";
		capitalname="cn";
		noofdistricts=nd;
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
	Village(String vn,int ns,int np)
	{
		villagename="vn";
		noofstreet=ns;
		noofpeople=np;
		System.out.println("villagename:"+villagename);
		System.out.println("noofstreet:"+noofstreet);
		System.out.println("noofpeople:"+noofpeople);
	}
}
public class InstanceCountry{
	public static void main(String[] args) {
		Country obj1=new Country("india",29,160000000);
		Country obj2=new Country("usa",20,178900);
		Country obj3=new Country("uae",25,196000);

		State obj4=new State("Karnataka","bangalore",3);
		State obj5=new State("tamilnadu","chennai",4);
		State obj6=new State("andhrapradesh","hyderabad",2);

		Village obj7=new Village("hebbal",12,1256);
		Village obj8=new Village("rajajinagar",10,1956);	
		Village obj9=new Village("kolar",19,18256);	

	}
}
