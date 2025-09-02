package com.rk.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Demo2 
{
	public static void main(String[] args) 
	{
		//Verify whether my name starts with R or not
		Predicate<String> p1= str -> str.startsWith("R");
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name= sc.nextLine();
		System.out.println(name+" starts with 'R': "+ p1.test(name));
	}
}
