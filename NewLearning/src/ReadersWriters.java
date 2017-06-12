import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadersWriters {
	
	public static void main(String args[]) throws IOException
	{
	
		FileReader fr = new FileReader("C:/Users/sathyaprakash/Desktop/Tester1.txt");
		FileWriter wr = new FileWriter("C:/Users/sathyaprakash/Desktop/Tester2.txt");
		Integer data;
		
		while ((data = fr.read()) != -1  )
		{
			
			wr.write(data.toString());;
			System.out.println(data);
			
		}
		
		fr.close();
		wr.close();
		
		
	}
	
	

}
