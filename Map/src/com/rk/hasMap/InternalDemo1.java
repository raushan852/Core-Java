package com.rk.hasMap;

import java.util.HashMap;

public class InternalDemo1
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> hm= new HashMap<>();
		hm.put("A", 1);
		hm.put("A", 2);
		hm.put(new String("A"), 3);
		
		System.out.println("Size is: "+hm.size());
		System.out.println(hm);
		
		System.out.println("--------------------");
		
		HashMap<Integer, Integer> hm1= new HashMap<>();
		hm1.put(128, 1);
		hm1.put(128, 2);	
		System.out.println("Size is: "+hm1.size());
		System.out.println(hm1);
		
		System.out.println("---------------------");
		
		HashMap<Object, Object> hm2= new HashMap<>();
		hm2.put("A", 1);
		hm2.put("A", 2);
		hm2.put(new String("A"), 3);
		hm2.put(65, 4);
		System.out.println("Size is: "+hm2.size());
		System.out.println(hm2);
	}
}
