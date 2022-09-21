package com.sgtesting.practiceprograms;

public class FirstRowWhile2DArray {

	public static void main(String[] args) {
		int b[][]={{2,3,4},{4,5,6},{7,8,9}};
		int i=0;
		while(i<=b.length-1) {
			int j=0;
			while(j<=b[i].length-1) {
				if(i>=1) {
					break;
				}
				System.out.print(b[i][j]+" ");
				j++;
				}
			System.out.println();
			i++;
		}	
	}

}
