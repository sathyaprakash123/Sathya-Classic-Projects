
class threadder implements Runnable{

	
		@Override
	public void run() {
			
		System.out.println("Thread Running "+ Thread.currentThread());
		
					}

		
		public static void main(String args[])
		{
			threadder th = new threadder();
			Thread tb = new Thread(th);
			tb.start();
			Thread tb1 = new Thread(th);
			tb1.start();
			Thread tb2 = new Thread(th);
			tb2.start();
			Thread tb3 = new Thread(th);
			tb3.start();
		}
}
