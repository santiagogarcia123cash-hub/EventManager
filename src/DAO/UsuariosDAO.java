/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Conexion;
import Modelo.Usuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuariosDAO {

    // Verifica si ya existe un nombre de usuario
    public boolean existeUsuario(String usuario) {

        String sql = "SELECT id_usuario "
                + "FROM usuarios "
                + "WHERE usuario = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            PS.setString(1, usuario);

            ResultSet RS = PS.executeQuery();

            boolean existe = RS.next();

            RS.close();
            PS.close();
            conexion.close();

            return existe;

        } catch (SQLException e) {

            System.out.println(
                    "Error al verificar usuario: " + e.getMessage()
            );

            return false;
        }
    }

    // Crea una nueva cuenta
    public boolean crearUsuario(Usuarios objusuario) {

        String sql = "INSERT INTO usuarios "
                + "(nombre, usuario, password, rol, estado) "
                + "VALUES (?, ?, ?, ?, ?)";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setString(1, objusuario.getNombre());
            PS.setString(2, objusuario.getUsuario());
            PS.setString(3, objusuario.getPassword());
            PS.setString(4, objusuario.getRol());
            PS.setString(5, objusuario.getEstado());

            PS.executeUpdate();

            PS.close();
            conexion.close();

            return true;

        } catch (SQLException e) {

            System.out.println(
                    "Error al crear usuario: " + e.getMessage()
            );

            return false;
        }
    }

    // Muestra las cuentas registradas
    public void mostrarUsuarios(JTable tabla) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Usuario");
        modelo.addColumn("Rol");
        modelo.addColumn("Estado");

        String sql = "SELECT "
                + "id_usuario, "
                + "nombre, "
                + "usuario, "
                + "rol, "
                + "estado "
                + "FROM usuarios "
                + "ORDER BY id_usuario";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            tabla.setModel(modelo);
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                Object[] fila = new Object[5];

                fila[0] = RS.getInt("id_usuario");
                fila[1] = RS.getString("nombre");
                fila[2] = RS.getString("usuario");
                fila[3] = RS.getString("rol");
                fila[4] = RS.getString("estado");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println(
                    "Error al mostrar usuarios: " + e.getMessage()
            );

            tabla.setModel(modelo);
        }
    }

    // Cuenta cuántos administradores existen
    public int contarAdministradores() {

        int cantidad = 0;

        String sql = "SELECT COUNT(*) AS cantidad "
                + "FROM usuarios "
                + "WHERE rol = 'Administrador'";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return 0;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();

            if (RS.next()) {
                cantidad = RS.getInt("cantidad");
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println(
                    "Error al contar administradores: " + e.getMessage()
            );
        }

        return cantidad;
    }

    // Obtiene el rol de una cuenta por su ID
    public String obtenerRolUsuario(int idUsuario) {

        String rol = "";

        String sql = "SELECT rol "
                + "FROM usuarios "
                + "WHERE id_usuario = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return "";
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            PS.setInt(1, idUsuario);

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {
                rol = RS.getString("rol");
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println(
                    "Error al obtener rol: " + e.getMessage()
            );
        }

        return rol;
    }

    // Elimina una cuenta
    public boolean eliminarUsuario(int idUsuario) {

        String sql = "DELETE FROM usuarios "
                + "WHERE id_usuario = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            PS.setInt(1, idUsuario);

            int filas = PS.executeUpdate();

            PS.close();
            conexion.close();

            return filas > 0;

        } catch (SQLException e) {

            System.out.println(
                    "Error al eliminar usuario: " + e.getMessage()
            );

            return false;
        }
    }
}