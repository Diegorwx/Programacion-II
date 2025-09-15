package org.uniquindio.edu.co.poo.model.factory.envios;

public class EnvioRecogidaTienda implements TipoEnvio {
    @Override
    public double calcularEnvio() {
        System.out.println("El cliente recogerá el pedido en tienda.");
        return 0;
    }
}
