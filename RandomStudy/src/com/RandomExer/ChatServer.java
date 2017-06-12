package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static final int port = 5000;
	public static boolean flag = false;
	
	public static void main(String args[]) throws IOException
	{
		
		
		while(true)
		{
			
		//if (flag == false){flag = true;System.out.println("Welcome to Chat Server! Have a pleasant stay");}	
		ServerSocket  chatClient = new ServerSocket(port);
		Socket sock = chatClient.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		System.out.println(sock.getRemoteSocketAddress() + " said : "+ br.readLine().toString());
		br.close();
		sock.close();
		chatClient.close();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
