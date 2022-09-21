package com.sgtesting.practiceprograms;

public class CharWhile2DArray {

	public static void main(String[] args) {
		char a[][]={{'a','v','a','j'},{'e','r','o','c'}};
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
