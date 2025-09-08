package org.uniquindio.edu.co.poo;

public class Main {
    public static void main(String[] args) {
        // Persona con solo atributos obligatorios
        Persona personaBasica = new Persona.PersonaBuilder("Juan", "Perez", "12345678").build();

        // Persona con atributos opcionales
        Persona personaCompleta = new Persona.PersonaBuilder("Ana", "Gomez", "87654321")
                .withEmail("ana.gomez@email.com")
                .withEdad(30)
                .build();

        System.out.println("Persona Completa: " + personaCompleta.getNombre() + " tiene " +
                personaCompleta.getEdad() + " años.");
    }
}
