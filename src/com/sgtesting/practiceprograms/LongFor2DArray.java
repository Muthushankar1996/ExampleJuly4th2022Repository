package com.sgtesting.practiceprograms;

public class LongFor2DArray {

	public static void main(String[] args) {
		long a[][]={{25L,27L,28L},{30L,49L,52L}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
