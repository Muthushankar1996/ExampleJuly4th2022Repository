package com.sgtesting.practicereString;

public class ProgrampatterndisplayB {

	public static void main(String[] args) {
		pattern2();

	}
	private static void pattern2()
	{
		String s="program";
		char o[]=s.toCharArray();
		for(int i=1;i<=7;i++)
		{
			int k=0;
			for(int j=i;j<=7;j++)
			{
				System.out.print(o[k]+" ");
				k++;
			}
			System.out.println();
		}
	}

}

