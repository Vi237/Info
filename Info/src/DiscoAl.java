public class DiscoAl extends Alquiler{
    private String capacidad;

    public DiscoAl(int codigoAlquiler, double pricioHora, String capacidad) {
        super(codigoAlquiler, pricioHora);
        this.setCapacidad(capacidad);
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
