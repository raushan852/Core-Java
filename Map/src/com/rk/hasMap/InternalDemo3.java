package com.rk.hasMap;

import java.util.HashMap;

record Product(Integer id, String name)
{
	
}

public class InternalDemo3 
{
	public static void main(String[] args) 
	{
		Product p1= new Product(101, "Mobile");
		Product p2= new Product(101, "Mobile");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode()+" : "+p2.hashCode());
		
		System.out.println("-----------------");
		
		HashMap<Product, String> map= new HashMap<>();
		map.put(p1, "A");
		map.put(p2, "B");
		
		System.out.println(map.size());
		System.out.println(map);
	}
}
