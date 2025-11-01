package co.edu.uniquindio.Model.DTO;

import co.edu.uniquindio.Model.EstadoIncidencia;
import java.time.LocalDateTime;

public class IncidenciaDTO {

    private String idIncidencia;
    private String descripcion;
    private LocalDateTime fechaReporte;
    private EstadoIncidencia estado;
    private String idEnvio; // Solo guardamos el ID del envío, no el objeto completo

    public IncidenciaDTO() {}

    public IncidenciaDTO(String idIncidencia, String descripcion, LocalDateTime fechaReporte,
                         EstadoIncidencia estado, String idEnvio) {
        this.idIncidencia = idIncidencia;
        this.descripcion = descripcion;
        this.fechaReporte = fechaReporte;
        this.estado = estado;
        this.idEnvio = idEnvio;
    }


    public String getIdIncidencia() { return idIncidencia; }
    public void setIdIncidencia(String idIncidencia) { this.idIncidencia = idIncidencia; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDateTime getFechaReporte() { return fechaReporte; }
    public void setFechaReporte(LocalDateTime fechaReporte) { this.fechaReporte = fechaReporte; }

    public EstadoIncidencia getEstado() { return estado; }
    public void setEstado(EstadoIncidencia estado) { this.estado = estado; }

    public String getIdEnvio() { return idEnvio; }
    public void setIdEnvio(String idEnvio) { this.idEnvio = idEnvio; }

    @Override
    public String toString() {
        return "IncidenciaDTO{" +
                "idIncidencia='" + idIncidencia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaReporte=" + fechaReporte +
                ", estado=" + estado +
                ", idEnvio='" + idEnvio + '\'' +
                '}';
    }
}

