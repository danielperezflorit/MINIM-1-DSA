package edu.upc.dsa;

import edu.upc.dsa.models.Drone;
import edu.upc.dsa.models.Piloto;
import edu.upc.dsa.models.Reserva;
import org.apache.log4j.Logger;
import org.eclipse.persistence.internal.sessions.remote.RemoveServerSideRemoteValueHolderCommand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DroneManagerImpl implements DroneManager {

    private static DroneManager instance;
    protected List<Drone> drones;
    protected List<Piloto> pilotos;
    protected List<Reserva> reservas;
    final static Logger logger = Logger.getLogger(DroneManagerImpl.class);

    private DroneManagerImpl() {
        this.drones = new LinkedList<>();
    }

    public static DroneManager getInstance() {
        if (instance == null) instance = new DroneManagerImpl();
        return instance;
    }


    public Drone getDrone(int id) {
        logger.info("getDrone(" + id + ")");

        for (Drone d : this.drones) {
            if (d.getId().equals(id)) {
                logger.info("getDrone(" + id + "): " + d);
                return d;
            }
        }

        logger.warn("not found " + id);
        return null;
    }

    public int getHores(int id) {
        for (Drone d : this.drones) {
            if (d.getFabricante().equals(id)) {
                return d.getHoras();
            }
        }
        return 0;
    }

    public List<Drone> reservas(int id) {
        List<Drone> reservas;
        return null;
    }

    @Override
    public Drone addDrone(String id, String nombre, String fabricante, String modelo, int horas) {
        Drone d = new Drone(id,nombre, fabricante, modelo, horas);
        drones.add(d);
        return d;
    }


    @Override
    public Piloto addPiloto(String id, String nombre, String apellidos, int horas) {
        Piloto p = new Piloto(id, nombre, apellidos, horas);
        pilotos.add(p);
        return p;
    }

    @Override
    public Drone saveDrone(String id) {

        return null;
    }

    @Override
    public List<String> ldrones() {
        List<Drone> ldrones = new ArrayList<>();
        ldrones.sort((d1, d2) -> Integer.compare(
                d2.getHoras(),
                d1.getHoras()
        ));
        List<String> lista = new ArrayList<>();
        ldrones.forEach(drone -> {
            lista.add(drone.getId() + ": " + drone.getHoras());
        });
        return lista;
    }

    @Override
    public List<String> lpilotos() {
        List<Piloto> lpilotos = new ArrayList<>();
        lpilotos.sort((p1, p2) -> Integer.compare(
                p2.getHoras(),
                p1.getHoras()
        ));
        List<String> lista = new ArrayList<>();
        lpilotos.forEach(piloto -> {
            lista.add(piloto.getId() + ": " + piloto.getHoras());
        });
        return lista;
    }

    @Override
    public List<String> vuelosPilotos() {
        List<String> lvuelos = new ArrayList<>();

        return null;
    }

    @Override
    public List<String> vuelosDrones() {

        return null;
    }

    @Override
    public List<String> mantDrone(String id) {
//        List<String> manteniment = new ArrayList<>();
//        Drone d = new Drone(manteniment.d.getId(), d.getNombre(),d.getFabricante(),d.getModelo(),d.getHoras());
//        manteniment.add(d.getId());
//        return manteniment;
        return null;
    }

    @Override
    public Reserva addReserva(String idDrone, int dia, int hora, int tiempo, int poslatin, int poslogin, int poslatdst, int poslogdst, String piloto) {
        Reserva r = new Reserva(idDrone, dia, hora,tiempo, poslatin, poslatdst, poslogin, poslogdst, piloto);
        reservas.add(r);
        return r;
    }

//    @Override
//    public List<Reserva> lreservas(String id){
//        List<Reserva> lreservas;
//        for(Piloto p: this.pilotos){
//            if (p.getId().equals(id)){
//                lreservas.add(reservas);
//            }
//        }
//    }
    @Override
    public int size() {
        int ret = this.drones.size();
        logger.info("size " + ret);
        return ret;
    }

    @Override
    public void sortList() {
        drones.sort((Drone d1, Drone d2) -> Integer.compare(d1.getHoras(), (d2.getHoras())));
        for (Drone drone : drones) {
            logger.info("Dron: " + drone.getNombre() + " - horas: " + drone.getHoras());
        }
    }

}