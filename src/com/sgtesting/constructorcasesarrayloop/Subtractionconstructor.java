package com.sgtesting.constructorcasesarrayloop;

class Substraction
{
	Substraction(int a[][],int b[][])
	{
		int k=0;
		int c[][]=new int[a.length][a[k].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int m=0;m<=a[i].length-1;m++)
			{
				c[i][m]=a[i][m]-b[i][m];
			}
		}
		for(int j=0;j<=c.length-1;j++)
		{
			for(int z=0;z<=c[j].length-1;z++)
			{
				System.out.print(c[j][z]+" ");
			}
			System.out.println(" ");
		}
	}
}

public class Subtractionconstructor {

	public static void main(String[] args) {
		int d[][]= {{2,33,41},{5,6,7}};
		int f[][]= {{1,4,5},{2,1,1}};
		Substraction array=new Substraction(d,f);
	}

}



