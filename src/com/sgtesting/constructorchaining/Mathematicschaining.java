package com.sgtesting.constructorchaining;

class Basicmathematics1
{
	Basicmathematics1(String firstname)
	{
		System.out.println("first name:"+firstname);
	}
	Basicmathematics1(int cost)
	{
	 this("algorithms");
	 System.out.println("cost:"+cost);
	}
	
}

public class Mathematicschaining {

	public static void main(String[] args) {
		Basicmathematics1 o1=new Basicmathematics1(500);
	}
}


