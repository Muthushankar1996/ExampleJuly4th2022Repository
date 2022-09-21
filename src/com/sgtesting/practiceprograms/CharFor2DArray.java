package com.sgtesting.practiceprograms;

public class CharFor2DArray {

	public static void main(String[] args) {
		char a[][]={{'a','v','a','j'},{'e','r','o','c'}};
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
