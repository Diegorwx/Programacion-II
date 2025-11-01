package co.edu.uniquindio.Service.Singleton;

import co.edu.uniquindio.Service.EnvioService;

public class EnvioServiceSingleton {
    private static EnvioService instancia;

    private EnvioServiceSingleton() {}

    public static EnvioService getInstancia() {
        if (instancia == null) {
            instancia = new EnvioService();
        }
        return instancia;
    }
}

