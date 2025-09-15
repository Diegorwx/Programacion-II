package org.uniquindio.edu.co.poo.model.factory.pagos;

public class PagoNequiFactory implements PagoFactory {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoNequi();
    }
}
