package com.RandomExer;

import java.util.Observable;

public class Observed extends Observable{

	String name= "sathya";
	
	public void setName(String name)
	{
		this.name = name;
		setChanged();
		notifyObservers();
	}
	
	public String getName()
	{
		return name;
	}
	
}
