package org.uniquindio.edu.co.poo.model.factory.envios;

public class EnvioExpressFactory implements EnvioFactory {
    @Override
    public TipoEnvio crearEnvio() {
        return new EnvioExpress();
    }
}
