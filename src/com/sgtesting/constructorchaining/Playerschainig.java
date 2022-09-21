package com.sgtesting.constructorchaining;

class Players1
{
	Players1 (String firstname)
	{
		System.out.println("First name:"+firstname);	
	}
	Players1 (int idno)
	{
		this("Dhoni");
		System.out.println("idno:"+idno);
	}
}

public class Playerschainig {

	public static void main(String[] args) {
		Players1 o1=new Players1(07);
	}
}


