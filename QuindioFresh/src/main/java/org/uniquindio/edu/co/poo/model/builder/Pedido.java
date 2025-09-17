package org.uniquindio.edu.co.poo.model.builder;

import org.uniquindio.edu.co.poo.model.Cliente;
import org.uniquindio.edu.co.poo.model.factory.envios.TipoEnvio;
import org.uniquindio.edu.co.poo.model.Producto;
import java.util.*;

public class Pedido {
    private final String id;
    private final Date fecha;
    private final Cliente cliente;
    private final Map<Producto, Integer> productos;
    private final String direccion;
    private final String notas;
    private final double descuento;

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
        private double descuento;

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

        public PedidoBuilder withDescuento(double desc) {
            this.descuento = desc;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }


    public String getId() { return id; }
    public Date getFecha() { return fecha; }
    public Cliente getCliente() { return cliente; }
    public Map<Producto, Integer> getProductos() { return productos; }
    public String getDireccion() { return direccion; }
    public String getNotas() { return notas; }
    public double getDescuento() { return descuento; }


    public double calcularTotal(TipoEnvio envio) {
        double subtotal = 0;

        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            subtotal += producto.getPrecio() * cantidad;
        }

        double descuentoAplicado = subtotal * descuento;
        double totalConDescuento = subtotal - descuentoAplicado;

        double costoEnvio = envio.calcularEnvio();

        return totalConDescuento + costoEnvio;
    }

}


