package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Producto;
import org.uniquindio.edu.co.poo.model.Cliente;
import org.uniquindio.edu.co.poo.model.builder.*;
import org.uniquindio.edu.co.poo.model.singleton.*;
import org.uniquindio.edu.co.poo.model.factory.envios.*;
import org.uniquindio.edu.co.poo.model.factory.pagos.*;
import org.uniquindio.edu.co.poo.model.factory.notificaciones.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Singleton: catálogo
        CatalogoProductos catalogo = CatalogoProductos.getInstance();
        catalogo.agregarProducto(new Producto("SKU1", "Tomates", 4000));
        catalogo.agregarProducto(new Producto("SKU2", "Café", 15000));

        // Cliente
        Cliente cliente = new Cliente("Diego", "diego27@email.com", "321456789");

        // Builder: pedido
        Pedido pedido = new Pedido.PedidoBuilder("PED001", new Date(), cliente)
                .addProducto(catalogo.getProducto("SKU1"), 3)
                .addProducto(catalogo.getProducto("SKU2"), 1)
                .withNotas("Entregar en portería")
                .withDescuento(0.)
                .build();

        pedido.mostrarPedido(new EnvioEstandar());

        // Factory Method: Envio
        EnvioFactory envioFactory = new EnvioEstandarFactory();
        TipoEnvio envio = envioFactory.crearEnvio();

        MetodoPago pago = new PagoNequi();
        pago.procesarPago(pedido.calcularTotal(envio));



        double total = pedido.calcularTotal(envio);
        System.out.println("Total a pagar: $" + total);


        // Factory Method: notificación
        NotificacionFactory notificacionFactory = new NotificacionEmailFactory();
        Notificacion notificacion = notificacionFactory.crearNotificacion();
        notificacion.notificar("Pedido confirmado para " + cliente.getNombre() + "con correo " + cliente.getEmail());

    }
}