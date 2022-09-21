package com.sgtesting.framesjava;
	class MyClass<T>
	{
		private T obj=null;
		public void add(T obj)
		{
			this.obj=obj;
		}
		
		public T get()
		{
			return obj;
		}
	}
	public class GenericsIncoreJava {
		public static void main(String[] args) {
			//With Generics Approach
			MyClass<String> obj1=new MyClass<String>();
			obj1.add("Mango");
			String v1=obj1.get();
			System.out.println(v1);
			obj1.add("Orange");
			String v2=obj1.get();
			System.out.println(v2);
			//Without Generics Approach
			MyClass obj2=new MyClass();
			obj2.add(100);
			int a=(int) obj2.get();
			System.out.println(a);
			obj2.add("Apple");
			String s=(String) obj2.get();
			System.out.println(s);
		}

	}

