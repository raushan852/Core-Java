package com.rk.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfDemo
{
	public static void main(String[] args)
	{
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Raj");
		listOfNames.add("Rohit");
		listOfNames.add("Rohan");
		listOfNames.add("Ankit");
		listOfNames.add("Scott");
		
		System.out.println("Original List :"+listOfNames);
				
		listOfNames.removeIf(str -> str.startsWith("R"));
		
		System.out.println("After Removing :"+listOfNames);	

	}
}
