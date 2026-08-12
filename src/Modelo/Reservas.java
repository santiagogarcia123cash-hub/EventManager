package Modelo;

public class Reservas {

    // Atributos de la reserva
       int idReserva;
    int idCliente;
    int idTerraza;
    String fecha;
    String horaInicio;
    String horaFin;
    int invitados;
    String estado;

  // Constructor vacío
    public Reservas() {

    }

    // Constructor con todos los datos
    public Reservas(
            int idReserva,
            int idCliente,
            int idTerraza,
            String fecha,
            String horaInicio,
            String horaFin,
            int invitados,
            String estado) {

        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idTerraza = idTerraza;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.invitados = invitados;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTerraza() {
        return idTerraza;
    }

    public void setIdTerraza(int idTerraza) {
        this.idTerraza = idTerraza;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}