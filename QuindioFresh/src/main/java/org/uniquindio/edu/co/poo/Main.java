package org.uniquindio.edu.co.poo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CatalogoProductos catalogo = CatalogoProductos.getInstance();
        catalogo.agregarProducto(new Producto("SKU1", "Manzanas", 5000));
        catalogo.agregarProducto(new Producto("SKU2", "Café", 15000));

        Cliente cliente = new Cliente("Ana", "ana@email.com", "321456789");

        Pedido pedido = new Pedido.PedidoBuilder("PED001", new Date(), cliente)
                .addProducto(catalogo.getProducto("SKU1"), 2)
                .addProducto(catalogo.getProducto("SKU2"), 1)
                .withDireccion("Calle 10 #25-30")
                .withNotas("Entregar en portería")
                .build();

        MetodoPago pago = PagoFactory.crearMetodoPago("TARJETA");
        pago.procesarPago(25000);

        TipoEnvio envio = EnvioFactory.crearEnvio("EXPRESS");
        System.out.println("Costo de envío: $" + envio.calcularEnvio());

        Notificacion notificacion = NotificacionFactory.crearNotificacion("EMAIL");
        notificacion.notificar("Pedido confirmado para " + cliente.getNombre());
    }
}
