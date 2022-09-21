package com.sgtesting.practiceprograms;

public class AddTwoMatFor2D {

	public static void main(String[] args) {
		int a[][]= {{2,3,4},{5,6,7}};
		int b[][]= {{10,2,30},{40,50,60}};
		int c[][]=new int[2][3];
		for(int i=0;i<=b.length-1;i++) {
			for(int j=0;j<=b[i].length-1;j++) {
				c[i][j]=b[i][j]+a[i][j];
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
			}
	}

}
