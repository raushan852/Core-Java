package com.rk.string;

public class CommonMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "Virat Kohli";
		System.out.println(s1.startsWith("Vi"));//true
		
		String s2 = "Hyderabad";
		System.out.println(s2.endsWith("bad"));//true
		
		String s3 = "it is a nice city";
		System.out.println(s3.indexOf("it"));//0
		System.out.println(s3.lastIndexOf("it"));//14
		System.out.println(s3.lastIndexOf("hyd"));//-1
		System.out.println(s3.lastIndexOf(" ")); //12

		String str= "raushan";
		System.out.println(str.toUpperCase());//RAUSHAN

	}
}
