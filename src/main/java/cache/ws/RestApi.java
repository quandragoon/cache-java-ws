package cache.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by qdnguyen on 4/9/16.
 */

@Path("/")
public class RestApi {

    Logger logger = LoggerFactory.getLogger(RestApi.class);

    @GET
    @Path("/ping")
    @Produces(MediaType.TEXT_PLAIN)
    public Response ping () throws IOException {
        logger.info("RECEIVED PING");
        return Response.status(200).entity("pong").build();
    }

    @GET
    @Path("/echo")
    @Produces(MediaType.TEXT_PLAIN)
    public Response echo (@QueryParam("name") String name) {
        return Response.status(200).entity("Hello " + name).build();
    }
}
