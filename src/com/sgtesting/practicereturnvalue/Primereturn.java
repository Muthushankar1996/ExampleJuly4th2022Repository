package com.sgtesting.practicereturnvalue;

class Prime2
{
	Boolean Primenumber2(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;                       
			}
			return true;
		}
		return null;
	}
}

public class Primereturn {

	public static void main(String[] args) {
		Prime2 jj=new Prime2();
		Boolean yy=jj.Primenumber2(7);
		if(yy==true)
		{
			System.out.println("it is a prime number");
		}
		else if(yy==false)
		{
			System.out.println("it is not a prime number");
		}
	}
}
