package org.drake.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {

    @GET
    //what type of data gets
    @Produces(MediaType.TEXT_PLAIN)
    public String getMesages() {
        return "Hello World!";
    }


}
