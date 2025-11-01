package co.edu.uniquindio.Service;

import co.edu.uniquindio.Model.EstadoDisponibilidad;
import co.edu.uniquindio.Model.Repartidor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RepartidorService {

    private List<Repartidor> repartidores;

    public RepartidorService() {
        this.repartidores = new ArrayList<>();
    }


    public Repartidor registrarRepartidor(String nombre, String documento, String telefono, String zonaCobertura) {
        Repartidor repartidor = new Repartidor(
                UUID.randomUUID().toString(),
                nombre,
                documento,
                telefono,
                zonaCobertura,
                EstadoDisponibilidad.DISPONIBLE
        );
        repartidores.add(repartidor);
        return repartidor;
    }


    public void cambiarDisponibilidad(String idRepartidor, EstadoDisponibilidad nuevoEstado) {
        for (Repartidor r : repartidores) {
            if (r.getIdRepartidor().equals(idRepartidor)) {
                r.setEstadoDisponibilidad(nuevoEstado);
                break;
            }
        }
    }


    public void actualizarZonaCobertura(String idRepartidor, String nuevaZona) {
        for (Repartidor r : repartidores) {
            if (r.getIdRepartidor().equals(idRepartidor)) {
                r.setZonaCobertura(nuevaZona);
                break;
            }
        }
    }


    public List<Repartidor> listarRepartidores() {
        return repartidores;
    }
}
