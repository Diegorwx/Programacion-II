package org.uniquindio.edu.co.poo;

public class PagoTarjetaCredito implements MetodoPago {
    public void procesarPago(double monto) {
    System.out.println("Pago con Tarjeta de Credito por $" + monto);}
}
