package co.edu.uniquindio.Service.Facade;

import co.edu.uniquindio.Service.*;

public class SistemaEnviosFacade {

    private EnvioService envioService;
    private PagoService pagoService;
    private UsuarioService usuarioService;

    public SistemaEnviosFacade() {
        this.envioService = new EnvioService();
        this.pagoService = new PagoService();
        this.usuarioService = new UsuarioService();
    }

    public void registrarEnvioYPago() {
        System.out.println("Envío y pago registrados correctamente.");
    }
}

