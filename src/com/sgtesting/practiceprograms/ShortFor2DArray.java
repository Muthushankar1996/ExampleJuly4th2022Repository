package com.sgtesting.practiceprograms;

public class ShortFor2DArray {

	public static void main(String[] args) {
		short a[][]= {{12,13,14},{18,16,20}};
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
