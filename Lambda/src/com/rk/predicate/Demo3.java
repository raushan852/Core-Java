package com.rk.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Demo3 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name= sc.nextLine();
		
		//Verify that your name is Raushan
		Predicate<String> p1= str -> str.equalsIgnoreCase(name);
		System.out.println("Are u Raushan: "+p1.test("Raushan"));
	}
}
