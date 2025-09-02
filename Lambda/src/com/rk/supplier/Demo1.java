package com.rk.supplier;

import java.util.function.Supplier;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Supplier<String> s1 = ()-> 100 + 200 + "Hyd"+ 50 + 50;
		System.out.println(s1.get());
	}

}
