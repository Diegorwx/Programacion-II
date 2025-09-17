package org.uniquindio.edu.co.poo.model.factory.pagos;

public class PagoPSEFactory implements PagoFactory {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoPSE();
    }
}
