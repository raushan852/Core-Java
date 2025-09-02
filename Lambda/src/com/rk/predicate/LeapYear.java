package com.rk.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		//To find leap year
				Predicate<Integer> p1= year -> (year %4 == 0) || (year %400 == 0);
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter the year: ");
				int year= sc.nextInt();
				System.out.println(p1.test(year) ? year+" is leap year" : year+" is normal year");

	}

}
