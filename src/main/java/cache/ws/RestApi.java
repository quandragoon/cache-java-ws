package cache.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by qdnguyen on 4/9/16.
 */

@Path("/")
public class RestApi {

    @GET
    @Path("/ping")
    @Produces(MediaType.TEXT_PLAIN)
    public Response ping () throws IOException {
        return Response.status(200).entity("pong").build();
    }
}
