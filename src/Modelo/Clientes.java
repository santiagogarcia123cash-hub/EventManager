package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class Clientes {
    int id_cliente;
    String nombre;
    String telefono;
    String correo;
    String direccion;
  // Constructor vacío
    public Clientes() {

    }

    // Constructor con todos los datos
    public Clientes(
            int id_cliente,
            String nombre,
            String telefono,
            String correo,
            String direccion) {

        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Devuelve el ID del cliente
    public int getId_cliente() {
        return id_cliente;
    }

    // Cambia el ID del cliente
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    // Devuelve el nombre
    public String getNombre() {
        return nombre;
    }

    // Cambia el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve el teléfono
    public String getTelefono() {
        return telefono;
    }

    // Cambia el teléfono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Devuelve el correo
    public String getCorreo() {
        return correo;
    }

    // Cambia el correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Devuelve la dirección
    public String getDireccion() {
        return direccion;
    }

    // Cambia la dirección
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}