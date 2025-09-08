package org.uniquindio.edu.co.poo;

public class Marcador {

    private static Marcador instancia;
    private int puntosEquipo1;
    private int puntosEquipo2;

    private Marcador() {
        this.puntosEquipo1 = 0;
        this.puntosEquipo2 = 0;
    }

    public static Marcador getInstance() {
        if (instancia == null) {
            instancia = new Marcador();
        }
        return instancia;
    }

    public void anotarEquipo1() {
        puntosEquipo1 += 3;
    }

    public void anotarEquipo2() {
        puntosEquipo2 += 3;
    }

    public String getMarcador() {
        return "Equipo 1: " + puntosEquipo1 + " - Equipo 2: " + puntosEquipo2;
    }

    public void reiniciarMarcador() {
        puntosEquipo1 = 0;
        puntosEquipo2 = 0;
    }

}
