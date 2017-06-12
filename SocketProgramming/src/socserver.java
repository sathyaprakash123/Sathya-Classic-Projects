import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class socserver {

	public static void main(String args[])
	{
		int port = 5001;
		try {
			
			while (true)
			{
			
			ServerSocket client = new ServerSocket(port);
			System.out.println("Listening to Port :" + port);
			Socket serv = client.accept();
			System.out.println("Connected to client:"+serv.getLocalAddress());
			
			//*********** Write Output to client ******************
			    
			PrintWriter out = new PrintWriter(serv.getOutputStream(), true);
			out.println("Hello There, Thank you for Connecting...");
						
		    //************ Get Input from Client *******************
		   BufferedReader br = new BufferedReader(new InputStreamReader(serv.getInputStream()));
		   System.out.println("The client says : "+br.readLine());
			
			
			client.close();
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
