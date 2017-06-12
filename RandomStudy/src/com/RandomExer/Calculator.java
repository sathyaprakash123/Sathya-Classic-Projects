package com.RandomExer;

public class Calculator {
	
	public static int findMax(int[] arr)
	{
		int x[] = arr;
		int max = 0;
		
		for (int i=0;i<x.length; i++)
		{
			
			if (max < arr[i]) max = arr[i];
						
		}
		
		return max;
	}
	
}
