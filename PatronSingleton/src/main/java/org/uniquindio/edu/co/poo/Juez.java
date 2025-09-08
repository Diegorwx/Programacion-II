package org.uniquindio.edu.co.poo;

public class Juez {

    public void consultarMarcador() {
        Marcador marcador = Marcador.getInstance();
        System.out.println("Marcador Actual -> " + marcador.getMarcador());
    }

    public void finalizarJuego() {
        Marcador marcador = Marcador.getInstance();
        marcador.reiniciarMarcador();
        System.out.println("Marcador reiniciado.");
    }
}
