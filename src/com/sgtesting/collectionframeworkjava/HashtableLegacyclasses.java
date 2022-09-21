package com.sgtesting.collectionframeworkjava;

import java.util.Hashtable;

public class HashtableLegacyclasses {

	public static void main(String[] args) {
		//	addElements();
		readAndRemoveElements();
	}

	private static void addElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
	}

	private static void readAndRemoveElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
		String v1=obj.get("Mango");
		System.out.println(v1);
		obj.remove("Mango");
		String v2=obj.get("Mango");
		System.out.println(v2);
	}
}

