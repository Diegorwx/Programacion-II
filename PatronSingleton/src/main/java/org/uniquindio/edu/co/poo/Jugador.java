package org.uniquindio.edu.co.poo;

public class Jugador {

    private String nombre;
    private int numeroEquipo;

    public Jugador(String nombre, int numeroEquipo) {
        this.nombre = nombre;
        this.numeroEquipo = numeroEquipo;
    }

    public void anotar() {
        Marcador marcador = Marcador.getInstance();
        if (numeroEquipo == 1) {
            marcador.anotarEquipo1();
        } else {
            marcador.anotarEquipo2();
        }
    }
}
