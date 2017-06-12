package com.resto;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoMan {
	
	public void insertDetail(String name, String age) throws UnknownHostException
	{
	
		MongoClient mongo = new MongoClient("localhost",27017);
		DB database = mongo.getDB("json");
		DBCollection col = database.getCollection("requestLog");
		BasicDBObject doc = new BasicDBObject();
		doc.put(name, age);
		col.insert(doc);		
		System.out.println("Data added to MongoDb Collection");;
	}
	

}
