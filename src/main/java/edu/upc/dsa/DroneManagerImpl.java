package edu.upc.dsa;

import edu.upc.dsa.models.Drone;
import edu.upc.dsa.models.Piloto;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DroneManagerImpl implements DroneManager {

    private static DroneManager instance;
    protected List<Drone> drones;
    protected List<Piloto> pilotos;
    final static Logger logger = Logger.getLogger(DroneManagerImpl.class);

    private DroneManagerImpl() {
        this.drones = new LinkedList<>();
    }

    public static DroneManager getInstance() {
        if (instance==null) instance = new DroneManagerImpl();
        return instance;
    }

    public int size() {
        int ret = this.drones.size();
        logger.info("size " + ret);

        return ret;
    }


    public Drone addDrone(String nombre, String fabricante, String modelo) {
        Drone d = new Drone(nombre, fabricante, modelo);
        drones.add(d);
        return d;
    }

    public Drone getDrone(int id) {
        logger.info("getDrone("+id+")");

        for (Drone d: this.drones) {
            if (d.getId().equals(id)) {
                logger.info("getDrone("+id+"): "+d);
                return d;
            }
        }

        logger.warn("not found " + id);
        return null;
    }
    public int getHores(int id){
        for (Drone d:this.drones){
            if(d.getFabricante().equals(id)){
                return d.getHoras();
            }
        }
        return 0;
    }

    public List<Drone> ldrones(int id) {
        Drone d1;
        Drone d2;
        List<Drone> drones = getHores(id).drones();
        for(Drone d : drones){
            if(d2.getHoras() > d1.getHoras()){

            }
            logger.info("Drone: " + d.getNombre() + ", Hores: " + d.getHoras() + ".");
        }
        return drones;
    }


    public List<Drone> reservas (int id){
        List<Drone> reservas.
    }

    public List<Drone> mantenimiento (int hores){

    }

    @Override
    public Drone addDrone(Drone d) {
        return null;
    }

    @Override
    public Drone saveDrone(String id) {
        return null;
    }

    @Override
    public List<Drone> ldrones() {
        return null;
    }

    public List<Drone> mantDrone(String id){
        List<Drone> manteniment = new ArrayList<>();
        Drone d;
        manteniment.add(d.getId());
        return manteniment;
    }

    @Override
    public Drone Drone(Drone d) {
        return null;
    }

    @Override
    public List<Piloto> lpilotos() {
        List<Piloto> piloto = getHores(id).pilotos();

        for(Piloto p : pilotos){
            logger.info("Drone: " + p.getNombre() + ", Hores: " + p.getHoras() + ".");
        }
        return pilotos;
    }
}