package com.RandomExer;

public class ssingle {
	
private static ssingle single = null;
private ssingle(){}
private int value;

private static ssingle getInstance()
{
return single;	
}

	
private void setMessage(int val)
{
value = val;
	
}

private void getMessage()
{
	System.out.println("Value of value is:" + value);	
}



public static void main(String args[])
{

	ssingle ss = ssingle.getInstance();
	ss.setMessage(5);
	
	ssingle ss1 = new ssingle();
	ss1.getMessage();
	
	ss1.setMessage(6);
	ss.getMessage();
	
	
	
}



}
