package co.edu.uniquindio.Model;

public class Repartidor {
    private String idRepartidor;
    private String nombre;
    private String documento;
    private String telefono;
    private String zonaCobertura;
    private EstadoDisponibilidad disponibilidad;


    public Repartidor() {
        this.disponibilidad = EstadoDisponibilidad.DISPONIBLE;
    }


    public Repartidor(String idRepartidor, String nombre, String documento, String telefono,
                      String zonaCobertura, EstadoDisponibilidad disponibilidad) {
        this.idRepartidor = idRepartidor;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.zonaCobertura = zonaCobertura;
        this.disponibilidad = disponibilidad;
    }

    public String getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(String idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public EstadoDisponibilidad getEstadoDisponibilidad() {
        return disponibilidad;
    }

    public void setEstadoDisponibilidad(EstadoDisponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "idRepartidor='" + idRepartidor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", zonaCobertura='" + zonaCobertura + '\'' +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}