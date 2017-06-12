package com.RandomExer;

import java.io.IOException;


public class excep {

	public void calculate() 
	{
		int x = 5/1;
		throw new ArithmeticException("Wrong calculation");
	}
	
	public void calc()
	{
		calculate();
	}
	
	public void c()
	{
		calc();
	}
	
	public static void main(String args[]) throws IOException
	{
		excep x = new excep();
			
		x.calculate();
		
			
		
	}
	
	
	
}
