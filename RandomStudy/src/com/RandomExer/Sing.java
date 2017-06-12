package com.RandomExer;

public class Sing {
	
	private static Sing	singInstance = null;
	public String color = null;

	private  Sing()
	{
		
	}
	
	public  void display()
	{
		
		System.out.println("Hello From singleton Class :" + color );
	}
	
	public static Sing getInstance()
	{
		if (singInstance == null)
		{
			singInstance = new Sing();
		}
		return singInstance;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public static void main(String args[])
	{
		Sing a = Sing.getInstance();
		Sing b = Sing.getInstance();
		b.display();
		
	}
	
}
