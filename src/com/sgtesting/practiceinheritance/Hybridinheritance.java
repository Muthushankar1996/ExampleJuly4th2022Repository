package com.sgtesting.practiceinheritance;

class Mats1
{
	void addition(int m,int n)
	{
		System.out.println("addition result:"+(m+n));
	}
}
    class Mats2 extends Mats1
{
	void substraction(int n,int p)
	{

		System.out.println("substraction result:"+(n-p));	
	}
}
    class Mats3 extends Mats2
    {
    	void division(int a,int b)
    	{
    		System.out.println("division result:"+(a/b));	
    	}
    }
    class Mats4 extends Mats1
    {
    	void multiplication(int a,int b)
    	{
    		System.out.println("multiplication result:"+(a*b));	
    	}
    }
    public class Hybridinheritance {
    	public static void main(String args[])
    	{
    		Mats3 o=new Mats3();
    		o.addition(6, 2);
    		o.substraction(30, 20);
    		o.division(40, 10);
    		Mats4 o1=new Mats4();
    		o1.addition(20, 5);
    		o1.multiplication(40, 10);
    	}
    }
    	

