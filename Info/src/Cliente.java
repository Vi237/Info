import java.util.Date;

public class Cliente {
    private String DNI;
    private int telefono;
    private String domicilio;
    private Date fechaDeCompra;

    public Cliente(String DNI, int telefono, String domicilio, Date fechaDeCompra) {
        this.setDNI(DNI);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
        this.setFechaDeCompra(fechaDeCompra);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
}
