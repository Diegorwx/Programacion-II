package co.edu.uniquindio.SOLID.Model.DTO;


import java.time.LocalDate;

public class MovimientoInventarioDTO {

    private String id;
    private String tipo; // ENTRADA o SALIDA
    private LocalDate fecha;
    private String skuProducto;
    private int cantidad;
    private String referencia;

    public MovimientoInventarioDTO() {
    }

    public MovimientoInventarioDTO(String id, String tipo, LocalDate fecha, String skuProducto,
                                   int cantidad, String referencia) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.skuProducto = skuProducto;
        this.cantidad = cantidad;
        this.referencia = referencia;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getSkuProducto() {
        return skuProducto;
    }

    public void setSkuProducto(String skuProducto) {
        this.skuProducto = skuProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}

