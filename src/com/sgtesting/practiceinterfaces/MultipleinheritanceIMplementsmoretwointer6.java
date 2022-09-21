package com.sgtesting.practiceinterfaces;

interface Parent1
{
	void showparentname(String name);
}
interface parent2
{
	void showparentname2(String name);
}
abstract class Parent3
{
	abstract void showparentname3(String name);
	void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println("sum of vairables:"+sum);
	}
}
class ChildA extends Parent3 implements Parent1,parent2
{
	public void showparentname(String name)
	{
		System.out.println("name of parent1:"+name);
	}
	public void showparentname2(String name)
	{
		System.out.println("name of parent2:"+name);
	}
	void showparentname3(String name)
	{
		System.out.println("name of parent3:"+name);
	}
}

public class MultipleinheritanceIMplementsmoretwointer6 {

	public static void main(String[] args) {
       ChildA obj=new ChildA();
       obj.addition(10,15);
       obj.showparentname("fahad");
       obj.showparentname2("timma");
       obj.showparentname3("kiccha");
	}

}



