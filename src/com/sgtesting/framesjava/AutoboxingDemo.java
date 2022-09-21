package com.sgtesting.framesjava;



public class AutoboxingDemo {

	public static void main(String[] args) {

		int a=25;
		System.out.println("int a:"+a);
		//Explicit Conversion of Primitive into Object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		//Auto boxing indicates internal conversion
		Integer c=a;
		System.out.println("Integer c:"+c);
	}
}
