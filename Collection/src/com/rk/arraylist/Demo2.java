package com.rk.arraylist;

import java.util.ArrayList;
import java.util.List;

//Custom object
record Product(int id, String name, double price)
{
	
}


public class Demo2 
{
	public static void main(String[] args) 
	{
		List<Product> listOfProduct= new ArrayList<>();
		listOfProduct.add(new Product(101,"Laptop",69999.0));
		listOfProduct.add(new Product(102,"Mobile",11999.0));
		listOfProduct.add(new Product(103,"Headphone",999.0));
		
//		for(Product p: listOfProduct)
//		{
//			System.out.println("Product [Id: "+p.id()+", Name: "+p.name()+", Price: "+p.price()+" ]");
//		}
		
		listOfProduct.forEach(System.out::println);

	}

}
