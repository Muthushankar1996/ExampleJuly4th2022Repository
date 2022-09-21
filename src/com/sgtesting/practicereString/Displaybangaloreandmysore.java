package com.sgtesting.practicereString;

public class Displaybangaloreandmysore {

	public static void main(String[] args) {
		Display();

	}
	private static void Display()
	{
		String s="Mysore and Banglore";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.println(s1[i]+" ");
		}
	}

}
