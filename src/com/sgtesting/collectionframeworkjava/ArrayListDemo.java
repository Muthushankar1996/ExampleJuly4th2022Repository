package com.sgtesting.collectionframeworkjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Grapes");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Jack Fruit");
		System.out.println("Elements :"+obj);
		List<String> obj1=new ArrayList<String>();
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Red");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Grapes");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Jack Fruit");
		System.out.println("Elements :"+obj);
		obj.remove("Mango");
		System.out.println("Elements :"+obj);
		obj.remove(2);
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Grapes");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Jack Fruit");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElements2()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Grapes");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Jack Fruit");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}

	private static void readElementsByIterator()
	{
		List<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Grapes");
		obj.add("Mango");
		obj.add("Banana");
		obj.add("Jack Fruit");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void withoutGenerics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(125);
		obj.add(4.75);
		obj.add('A');
		obj.add("Mango");
		obj.add(true);
		System.out.println("Elements :"+obj);
	}
}
