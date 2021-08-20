import java.util.List;

public class Soporte {
    private double precios;
    private List<Cliente> clientes;

    public Soporte(double precios, List<Cliente> clientes) {
        this.setPrecios(precios);
        this.setClientes(clientes);
    }

    public double getPrecios() {
        return precios;
    }

    public void setPrecios(double precios) {
        this.precios = precios;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
