package com.sgtesting.practiceprograms;

public class ShortWhile2DArray {

	public static void main(String[] args) {
		short a[][]= {{12,13,14},{18,16,20}};
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
