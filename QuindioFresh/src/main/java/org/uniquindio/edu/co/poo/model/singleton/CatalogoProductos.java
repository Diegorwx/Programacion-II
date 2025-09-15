package org.uniquindio.edu.co.poo.model.singleton;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
    private static CatalogoProductos instancia;
    private final Map<String, Producto> productos = new HashMap<>();

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

    public Map<String, Producto> getProductos() {
        return new HashMap<>(productos);
    }
}
