package org.uniquindio.edu.co.poo.model.factory.envios;

public class EnvioExpress implements TipoEnvio {
    @Override
    public double calcularEnvio() {
        return 15000;
    }
}
