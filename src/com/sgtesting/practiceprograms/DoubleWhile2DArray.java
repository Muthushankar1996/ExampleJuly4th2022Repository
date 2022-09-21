package com.sgtesting.practiceprograms;

public class DoubleWhile2DArray {

	public static void main(String[] args) {
		double a[][]={{12.5,12.7,12.8},{10.4,14.8,12.2}};
		int i=a.length-1;
		while(i>=0) {
			int j=a[i].length-1;
			while(j>=0) {
				System.out.print(a[i][j]+" ");
				j--;
			}
			System.out.println();
			i--;
		}

	}

}
