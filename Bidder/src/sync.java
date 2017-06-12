
public class sync {
	
public synchronized void counter()

{
	System.out.println("Starting counter");
for(int i=5;i>0;i--)
	
{
	System.out.println("Thread Name : " + Thread.currentThread() + " Count: "+ i);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
		
		

}
