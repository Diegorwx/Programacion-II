package org.uniquindio.edu.co.poo;

public class PagoPSE implements MetodoPago{
    public void procesarPago(double monto) {
        System.out.println("Pago con PSE por $" + monto);
    }
}
