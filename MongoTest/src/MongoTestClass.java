import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class MongoTestClass {

	public static void main(String args[]) throws IOException
	
	{		
		FileWriter fl = new FileWriter("C:/Users/sathyaprakash/Desktop/MongoData.txt");
		MongoClient mongoclient = new MongoClient( "localhost" , 27017 );
		DB database = mongoclient.getDB("test");
		DBCollection mycollection = database.getCollection("restaurants");
	    DBCursor cursor = mycollection.find();
	    while (cursor.hasNext()) {
	    fl.write(cursor.next().toString());
	    System.out.println(cursor.next());
	        
	    

	    }
	
		
	}
	
	
}
