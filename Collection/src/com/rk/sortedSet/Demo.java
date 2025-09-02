package com.rk.sortedSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo 
{
	public static void main(String[] args) 
	{
        NavigableSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");
        
        // Elements are automatically stored in default sorting order
        System.out.println("Fruits in Sorted Order: " + fruits);

        System.out.println("First Element: " + fruits.first());
        System.out.println("Last Element: " + fruits.last());

        // Elements less than "Mango"
        System.out.println("HeadSet (before Mango): " + fruits.headSet("Mango"));

        // Elements greater than or equal to "Mango"
        System.out.println("TailSet (from Mango): " + fruits.tailSet("Mango"));

        // SubSet (range)
        System.out.println("SubSet (Apple to Orange): " + fruits.subSet("Apple", "Orange"));
	}
}