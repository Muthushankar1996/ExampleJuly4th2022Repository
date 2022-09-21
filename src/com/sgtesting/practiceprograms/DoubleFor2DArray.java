package com.sgtesting.practiceprograms;

public class DoubleFor2DArray {

	public static void main(String[] args) {
		double a[][]={{12.5,12.7,12.8},{10.4,14.8,12.2}};
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
