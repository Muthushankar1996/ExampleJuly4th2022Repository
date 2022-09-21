package com.sgtesting.practicereturnvalue;
class Returnname
{
	String name(String b)
	{
		return b;
	}
}
public class Namereturn {

	public static void main(String[] args) {
		Returnname obj=new Returnname();
		String zz=obj.name("muthu"); 
		System.out.println(zz);
	}
}
