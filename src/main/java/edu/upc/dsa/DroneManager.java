package edu.upc.dsa;

import edu.upc.dsa.models.Drone;
import edu.upc.dsa.models.Piloto;

import java.util.List;

public interface DroneManager {


    public Drone addDrone(Drone d);
    public Drone saveDrone(String id);
    public List<Drone> ldrones();
    public List <Drone> mantDrone(String id);
    public Drone Drone(Drone d);
    public List<Piloto> lpilotos();

    public int size();
}
