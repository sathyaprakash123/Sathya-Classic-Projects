
public class threadman extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Started, Thread Name: " + Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("Thread Completed");
	}

	public static void main(String args[])
	{
		threadman tj = new threadman();
		Thread tt = new Thread(tj);
		tt.start();
		threadman tk = new threadman();
		Thread tx = new Thread(tk);
		tx.start();
	}
	
}
