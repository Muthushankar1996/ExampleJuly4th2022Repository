package com.sgtesting.constructorcasesarrayloop;

class Ascending
{
	Ascending(int c[])
	{
		for(int i=0;i<=7;i++)
		{
			for(int j=i+1;j<7;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}

			}
		}
		for(int m=0;m<7;m++)
		{
			System.out.println(c[m]);	
		}
	}
}

public class Sortascendingconstructor {

	public static void main(String[] args) {
		int d[]= {7,4,5,6,2,9,1};
		Ascending arr=new Ascending(d);

	}

}



