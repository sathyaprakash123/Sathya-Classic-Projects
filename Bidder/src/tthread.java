
public class tthread extends Thread{
	private String name;
	
	
	public tthread(String x)
	
	{
		name = x;
		System.out.println("Thread Name : " + name);
	}

	public void run()
	{
		System.out.println("Thread Started : " + name);
		try {
			for (int i=1;i<20;i++) { this.sleep(300);System.out.println("Thread "+name+" Running");}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Completed");
	}
	
	public static void main(String args[])
	{
		
			tthread t1  = new tthread("Superman");
			t1.start();
			tthread t2 = new tthread("Spiderman");
		    t2.start();
	}
	
}
