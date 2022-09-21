package com.sgtesting.practiceprograms;

public class StringFor2DArray {

	public static void main(String[] args) {
		String s[][]={{"Automation","Testing"},{"Testing","Automation"}};
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}

	}

}
