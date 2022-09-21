package com.sgtesting.framesjava;

	public class UnboxingDemo {

		public static void main(String[] args) {
			
			Integer a=Integer.valueOf(125);
			System.out.println("Integer a:"+a);
			//Explicit Convertion of Object into Primitive
			int b=a.intValue();
			System.out.println("int b:"+b);
			//UnBoxing i.e internal Convertion
			int c=a;
			System.out.println("int c:"+c);
			

		}

	}

