package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Cliente;
import org.uniquindio.edu.co.poo.model.PedidoMensaje;
import org.uniquindio.edu.co.poo.model.Producto;
import org.uniquindio.edu.co.poo.model.builder.*;
import org.uniquindio.edu.co.poo.model.factory.envios.*;
import org.uniquindio.edu.co.poo.model.factory.notificaciones.*;
import org.uniquindio.edu.co.poo.model.factory.pagos.*;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Luis", "luis27@email.com", "321456789");

        //Crear productos
        Producto manzanas = new Producto("001", "Manzanas", 10000);
        Producto peras = new Producto("002", "Peras", 17000);

        // Construir pedido con builder
        Pedido pedido = new Pedido.PedidoBuilder("P-001", new Date(), cliente)
                .addProducto(manzanas, 2)
                .addProducto(peras, 1)
                .withDescuento(0.1)
                .withNotas("Entregar en la mañana")
                .build();

        // Escoger tipo de envío
        TipoEnvio envio = new EnvioEstandar();

        // Generar mensaje
        PedidoMensaje pedidoMensaje = new PedidoMensaje();
        String mensaje = pedidoMensaje.generarMensaje(pedido, envio);

        //Notificación por algún canal
        NotificacionFactory factory = new NotificacionWhatsappFactory();
        Notificacion notificacion = factory.crearNotificacion();
        notificacion.notificar(mensaje);


        // Metodo de Pago
        double total= pedido.calcularTotal(envio);
        MetodoPago pago = new PagoNequi();
        pago.procesarPago (total);

    }
}