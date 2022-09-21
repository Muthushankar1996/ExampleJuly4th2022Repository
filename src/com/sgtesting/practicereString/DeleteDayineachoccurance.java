package com.sgtesting.practicereString;

public class DeleteDayineachoccurance {

	public static void main(String[] args) {
		deleteString();

	}
	private static void deleteString()
	{
		String h="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";

		System.out.println(h.replace("DAY",""));
	}

}
