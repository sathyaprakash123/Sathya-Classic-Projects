package com.RandomExer;

public class ArraryTest {
	
	
	
	public static void main(String args[])
	{
		Integer[][] array = new Integer[10][10];
		
		for (int i=0;i<10;i++)
		{
			array[i][i]= i;
		}
		
		for (int i =9;i>=0;i--)
		{
			System.out.println(array[i][i]);
		}
		
		
		
	}
	
	
}
