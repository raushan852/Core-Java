package com.rk.supplier;

import java.util.function.Supplier;

class Player
{
	private int id;
	private String name;
	
	public Player(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

}

public class Demo2
{
	public static void main(String[] args) 
	{
		Supplier<Player> s2 = () -> new Player(18, "Virat");
		Player player = s2.get();
		System.out.println(player);
	}

}
