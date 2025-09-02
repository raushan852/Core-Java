package com.rk.Consumer;

import java.util.function.Consumer;

public class Demo1
{
	public static void main(String[] args) 
	{
		//Consume different type of values
		Consumer<String> conString= num -> System.out.println(num);
		conString.accept("Raushan");
		
		Consumer<Integer> conInteger= num -> System.out.println(num);
		conInteger.accept(852);
		
		Consumer<Float> conFloat= num -> System.out.println(num);
		conFloat.accept(123.45f);

	}

}
