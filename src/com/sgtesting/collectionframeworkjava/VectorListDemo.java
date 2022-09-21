package com.sgtesting.collectionframeworkjava;

	import java.util.Enumeration;
	import java.util.Iterator;
	import java.util.Vector;

	public class VectorListDemo {

		public static void main(String[] args) {
		//	addElements();
		//	removeElements();
		//	readElements1();
		//	readElements2();
		//	readElementsByEnumerator();
		//	readElementsByIterator();
			withoutGenerics();
		}
		
		private static void addElements()
		{
			Vector<String> obj=new Vector<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add(0,"Grapes");
			obj.add("Mango");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			Vector<String> obj1=new Vector<String>();
			obj1.add("Blue");
			obj1.add("White");
			obj1.add("Red");
			obj.addAll(obj1);
			System.out.println("Elements :"+obj);
		}
		
		private static void removeElements()
		{
			Vector<String> obj=new Vector<String>();
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
			Vector<String> obj=new Vector<String>();
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
			Vector<String> obj=new Vector<String>();
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
		
		private static void readElementsByEnumerator()
		{
			Vector<String> obj=new Vector<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add(0,"Grapes");
			obj.add("Mango");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			Enumeration<String> elements=obj.elements();
			while(elements.hasMoreElements())
			{
				System.out.println(elements.nextElement());
			}
		}
		
		private static void readElementsByIterator()
		{
			Vector<String> obj=new Vector<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add(0,"Grapes");
			obj.add("Mango");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			Iterator<String> elements=obj.iterator();
			while(elements.hasNext())
			{
				System.out.println(elements.next());
			}
		}
		
		private static void withoutGenerics()
		{
			Vector obj=new Vector();
			System.out.println("Elements :"+obj);
			obj.add(125);
			obj.add(4.75);
			obj.add('A');
			obj.add("Mango");
			obj.add(true);
			System.out.println("Elements :"+obj);
		}
	}

