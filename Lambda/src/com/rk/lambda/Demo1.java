package com.rk.lambda;

@FunctionalInterface
interface length
{
	public abstract int getLength(String str);
//	int getLength(String str);
}

public class Demo1 
{
	public static void main(String[] args)
	{
		length l= (str) -> str.length();
		System.out.println("Length is: "+l.getLength("Hyderabad"));
//		calc.doSum(10, 20);

	}

}
