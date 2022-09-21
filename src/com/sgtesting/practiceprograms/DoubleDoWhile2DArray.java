package com.sgtesting.practiceprograms;

public class DoubleDoWhile2DArray {

	public static void main(String[] args) {
		double a[][]={{12.5,12.7,12.8},{10.4,14.8,12.2}};
		int i=a.length-1;
		do {
			int j=a[i].length-1;
			do {
				System.out.print(a[i][j]+" ");
				j--;
			}while(j>=0);
			System.out.println();
			i--;
		}while(i>=0);


	}

}
