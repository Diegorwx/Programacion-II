package org.uniquindio.edu.co.poo.model.factory.pagos;

public class PagoTarjetaCreditoFactory implements PagoFactory {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoTarjetaCredito();
    }
}