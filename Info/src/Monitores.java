public class Monitores extends Producto{
    private String definicionMax;

    public Monitores(String nombre, String direccion, int empleados, int codigo, String modelo, String definicionMax) {
        super(nombre, direccion, empleados, codigo, modelo);
        this.setDefinicionMax(definicionMax);
    }

    public String getDefinicionMax() {
        return definicionMax;
    }

    public void setDefinicionMax(String definicionMax) {
        this.definicionMax = definicionMax;
    }
}
