package satRest;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hellsat")
public class HellSat {
 
  @GET
  @Produces("text/html")
  public Response getLocalCust() {
 
           String output = "I am from 'getLocalCust' method";
           return Response.status(200).entity(output).build();
  }
 
  @GET
  @Path("/xmlresponse")
  @Produces("text/XML")
  public Response getNriCust() {
 
            String output = "<VAST><Ad></Ad></VAST>";
            return Response.status(200).entity(output).build();
  }
  
  @GET
  @Path("/jiva")
  @Produces(MediaType.TEXT_XML)
  public Response getNriMat() {
 
            String output = "I am from 'getNriMat' method";
            return Response.status(200).entity(output).build();
  }

  @GET
  @Path("/process/{name}/{age}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response process(@PathParam("name") String name, @PathParam("age") int age)
  {
	  String resp = "Name : " + name + "age : "  + age;
	  return Response.status(200).entity(resp).build();
	  
	  
  }
  
  
  @GET
  @Path("/query")
  @Produces(MediaType.TEXT_PLAIN)
  public Response query(@HeaderParam("User-Agent") String ua,  @CookieParam("satid") int satid,@DefaultValue("99") @QueryParam("age") int age)
   {
	  
	  String res = "UserAgent : "+ ua + " Cookie id = "+ satid + " age :"+ age;
	  return Response.status(200).entity(res).build();
  }
  

}

	
	


