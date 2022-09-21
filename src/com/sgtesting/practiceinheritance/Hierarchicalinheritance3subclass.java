package com.sgtesting.practiceinheritance;

class Mates1
{
	void addition(int m,int n)
	{
		System.out.println("addition result:"+(m+n));
	}
}
    class Mates2 extends Mates1
{
	void substraction(int n,int p)
	{

		System.out.println("substraction result:"+(n-p));	
	}
}
    class Mates3 extends Mates1
    {
    	void division(int a,int b)
    	{
    		System.out.println("division result:"+(a/b));	
    	}
    }
   

    public class Hierarchicalinheritance3subclass {
		public static void main (String args[])
		{
			Mates2 o=new Mates2();
			o.addition(40,50);
		    o.substraction(2,3);
		    Mates3 o1=new Mates3();
		   o1.division(12,10);
		   o1.addition(20, 10);
		}
	}

