package com.sgtesting.collectionframeworkjava;

	import java.util.HashSet;
	import java.util.Iterator;

	public class HashSetDemo {
		public static void main(String[] args) {
		//	addElements();
		//	removeElements();
		//	readElements();
		//	readElementsByIterator();
		//	convertSetInToArray();
			withoutGenerics();
		}
		
		private static void addElements()
		{
			HashSet<String> obj=new HashSet<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add("Grapes");
			obj.add("Mango");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			HashSet<String> obj1=new HashSet<String>();
			obj1.add("Blue");
			obj1.add("White");
			obj1.add("Red");
			obj.addAll(obj1);
			System.out.println("Elements :"+obj);
		}
		
		private static void removeElements()
		{
			HashSet<String> obj=new HashSet<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add("Grapes");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			obj.remove("Grapes");
			System.out.println("Elements :"+obj);
			obj.removeAll(obj);
			System.out.println("Elements :"+obj);
		}
		
		
		private static void readElements()
		{
			HashSet<String> obj=new HashSet<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add("Grapes");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			for(String kk:obj)
			{
				System.out.println(kk);
			}
		}
		
		private static void readElementsByIterator()
		{
			HashSet<String> obj=new HashSet<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add("Grapes");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			Iterator<String> ite=obj.iterator();
			while(ite.hasNext())
			{
				System.out.println(ite.next());
			}
		}
		
		private static void convertSetInToArray()
		{
			HashSet<String> obj=new HashSet<String>();
			System.out.println("Elements :"+obj);
			obj.add("Mango");
			obj.add("Apple");
			obj.add("Orange");
			obj.add("Grapes");
			obj.add("Banana");
			obj.add("Jack Fruit");
			System.out.println("Elements :"+obj);
			Object arr[]=obj.toArray();
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}

		private static void withoutGenerics()
		{
			HashSet obj=new HashSet();
			System.out.println("Elements :"+obj);
			obj.add(125);
			obj.add(4.75);
			obj.add('A');
			obj.add("Mango");
			obj.add(true);
			System.out.println("Elements :"+obj);
		}
	}

