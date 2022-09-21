package com.sgtesting.practiceMethods;

class Array
{
	void Array(char ch[][]) {
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.println(ch[i][j]+" ");
			}
		System.out.println();
			}
	}
}

public class Methodsarray {
	public static void main(String[] args) {
		char z[][]= {{'a','v'},{'a','j'}};
		
		Array obj=new Array();
		obj.Array(z);
	}

}
