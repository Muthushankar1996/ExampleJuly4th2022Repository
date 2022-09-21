package com.sgtesting.parameterisedconstructor;

//parameterisedconstructor= wich accepts parameters
    class  Fruit{
	String fruitname;
	String fruitcolor;
	int nooffruit;
	Fruit(String fn,String fc,int nf)
	{
		fruitname="fn";
		fruitname="fn";
		fruitcolor="fc";
		nooffruit=nf;
		System.out.println("Fruitname:"+fruitname);
		System.out.println("Fruitcolor:"+fruitcolor);
		System.out.println("nooffruit:"+nooffruit);
		System.out.println("+");
	}
	}
class Vegetable
{
	String vegetablename;
	String vegetablecolor;
	int noofvegetable;
	Vegetable(String vn,String vc,int nv)
	{
		vegetablename="vn";
		vegetablecolor="vc";
		noofvegetable=nv;
		System.out.println("vegetablename:"+vegetablename);
		System.out.println("vegetablecolor:"+vegetablecolor);
		System.out.println("noofvegetable:"+noofvegetable);
		System.out.println("+");
	}
	}
class Flower
{
	String flowername;
	String flowercolor;
	int noofflower;
	Flower(String fn,String fc,int nf)
	{
		flowername="fn";
		flowercolor="fc";
		noofflower=nf;
		System.out.println("flowername:"+flowername);
		System.out.println("flowercolor:"+flowercolor);
		System.out.println("noofflower:"+noofflower);
	}
}
public class InstanceFruits{
	public static void main(String[] args) {
		Fruit obj1=new Fruit("Apple","red",10);
		Fruit obj2=new Fruit("orange","orange",5);
		Fruit obj3=new Fruit("grapes","green",6);
		
		Vegetable obj4=new Vegetable("brinjal","blue",6);
		Vegetable obj5=new Vegetable("tomato","red",8);
		Vegetable obj6=new Vegetable("potato","brown",10);


		Flower obj7=new Flower("lotus","pink",6);
		Flower obj8=new Flower("lilly","white",9);
		Flower obj9=new Flower("tulip","pink",6);
	}

}
