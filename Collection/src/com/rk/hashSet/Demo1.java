package com.rk.hashSet;

import java.util.HashSet;

public class Demo1 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs= new HashSet<>();
		hs.add(67); 
		hs.add(89);		
		hs.add(33);
		hs.add(45);
		hs.add(12);
		hs.add(35);	
		hs.add(null);

//		System.out.println(hs);
		hs.forEach(System.out::println);
	}
}
