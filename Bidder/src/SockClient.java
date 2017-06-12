import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SockClient {

	public static void main(String args[]) throws UnknownHostException, IOException
	{
	int port = Integer.parseInt(args[1]);
	String server = args[0];
	
	System.out.println("Connecting to Server : "+server+" through port :"+ port);
	Socket ser = new Socket(server, port);
	System.out.println("Connected to server : "+ ser.getRemoteSocketAddress());
	
	//write outpupt
	PrintWriter out = new PrintWriter(ser.getOutputStream(), true);
	out.write("Message from Client to Server");
	
	//Read input
	BufferedReader br = new BufferedReader(new InputStreamReader(ser.getInputStream()));
	while (br.readLine() != null)
	{
		System.out.println(br.readLine().toString());
	}
	
	
	InputStream is = ser.getInputStream();
	DataInputStream dis = new DataInputStream(is);
	System.out.println(dis.readUTF());
	
	}
	
	
	
}
