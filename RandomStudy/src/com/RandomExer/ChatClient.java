package com.RandomExer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	
	public static String clientName;

	public static void main(String args[]) throws UnknownHostException, IOException
	{
		System.out.println("Enter Chat Name : ");
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		ChatClient.clientName = fr.readLine();
		
		while (true)
		{
		Socket server = new Socket("localhost", 5000);
		PrintWriter message = new PrintWriter(server.getOutputStream(), true);
		System.out.println("Send Message : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mes = ChatClient.clientName + " : " + br.readLine().toString();
		message.println(mes.toString());
		message.close();
		server.close();
		
		}
		
		
	}
	
	
}
