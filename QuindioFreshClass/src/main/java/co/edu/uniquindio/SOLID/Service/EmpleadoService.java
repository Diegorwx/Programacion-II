package co.edu.uniquindio.SOLID.Service;

import co.edu.uniquindio.SOLID.Model.DTO.EmpleadoDTO;
import co.edu.uniquindio.SOLID.utils.Mappers.EmpleadoMapper;
import co.edu.uniquindio.SOLID.Model.Empleado;
import co.edu.uniquindio.SOLID.Model.Minimercado;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Servicio que gestiona la lógica de negocio de los empleados.
 * Aplica SRP (responsabilidad única): sólo se encarga del dominio Empleado.
 */
public class EmpleadoService {

    private final Minimercado minimercado;

    public EmpleadoService(Minimercado minimercado) {
        this.minimercado = minimercado;
    }

    /**
     * Crea un nuevo empleado en el sistema.
     */
    public boolean crearEmpleado(EmpleadoDTO dto) {
        if (dto == null || dto.getId() == null || dto.getNombre() == null || dto.getRol() == null)
            throw new IllegalArgumentException("Datos del empleado incompletos");

        if (buscarEmpleadoPorId(dto.getId()).isPresent())
            throw new IllegalArgumentException("Ya existe un empleado con ese ID");

        Empleado nuevo = EmpleadoMapper.toEntity(dto);
        minimercado.getListaEmpleados().add(nuevo);
        return true;
    }

    /**
     * Actualiza los datos de un empleado existente.
     */
    public boolean actualizarEmpleado(EmpleadoDTO dto) {
        Empleado empleado = buscarEmpleadoPorId(dto.getId())
                .orElseThrow(() -> new NoSuchElementException("Empleado no encontrado"));

        EmpleadoMapper.updateEntityFromDTO(empleado, dto);
        return true;
    }

    /**
     * Elimina un empleado según su ID.
     */
    public boolean eliminarEmpleado(String id) {
        Empleado empleado = buscarEmpleadoPorId(id)
                .orElseThrow(() -> new NoSuchElementException("Empleado no encontrado"));

        minimercado.getListaEmpleados().remove(empleado);
        return true;
    }

    /**
     * Activa un empleado (cambia su estado a activo).
     */
    public boolean activarEmpleado(String id) {
        Empleado empleado = buscarEmpleadoPorId(id)
                .orElseThrow(() -> new NoSuchElementException("Empleado no encontrado"));

        empleado.activar();
        return true;
    }

    /**
     * Inactiva un empleado (cambia su estado a inactivo).
     */
    public boolean inactivarEmpleado(String id) {
        Empleado empleado = buscarEmpleadoPorId(id)
                .orElseThrow(() -> new NoSuchElementException("Empleado no encontrado"));

        empleado.inactivar();
        return true;
    }

    /**
     * Retorna una lista de empleados en formato DTO.
     */
    public List<EmpleadoDTO> listarEmpleados() {
        List<EmpleadoDTO> lista = new ArrayList<>();
        for (Empleado e : minimercado.getListaEmpleados()) {
            lista.add(EmpleadoMapper.toDTO(e));
        }
        return lista;
    }

    // ----------------------------------------------------------
    // MÉTODOS AUXILIARES
    // ----------------------------------------------------------
    private Optional<Empleado> buscarEmpleadoPorId(String id) {
        return minimercado.getListaEmpleados()
                .stream()
                .filter(e -> e.getId().equalsIgnoreCase(id))
                .findFirst();
    }
}
