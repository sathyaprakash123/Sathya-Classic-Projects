import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SockPlay {

	static int port = 5555;
	
	public static void main(String args[]) throws IOException
	
	{
		while (true)
		{
			ServerSocket con = new ServerSocket(port);
			Socket connection = con.accept();
			System.out.println("Connected through port : " + connection.getPort());
			
			PrintWriter pp = new PrintWriter(connection.getOutputStream(), true);
			pp.println("Hello, Welcome to SAT server");
			pp.println("Your Ip : " + InetAddress.getLocalHost());
									
			pp.close();
			connection.close();
			con.close();
			
			
			
		}
	}
	
}
