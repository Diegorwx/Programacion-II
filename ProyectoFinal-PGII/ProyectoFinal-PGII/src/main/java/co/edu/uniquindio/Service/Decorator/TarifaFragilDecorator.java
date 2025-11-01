package co.edu.uniquindio.Service.Decorator;


import co.edu.uniquindio.Model.Tarifa;

public class TarifaFragilDecorator extends TarifaDecorator {
    public TarifaFragilDecorator(Tarifa tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto() {
        return tarifaBase.getCostoTotal() + 5000; // recargo por manejo frágil
    }
}

