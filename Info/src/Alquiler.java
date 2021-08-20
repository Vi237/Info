public class Alquiler{
    protected int codigoAlquiler;
    protected double pricioHora;

    public Alquiler(int codigoAlquiler, double pricioHora) {
        this.setCodigoAlquiler(codigoAlquiler);
        this.setPricioHora(pricioHora);
    }

    public int getCodigoAlquiler() {
        return codigoAlquiler;
    }

    public void setCodigoAlquiler(int codigoAlquiler) {
        this.codigoAlquiler = codigoAlquiler;
    }

    public double getPricioHora() {
        return pricioHora;
    }

    public void setPricioHora(double pricioHora) {
        this.pricioHora = pricioHora;
    }
}
