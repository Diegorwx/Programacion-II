package co.edu.uniquindio.Model;

import java.time.LocalDateTime;

public class Incidencia {

    private String idIncidencia;
    private String descripcion;
    private LocalDateTime fechaReporte;
    private EstadoIncidencia estado;
    private Envio envio; // Asociación directa al envío afectado

    public Incidencia() {
        this.fechaReporte = LocalDateTime.now();
        this.estado = EstadoIncidencia.PENDIENTE;
    }

    public Incidencia(String idIncidencia, String descripcion, Envio envio, EstadoIncidencia estado) {
        this.idIncidencia = idIncidencia;
        this.descripcion = descripcion;
        this.envio = envio;
        this.fechaReporte = LocalDateTime.now();
        this.estado = estado;
    }


    public String getIdIncidencia() { return idIncidencia; }
    public void setIdIncidencia(String idIncidencia) { this.idIncidencia = idIncidencia; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDateTime getFechaReporte() { return fechaReporte; }
    public void setFechaReporte(LocalDateTime fechaReporte) { this.fechaReporte = fechaReporte; }

    public EstadoIncidencia getEstado() { return estado; }
    public void setEstado(EstadoIncidencia estado) { this.estado = estado; }

    public Envio getEnvio() { return envio; }
    public void setEnvio(Envio envio) { this.envio = envio; }

    @Override
    public String toString() {
        return "Incidencia{" +
                "idIncidencia='" + idIncidencia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaReporte=" + fechaReporte +
                ", estado=" + estado +
                ", envio=" + (envio != null ? envio.getIdEnvio() : "N/A") +
                '}';
    }
}

