package co.edu.uniquindio.Service.Factory;

import co.edu.uniquindio.Model.Envio;

public class EnvioEstandarFactory extends EnvioFactory{
    @Override
    public Envio crearEnvio() {
        Envio envio = new Envio();
        return envio;
    }
}
