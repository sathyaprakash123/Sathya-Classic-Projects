package stricker;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


public class stricker_main implements Runnable{
	
	static int count = 0;

	@Override
	public void run() {
		
		while (count < 25)
		
						
		{
		count++;
		System.out.println("Ad request No:"+count);
		System.out.println("Thread Name : "+ Thread.currentThread().getName());
		// TODO Auto-generated method stub
		getConfigData data = new getConfigData();
		
		
		try {
			data.ParseConfigXML();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Request Url :"+data.getRequestUrlValue() + " & Post Body Received");
		// System.out.println("Post Json " + data.getPostJson());	
		try {
			data.intiateRequest();
			//data.intiateRequestGet();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			data.fireTrackers();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException
	{
		
		
		stricker_main strike[];
		Thread t[];
	
		
	/*	for (int i=0;i<10;i++)
		{
			t[i] = new Thread(strike[i]);
			t[i].start();
			
		} */
		
		
		
		stricker_main strike1 = new stricker_main();
		Thread t1 = new Thread(strike1);
		t1.start();
		
		stricker_main strike2 = new stricker_main();
		Thread t2 = new Thread(strike2);
		t2.start();
		
		stricker_main strike3 = new stricker_main();
		Thread t3 = new Thread(strike3);
		t3.start();
		
		stricker_main strike4 = new stricker_main();
		Thread t4 = new Thread(strike4);
		t4.start();
		
		stricker_main strike5 = new stricker_main();
		Thread t5 = new Thread(strike5);
		t5.start();
		
		stricker_main strike6 = new stricker_main();
		Thread t6 = new Thread(strike6);
		t6.start();
		
		stricker_main strike7 = new stricker_main();
		Thread t7 = new Thread(strike7);
		t7.start();
			
		stricker_main strike8 = new stricker_main();
		Thread t8 = new Thread(strike8);
		t8.start();
		
		stricker_main strike9 = new stricker_main();
		Thread t9 = new Thread(strike9);
		t9.start();
		
		stricker_main strike10 = new stricker_main();
		Thread t10 = new Thread(strike10);
		t10.start();
		
		stricker_main strike11 = new stricker_main();
		Thread t11 = new Thread(strike11);
		t11.start();
		
		stricker_main strike12 = new stricker_main();
		Thread t12 = new Thread(strike12);
		t12.start();
		
		stricker_main strike13 = new stricker_main();
		Thread t13 = new Thread(strike13);
		t13.start();
		
		stricker_main strike14 = new stricker_main();
		Thread t14 = new Thread(strike14);
		t14.start();
		
		stricker_main strike15 = new stricker_main();
		Thread t15 = new Thread(strike15);
		t15.start();
		
		stricker_main strike16 = new stricker_main();
		Thread t16 = new Thread(strike16);
		t16.start();
		
		stricker_main strike17 = new stricker_main();
		Thread t17 = new Thread(strike17);
		t17.start();
		
		stricker_main strike18 = new stricker_main();
		Thread t18 = new Thread(strike18);
		t18.start();
		
		stricker_main strike19 = new stricker_main();
		Thread t19 = new Thread(strike19);
		t19.start();
		
		stricker_main strike20 = new stricker_main();
		Thread t20 = new Thread(strike20);
		t20.start();
		
		stricker_main strike21 = new stricker_main();
		Thread t21 = new Thread(strike21);
		t21.start();
		
		stricker_main strike22 = new stricker_main();
		Thread t22 = new Thread(strike22);
		t22.start();
		
		stricker_main strike23 = new stricker_main();
		Thread t23 = new Thread(strike23);
		t23.start();
		
		stricker_main strike24 = new stricker_main();
		Thread t24 = new Thread(strike24);
		t24.start();
		
		stricker_main strike25 = new stricker_main();
		Thread t25 = new Thread(strike25);
		t25.start();
		
		stricker_main strike26 = new stricker_main();
		Thread t26 = new Thread(strike26);
		t26.start();
		
		stricker_main strike27 = new stricker_main();
		Thread t27 = new Thread(strike27);
		t27.start();
		
		stricker_main strike28 = new stricker_main();
		Thread t28 = new Thread(strike28);
		t28.start();
		
		stricker_main strike29 = new stricker_main();
		Thread t29 = new Thread(strike29);
		t29.start();
		
		stricker_main strike30 = new stricker_main();
		Thread t30 = new Thread(strike30);
		t30.start();
		
		
		System.out.println("Completed Hits");
		
		
		
	}
	
	
}
