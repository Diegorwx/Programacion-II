package org.uniquindio.edu.co.poo;

public class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo) {
        switch (tipo.toUpperCase()) {
            case "SMS": return new NotificacionSMS();
            case "EMAIL": return new NotificacionEmail();
            default: throw new IllegalArgumentException("Canal de notificación no soportado");
        }
    }
}
