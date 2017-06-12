import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class socclient {

	public static void main(String args[])
	{
		int port = Integer.parseInt(args[0]);
		

		try {
			Socket server = new Socket("localhost", port);
			System.out.println("Connected to server:"+server.getLocalSocketAddress());




			// Read from server
			BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			System.out.println("Message from Server:" + in.readLine());



			//write to server
			PrintWriter message = new PrintWriter(server.getOutputStream(), true);
			message.println("Hello Sir, my name is client");
			server.close();

		} 


		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not connect to server");
			e.printStackTrace();
		}
	}


}
