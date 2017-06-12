import java.net.InetAddress;
import java.net.UnknownHostException;

public class ThreadRunner extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello. Thread Started" + Thread.currentThread());
		System.out.println(this.getName());
		
		
	}
	
	public static void main(String args[]) throws UnknownHostException
	
	{
		
		ThreadRunner tr = new ThreadRunner();
		tr.start();
		ThreadRunner tr1 = new ThreadRunner();
		tr1.start();
		tr1.setName("Sat Thread");
		InetAddress ip = InetAddress.getByName("www.google.com");
		System.out.println(ip);
		System.out.println(ip.getCanonicalHostName());
		System.out.println(ip.getLoopbackAddress());
		System.out.println(ip.isSiteLocalAddress());
		System.out.println(ip.getAddress());
		
					
	}

}
