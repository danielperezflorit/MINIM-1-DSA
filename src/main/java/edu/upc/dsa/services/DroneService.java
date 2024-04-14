package edu.upc.dsa.services;


import edu.upc.dsa.DroneManager;
import edu.upc.dsa.DroneManagerImpl;
import edu.upc.dsa.models.Drone;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.management.DescriptorRead;
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
            this.dm.addDrone("1", "a","a","a",7);
            this.dm.addDrone("2", "b","b","b",4);
            this.dm.addDrone("3", "c","c","c",2);

            this.dm.addPiloto("a", "a","a",5);
            this.dm.addPiloto("b", "b","b",7);
            this.dm.addPiloto("c", "c","c",2);

            this.dm.addReserva("a",1 ,5,1, 4,7,7,8,"a");
            this.dm.addReserva("b",2 ,4,2, 3,8,8,9,"b");
            this.dm.addReserva("c",3 ,6,2, 5,6,9,7,"c");
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
        List<String> drones = this.dm.ldrones();
        return Response.status(201).entity(drones).build()  ;

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
        this.dm.addDrone(drone.getId(), drone.getNombre(), drone.getFabricante(), drone.getModelo(),drone.getHoras());
        return Response.status(201).entity(drone).build();
    }
    @GET
    @ApiOperation(value = "get horas de vuelo", notes = "Get las horas de vuelo de un dron")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful", response = String.class, responseContainer="List"),
            @ApiResponse(code = 404, message = "dron no existe"),
    })
    @Path("/dron/{id}/Horas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHoras(@PathParam("id") String iddron) {
        List<String> drone = this.dm.ldrones();
        if (drone==null){
            return Response.status(404).build();
        }
        GenericEntity<List<String>> entity = new GenericEntity<List<String>>(drone){};
        return Response.status(200).entity(entity).build();
    }

}