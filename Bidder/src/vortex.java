import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class vortex {

	public DBCollection connectDB() throws UnknownHostException
	{
		MongoClient mc = new MongoClient("localhost", 27017);
		DB database = mc.getDB("test");
		DBCollection collection = database.getCollection("super1");
		return collection;
	}
	
	public void insertDB(DBCollection collection)
	{
		DBCollection col = collection;
		BasicDBObject val = new BasicDBObject();
		val.put("name", "Peter");
		val.put("age",20);
		col.insert(val);
	
	}
	
	public void printDB(DBCollection collection)
	
	{
		DBCollection col = collection;
		DBCursor cur = col.find();
		while (cur.hasNext() == true)
		{
			System.out.println("Data from Collection : " + cur.next());
		}
	}
	
	
	public static void main(String args[]) throws UnknownHostException
	
	{
		vortex v = new vortex();
		DBCollection col =  v.connectDB();
		v.insertDB(col);
		v.printDB(col);
	}
	
}
