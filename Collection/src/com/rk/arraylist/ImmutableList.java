package com.rk.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImmutableList
{
	public static void main(String[] args) 
	{
		List<String> listOfNumbers= List.of("rakesh", "ravi", "puja");
//		listOfNumbers.set(0, "ravi");        //java.lang.UnsupportedOperationException
//		listOfNumbers.add("jyoti");          //java.lang.UnsupportedOperationException
		listOfNumbers.remove(2);            //java.lang.UnsupportedOperationException
		System.out.println(listOfNumbers);
		

	}

}
