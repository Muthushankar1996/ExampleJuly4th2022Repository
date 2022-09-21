package com.sgtesting.practiceprograms;

public class LastRowDoWhile2DArray {

	public static void main(String[] args) {
		int b[][]={{2,3,4},{4,5,6},{7,8,9}};
		int i=0;
		do {
			int j=0;
			do {
				if(i<=b.length-2) {
					break;
				}
				System.out.print(b[i][j]+" ");
				j++;
				}while(j<=b[i].length-1);
			System.out.println();
			i++;
		}while(i<=b.length-1);	


	}

}
