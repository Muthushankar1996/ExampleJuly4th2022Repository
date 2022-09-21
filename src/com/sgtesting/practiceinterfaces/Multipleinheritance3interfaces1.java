package com.sgtesting.practiceinterfaces;

interface Market
{
	void vegitableName(String name);
}
interface Shop 
{
	void Thingname(String name);
}
interface Cards 
{
	void cardname(String name);
}
class Child implements Market,Shop,Cards
{
	public void vegitableName(String name)
	{
		System.out.println("name of vegitable name:"+name);
	}
	public void Thingname(String name)
	{
		System.out.println("name of thing:"+name);
	}
	public void cardname(String name)
	{
		System.out.println("name of card:"+name);
	}
}


public class Multipleinheritance3interfaces1 {
	public static void main(String[]args) {
		Child kk=new Child();
		kk.vegitableName("carrot");
		kk.Thingname("bat");
		kk.cardname("king");
	}

}


