package com.sgtesting.practiceabstract;

abstract class studentA
{
	static void Library()
	{
		String sname="jackie";
		System.out.println("same in library method:"+sname);
	}
}
class studentB extends studentA
{
	
}

public class StaticmethodAbstractclass {

	public static void main(String[] args) {
		studentB hh=new studentB();
		hh.Library();
       
	}

}