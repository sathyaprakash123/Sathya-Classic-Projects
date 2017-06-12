import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteFil {

	public static void main(String args[]) throws IOException
	{
		
		for (String s : args)
		{
		File file = new File("C:/Users/sathyaprakash/Desktop/output.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter wr = new BufferedWriter(fr);
		PrintWriter pr = new PrintWriter(fr);
		pr.write(s);
		pr.write(System.getProperty("line.separator"));
		pr.close();
		}
	}
	
	
}
