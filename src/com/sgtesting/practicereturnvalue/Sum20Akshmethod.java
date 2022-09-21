package com.sgtesting.practicereturnvalue;

class Sumnumber
{
	int sum(int n)
	{
		int sum=0;
		sum=(n*(n+1))/2;
		return sum;
	}
}

public class Sum20Akshmethod {

	public static void main(String[] args) {
		Sumnumber ss=new Sumnumber();
		int k=ss.sum(20);
		System.out.println(k);

	}
}