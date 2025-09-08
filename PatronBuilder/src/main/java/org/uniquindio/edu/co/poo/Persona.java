package org.uniquindio.edu.co.poo;

public class Persona {
    // Atributos obligatorios
    private final String nombre;
    private final String apellido;
    private final String cedula;

    // Atributos opcionales
    private final String email;
    private final String telefono;
    private final String direccion;
    private final int edad;

    // Constructor privado que recibe el builder
    private Persona(PersonaBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.cedula = builder.cedula;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.edad = builder.edad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCedula() { return cedula; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }
    public int getEdad() { return edad; }

    // Clase interna Builder
    public static class PersonaBuilder {
        private final String nombre;
        private final String apellido;
        private final String cedula;

        private String email;
        private String telefono;
        private String direccion;
        private int edad;

        public PersonaBuilder(String nombre, String apellido, String cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
        }

        public PersonaBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonaBuilder withTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public PersonaBuilder withDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public PersonaBuilder withEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }
    }
}

