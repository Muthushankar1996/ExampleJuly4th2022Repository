package com.sgtesting.practiceinterfaces;

interface StudentA
{
	void Displayname(String name);
}
interface StudentB extends StudentA
{
	void Displayname2(String name);
}
interface StudentC extends StudentA
{
	void Displayname3(String name);
}
class DisplayC implements StudentA
{
	public void Displayname(String name)
	{
		System.out.println("name of student1:"+name);
	}
	public void Displayname2(String name)
	{
		System.out.println("name of student2:"+name);
	}
	public void Displayname3(String name)
	{
		System.out.println("name of student3:"+name);
	}
}


public class InterfacesextendsinHHapproach3 {

	public static void main(String[] args) {
      DisplayC obj=new DisplayC();
      obj.Displayname("lohit");
      obj.Displayname("hari");
      obj.Displayname3("mahi");
	}

}



