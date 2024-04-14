package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Piloto {

    String id;
    String nombre;
    String apellidos;
    int horas;
    static int lastId;

    public Piloto(String id, String nombre, String apellidos, int horas) {
        this.id = RandomUtils.getId();
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setHoras(horas);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
    }

}


