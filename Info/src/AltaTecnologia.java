import java.util.Date;

public class AltaTecnologia extends Fabricante {
     protected String origen;
     protected Date fabricacion;

    public AltaTecnologia(String nombre, String direccion, int empleados, String origen, Date fabricacion) {
        super(nombre, direccion, empleados);
        this.setOrigen(origen);
        this.setFabricacion(fabricacion);
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "AltaTecnologia{" +
                "origen='" + origen + '\'' +
                ", fabricacion=" + fabricacion +
                '}';
    }
}
