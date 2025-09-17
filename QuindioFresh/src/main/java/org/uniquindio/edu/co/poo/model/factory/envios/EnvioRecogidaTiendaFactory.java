package org.uniquindio.edu.co.poo.model.factory.envios;

public class EnvioRecogidaTiendaFactory implements EnvioFactory {
    @Override
    public TipoEnvio crearEnvio() {
        return new EnvioRecogidaTienda();
    }
}