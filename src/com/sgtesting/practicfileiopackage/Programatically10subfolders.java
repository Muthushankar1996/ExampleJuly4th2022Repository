package com.sgtesting.practicfileiopackage;

import java.io.File;

public class Programatically10subfolders {

	public static void main(String[] args) {
		CreateFolder();
		//CreateFolder1();
		//CreatesubFolders();
		//CreatesubFolders();
        
	}
	private static void CreateFolder()
	{
		File f1=new File("D:\\Demo2\\Demo3");
		boolean v1=f1.mkdir();
		System.out.println("wether folder hascreated?:"+v1);
	}
	private static void CreateFolder1()
	{
		for(int i=1;i<=10;i++)
		{
		File f1=new File("D:\\Demo1\\B"+i);
		boolean d=f1.mkdir();
		System.out.println(d);
		}
	}
}