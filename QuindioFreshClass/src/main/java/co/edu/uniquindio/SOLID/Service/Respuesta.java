package co.edu.uniquindio.SOLID.Service;

public class Respuesta {
    private boolean exito;
    private String mensaje;

    public Respuesta(boolean exito, String mensaje) {
        this.exito = exito;
        this.mensaje = mensaje;
    }

    public boolean isExito() { return exito; }
    public void setExito(boolean exito) { this.exito = exito; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    @Override
    public String toString() {
        return (exito ? "✅ " : "❌ ") + mensaje;
    }
}

