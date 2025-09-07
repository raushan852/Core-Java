package com.rk.initialization_through_parameter;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		Customer martin= new Customer();
		martin.setCustomerData(101, "Mr. Martin");
		martin.getCustomerData();
		
		System.out.println("------------------");
		
		Customer alen= new Customer();
		alen.setCustomerData(102, "Mr. Alen");
		alen.getCustomerData();
	}
}
