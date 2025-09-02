package com.rk.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Demo1
{
	public static void main(String[] args) 
	{
		//To verify a number is even or odd
		Predicate<Integer> p1= num -> num%2 == 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number= sc.nextInt();
		
		boolean isEven= p1.test(number);
		System.out.println(number+" is even: "+isEven);
	}
}
