package com.rk.function;

import java.util.Scanner;
import java.util.function.Function;

public class Demo2 
{
	public static void main(String[] args) 
	{
	  //Find the length of the String
		
      Function<String,Integer> fn2 = str -> str.length();
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your city name :");
      String city = sc.next();
      
      System.out.println(city +" length is :"+fn2.apply(city));
      sc.close();
	}

}
