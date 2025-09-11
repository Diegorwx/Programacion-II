package org.uniquindio.edu.co.poo;

public class EnvioFactory {
    public static TipoEnvio crearEnvio(String tipo) {
        switch (tipo.toUpperCase()) {
            case "ESTANDAR": return new EnvioEstandar();
            case "EXPRESS": return new EnvioExpress();
            default: throw new IllegalArgumentException("Tipo de envío no soportado");
        }
    }
}
