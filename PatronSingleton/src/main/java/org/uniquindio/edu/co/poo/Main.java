package org.uniquindio.edu.co.poo;

public class Main {
    public static void main(String[] args) {
        Juez juez = new Juez();
        Jugador jugador1 = new Jugador("Michael", 1);
        Jugador jugador2 = new Jugador("Larry", 2);

        System.out.println("--- ¡Inicia el partido! ---");

        jugador1.anotar();
        jugador2.anotar();
        jugador1.anotar();

        juez.consultarMarcador(); // Equipo 1: 6 - Equipo 2: 3

        System.out.println("\n--- ¡Fin del partido! ---");
        juez.finalizarJuego();
        juez.consultarMarcador(); // Equipo 1: 0 - Equipo 2: 0
    }
}