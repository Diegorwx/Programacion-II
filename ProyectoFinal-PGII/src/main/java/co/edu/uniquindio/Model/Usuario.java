package co.edu.uniquindio.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private List<Direccion> direcciones;


    public Usuario() {
        this.direcciones = new ArrayList<>();
    }

    public Usuario(String idUsuario, String nombre, String correo,
                   String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direcciones = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
