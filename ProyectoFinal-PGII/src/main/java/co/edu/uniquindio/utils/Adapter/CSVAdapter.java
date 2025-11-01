package co.edu.uniquindio.utils.Adapter;

import co.edu.uniquindio.Model.Envio;

public class CSVAdapter implements ReporteAdapter {
    @Override
    public String generarReporte(Envio envio) {
        return envio.getIdEnvio() + ";" + envio.getPeso() + ";" + envio.getCosto();
    }
}

