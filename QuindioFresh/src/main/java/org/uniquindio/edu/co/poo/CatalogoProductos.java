package org.uniquindio.edu.co.poo;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
    private static CatalogoProductos instancia;
    private Map<String, Producto> productos = new HashMap<>();

    private CatalogoProductos() {}

    public static CatalogoProductos getInstance() {
        if (instancia == null) {
            instancia = new CatalogoProductos();
        }
        return instancia;
    }

    public void agregarProducto(Producto p) {
        productos.put(p.getSku(), p);
    }

    public Producto getProducto(String sku) {
        return productos.get(sku);
    }
}

