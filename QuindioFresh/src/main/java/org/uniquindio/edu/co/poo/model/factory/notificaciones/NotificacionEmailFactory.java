package org.uniquindio.edu.co.poo.model.factory.notificaciones;

public class NotificacionEmailFactory implements NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}