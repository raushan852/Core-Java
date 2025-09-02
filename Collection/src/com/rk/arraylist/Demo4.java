package com.rk.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Program to fetch the elements in forward and backward direction using ListIterator Interface
public class Demo4 
{
	public static void main(String[] args)
	{
		List<String> listOfName= Arrays.asList("ravi", "hilal", "santosh", "rakhi");     //Length is fixed
		Collections.sort(listOfName);
		
		//Fetching the data in both the direction
		ListIterator<String> itr= listOfName.listIterator();
		System.out.println("In Forward Direction: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------");
		System.out.println("In Backward Direction: ");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}
}
