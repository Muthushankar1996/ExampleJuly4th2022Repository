package com.sgtesting.practiceabstract;

abstract class studentaa
{
	void Library(int cardno,int rollno)
	{
		System.out.println("card in library method:"+cardno);
		System.out.println("rollno:"+rollno);
	}
}
class studentbb extends studentaa
{
	
}

public class Instancemethodexecuteinstancemethod {

	public static void main(String[] args) {
		studentbb hh=new studentbb();
		hh.Library(25, 78);

	}

}


