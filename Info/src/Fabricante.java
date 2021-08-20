public class Fabricante {
    protected String nombre;
    protected String direccion;
    protected int empleados;

    public Fabricante(String nombre, String direccion, int empleados) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setEmpleados(empleados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
