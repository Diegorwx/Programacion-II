package org.uniquindio.edu.co.poo;

public class EnvioExpress implements TipoEnvio{
    @Override
    public double calcularEnvio() {
        return 15000;
    }
}
