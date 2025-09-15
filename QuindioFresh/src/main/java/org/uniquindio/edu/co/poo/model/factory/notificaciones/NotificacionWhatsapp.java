package org.uniquindio.edu.co.poo.model.factory.notificaciones;

public class NotificacionWhatsapp implements Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviado mensaje por Whatsapp: " + mensaje);
    }
}
