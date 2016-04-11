package cache.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by qdnguyen on 4/9/16.
 */

@Path("/")
public class RestApi {

    Logger logger = LoggerFactory.getLogger(RestApi.class);

    private static HashMap<String, List<String> > itemsMap = new HashMap<>();

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getList (@DefaultValue("") @QueryParam("uid") String uid) {
        if (!"".equals(uid) && itemsMap.containsKey(uid)) {
            return Response.status(200).entity(itemsMap.get(uid)).build();
        }
        return Response.status(200).entity("INVALID ARGS").build();
    }

    @POST
    @Path("/append")
    @Produces(MediaType.TEXT_PLAIN)
    public Response addToList (@DefaultValue("") @QueryParam("uid") String uid,
                               @DefaultValue("" )@QueryParam("iid") String iid) {
        if (!"".equals(uid) && !"".equals(iid)) {
            if (!itemsMap.containsKey(uid)) {
                itemsMap.put(uid, new ArrayList<>());
            }
            itemsMap.get(uid).add(iid);
            return Response.status(200).entity("SUCCESS").build();
        }
        return Response.status(200).entity("INVALID ARGS").build();
    }
}
