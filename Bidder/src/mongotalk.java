import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class mongotalk {
	
	public void connectDatabase() throws UnknownHostException

	{
		int counter=0;
	MongoClient mc = new MongoClient("localhost",27017);
	DB db = mc.getDB("test");
	DBCollection col = db.getCollection("restaurants");
	DBCursor cur = col.find();
	
	
	while (cur.hasNext() )
	{
		counter ++;
		System.out.println(cur.next());
	}
	System.out.println("Record No : " + counter);
	}
	
	public static void main(String args[]) throws UnknownHostException
	{
		mongotalk mg = new mongotalk();
		mg.connectDatabase();
		
		
	}
	
	
	
}
