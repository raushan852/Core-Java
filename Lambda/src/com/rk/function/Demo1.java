package com.rk.function;

import java.util.Scanner;
import java.util.function.Function;

public class Demo1
{
	public static void main(String[] args) 
	{
	  //Find the cube of the number
	  Function<Integer,Integer> fn1 = num -> num*num*num;	
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a number :");
	  
	  int num = sc.nextInt();
//	  System.out.println("Cube of "+num+" is : "+fn1.apply(num));  
      	  sc.close();
	}

}
