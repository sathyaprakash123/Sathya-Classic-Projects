package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SuperClient {

	static final int port = 5001;
	
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		
		Socket ss = new Socket("localhost", port);
		
		PrintWriter pr = new PrintWriter(ss.getOutputStream(), true);
		pr.write("Hi, this is the Client. Thanks for accepting connection!");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		System.out.println("Message from Server : "+ br.readLine().toString());
		
		ss.close();
			
		
		
	}
	
	
}
