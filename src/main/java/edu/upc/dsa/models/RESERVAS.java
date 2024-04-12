package edu.upc.dsa.models;

public class RESERVAS {


    int id;
    int [] fecha;
    int tiempo;
    int posIn;
    int posDst;
    Piloto piloto;

    public int getId() {
        return id;
    }
    public int[] getFecha() {
        return fecha;
    }
    public int getTiempo() {
        return tiempo;
    }
    public int getPosIn() {
        return posIn;
    }
    public int getPosDst() {
        return posDst;
    }
    public Piloto getPiloto() {
        return piloto;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFecha(int[] fecha) {
        this.fecha = fecha;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public void setPosIn(int posIn) {
        this.posIn = posIn;
    }
    public void setPosDst(int posDst) {
        this.posDst = posDst;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
