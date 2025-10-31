package co.edu.uniquindio.SOLID.Model.DTO;

import java.time.LocalDate;
import java.util.List;

public class EntradaInventarioDTO {

    private String id;
    private LocalDate fecha;
    private String nitProveedor;
    private List<ItemEntradaDTO> items;

    public EntradaInventarioDTO() {}

    public EntradaInventarioDTO(String id, LocalDate fecha, String nitProveedor,
                                List<ItemEntradaDTO> items) {
        this.id = id;
        this.fecha = fecha;
        this.nitProveedor = nitProveedor;
        this.items = items;
    }


    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getNitProveedor() { return nitProveedor; }
    public void setNitProveedor(String nitProveedor) { this.nitProveedor = nitProveedor; }

    public List<ItemEntradaDTO> getItems() { return items; }
    public void setItems(List<ItemEntradaDTO> items) { this.items = items; }
}
