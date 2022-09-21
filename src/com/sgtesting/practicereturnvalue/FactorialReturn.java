package com.sgtesting.practicereturnvalue;

class Factorial
{
	int Fact(int num)
	{
	int fact=1;
	for(int i=num;i>=1;i--)
	{
		fact=fact*i;
	}
	return fact;
	}
}

public class FactorialReturn {

	public static void main(String[] args) {
		Factorial fa=new Factorial();
		int h=fa.Fact(5);
		System.out.println(h);
	}
}


