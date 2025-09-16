package org.uniquindio.edu.co.poo.model.factory.pagos;

public class PagoNequi implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " realizado con Nequi.");
    }
}