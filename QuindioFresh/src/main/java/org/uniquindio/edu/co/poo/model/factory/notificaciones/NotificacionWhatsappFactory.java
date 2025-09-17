package org.uniquindio.edu.co.poo.model.factory.notificaciones;

public class NotificacionWhatsappFactory implements NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionWhatsapp();
    }
}
