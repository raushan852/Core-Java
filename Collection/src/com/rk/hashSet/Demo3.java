package com.rk.hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Demo3 
{
	public static void main(String[] args)
	{
		Boolean b1[]= new Boolean[6];
		
		HashSet<Object> hs= new HashSet<>();
		b1[0]= hs.add("NIT");
		b1[1]= hs.add(12);
//		b1[2]= hs.add("NIT");
		b1[2]= hs.add(new String("NIT"));
		b1[3] = hs.add(false);
		b1[4] = hs.add(new StringBuffer("HYD"));
		b1[5] = hs.add(new StringBuffer("HYD"));
		
		System.out.println(Arrays.toString(b1));
		hs.forEach(System.out::println);
	}

}
