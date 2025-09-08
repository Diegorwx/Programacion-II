package org.uniquindio.edu.co.poo;

public class PagoPayPal implements IMetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Iniciando sesión de PayPal para pago de $" + monto + ".");
    }
}