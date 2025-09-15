package org.uniquindio.edu.co.poo.model.builder;

import org.uniquindio.edu.co.poo.model.singleton.Producto;
import java.util.*;

public class Pedido {
    private final String id;
    private final Date fecha;
    private final Cliente cliente;
    private final Map<Producto, Integer> productos;
    private final String direccion;
    private final String notas;
    private final String descuento;

    private Pedido(PedidoBuilder builder) {
        this.id = builder.id;
        this.fecha = builder.fecha;
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.direccion = builder.direccion;
        this.notas = builder.notas;
        this.descuento = builder.descuento;
    }

    public void mostrarPedido() {
        System.out.println("Pedido " + id + " - Cliente: " + cliente.getNombre());
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto p = entry.getKey();
            int cantidad = entry.getValue();
            double subtotal = p.getPrecio() * cantidad;
            System.out.println("   Producto: " + p.getNombre() +
                    " x" + cantidad +
                    " - $" + subtotal);
        }
        if (direccion != null) System.out.println("   Dirección: " + direccion);
        if (notas != null) System.out.println("   Notas: " + notas);
        if (descuento != null) System.out.println("   Descuento aplicado: " + descuento);
    }


    public static class PedidoBuilder {
        private final String id;
        private final Date fecha;
        private final Cliente cliente;
        private final Map<Producto, Integer> productos = new HashMap<>();

        private String direccion;
        private String notas;
        private String descuento;

        public PedidoBuilder(String id, Date fecha, Cliente cliente) {
            this.id = id;
            this.fecha = fecha;
            this.cliente = cliente;
        }

        public PedidoBuilder addProducto(Producto producto, int cantidad) {
            productos.put(producto, cantidad);
            return this;
        }

        public PedidoBuilder withDireccion(String dir) {
            this.direccion = dir;
            return this;
        }

        public PedidoBuilder withNotas(String notas) {
            this.notas = notas;
            return this;
        }

        public PedidoBuilder withDescuento(String desc) {
            this.descuento = desc;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}


