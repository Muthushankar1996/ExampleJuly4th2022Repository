package com.sgtesting.practiceprograms;

public class ShortDoWhile2DArray {

	public static void main(String[] args) {
		short a[][]= {{12,13,14},{18,16,20}};
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
