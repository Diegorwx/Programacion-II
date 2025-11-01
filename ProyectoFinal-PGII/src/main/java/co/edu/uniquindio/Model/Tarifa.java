package co.edu.uniquindio.Model;

public class Tarifa {
    private double costoBase;
    private double costoPeso;
    private double costoVolumen;
    private double recargoPrioridad;
    private double recargosAdicionales;
    private double costoTotal;


    public Tarifa(double costoBase, double costoPeso, double costoVolumen,
                  double recargoPrioridad, double recargosAdicionales) {
        this.costoBase = costoBase;
        this.costoPeso = costoPeso;
        this.costoVolumen = costoVolumen;
        this.recargoPrioridad = recargoPrioridad;
        this.recargosAdicionales = recargosAdicionales;
        this.costoTotal = costoBase + costoPeso + costoVolumen + recargoPrioridad + recargosAdicionales;
    }


    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }

    public double getCostoPeso() { return costoPeso; }
    public void setCostoPeso(double costoPeso) { this.costoPeso = costoPeso; }

    public double getCostoVolumen() { return costoVolumen; }
    public void setCostoVolumen(double costoVolumen) { this.costoVolumen = costoVolumen; }

    public double getRecargoPrioridad() { return recargoPrioridad; }
    public void setRecargoPrioridad(double recargoPrioridad) { this.recargoPrioridad = recargoPrioridad; }

    public double getRecargosAdicionales() { return recargosAdicionales; }
    public void setRecargosAdicionales(double recargosAdicionales) { this.recargosAdicionales = recargosAdicionales; }

    public double getCostoTotal() { return costoTotal; }
    public void setCostoTotal(double costoTotal) { this.costoTotal = costoTotal; }

    @Override
    public String toString() {
        return "Tarifa{" +
                "costoBase=" + costoBase +
                ", costoPeso=" + costoPeso +
                ", costoVolumen=" + costoVolumen +
                ", recargoPrioridad=" + recargoPrioridad +
                ", recargosAdicionales=" + recargosAdicionales +
                ", costoTotal=" + costoTotal +
                '}';
    }
}

