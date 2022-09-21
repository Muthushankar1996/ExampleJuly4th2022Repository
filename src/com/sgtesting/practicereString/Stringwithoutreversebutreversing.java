package com.sgtesting.practicereString;

public class Stringwithoutreversebutreversing {

	public static void main(String[]args) {
		Reverse();
		Reverse2();
		Reverse3();

	}
	private static void Reverse()
	{
		String s="muthu";
		char q[]=s.toCharArray();
		for(int i=q.length-1;i>=0;i--)
		{
			System.out.println(q[i]);
		}
		System.out.println();
	}
	private static void Reverse2() 
	{
		String s="ram";
		char o[]=s.toCharArray();
		for(int i=o.length-1;i>=0;i--)
		{
			System.out.println(o[i]);
		}
		System.out.println();
	}
	private static void Reverse3()
	{
		String s="software";
		char o[]=s.toCharArray();
		for(int i=o.length-1;i>=0;i--)
		{
			System.out.println(o[i]);
		}
	}

}
