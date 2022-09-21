package com.sgtesting.practiceprograms;

public class LongDoWhile2DArray {

	public static void main(String[] args) {
		long a[][]={{25L,27L,28L},{30L,49L,52L}};
		int i=0;
		do {
			int j=0;
			do{
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<a[i].length);
			System.out.println();
			i++;
		}while(i<a.length);

	}

}
