import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String args[]) throws NumberFormatException, UnknownHostException, IOException
	
	{
		String server = args[0];
		String port = args[1];
		
		System.out.println("Connecting to Server : " + server + " through port " + port);
		Socket sock = new Socket(server, Integer.parseInt(port));
		System.out.println("Connected to server :"+ sock.getRemoteSocketAddress());
		OutputStream out = sock.getOutputStream();
		DataOutputStream data = new DataOutputStream(out);
		data.writeUTF("Hello from Sathya client. Whats up dude");
		
	}
	
	
	
}
