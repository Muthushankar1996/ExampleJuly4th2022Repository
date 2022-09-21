package com.sgtesting.practiceprograms;

public class AddTwoMatDoWhile2D {

	public static void main(String[] args) {
		int a[][]= {{2,3,4},{5,6,7}};
		int b[][]= {{10,2,30},{40,50,60}};
		int c[][]=new int[2][3];
		int i=0;
		do {
			int j=0;
			do {
				c[i][j]=b[i][j]+a[i][j];
				System.out.print(c[i][j]+" ");
				j++;
				}while(j<=b[i].length-1);
			System.out.println();
			i++;
			}while(i<=b.length-1);

	}

}
