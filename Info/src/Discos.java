import java.util.Date;

public class Discos extends AltaTecnologia{
    private String capacidad;

    public Discos(String nombre, String direccion, int empleados, String origen, Date fabricacion, String capacidad) {
        super(nombre, direccion, empleados, origen, fabricacion);
        this.setCapacidad(capacidad);
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Discos{}";
    }
}
