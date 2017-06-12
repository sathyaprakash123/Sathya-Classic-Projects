package com.resto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
//import Decoder.BASE64Decoder;

@Path("/restbar")
public class restobar {

	@GET
	@Path("/tinder")
	@Produces(MediaType.TEXT_PLAIN)
	public Response retrobar() {
		String x = "Hello Test SAT";
		return Response.status(200).entity(x).build();
	}

	@Path("/rssbbc")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response htmlresponse() throws ParserConfigurationException, SAXException, IOException {
		rssReader rat = new rssReader();
		StringBuilder ss = rat.rssParser("http://feeds.bbci.co.uk/news/rss.xml");
		String sat = ss.toString();
		return Response.status(200).entity(sat).build();
	}

	@Path("/posthandler")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response postRes(detail jc) {

		String x = jc.toString();
		System.out.println("Name of the person is : "+jc.getName());
		System.out.println("Age of the person is : "+ jc.getAge());
		return Response.status(200).entity(x).build();

	}
	
	
	@Path("/mongo")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response mongoMan(detail customer) throws UnknownHostException
	{
		MongoMan map = new MongoMan();
		map.insertDetail(customer.name, customer.age);
		return Response.status(200).entity("Added to Collection").build();
	}
	
	@Path("{x}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response QueryString(@PathParam("x") String s)
	{
		return Response.status(200).entity("Value Passed on query String " + s).build();
	}

	
	@Path("/hello/{y}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response QueryStr(@PathParam("y") String s)
	{
		return Response.status(200).entity("This is the second query string " + s).build();
	}
	
	@Path("/auth")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response auth(@HeaderParam("Authorization") String autho) throws IOException
  {
	
		//BASE64Decoder bc = new BASE64Decoder();
		//bc.decodeBuffer(autho);
		
		 return Response.status(200).entity("You are authorized : "+ autho ).build();
		 
		
		
	}
	
}
