package eu.europeana.redirects.rest;

import eu.europeana.redirects.model.RedirectRequest;
import eu.europeana.redirects.model.RedirectRequestList;
import eu.europeana.redirects.service.RedirectService;
import eu.europeana.redirects.service.mongo.MongoRedirectService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Endpoint for Europeana Redirects Service module
 * Created by ymamakis on 1/15/16.
 */
@Path("/")
public class RedirectResource {
    private final RedirectService redirectService = new MongoRedirectService();

    @POST
    @Path("/redirect/single")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response redirectSingle(@FormParam("record")RedirectRequest request){
        return Response.ok().entity(redirectService.createRedirect(request)).build();
    }
    @POST
    @Path("/redirect/batch")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response redirectBatch(@FormParam("records")RedirectRequestList requestList){
        return Response.ok().entity(redirectService.createRedirects(requestList)).build();
    }

}
