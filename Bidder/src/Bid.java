import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Bid {
	
	StringBuilder jsontotal = new StringBuilder();
	String line;
	StringBuilder xmlresponse = new StringBuilder();

	public String getJson() throws IOException
	
	{
		
		//**********Method to obtain Json Body from Text File*****************
		File file = new File("C:/Users/sathyaprakash/Desktop/BidSample1.txt");
		FileReader filetext = new FileReader(file);
		BufferedReader br = new BufferedReader(filetext);
	    while((line = br.readLine())!= null)
	    {
	    	
	    	jsontotal.append(line);
	    	jsontotal.append(System.getProperty("line.separator"));
	    	//System.out.println(line);
	    	
	    }
		System.out.println(jsontotal);
		return jsontotal.toString();
	}
	
	//*****************Method to make POST request using Json data as body************
	public String PostBid(String jsondata) throws IOException
	{
		URL url = new URL("http://54.152.190.220:8080/yume");
		URLConnection conn = url.openConnection();
		conn.setDoOutput(true);
		OutputStreamWriter output = new OutputStreamWriter(conn.getOutputStream());
		output.write(jsondata);
		output.flush();
		String x = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while((x = br.readLine()) != null)
		{
			System.out.println(x);
			xmlresponse.append(x);
			xmlresponse.append(System.getProperty("line separator"));
		}
		 output.close();
		 br.close();
		
		return xmlresponse.toString();
	}
	
	
	public static void main(String args[]) throws IOException
	{
		Integer times;
		System.out.println("Enter number of bids ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		times = Integer.parseInt(br.readLine());
		for(int i=0;i<times;i++)
				{
		Bid crawler = new Bid();
		// calling Json Body to be posted in Bid Request
		String jsonPostBody = crawler.getJson();
		String output = crawler.PostBid(jsonPostBody);
				}
	    		System.out.println("********** Bidding Complete **************");
	}
	
}
