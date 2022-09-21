package com.sgtesting.practicfileiopackage;

import java.io.File;

public class Foldercontainsmultiplefilesandfolders {

	public static void main(String[] args) {
		Displayfilename();
		//Displayfilename2();
		//Displayexcel();
		 //Displayimagefile();
		 Displayfolder();
	}
	private static void Displayfilename()
	{
		File f1=new File("D:\\Demo2");
		File s[]=f1.listFiles();
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i].isFile()==true)
			{
				String path=s[i].getName();
				System.out.println(path);
			}
		}
	}
	private static void Displayfilename2()
	{
		File f1=new File("D:\\Demo2");
		File s[]=f1.listFiles();
		for(int i=0;i<=s.length-1;i++)
		{
			String path=s[i].getName();
			if(path.contains("txt"))
			{
				System.out.println(path);
			}
		}
	}
	private static void Displayexcel()
	{
		File f1=new File("D:\\Demo2");
		File s[]=f1.listFiles();
		for(int i=0;i<=s.length-1;i++)
		{
			String path=s[i].getName();
			if(path.contains("xlsx"))
			{
				System.out.println(path);
			}
		}
	}
	private static void Displayimagefile()
	{
		File f1=new File("D:\\Demo2");
		File s[]=f1.listFiles();
		for(int i=0;i<=s.length-1;i++)
		{
			String path=s[i].getName();
			if(path.contains("jpg"))
			{
				System.out.println(path);
			}
		}
	}
	private static void Displayfolder()
	{
		File f1=new File("D:\\Demo2");
		File s[]=f1.listFiles();
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i].isDirectory()==true)
			{
				String path=s[i].getPath();
				System.out.println(path);
			}
			
		}
	}

}
