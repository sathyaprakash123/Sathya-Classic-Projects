package packart;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class servetest {
	
	
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		int p = 4000;
		
		while (true)
		{
			ServerSocket portone = new ServerSocket(4000);
			Socket con = portone.accept();
			System.out.println("Connected to Server :" + con.getLocalAddress());
			BufferedWriter br = new BufferedWriter(new PrintWriter(con.getOutputStream(), true));
			br.write("Welcome to Sathya Server");
				
			
		}
		
	}

}
