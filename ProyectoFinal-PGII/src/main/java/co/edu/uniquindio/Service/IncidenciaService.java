package co.edu.uniquindio.Service;

import co.edu.uniquindio.Model.EstadoIncidencia;
import co.edu.uniquindio.Model.Incidencia;
import co.edu.uniquindio.Model.Envio;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IncidenciaService {

    private List<Incidencia> incidencias;

    public IncidenciaService() {
        this.incidencias = new ArrayList<>();
    }


    public Incidencia reportarIncidencia(Envio envio, String descripcion) {
        Incidencia incidencia = new Incidencia(
                UUID.randomUUID().toString(),
                descripcion,
                envio,
                EstadoIncidencia.PENDIENTE
        );

        incidencias.add(incidencia);
        return incidencia;
    }


    public List<Incidencia> listarIncidencias() {
        return incidencias;
    }


    public Incidencia buscarPorId(String idIncidencia) {
        for (Incidencia i : incidencias) {
            if (i.getIdIncidencia().equalsIgnoreCase(idIncidencia)) {
                return i;
            }
        }
        return null;
    }


    public boolean actualizarEstado(String idIncidencia, EstadoIncidencia nuevoEstado) {
        Incidencia incidencia = buscarPorId(idIncidencia);
        if (incidencia != null) {
            incidencia.setEstado(nuevoEstado);
            return true;
        }
        return false;
    }
}

