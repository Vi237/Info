import java.util.Date;
import java.util.List;

public class Proveedores {
    private String NIF;
    private String direccion;
    private List<Producto> productos;
    private Date fechaDeAdquisicion;

    public Proveedores(String NIF, String direccion, List<Producto> productos, Date fechaDeAdquisicion) {
        this.setNIF(NIF);
        this.setDireccion(direccion);
        this.setProductos(productos);
        this.setFechaDeAdquisicion(fechaDeAdquisicion);
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFechaDeAdquisicion() {
        return fechaDeAdquisicion;
    }

    public void setFechaDeAdquisicion(Date fechaDeAdquisicion) {
        this.fechaDeAdquisicion = fechaDeAdquisicion;
    }
}
