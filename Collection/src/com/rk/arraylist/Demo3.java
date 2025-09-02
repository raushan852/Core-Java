package com.rk.arraylist;

import java.util.ArrayList;

//Program to merge and retain of two collection addAll()  retainAll()
public class Demo3
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al1= new ArrayList<>();   // Object can accept any type of data
		al1.add("Ravi");
		al1.add("Jyoti");
		al1.add("Puja");
		
		ArrayList<String> al2= new ArrayList<>();
		al2.add("Rajesh");
		al2.add("Sudhakar");
		al2.add("Natraj");
		al2.add("Shubham");
		
		al1.addAll(al2);
		al1.forEach(System.out::println);
		
		System.out.println("======================");
		
		ArrayList<String> al3= new ArrayList<>();
		al3.add("Raju");
		al3.add("Ranjan");
		al3.add("Neeraj");
		al3.add("Santosh");
		
		ArrayList<String> al4= new ArrayList<>();
		al4.add("Pallavi");
		al4.add("Ragni");
		al4.add("Neeraj");
		al4.add("Santosh");
		
		al3.retainAll(al4);
//		al3.forEach(System.out::println);
		al3.forEach(str -> System.out.println(str.toUpperCase()));
	}
}
