package com.sgtesting.practiceprograms;

public class StringWhile2DArray {

	public static void main(String[] args) {
		String s[][]={{"Automation","Testing"},{"Testing","Automation"}};
		int i=0;
		while(i<s.length) {
			int j=0;
			while(j<s[i].length) {
				System.out.print(s[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
