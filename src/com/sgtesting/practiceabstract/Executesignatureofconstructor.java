package com.sgtesting.practiceabstract;

abstract class Bikes
{
	Bikes(String name)
	{
		System.out.println("name of bike:"+name);
	}
	Bikes(int rs)
	{
		System.out.println("cost:"+rs);
	}
}
class Bikes2 extends Bikes
{
	Bikes2(String bname)
	{
		super(bname);
	}
	Bikes2(int k)
	{
		super(k);
	}
}

public class Executesignatureofconstructor {

	public static void main(String[] args) {
       Bikes2 ll=new Bikes2("splender");
       Bikes2 ll2=new Bikes2(150000);
	}

}

