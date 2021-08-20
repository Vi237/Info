import java.util.List;

public class Producto extends Fabricante{
      private int codigo;
      private String modelo;

    public Producto(String nombre, String direccion, int empleados, int codigo, String modelo) {
        super(nombre, direccion, empleados);
        this.setCodigo(codigo);
        this.setModelo(modelo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

