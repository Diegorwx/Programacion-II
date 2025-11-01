package co.edu.uniquindio.Service;


import co.edu.uniquindio.Model.Envio;
import co.edu.uniquindio.Model.Tarifa;


public class TarifaService {

    private static final double COSTO_BASE = 3000.0;       // costo fijo mínimo
    private static final double COSTO_POR_KG = 1000.0;     // costo por kilogramo
    private static final double COSTO_POR_M3 = 8000.0;     // costo por metro cúbico
    private static final double RECARGO_PRIORIDAD = 0.25;  // 25% adicional si es envío prioritario


    public Tarifa calcularTarifa(Envio envio, double distancia, boolean esPrioritario) {
        double peso = envio.getPeso();
        double volumen = (envio.getLargo() * envio.getAlto() * envio.getAncho()) / 1_000_000.0; // cm³ → m³


        double costoBase = COSTO_BASE + (distancia * 50);  // 50 por km
        double costoPeso = peso * COSTO_POR_KG;
        double costoVolumen = volumen * COSTO_POR_M3;
        double recargoPrioridad = esPrioritario ? (costoBase + costoPeso + costoVolumen) * RECARGO_PRIORIDAD : 0;
        double recargosAdicionales = 0; // por ahora ninguno

        return new Tarifa(costoBase, costoPeso, costoVolumen, recargoPrioridad, recargosAdicionales);
    }
}
