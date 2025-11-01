package co.edu.uniquindio.Model;

import java.time.LocalDateTime;

public class Pago {
    private String idPago;
    private double monto;
    private LocalDateTime fecha;
    private MetodoPago metodoPago;
    private ResultadoPago resultado;


    public Pago() {
        this.fecha = LocalDateTime.now();
        this.resultado = ResultadoPago.RECHAZADO;
    }

    public Pago(String idPago, double monto, MetodoPago metodoPago, ResultadoPago resultado) {
        this.idPago = idPago;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
        this.metodoPago = metodoPago;
        this.resultado = resultado;
    }


    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ResultadoPago getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoPago resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "idPago='" + idPago + '\'' +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", metodoPago=" + metodoPago +
                ", resultado=" + resultado +
                '}';
    }
}
