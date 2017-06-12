package com.RandomExer;

public class Geometry implements Circle, Rectangle1{

	@Override
	public int area(int width, int height) 
	{
		
			int area = width * height;
			return area;
		
	}

	@Override
	public double area(int radius) {
		
		double area = radius * 3.14;
		return area;
	}
	
	public static void main(String args[])
	{
		Geometry g = new Geometry();
		
		System.out.println("Area of rectangle = " +  g.area(10, 15));
		System.out.println("Area of Circle = " +  g.area(10));
	}

}
