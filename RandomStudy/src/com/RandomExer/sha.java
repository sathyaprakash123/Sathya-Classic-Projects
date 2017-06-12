package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class sha {

	
	public static void main(String args[]) throws NoSuchAlgorithmException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value  = br.readLine();
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.reset();
		md.update(value.getBytes());
		byte[] hashValue = md.digest();
		Formatter ft = new Formatter();
		for (byte hash : hashValue)
		{
			System.out.println("byte value : "+ hash);
			ft.format("%02x", hash);
						
		}
		
		System.out.println("SHA1 value of "+ value +"  is "+ft.toString());
			
	}
	
	
}
