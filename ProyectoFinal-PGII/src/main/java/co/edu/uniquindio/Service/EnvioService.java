package co.edu.uniquindio.Service;

import co.edu.uniquindio.Model.Envio;
import co.edu.uniquindio.Model.EstadoEnvio;
import co.edu.uniquindio.Model.Tarifa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.edu.uniquindio.Model.Usuario;


public class EnvioService {

    private TarifaService tarifaService;
    private List<Envio> envios; // lista simulada para pruebas

    public EnvioService() {
        this.tarifaService = new TarifaService();
        this.envios = new ArrayList<>();
    }


    public Envio crearEnvio(Usuario usuario, double peso, double largo, double alto, double ancho,
                            double distancia, boolean prioridad) {

        Envio envio = new Envio();
        envio.setIdEnvio(UUID.randomUUID().toString());
        envio.setUsuario(usuario);
        envio.setPeso(peso);
        envio.setLargo(largo);
        envio.setAlto(alto);
        envio.setAncho(ancho);
        envio.setEstadoEnvio(EstadoEnvio.SOLICITADO);


        Tarifa tarifa = tarifaService.calcularTarifa(envio, distancia, prioridad);
        envio.setCosto(tarifa.getCostoTotal());

        // Guardar en lista simulada
        envios.add(envio);

        return envio;
    }


    public List<Envio> listarEnvios() {
        return envios;
    }


    public Envio buscarPorId(String idEnvio) {
        return envios.stream().filter(e -> e.getIdEnvio().
                equals(idEnvio)).findFirst().orElse(null);
    }
}