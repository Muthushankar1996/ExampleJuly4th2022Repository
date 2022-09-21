package com.sgtesting.practiceinheritance;

class Demo4
{
	String player;
	void name()
	{
		System.out.println("the name of the player in superclass:"+player);
	}
}
class Demo5 extends Demo4
{
	Demo5(String pname)
	{
		super.player=pname;
	}
void display() 
{
	System.out.println("the name of the player in subclass:"+player);
}
}
public class MultilevelExecuteallthevariables
{
	public static void main(String args[])
	{
		Demo5 o=new Demo5("dhoni");
		o.player="allrounder";
		o.display();
		o.name();
	}
}