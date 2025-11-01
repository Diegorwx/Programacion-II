package co.edu.uniquindio.Model.DTO;

import co.edu.uniquindio.Model.EstadoEnvio;

public class EnvioDTO {
    private String idEnvio;
    private String nombreUsuario;
    private String nombreRepartidor;
    private double peso;
    private double costo;
    private EstadoEnvio estado;

    public EnvioDTO() {}

    public EnvioDTO(String idEnvio, String nombreUsuario, String nombreRepartidor, double peso, double costo, EstadoEnvio estado) {
        this.idEnvio = idEnvio;
        this.nombreUsuario = nombreUsuario;
        this.nombreRepartidor = nombreRepartidor;
        this.peso = peso;
        this.costo = costo;
        this.estado = estado;
    }

    // Getters y Setters
    public String getIdEnvio() { return idEnvio; }
    public void setIdEnvio(String idEnvio) { this.idEnvio = idEnvio; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getNombreRepartidor() { return nombreRepartidor; }
    public void setNombreRepartidor(String nombreRepartidor) { this.nombreRepartidor = nombreRepartidor; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public EstadoEnvio getEstado() { return estado; }
    public void setEstado(EstadoEnvio estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "EnvioDTO{" +
                "idEnvio='" + idEnvio + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", nombreRepartidor='" + nombreRepartidor + '\'' +
                ", peso=" + peso +
                ", costo=" + costo +
                ", estado=" + estado +
                '}';
    }
}
