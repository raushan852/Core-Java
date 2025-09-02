package com.rk.arraylist;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Serialization and De-serialization on ArrayList Object
public class Demo5 
{
	public static void main(String[] args) 
	{
		ArrayList<String> listOfIceCream= new ArrayList<>();
		listOfIceCream.add("Vanilla");
		listOfIceCream.add("Strawberry");
		listOfIceCream.add("Butter Scotch");
		
		//Serialization
//		var fout= new FileOutputStream("D:\\new\\IceCream.txt");
//		var oos= new ObjectOutputStream(fout);
	}
}
