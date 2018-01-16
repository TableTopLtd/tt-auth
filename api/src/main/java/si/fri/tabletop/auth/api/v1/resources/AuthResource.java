package si.fri.tabletop.auth.api.v1.resources;

import com.kumuluz.ee.logs.cdi.Log;
import si.fri.tabletop.auth.Auth;
import si.fri.tabletop.auth.AuthBean;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Log
public class AuthResource {

    @Inject
    private AuthBean authBean;

    @GET
    public Response getAuth() {

        List<Auth> auth = authBean.getAuth();
        return Response.ok(auth).build();
    }

    @POST
    @Path("/login")
    public Response logIn(Auth auth) {
        auth = authBean.addAuth(auth);

        if (auth.getId() != null) {
            return Response.status(Response.Status.CREATED).entity(auth).build();
        } else {
            return Response.status(Response.Status.CONFLICT).entity(auth).build();
        }
    }

    @POST
    @Path(("/logout"))
    public Response logOut(Auth auth) {
        auth = authBean.addAuth(auth);

        if (auth.getId() != null) {
            return Response.status(Response.Status.CREATED).entity(auth).build();
        } else {
            return Response.status(Response.Status.CONFLICT).entity(auth).build();
        }
    }


}
