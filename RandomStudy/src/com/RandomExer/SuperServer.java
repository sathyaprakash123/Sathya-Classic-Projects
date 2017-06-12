package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SuperServer {
	
	static int port = 5001;

	public static void main(String args[]) throws IOException
	{
		
		try {
		while (true)
		{
			ServerSocket sockserver = new ServerSocket(port);
			Socket sock = sockserver.accept();
			System.out.println("Connected to Client : "+ sock.getLocalAddress());
			
			PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
			out.println("You have Connected to Super Server. Thank you : "+ sock.getLocalAddress());

			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			System.out.println("Message from Client : " + br.readLine());		
			
			sock.close();
			
			
		}
		
	}
	
	catch (IOException e)
	{e.printStackTrace();}
	
	
	
}
}
