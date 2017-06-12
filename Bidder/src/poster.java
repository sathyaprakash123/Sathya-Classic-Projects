import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class poster {

	public static void main(String args[]) throws IOException
	
	{
		//String payload = "{\"id\":\"sathya_post_testing\",\"imp\":[{\"id\":\"1\",\"video\":{\"mimes\":[\"video/mp4\",\"application/x-shockwave-flash\",\"video/x-flv\"],\"minduration\":15,\"maxduration\":0,\"startdelay\":0,\"linearity\":1,\"playbackmethod\":[3],\"delivery\":[2],\"protocols\":[2,5]},\"displaymanager\":\"YuMe\",\"displaymanagerver\":\"1.0\",\"secure\":0,\"bidfloor\":5.0,\"bidfloorcur\":\"USD\",\"pmp\":{\"private_auction\":1,\"deals\":[{\"id\":\"qatest123\",\"bidfloor\":5.0,\"bidfloorcur\":\"USD\",\"at\":3}]}}],\"site\":{\"id\":\"1450byskdWGR\",\"name\":\"www.google.com\",\"domain\":\"www.google.com\",\"page\":\"www.google.com\",\"privacypolicy\":1,\"publisher\":{\"id\":\"1450\"}},\"device\":{\"dnt\":1,\"ua\":\"Apache-HttpClient/4.2.5 (java 1.5)\",\"ip\":\"74.118.186.1\"},\"at\":2,\"tmax\":300,\"cur\":[\"USD\"],\"regs\":{\"coppa\":0}}";
		String payload= "{\"id\":\"0A40015501552FAB1706538C620D8A8E\",\"imp\":[{\"id\":\"1\",\"video\":{\"mimes\":[\"video/mp4\"],\"minduration\":15,\"maxduration\":30,\"startdelay\":0,\"linearity\":1,\"maxextended\":15,\"minbitrate\":384,\"maxbitrate\":840,\"boxingallowed\":1,\"playbackmethod\":[3],\"delivery\":[2],\"protocols\":[2,5]},\"displaymanager\":\"YuMe\",\"displaymanagerver\":\"1.0\",\"secure\":0,\"bidfloor\":5,\"bidfloorcur\":\"USD\",\"pmp\":{\"private_auction\":1,\"deals\":[{\"id\":\"yms3Lnxh90\",\"bidfloor\":5,\"bidfloorcur\":\"USD\",\"at\":3}]}}],\"app\":{\"id\":\"2456VngnvbTu\",\"domain\":\"FireTV Kingdom Impact Network\",\"cat\":[\"IAB23\"],\"privacypolicy\":1,\"storeurl\":\"http://www.amazon.com/Kingdom-Impact-Network/dp/B01702GQ3U\",\"publisher\":{\"id\":\"2456\",\"cat\":[\"IAB23\"]},\"content\":{\"cat\":[\"IAB23\"]},\"paid\":0},\"device\":{\"dnt\":0,\"ua\":\"Mozilla/5.0 (Windows NT 6.1; WOW64; rv:46.0) Gecko/20100101 Firefox/46.0\",\"ip\":\"74.118.45.56\",\"os\":\"Windows\",\"osv\":\"7\"},\"at\":2,\"tmax\":300,\"cur\":[\"USD\"],\"regs\":{\"coppa\":0}}";
		//URL x = new URL("http://download.yumenetworks.com/yume/rajesh/simulateDSP/bidRequest.php?bidResponseUrl");
		URL x = new URL("http://yfp.bid.yume.com/engine/dynamic_ybid.rtb?seat_id=xz9jePPV");
		HttpURLConnection con = (HttpURLConnection) x.openConnection();
		con.setDoInput(true);
		con.setDoOutput(true);
		con.setRequestMethod("POST");
		con.connect();
		
		OutputStream os = con.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
		pw.write(payload);
		pw.close();
				
		System.out.println("Response Code : " + con.getResponseCode());
		
		InputStream is = con.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		StringBuilder sb = new StringBuilder();
		
		while ((line = br.readLine()) != null)
		{
			sb.append(line.toString());
		}
		
		System.out.println("Bid Response : " + sb.toString());
		}
	
}
