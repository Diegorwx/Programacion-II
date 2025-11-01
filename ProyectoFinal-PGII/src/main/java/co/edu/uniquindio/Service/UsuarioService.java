package co.edu.uniquindio.Service;

import co.edu.uniquindio.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UsuarioService {

    private List<Usuario> usuarios;

    public UsuarioService() {
        this.usuarios = new ArrayList<>();
    }


    public Usuario registrarUsuario(String nombre, String correo, String telefono) {
        Usuario usuario = new Usuario(UUID.randomUUID().toString(), nombre, correo, telefono);
        usuarios.add(usuario);
        return usuario;
    }


    public Usuario buscarPorId(String idUsuario) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario().equals(idUsuario)) {
                return u;
            }
        }
        return null;
    }


    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
