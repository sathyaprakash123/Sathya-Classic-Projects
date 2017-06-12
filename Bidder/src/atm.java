
public class atm implements Runnable{

	sync Sync;
	String threadName;
	
	public atm(sync sync1, String name)
	{
		Sync = sync1;
		threadName = name;
				
	}

	@Override
	public void run() {
		
		System.out.println("Starting Thread : " + Thread.currentThread());
		Sync.counter();
		System.out.println("Exiting Thread : " + Thread.currentThread());
				
	}
	
	
	public static void main(String args[])
	{
		sync ssync = new sync();
		atm t1 = new atm(ssync, "Thread 1");
		atm t2 = new atm(ssync, "Thread 2");
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		tt1.setPriority(Thread.MAX_PRIORITY);
		tt1.start();
		tt2.start();
		
	}
	
}
