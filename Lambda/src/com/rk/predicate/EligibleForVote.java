package com.rk.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class EligibleForVote
{
	public static void main(String[] args) 
	{
		//To find eligible for vote or not
				Predicate<Integer> p1= age -> age>=18 && age>0;
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter the name: ");
				String name= sc.nextLine();
				System.out.print("Enter the age: ");
				int age= sc.nextInt();
				System.out.println(p1.test(age) ? name +" is eligible for vote" : name+" is not eligible for vote");
	}

}
