package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

public class Reserva {
    String id;
    int dia;
    int hora;
    int tiempo;
    int poslatin;
    int poslogin;
    int poslatdst;
    int poslogdst;
    String piloto;

    public Reserva(String id, int dia, int hora, int tiempo,  int poslatin, int poslogin, int poslatdst, int poslogdst, String piloto) {
        this.id = RandomUtils.getId();
        this.setdia(dia);
        this.setHora(hora);
        this.setHora(hora);
        this.setTiempo(tiempo);
        this.setPoslatin(poslatin);
        this.setPoslatdst(poslatdst);
        this.setPoslogin(poslogin);
        this.setPoslogdst(poslogdst);
        this.setPiloto(piloto);
    }

    public String getId() {
        return id;
    }

    public int getdia() {
        return dia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getPoslatin() {return poslatin;}
    public int getPoslogin() {return poslogin;}
    public int getPoslatdst() {return poslatdst;}
    public int getPoslogdst() {return poslogdst;}
    public int getHora() {return hora;}
    public String getPiloto() {return piloto;}
    public void setId(String id) {
        this.id = id;
    }
    public void setdia(int dia) {
        this.dia = dia;
    }
    public void setHora(int hora) {this.hora = hora;}
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public void setPoslatin(int poslatin) {this.poslatin = poslatin;}
    public void setPoslogin(int poslogin) {this.poslogin = poslogin;}
    public void setPoslatdst(int poslatdst) {this.poslatdst = poslatdst;}
    public void setPoslogdst(int poslogdst) {this.poslogdst = poslogdst;}
    public void setPiloto(String piloto) {this.piloto = piloto;}
}

