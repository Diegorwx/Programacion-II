package org.uniquindio.edu.co.poo.model.factory.envios;

public class EnvioEstandarFactory implements EnvioFactory {
    @Override
    public TipoEnvio crearEnvio() {
        return new EnvioEstandar();
    }
}

