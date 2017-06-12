package com.RandomExer;

import Decoder.BASE64Encoder;

public class auth {

	public static void main(String args[])
	{
	   String userName = "sathya";
	   String pass = "whatsup";
	   String authString = userName+ ":"+ pass;
	   BASE64Encoder bc = new BASE64Encoder();
	   byte[] b = authString.getBytes();
	   String x = bc.encode(b);
	   System.out.println("Encoded Value : " + " of "+ authString + " is "+x);
					
	}
	
}
