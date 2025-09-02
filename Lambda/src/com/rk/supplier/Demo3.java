package com.rk.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

class Product
{
	private Integer id;
	private String name; 
	private Double price;
	
	public Product(Integer id, String name, Double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	

}

public class Demo3 
{
	public static void main(String[] args) 
	{
		Supplier<Product> s3 = () -> 
		{
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Product Id :");
			int id = Integer.parseInt(sc.nextLine());
	
			System.out.print("Enter Product Name :");
			String name = sc.nextLine();
	
			System.out.print("Enter Product Price :");
			double price = Double.parseDouble(sc.nextLine());			
			
			return new Product(id, name, price);
		};	

	Product product = s3.get();
	System.out.println(product);

	}

}
