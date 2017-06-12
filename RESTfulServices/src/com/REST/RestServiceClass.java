package com.REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/RestServiceClass")
public class RestServiceClass {

	@GET
	@Path("/Message")
	@Produces(MediaType.TEXT_PLAIN)
	public Response printMessage()
	{
		String x = "Printing Message from Print Message Class";
		return Response.status(200).entity(x).build();
	}
	
	@GET
	@Path("/datevalue")
	@Produces(MediaType.TEXT_PLAIN)
	public Response datevalue()
	{
		
		ServiceClass sc = new ServiceClass();
		String date = sc.getDate();
		String x = "Current Date from Operating System";
		return Response.status(200).entity(x + "  Date:" +  date).build();
	}
	
	
	
}
