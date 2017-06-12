package com.RandomExer;

import java.util.Observable;

public class looked extends Observable{

	
	private String name = "sathya";
	
	public void setName(String name)
	{
		String nama = name;
		if (!nama.equals(this.name)) 
		{
		this.name = name;
		setChanged();
		notifyObservers();
		}
		
	}
	
	public void getName()
	{
		System.out.println("String Value = "+ name);
	}
	
	
}
