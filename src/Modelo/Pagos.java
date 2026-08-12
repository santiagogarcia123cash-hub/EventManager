package Modelo;

public class Pagos {

    // Atributos del pago
    int idPago;
    int idReserva;
    String fechaPago;
    double abono;
    String metodoPago;
    String observacion;

    // Constructor vacío
    public Pagos() {

    }

    // Constructor completo
    public Pagos(
            int idPago,
            int idReserva,
            String fechaPago,
            double abono,
            String metodoPago,
            String observacion) {

        this.idPago = idPago;
        this.idReserva = idReserva;
        this.fechaPago = fechaPago;
        this.abono = abono;
        this.metodoPago = metodoPago;
        this.observacion = observacion;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}