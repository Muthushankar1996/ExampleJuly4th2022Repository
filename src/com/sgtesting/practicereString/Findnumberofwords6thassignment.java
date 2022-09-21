package com.sgtesting.practicereString;

public class Findnumberofwords6thassignment {

	public static void main(String[] args) {
		pattern2();
	}
	private static void pattern2()
	{
		String s="the temple is at top of the hill";
		String s1[]=s.split(" ");
		int count=0;
		for(int i=0;i<=s1.length-1;i++)
		{
			count=count+1;
		}
		System.out.println("no of words in a given string is:"+count);

	}
}
