package com.sgtesting.practicfileiopackage;

import java.io.File;

public class WithoutuseMKDscreatenesteddirectory{

		public static void main(String[] args) {
			//CreateFolder();
			//CreateFolder1();
			//CreatesubFolders();
			CreatesubFolders();
	        
		}

		private static void CreatesubFolders()
		{
			for(int i=0;i<=0;i++)
			{
			File f1=new File("D:\\Demo2\\sample1");
			f1.mkdir();
			for(int j=0;j<=0;j++)
			{
				File f2=new File("D:\\Demo2\\sample1\\sample2");
				f2.mkdir();
				for(int k=0;k<=0;k++)
				{
					File f3=new File("D:\\Demo2\\sample1\\sample2\\sample3");
					f3.mkdir();
					for(int m=0;m<=0;m++)
					{
						File f4=new File("D:\\Demo2\\sample1\\sample2\\sample3\\sample4");
						f4.mkdir();
					}
				}
					
			}
			
			}
			
		}

	}