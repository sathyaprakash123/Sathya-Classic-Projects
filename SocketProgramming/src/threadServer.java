import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class threadServer implements Runnable {

	int port;
	
	public threadServer(int port1)
	{
		port = port1;
		
	}
	

	@Override
	public void run() {

		System.out.println("Welcome to thread Server. Thread " + Thread.currentThread() + " at your service");
		System.out.println("Port Used:" + port);
		
		try {
			
			while (true)
			{
			ServerSocket client = new ServerSocket(port);
			Socket sock = client.accept();
			System.out.println("Connected to Server :"+ sock.getRemoteSocketAddress());
			//write to the client
			PrintWriter message = new PrintWriter(sock.getOutputStream(), true);
			message.println("Hello there, you are connected to "+Thread.currentThread()+" server");
			client.close();	
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String args[])

	{
		threadServer th = new threadServer(60707);
		Thread server1 = new Thread(th);
		server1.start();
		threadServer th2 = new threadServer(60708);
		Thread server2 = new Thread(th2);
		server2.start();
		
	}

}
