package com.sgtesting.practiceprograms;

public class CharDoWhile2DArray {

	public static void main(String[] args) {
		char a[][]={{'a','v','a','j'},{'e','r','o','c'}};
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
