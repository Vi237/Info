public class Impresora extends Producto {
    private String velocidad;

    public Impresora(String nombre, String direccion, int empleados, int codigo, String modelo, String velocidad) {
        super(nombre, direccion, empleados, codigo, modelo);
        this.setVelocidad(velocidad);
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

}
