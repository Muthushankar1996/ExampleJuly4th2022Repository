package com.sgtesting.practiceinheritance;
//
class Maths1
{
	void addition(int c,int d)
	{
		System.out.println("addition result:"+(c+d));
	}
}
	class Maths2 extends Maths1
	{
		void substraction(int p,int q)
		{
			System.out.println("substraction result:"+(p-q));	
		}
	}
	class Maths3 extends Maths2
	{
		void Multiplication(int l,int s)
		{
			System.out.println("Multiplication result:"+(l*s));
		}
	}
	public class ExecuteparameterizedconstrSuperclass {
		public static void main (String args[])
		{
			Maths3 o=new Maths3();
			o.addition(40,50);
			o.substraction(12,10);
			o.Multiplication(2,3);
		}
	}
		


