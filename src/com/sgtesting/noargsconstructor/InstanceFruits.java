package com.sgtesting.noargsconstructor;

//no argsconstructor= wich doesnt accept parameter.

class  Fruit{
	String fruitname;
	String fruitcolor;
	int nooffruit;
	{
		fruitname="Apple";
		fruitcolor="Green";
		nooffruit=12;
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
	{
		vegetablename="potato";
		vegetablecolor="brown";
		noofvegetable=14;
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
	{
		flowername="lotus";
		flowercolor="pink";
		noofflower=18;
		System.out.println("Flowername:"+flowername);
		System.out.println("flowercolor:"+flowercolor);
		System.out.println("noofflower:"+noofflower);
	}
}
public class InstanceFruits{
	public static void main(String[] args) {
		Fruit obj1=new Fruit();
		Vegetable obj2=new Vegetable();
		Flower obj3=new Flower();

	}

}
