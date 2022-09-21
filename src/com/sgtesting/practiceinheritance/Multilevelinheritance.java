package com.sgtesting.practiceinheritance;

class maths10
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class maths20 extends maths10
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class maths30 extends maths20
{
	void multipication(int a,int b)
	{
		int res=a*b;
		System.out.println(res);
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		maths30 obj=new maths30();
		obj.addition(10,20);
		obj.substraction(20,5);
		obj.multipication(10,5);

	}

}


