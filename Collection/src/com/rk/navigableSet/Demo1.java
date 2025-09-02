package com.rk.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo1
{
	public static void main(String[] args) 
	{
		NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        System.out.println("lower(3): " + ns.lower(3));//Just below than the specified element or null    //2
        
        System.out.println("floor(3): " + ns.floor(3)); //Equal  less or null													      	//3
      
        System.out.println("higher(3): " + ns.higher(3));//Just greater than specified element or null		//4
    
        System.out.println("ceiling(3): " + ns.ceiling(3));//Equal or greater or null 											//3
        
        System.out.println("First element: "+ns.pollFirst());//Get first element and remove                       //1
        
        System.out.println("Last element: "+ns.pollLast());//Get last element and remove                         //6
        
        System.out.println("Reverse order: "+ns.reversed());//Remaining element in reverse order

	}
}
