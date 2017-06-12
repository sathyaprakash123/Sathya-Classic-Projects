package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class Digest {

	public static void main(String args[]) throws IOException
	
	{
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 String input = br.readLine().toString();
	 
	 byte[] bh = input.getBytes();
	 Formatter ft = new Formatter();
	 for (byte b : bh)
	 {
		 System.out.println("Byte Value : "+ b);
		 ft.format("%02x",b);
	 }
	 
	 System.out.println("Formatted Value : "+ ft.toString());
		
	}
	
	
}
