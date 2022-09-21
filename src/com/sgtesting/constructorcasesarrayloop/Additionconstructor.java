package com.sgtesting.constructorcasesarrayloop;

class Addition
{
	Addition(int a[][],int b[][])
	{
		int k=0;
		int c[][]=new int[a.length][a[k].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int m=0;m<=a[k].length-1;m++)
			{
				c[i][m]=a[i][m]+b[i][m];
			}
		}
		for(int j=0;j<=c.length-1;j++)
		{
			for(int y=0;y<=c[j].length-1;y++)
			{
				System.out.print(c[j][y]+" ");
			}
			System.out.println(" ");

		}
	}
}

public class Additionconstructor {

	public static void main(String[] args) {
		int d[][]= {{2,33,41},{5,6,7}};
		int f[][]= {{4,6,7},{9,3,4}};
		Addition array=new Addition(d,f);

	}

}


