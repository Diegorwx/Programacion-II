package co.edu.uniquindio.Service.Builder;


import co.edu.uniquindio.Model.Envio;
import co.edu.uniquindio.Model.Usuario;
import co.edu.uniquindio.Model.Repartidor;

public class EnvioBuilder {
    private Envio envio;

    public EnvioBuilder() {
        envio = new Envio();
    }

    public EnvioBuilder setUsuario(Usuario usuario) {
        envio.setUsuario(usuario);
        return this;
    }

    public EnvioBuilder setRepartidor(Repartidor repartidor) {
        envio.setRepartidor(repartidor);
        return this;
    }

    public EnvioBuilder setPeso(double peso) {
        envio.setPeso(peso);
        return this;
    }

    public Envio build() {
        return envio;
    }
}

