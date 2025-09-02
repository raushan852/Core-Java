package com.rk.arraylist;

import java.util.ArrayList;

//How to add ArrayList element
public class Demo1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(100);
		numbers.add(50);
		numbers.add(150);
		numbers.add(300);
		numbers.add(200);
		
		int sum=0;
		
		for(int number: numbers)
		{
			sum+= number;
		}
		
		System.out.println("Sum is: "+sum);
	}
}
