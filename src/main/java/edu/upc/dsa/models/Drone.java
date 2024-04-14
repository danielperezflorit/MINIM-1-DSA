package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Drone implements Comparable {

    private String id;
    private String nombre;
    private String fabricante;
    private String modelo;
    private int horas;

    public Drone(String id, String nombre, String fabricante, String modelo, int horas) {
        this.id = RandomUtils.getId();
        this.setNombre(nombre);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.horas = horas;
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}