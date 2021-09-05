package io.jersey.sumResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("add/{num1},{num2}")
public class MyResource {

    @GET
   @Produces(MediaType.TEXT_PLAIN)
    public String getSum(@PathParam("num1") int firstNumber,@PathParam("num2") int secondNumber) {
    	int Result=firstNumber+secondNumber;
    	
        return "sum of two number is "+Result;
    }
}
