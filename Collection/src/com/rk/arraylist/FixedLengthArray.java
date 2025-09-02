package com.rk.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FixedLengthArray 
{
	public static void main(String[] args)
	{
		List<Integer> listOfNumber= Arrays.asList(10,50,40,87,47);
		System.out.println(listOfNumber);
		
//		listOfNumber.remove(0);       // java.lang.UnsupportedOperationException
//		listOfNumber.add(5);              // java.lang.UnsupportedOperationException
		
		listOfNumber.set(0, 121);
		
		System.out.println(listOfNumber);

	}

}
