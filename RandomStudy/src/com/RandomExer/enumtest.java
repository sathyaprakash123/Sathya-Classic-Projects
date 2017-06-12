package com.RandomExer;

public class enumtest {

	public  enum name {sathya, shiva, surya}
	
	public enumtest(name nam)
	{
		
		System.out.println("Enum value now is : "+ nam);
		
	}
	
	
	
	public static void main(String args[])
			{
		
		enumtest e = new enumtest(name.sathya);
		
				
			}
	
	
}
