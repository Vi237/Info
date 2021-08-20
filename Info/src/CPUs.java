import java.util.Date;

public class CPUs extends AltaTecnologia{
    private String memoriaPrincipal;

    public CPUs(String nombre, String direccion, int empleados, String origen, Date fabricacion, String memoriaPrincipal) {
        super(nombre, direccion, empleados, origen, fabricacion);
        this.setMemoriaPrincipal(memoriaPrincipal);
    }

    public String getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(String memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
