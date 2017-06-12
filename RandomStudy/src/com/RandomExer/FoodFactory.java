package com.RandomExer;

public class FoodFactory {

	
	public String foodname;
	
	public Food setName(String name)
	
	{
		Food f1 = new Food();
		f1.foodname = name;
		return f1;
		
	}
	
	public void printName()
	{
		System.out.println("I would like to have : "+ this.foodname);
	}
	
}
