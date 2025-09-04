package com.rk.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2 
{
	public static void main(String[] a) 
    {
         Map<String,String> map = new LinkedHashMap<>();
         map.put("Ravi", "1234");
		   map.put("Rahul", "1234");
		   map.put("Aswin", null);
		   map.put("Samir", null);
         
		   map.forEach((k,v)->System.out.println(k+" : "+v));
    }

}
