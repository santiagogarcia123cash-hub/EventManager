package Modelo;

public class Terrazas {
    int id_terraza;
    String nombre;
    String ubicacion;
    int capacidad;
    double precio;
    String estado;
    String descripcion;

 // Constructor vacío
    public Terrazas() {

    }

    // Constructor con todos los datos
    public Terrazas(
            int id_terraza,
            String nombre,
            String ubicacion,
            int capacidad,
            double precio,
            String estado,
            String descripcion) {

        this.id_terraza = id_terraza;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    // Devuelve el ID de la terraza
    public int getId_terraza() {
        return id_terraza;
    }

    // Cambia el ID de la terraza
    public void setId_terraza(int id_terraza) {
        this.id_terraza = id_terraza;
    }

    // Devuelve el nombre
    public String getNombre() {
        return nombre;
    }

    // Cambia el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la ubicación
    public String getUbicacion() {
        return ubicacion;
    }

    // Cambia la ubicación
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Devuelve la capacidad
    public int getCapacidad() {
        return capacidad;
    }

    // Cambia la capacidad
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Devuelve el precio
    public double getPrecio() {
        return precio;
    }

    // Cambia el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Devuelve el estado
    public String getEstado() {
        return estado;
    }

    // Cambia el estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Devuelve la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Cambia la descripción
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
