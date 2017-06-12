package com.RandomExer;

public class override {
	
	public void meth(String s)
	{
		System.out.println("String value : "+ s);
	}
	
	
	public void meth(String s, String h)
	{
		System.out.println("Two values : "+ s + "  "+ h);
	}
	
	public String meth(String s, int k)
	{
		String x = s + " returned value";
		return x;
	}

	public static void main(String args[])
	{
		
		override o = new override();
		o.meth("sathya");
		o.meth("sathya", "surya");
		System.out.println(o.meth("Hellooo", 5));
		
		
	}
	
	
}
