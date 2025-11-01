package co.edu.uniquindio.Model.DTO;

public class TarifaDTO {
    private double costoBase;
    private double costoPeso;
    private double costoVolumen;
    private double recargoPrioridad;
    private double costoTotal;

    public TarifaDTO() {}

    public TarifaDTO(double costoBase, double costoPeso, double costoVolumen, double recargoPrioridad, double costoTotal) {
        this.costoBase = costoBase;
        this.costoPeso = costoPeso;
        this.costoVolumen = costoVolumen;
        this.recargoPrioridad = recargoPrioridad;
        this.costoTotal = costoTotal;
    }

    // Getters y Setters
    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }

    public double getCostoPeso() { return costoPeso; }
    public void setCostoPeso(double costoPeso) { this.costoPeso = costoPeso; }

    public double getCostoVolumen() { return costoVolumen; }
    public void setCostoVolumen(double costoVolumen) { this.costoVolumen = costoVolumen; }

    public double getRecargoPrioridad() { return recargoPrioridad; }
    public void setRecargoPrioridad(double recargoPrioridad) { this.recargoPrioridad = recargoPrioridad; }

    public double getCostoTotal() { return costoTotal; }
    public void setCostoTotal(double costoTotal) { this.costoTotal = costoTotal; }

    @Override
    public String toString() {
        return "TarifaDTO{" +
                "costoBase=" + costoBase +
                ", costoPeso=" + costoPeso +
                ", costoVolumen=" + costoVolumen +
                ", recargoPrioridad=" + recargoPrioridad +
                ", costoTotal=" + costoTotal +
                '}';
    }
}

