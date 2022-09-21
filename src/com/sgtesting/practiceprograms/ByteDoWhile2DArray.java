package com.sgtesting.practiceprograms;

public class ByteDoWhile2DArray {

	public static void main(String[] args) {
		byte a[][]= {{10,20,30},{40,50,60}};
		int i=0;
		do{
			int j=0;
			do {
				System.out.print(a[i][j]+" ");
				j++;
			}while(j<a[i].length);
			System.out.println();
			i++;
		}while(i<a.length);

	}

}
