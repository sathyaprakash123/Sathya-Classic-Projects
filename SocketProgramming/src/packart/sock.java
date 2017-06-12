package packart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class sock {

	int port = 5555;
	
	public void  loopServer() throws IOException
	
	{
		while (true)
		{
		ServerSocket sk = new ServerSocket(port);
		Socket server = sk.accept();
		System.out.println("Connected to Client :"+ server.getLocalPort());
		
		//Receive message from client
		//BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
		
		PrintWriter pr = new PrintWriter(server.getOutputStream(), true);
		pr.print("HTTP/1.1 200 \r\n");
		pr.print("Content-Type: text/HTML \r\n");
		pr.print("<html><body>");
		pr.print(server.getLocalSocketAddress());
		pr.print("</body></html>");
		pr.close();
		server.close();
		
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		sock s = new sock();
		s.loopServer();
	
		
	}
	
}
