package org.uniquindio.edu.co.poo;

public class PagoFactory {
    public static MetodoPago crearMetodoPago (String tipo) {
        switch (tipo.toUpperCase()) {
            case "TARJETA": return new PagoTarjetaCredito();
            case "PSE":  return new PagoPSE();
            default: throw new IllegalArgumentException("No se puede realizar el pago");
        }
    }
}
