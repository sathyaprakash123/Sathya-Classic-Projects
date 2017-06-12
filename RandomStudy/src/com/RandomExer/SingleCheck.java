package com.RandomExer;

public interface SingleCheck {

	public static void main(String args[])
	{
		Sing s = Sing.getInstance();
		s.display();
		s.setColor("green");
		s.display();
		
		Sing y = Sing.getInstance();
		y.display();
		
		
	}
	
}
