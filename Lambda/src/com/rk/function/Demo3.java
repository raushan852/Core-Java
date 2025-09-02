package com.rk.function;

import java.util.Scanner;
import java.util.function.Function;

public class Demo3 
{
	public static void main(String[] args) 
	{
	  //Verify the name starts with 'R' or not ?
		
	  Function<String, Boolean> fn3 = 	str -> str.startsWith("R");
	  Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name :");
      String name = sc.nextLine();
      
      Boolean isValid = fn3.apply(name);
      
      System.out.println("Does your name start with 'R' : "+isValid);
      sc.close();
	}

}
