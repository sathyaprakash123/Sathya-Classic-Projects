import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SockServer {

	public static void main (String args[]) throws IOException
	
	{
		ServerSocket sc = new ServerSocket(6000);
		Socket server = sc.accept();
		System.out.println("Connected to : " + server.getRemoteSocketAddress());
		DataInputStream in = new DataInputStream(server.getInputStream());
        System.out.println(in.readUTF());
		DataOutputStream output = new DataOutputStream(server.getOutputStream());
		output.writeUTF("You are connected to SAT server");
		output.writeUTF("May all your dreams come true, except the wet ones");
		server.close();
	}
	
}
