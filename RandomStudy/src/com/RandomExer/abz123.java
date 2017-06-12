package com.RandomExer;

public class abz123 extends abs123{
	
	public void printName()
	
	{
		super.printName();
		System.out.println("Second Method");
	}
	
	public static void main(String args[])
	
	{
		abz123 x = new abz123();
		x.printName();
		
	}

	@Override
	void hello(){}
	

}
