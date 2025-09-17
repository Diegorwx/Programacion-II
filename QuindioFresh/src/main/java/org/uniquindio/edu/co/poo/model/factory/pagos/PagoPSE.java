package org.uniquindio.edu.co.poo.model.factory.pagos;

public class PagoPSE implements MetodoPago{
    public void procesarPago(double monto) {
        System.out.println("Pago con PSE por $" + monto);
    }
}
