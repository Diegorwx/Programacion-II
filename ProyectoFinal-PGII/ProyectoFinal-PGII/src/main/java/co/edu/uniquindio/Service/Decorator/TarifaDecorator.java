package co.edu.uniquindio.Service.Decorator;

import co.edu.uniquindio.Model.Tarifa;

public abstract class TarifaDecorator extends Tarifa {
    protected Tarifa tarifaBase;

    public TarifaDecorator(Tarifa tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCosto();
}

