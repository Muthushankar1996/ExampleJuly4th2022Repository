package com.sgtesting.practiceprogramsinstancevariable;

    class  Fruit{
	String fruitname;
	String fruitcolor;
	int nooffruit;
}
class Vegetable
{
	String vegetablename;
	String vegetablecolor;
	int noofvegetable;
}
class Flower
{
	String flowername;
	String flowercolor;
	int noofflower;
}
public class InstanceFruits{
	public static void main(String[] args) {
		Fruit obj1=new Fruit();
		obj1.fruitname="Apple";
		obj1.fruitcolor="Green";
		obj1.nooffruit=12;
		System.out.println("Fruitname:"+obj1.fruitname);
		System.out.println("Fruitcolor:"+obj1.fruitcolor);
		System.out.println("nooffruit:"+obj1.nooffruit);
		System.out.println("+");
		Vegetable obj2=new Vegetable();
		obj2.vegetablename="potato";
		obj2.vegetablecolor="brown";
		obj2.noofvegetable=14;
		System.out.println("vegetablename:"+obj2.vegetablename);
		System.out.println("vegetablecolor:"+obj2.vegetablecolor);
		System.out.println("noofvegetable:"+obj2.noofvegetable);
		System.out.println("+");
		Flower obj3=new Flower();
		obj3.flowername="lotus";
		obj3.flowercolor="pink";
		obj3.noofflower=18;
		System.out.println("flowername:"+obj3.flowername);
		System.out.println("flowercolor:"+obj3.flowercolor);
		System.out.println("noofflower:"+obj3.noofflower);
	}

}
