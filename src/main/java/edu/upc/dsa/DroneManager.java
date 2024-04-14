package edu.upc.dsa;

import edu.upc.dsa.models.Drone;
import edu.upc.dsa.models.Piloto;
import edu.upc.dsa.models.Reserva;

import java.util.List;

public interface DroneManager {


    public Drone addDrone(String id, String nombre, String fabricante, String modelo, int horas);
    public Piloto addPiloto(String id, String nombre, String apellidos, int horas);
    public List<String> ldrones();
    public List<String> lpilotos();
    public Drone saveDrone(String id);
    public List <String> mantDrone(String id);
    public Reserva addReserva(String idDrone, int dia, int hora, int tiempo, int poslatin, int poslogin,int poslatdst, int poslogdst, String piloto);
    public List<String> vuelosPilotos();
    public List<String> vuelosDrones();

    public void sortList();
    public int size();

}
