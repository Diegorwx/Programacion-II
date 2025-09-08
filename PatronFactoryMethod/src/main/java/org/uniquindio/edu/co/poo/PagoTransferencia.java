package org.uniquindio.edu.co.poo;

public class PagoTransferencia implements IMetodoPago {
    public void procesarPago(double monto) {
        System.out.println("Generando referencia para transferencia bancaria por $" + monto + ".");
    }
}
