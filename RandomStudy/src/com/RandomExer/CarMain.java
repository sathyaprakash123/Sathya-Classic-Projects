package com.RandomExer;

public class CarMain {
 
	public static void main(String args[])
	{
		Car a = new Car("red");
	    System.out.println(a.getColor());
	    Car b = a;
	    System.out.println(b.getColor());
	    
	    CarProcess cp = new CarProcess(b);
	    cp.changeCar();
	    	    
	    System.out.println(a.getColor());
	    
	    b.setColor("orange");
	     
	    System.out.println(a.getColor());
	    
	    cp.changeCar();
	    
	    System.out.println(b.getColor());
	}
	
}
