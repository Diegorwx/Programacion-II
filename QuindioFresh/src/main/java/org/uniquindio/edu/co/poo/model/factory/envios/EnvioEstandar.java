package org.uniquindio.edu.co.poo.model.factory.envios;

public class EnvioEstandar implements TipoEnvio {
    @Override
    public double calcularEnvio() {
        return 7000;
    }
}
