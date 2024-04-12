package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Drone {

    String id;
    String nombre;
    String fabricante;
    String modelo;


    int horas;
    static int lastId;

    public Drone() {
        this.id = RandomUtils.getId();
    }

    public Drone(String nombre, String fabricante, String modelo) {
        this();
        this.setNombre(nombre);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id=id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "id="+id+", nombre=" + nombre + ", fabricante=" + fabricante +", modelo=" + modelo + ", horas=" + horas +"]";
    }

}