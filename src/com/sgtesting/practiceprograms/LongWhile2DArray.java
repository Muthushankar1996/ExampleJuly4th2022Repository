package com.sgtesting.practiceprograms;

public class LongWhile2DArray {

	public static void main(String[] args) {
		long a[][]={{25L,27L,28L},{30L,49L,52L}};
		int i=0;
		while(i<a.length) {
			int j=0;
			while(j<a[i].length){
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
