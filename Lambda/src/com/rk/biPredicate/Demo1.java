package com.rk.biPredicate;

import java.util.function.BiPredicate;

public class Demo1
{
	public static void main(String[] args) 
	{
		BiPredicate<String, Integer> filter = (x, y) -> 
		{
            return x.length() == y;  
        };

        boolean result = filter.test("Ravi", 4);
        System.out.println(result);  

        result = filter.test("Hyderabad", 10);
        System.out.println(result);

	}
}
