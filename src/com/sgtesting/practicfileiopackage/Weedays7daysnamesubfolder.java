package com.sgtesting.practicfileiopackage;

	import java.io.File;

	public class Weedays7daysnamesubfolder {

		public static void main(String[] args) {
			//Weekdays();
			Approach2();
			

		}
	    private static void Weekdays()
	    {

	    	File f1=new File("D:\\Demo2\\sunday\\Monday\\Tuesday\\Wednsday\\Thursday\\Friday\\Saturday");
	    	boolean d=f1.mkdirs();
	    	System.out.println(d);
	    }
	    	private static void Approach2()
	    	{
	    		String s[]={"Monday","Tuesday","Wednsday","Thursday","Friday","Saturday","Sunday"};
	    		for(int i=0;i<=s.length-1;i++)
	    		{
	    			File f1=new File("D:\\Demo2\\"+s[i]);
	    			f1.mkdir();
	    		}
	    	}
	}
