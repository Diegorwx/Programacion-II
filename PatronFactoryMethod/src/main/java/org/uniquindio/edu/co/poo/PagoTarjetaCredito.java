package org.uniquindio.edu.co.poo;

class PagoTarjetaCredito implements IMetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
    }
}
