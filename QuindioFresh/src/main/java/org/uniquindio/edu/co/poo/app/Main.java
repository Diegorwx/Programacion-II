package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.builder.*;
import org.uniquindio.edu.co.poo.model.singleton.*;

import org.uniquindio.edu.co.poo.model.factory.envios.*;
import org.uniquindio.edu.co.poo.model.factory.notificaciones.*;
import org.uniquindio.edu.co.poo.model.factory.pagos.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Singleton: catálogo
        CatalogoProductos catalogo = CatalogoProductos.getInstance();
        catalogo.agregarProducto(new Producto("SKU1", "Manzanas", 5000));
        catalogo.agregarProducto(new Producto("SKU2", "Café", 15000));

        // Cliente
        Cliente cliente = new Cliente("Luis ", "luis27@email.com", "321456789");

        // Builder: pedido
        Pedido pedido = new Pedido.PedidoBuilder("PED001", new Date(), cliente)
                .addProducto(catalogo.getProducto("SKU1"), 3)
                .addProducto(catalogo.getProducto("SKU2"), 1)
                .withDireccion("Calle 10 #25-30")
                .withNotas("Entregar en portería")
                .build();

        pedido.mostrarPedido();

        // Factory Method: pago con Nequi
        PagoFactory pagoFactory = new PagoNequiFactory();
        MetodoPago pago = pagoFactory.crearMetodoPago();
        pago.procesarPago(20000);

        // Factory Method: envío recogida en tienda
        EnvioFactory envioFactory = new EnvioExpressFactory();
        TipoEnvio envio = envioFactory.crearEnvio();
        System.out.println("Costo de envío: $" + envio.calcularEnvio());

        // Factory Method: notificación por WhatsApp
        NotificacionFactory notificacionFactory = new NotificacionEmailFactory();
        Notificacion notificacion = notificacionFactory.crearNotificacion();
        notificacion.notificar("Pedido confirmado para " + cliente.getNombre() + "con correo " + cliente.getEmail());


    }
}