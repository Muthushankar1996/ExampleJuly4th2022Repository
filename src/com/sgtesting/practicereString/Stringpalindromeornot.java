package com.sgtesting.practicereString;

public class Stringpalindromeornot {

	public static void main(String[] args) {
		Palindrome();
	}
	private static void Palindrome()
	{
		String s="gadag";
		char o[]=s.toCharArray();
		String rev="";
		for(int i=o.length-1;i>=0;i--)
		{
			rev=rev+o[i];
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Givenstring is palindrom:"+s);
		}
		else
		{
			System.out.println("Given string is not a palindrome:"+s);
		}



	}	

}
