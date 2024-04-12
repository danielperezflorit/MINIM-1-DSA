package edu.upc.dsa.services;


import edu.upc.dsa.DroneManager;
import edu.upc.dsa.DroneManagerImpl;
import edu.upc.dsa.models.Drone;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Api(value = "/drones", description = "Endpoint to Drone Service")
@Path("/drones")
public class DroneService {

    private DroneManager dm;

    public DroneService() {
        this.dm = DroneManagerImpl.getInstance();
        if (dm.size()==0) {
            this.dm.addDrone("a");
            this.dm.addDrone("b");
            this.dm.addDrone("c");
        }


    }

    @GET
    @ApiOperation(value = "get all Drones", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Drone.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDrones() {

        List<Drone> drones = this.dm.ldrones();
        GenericEntity<List<Drone>> entity = new GenericEntity<List<Drone>>(drones) {};
        return Response.status(201).entity(entity).build()  ;

    }
    @POST
    @ApiOperation(value = "create a new Drone", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Drone.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newDrone(Drone drone) {

        if (drone.getNombre()==null || drone.getFabricante()==null || drone.getModelo() == null)  return Response.status(500).entity(drone).build();
        this.dm.addDrone(drone);
        return Response.status(201).entity(drone).build();
    }

}