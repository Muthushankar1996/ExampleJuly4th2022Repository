package com.sgtesting.practicereturnvalue;

class Oddnumbers
{
	int countodd()
	{
		int count=0;
		for(int i=91;i>=31;i--)
		{
			if(i%2==1)
			{
				count=count+1;
			}
		}
		return count;
	}
}

public class CountReturnodd {

	public static void main(String[] args) {
		Oddnumbers kk=new Oddnumbers();
		int y=kk.countodd();
		System.out.println(y);
	}

}