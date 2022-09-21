package com.sgtesting.practiceMethods;
class Shakru
{
	void Reverse(char a[][])
	{
		char c[]=new char[a.length*a[0].length];
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[p]=a[i][j];
				p++;
			}
		}
		for(int m=c.length-1;m>=0;m--)
		{
			System.out.println(c[m]);
		}
	}
}

public class ArrayMethods1D {

	public static void main(String[] args) {
    char z[][]= {{'a','b','c'},{'d','e','f',}};
    Shakru obj=new Shakru();
    obj.Reverse(z);
	}
}
