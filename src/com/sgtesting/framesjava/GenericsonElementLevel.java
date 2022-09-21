package com.sgtesting.framesjava;

	class GenericElements
	{
		public static<E> void readElements(E[] elements)
		{
			for(E element:elements)
			{
				System.out.println(element);
			}
		}
	}
	public class GenericsonElementLevel {
		public static void main(String[] args) {
			String colors[]= {"Blue","Green","Red","White"};
			GenericElements.readElements(colors);
			System.out.println("--------");
			Integer[] arr= {100,200,300,400};
			GenericElements.readElements(arr);
			System.out.println("--------");
			Double[] d= {1.25,4.55,3.75};
			GenericElements.readElements(d);
		}

	}

