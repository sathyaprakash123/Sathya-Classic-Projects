import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hitter {
	
	public static void main(String args[]) throws IOException
	{
		
		File file = new File("C:/Users/sathyaprakash/Desktop/monitor.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		
		Calendar cal = Calendar.getInstance();
		String time = "";
		
		 if(cal.get(Calendar.AM_PM)==0)
		 {  time=time+"AM";  }
		    else
		    {   time=time+"PM";  }
		
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm");
		Date date = new Date();
		String x = df.format(date);
		System.out.println(x);
		br.write(x + " " + time );
		br.newLine();
			
		
		br.close();
		fr.close();
			
		
		
	}
	
	
}
