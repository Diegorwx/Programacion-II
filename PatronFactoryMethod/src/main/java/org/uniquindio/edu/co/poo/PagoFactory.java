package org.uniquindio.edu.co.poo;

public class PagoFactory {
    public static IMetodoPago crearMetodoPago(String tipo) {
        switch (tipo.toUpperCase()) {
            case "TARJETA":
                return new PagoTarjetaCredito();
            case "PAYPAL":
                return new PagoPayPal();
            case "TRANSFERENCIA":
                return new PagoTransferencia();
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + tipo);
        }
    }
}