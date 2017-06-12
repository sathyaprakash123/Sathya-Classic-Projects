import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class postreader {

	public static void main(String args[]) throws IOException
	{
		
		//Read from file and convert to string
		File file = new File("C:/Users/sathyaprakash/Desktop/payload.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		StringBuilder sb = new StringBuilder();
		while((line=br.readLine())!= null)
		{
			sb.append(line);
			
		}
		String  payload = sb.toString();
		
		//Make post request using string payload
		URL url = new URL("http://download.yumenetworks.com/yume/rajesh/simulateDSP/bidRequest.php?bidResponseUrl");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.setDoInput(true);
		con.connect();
		OutputStream sr = con.getOutputStream();
		PrintWriter pp = new PrintWriter(new OutputStreamWriter(sr));
		pp.write(payload);
		pp.close();
		System.out.println("Response Code : " + con.getResponseCode());
		
	
		//Receive Response Data from Server and write on output file
		InputStream inp = con.getInputStream();
		File out = new File("C:/Users/sathyaprakash/Desktop/out.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(out, true));
		BufferedReader bbr = new BufferedReader(new InputStreamReader(inp));
		String line1;
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date date = new Date();
		while((line = bbr.readLine())!=null)
		{
			bw.write(System.lineSeparator());
			bw.write("******************************************************************");
			bw.write(df.format(date));
			System.out.println(line.toString());
			bw.write(line);
		}
		bw.close();
	}
	
}
