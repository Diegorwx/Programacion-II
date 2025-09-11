package org.uniquindio.edu.co.poo;

public class NotificacionSMS implements Notificacion{
    @Override
    public void notificar(String mensaje) {
        System.out.println(mensaje);
    }
}
