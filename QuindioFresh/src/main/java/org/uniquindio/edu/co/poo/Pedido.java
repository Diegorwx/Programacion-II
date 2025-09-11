package org.uniquindio.edu.co.poo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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

        public PedidoBuilder addProducto(Producto p, int cantidad) {
            productos.put(p, cantidad);
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
