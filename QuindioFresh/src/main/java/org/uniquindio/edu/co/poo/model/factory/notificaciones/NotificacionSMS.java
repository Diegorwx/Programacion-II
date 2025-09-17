package org.uniquindio.edu.co.poo.model.factory.notificaciones;

public class NotificacionSMS implements Notificacion{
    @Override
    public void notificar(String mensaje) {
        System.out.println("\nMensaje enviado por SMS: " + mensaje);
    }
}
