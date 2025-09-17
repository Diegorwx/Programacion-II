package org.uniquindio.edu.co.poo.model;

import org.uniquindio.edu.co.poo.model.builder.Pedido;
import org.uniquindio.edu.co.poo.model.factory.envios.TipoEnvio;

import java.util.Map;

public class PedidoMensaje {

    public String generarMensaje(Pedido pedido, TipoEnvio envio) {
        double subtotal = 0;

        for (Map.Entry<Producto, Integer> entry : pedido.getProductos().entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            subtotal += producto.getPrecio() * cantidad;
        }

        double descuentoAplicado = subtotal * pedido.getDescuento();
        double totalConDescuento = subtotal - descuentoAplicado;
        double costoEnvio = envio.calcularEnvio();
        double totalFinal = totalConDescuento + costoEnvio;

        return "                                         \n\n" +
                "Pedido ID: " + pedido.getId() + "\n" +
                "Cliente: " + pedido.getCliente().getNombre() + "\n" +
                "Subtotal: " + subtotal + "\n" +
                "Descuento (" + (pedido.getDescuento() * 100) + "%): -" + descuentoAplicado + "\n" +
                "Costo de envío: +" + costoEnvio + "\n" +
                "TOTAL A PAGAR: " + totalFinal + "\n" +
                "\n¡GRACIAS POR SU COMPRA!";
    }
}
