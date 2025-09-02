package com.rk.hashSet;

import java.util.HashSet;

public class Demo2 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<>();	  
		  hs.add("Ravi");  
		  hs.add("Vijay");
		  hs.add("Ravi"); 
		  hs.add("Ajay");
		  hs.add("Palavi");
		  hs.add("Sweta");
		  hs.add(null);   
		  hs.add(null);
		  hs.forEach(str -> System.out.println(str));


	}

}
