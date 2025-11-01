package co.edu.uniquindio.utils;

import co.edu.uniquindio.Model.*;
import co.edu.uniquindio.Service.*;

public class Main {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        RepartidorService repartidorService = new RepartidorService();
        EnvioService envioService = new EnvioService();
        TarifaService tarifaService = new TarifaService();
        PagoService pagoService = new PagoService();

        // Crear usuario
        Usuario usuario = usuarioService.registrarUsuario("Carlos Pérez", "carlos@mail.com", "3115559999");

        // Crear repartidor
        Repartidor repartidor = repartidorService.registrarRepartidor("Juan Gómez", "1098765432", "3105558888", "Zona Norte");

        // Crear envío de prueba
        Envio envio = envioService.crearEnvio(usuario, 12, 40, 30, 25, 10, true);

        // Calcular tarifa
        Tarifa tarifa = tarifaService.calcularTarifa(envio, 10, true);
        System.out.println("Costo total del envío: $" + tarifa.getCostoTotal());

        // Registrar pago
        Pago pago = pagoService.registrarPago(MetodoPago.TARJETA, tarifa.getCostoTotal());
        System.out.println("Resultado del pago: " + pago.getResultado());

        // Mostrar información general
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Repartidor: " + repartidor.getNombre());
        System.out.println("Envío: " + envio.getIdEnvio());
    }
}
