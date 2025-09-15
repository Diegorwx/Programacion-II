package org.uniquindio.edu.co.poo.model.factory.notificaciones;

public class NotificacionSMSFactory implements NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
