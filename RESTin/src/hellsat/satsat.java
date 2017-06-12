package hellsat;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/super")
public class satsat {


	
	@GET
	@Path("/satsat/{value}")
	  @Produces("text/xml")
	  public Response getLocalCust(@PathParam("value") String value) {
	 
	           String output = value;
	           return Response.status(200).entity(output).build();
	  }
	
	
	@GET
	@Path("/query")
	@Produces(MediaType.TEXT_PLAIN)
	public Response QueryMet(@DefaultValue("100") @QueryParam("age") int age,@DefaultValue("suyranarayanan") @QueryParam("name") String name)
	{
	 return Response.status(200).entity(age + "    " + name).build();
		
		
	}
	
	@GET
	@Path("/headers")
	@Produces(MediaType.TEXT_PLAIN)
	public Response Headers(@HeaderParam("user-agent") String ua, @HeaderParam("content-type") String content, @HeaderParam("referer") String ref)
	{
	
		return Response.ok(200).entity("User Agent: "+ ua + " \n Content Type: "+ content + "\n Referer :"+ref).build();
		
	}
	
	
}
