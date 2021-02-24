package employeeServer.resource

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("server/v1")
class EmployeeResource {

    @GET
    @Path("status")
    @Produces(MediaType.TEXT_PLAIN)
    fun getStatus() : Response{
        return Response.status(200).entity("Status Of Server").build()
    }

    
}