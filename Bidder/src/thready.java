
public class thready extends Thread {
	
	public void run()
	{
		System.out.println("Hello");
	}
	

	public static void main(String args[])
	{
		thready td = new thready();
		Thread x = new Thread(td);
		x.run();
		
		
	}
	
}
