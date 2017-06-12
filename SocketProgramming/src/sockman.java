import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class sockman {
	
	static int port = 5000;
	
	public static void main(String args[]) throws IOException
	{
	
		
		while (true)
			
		{			
			ServerSocket portno = new ServerSocket(port);
			Socket connection = portno.accept();
							
			PrintWriter pr = new PrintWriter(connection.getOutputStream(), true);
			pr.print("HTTP/1.1 200 \r\n");
			pr.print("Content-Type: application/json \r\n");
			pr.println("\r\n");
			pr.print("{\"seatbid\":[{\"bid\":[{\"price\":7.2072,\"adomain\":[\"genesismedia.com\"],\"adid\":\"9_29146\",\"id\":\"9-2df3f70c-2d88-40b3-9ed6-40cd8f2c1261-1\",\"impid\":\"1\",\"cid\":\"14462\",\"adm\":\"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><VAST version=\\\"2.0\\\"><Ad id=\\\"2df3f70c-2d88-40b3-9ed6-40cd8f2c1261\\\"><Wrapper><AdSystem>BidSwitch</AdSystem><VASTAdTagURI><![CDATA[http://vast-f19-us-va.adhigh.net/rtb/vast?s=bsw.yume&b=H4sIAAAAAAAAAHVQu24TQRS9s3ESaBASj3qEFORIzuzDjwRQFJvYGMl2HGTDRjRm7R3bi3c9w87ai1MAHUpK-jTUKBUlBf9Ag6CBmoaGDsnMrE2DxGgeZ-7cc-bcC7AYqXe_qr-hiI_OTj6fnQKkh1HEb-t6wCIWCs7CSPR8jwvSY4EeCO4MqJUnfMgBXi9TuT8wyWwS0DGNYhaOFrmzKdctQ59yx3P1XqirhE5yIyLu7zluR9BwSsPOJPR3ldJGtrRh3ZOTh8zdCqi7FVERkRlPtJWmfLvpssDxxruWYZjNu9VJr1J-JKu4cEVuz74giboiTghQXDu_evy9eg6w8rBVRugrymgAFxMfig5wKcE7Tm0W94ePn6L4-rX8gw8_bKm18wLm8_llTZMUZEg4R_DfsffzLzgYnH573hUyd2Uam5o8UyKadBFScL1cadXazUOk_Sug9AGCBjv2fN_R88TAadsbuywW-KCNCyR7B9tNu5DbxCXOfWrTbs2L9Hx2m2QLOF27327UM9j3RhRXaW_ENvH-MGQB1fMmMYi1beSIaWRxy-k7obekSRPrjdJRZ_-wIR0gWPWcrpVT3hLLKpaUjW61W28-pV6-RQhUD7TlWl2YRoYMri2-g2KFn7xSBX1svb_xJCkNWRpKuqjRsWqLmbEkt1SvN23tDw3eMiiEAgAA]]></VASTAdTagURI><Error><![CDATA[http://us-east.bidswitch.net/vast_error/c-EL9FoZVoSzvB1LXbII5kzoOSlk7bOdO_f4qyOQO7_Wkzfo8pKsPRR4-O9xvNveMJgRgwXUgvnqJ0n66w-H9j1rJOEn5bfYY6k4RJtbJJ30Cdaq49rof4t8Wh1z9DZ_BIipZqymgiKLG3cYbz0hXJiisz-e8oSzgGy4ez06ZVZjs1biUp6m5gH2aREkHtbbWMP_eVGOQ0z_ber3NymNc53XDuLlfVxOiEQsuYuEN2aUpmLZR6LZQKGJsDaYuVeI4l9aGuYeH0NJmQRMc-mhbZUcfhO2X9ILrK-ykS0GwBfmnQOduMoHTneBtgZeOK-Fi-QHD9mX-IbIQklLDvzVg-__fVO0hjiiLuEAMFnEGTuzUH4OseXQFwoeLWix70UQsXLIYTv1ZD_JoBmPIhV0Q8lWbNvUQGXJy0oV3vp008JAPpO0JPtIC8KxH5Yq1K5G-XyuyZKA4vEeK5RljHUPZCb8q8QYMx7lTbruy8XMGObUrDeTRoaX2qWpKRQ/]]></Error><Impression><![CDATA[http://us-east.bidswitch.net/imp/${AUCTION_PRICE}/BSWhttp_A_B_Bvast-f19-us-va.adhigh.net_Brtb_Bopn_Bbsw_Bn_Cs_Rbsw.yume_Jb_RH4sIAAAAAAAAAHVQu24TQRS9s3ESaBASj3qEFORIzuzDjwRQFJvYGMl2HGTDRjRm7R3bi3c9w87ai1MAHUpK-jTUKBUlBf9Ag6CBmoaGDsnMrE2DxGgeZ-7cc-bcC7AYqXe__qr-hiI__OTj6fnQKkh1HEb-t6wCIWCs7CSPR8jwvSY4EeCO4MqJUnfMgBXi9TuT8wyWwS0DGNYhaOFrmzKdctQ59yx3P1XqirhE5yIyLu7zluR9BwSsPOJPR3ldJGtrRh3ZOTh8zdCqi7FVERkRlPtJWmfLvpssDxxruWYZjNu9VJr1J-JKu4cEVuz74giboiTghQXDu__evy9eg6w8rBVRugrymgAFxMfig5wKcE7Tm0W94ePn6L4-rX8gw8__bKm18wLm8__llTZMUZEg4R__DfsffzLzgYnH573hUyd2Uam5o8UyKadBFScL1cadXazUOk__Sug9AGCBjv2fN__R88TAadsbuywW-KCNCyR7B9tNu5DbxCXOfWrTbs2L9Hx2m2QLOF27327UM9j3RhRXaW__ENvH-MGQB1fMmMYi1beSIaWRxy-k7obekSRPrjdJRZ__-wIR0gWPWcrpVT3hLLKpaUjW61W28-pV6-RQhUD7TlWl2YRoYMri2-g2KFn7xSBX1svb__xJCkNWRpKuqjRsWqLmbEkt1SvN23tDw3eMiiEAgAA_Jw_R_I_WAUCTION__PRICE_X/c-EL9FoZVoSzvB1LXbII5kzoOSlk7bOdO_f4qyOQO7_Wkzfo8pKsPRR4-O9xvNveMJgRgwXUgvnqJ0n66w-H9j1rJOEn5bfYY6k4RJtbJJ30Cdaq49rof4t8Wh1z9DZ_BIipZqymgiKLG3cYbz0hXJiisz-e8oSzgGy4ez06ZVZjs1biUp6m5gH2aREkHtbbWMP_eVGOQ0z_ber3NymNc53XDuLlfVxOiEQsuYuEN2aUpmLZR6LZQKGJsDaYuVeI4l9aGuYeH0NJmQRMc-mhbZUcfhO2X9ILrK-ykS0GwBfmnQOduMoHTneBtgZeOK-Fi-QHD9mX-IbIQklLDvzVg-__fVO0hjiiLuEAMFnEGTuzUH4OseXQFwoeLWix70UQsXLIYTv1ZD_JoBmPIhV0Q8lWbNvUQGXJy0oV3vp008JAPpO0JPtIC8KxH5Yq1K5G-XyuyZKA4vEeK5RljHUPZCb8q8QYMx7lTbruy8XMGObUrDeTRoaX2qWpKRQ/]]></Impression><Impression><![CDATA[http://us-east-sync.bidswitch.net/sync?ssp=yume&dsp_id=9&imp=1]]></Impression><Creatives></Creatives></Wrapper></Ad></VAST>\"}],\"seat\":\"9\"}],\"cur\":\"USD\",\"id\":\"YM-7845499253981218501\"}");
			pr.close();
			connection.close();
			portno.close();
		}
		
	}
	}
