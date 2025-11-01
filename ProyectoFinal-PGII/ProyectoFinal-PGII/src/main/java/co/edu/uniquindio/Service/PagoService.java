package co.edu.uniquindio.Service;

import co.edu.uniquindio.Model.MetodoPago;
import co.edu.uniquindio.Model.Pago;
import co.edu.uniquindio.Model.ResultadoPago;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PagoService {

    private List<Pago> pagos;

    public PagoService() {
        this.pagos = new ArrayList<>();
    }


    public Pago registrarPago(MetodoPago metodo, double monto) {
        ResultadoPago resultado = monto > 0 ? ResultadoPago.APROBADO : ResultadoPago.RECHAZADO;

        Pago pago = new Pago(UUID.randomUUID().toString(), monto, metodo, resultado);
        pagos.add(pago);
        return pago;
    }


    public List<Pago> listarPagos() {
        return pagos;
    }
}

