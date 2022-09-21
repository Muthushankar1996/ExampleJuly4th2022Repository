package com.sgtesting.practiceprograms;

public class StringDoWhile2DArray {

	public static void main(String[] args) {
		String s[][]={{"Automation","Testing"},{"Testing","Automation"}};
		int i=0;
		do {
			int j=0;
			do {
				System.out.print(s[i][j]+" ");
				j++;
			}while(j<s[i].length);
			System.out.println();
			i++;
		}while(i<s.length);

	}

}
