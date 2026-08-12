package DAO;
// Importamos la conexión creada en el proyecto
import Modelo.Conexion;
// Importamos el modelo de terrazas
import Modelo.Terrazas;
// Importaciones necesarias para PostgreSQL
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// Importaciones para mostrar la información en la JTable
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TerrazasDAO {

    // Guarda una terraza en PostgreSQL
    public boolean guardarTerraza(Terrazas objterraza) {

        // Consulta para insertar los datos
        String sql = "INSERT INTO terrazas " + "(nombre, ubicacion, capacidad, precio, estado, descripcion) "+ "VALUES (?, ?, ?, ?, ?, ?)";

        // Creamos el objeto de conexión
        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        // Verificamos que sí exista conexión
        if (conexion == null) {
            return false;
        }

        try {

            // Preparamos la consulta
            PreparedStatement PS = conexion.prepareStatement(sql);

            // Enviamos los valores del objeto
            PS.setString(1, objterraza.getNombre());
            PS.setString(2, objterraza.getUbicacion());
            PS.setInt(3, objterraza.getCapacidad());
            PS.setDouble(4, objterraza.getPrecio());
            PS.setString(5, objterraza.getEstado());
            PS.setString(6, objterraza.getDescripcion());

            // Ejecutamos el INSERT
            PS.executeUpdate();

            // Cerramos los objetos
            PS.close();
            conexion.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al guardar la terraza: " + e.getMessage());

            return false;
        }
    }

    // Muestra todas las terrazas en la tabla
    public void mostrarTerrazas(JTable tabla) {

        // Creamos el modelo de la tabla
        DefaultTableModel objmodelo = new DefaultTableModel();

        // Agregamos las columnas
        objmodelo.addColumn("ID");
        objmodelo.addColumn("Nombre");
        objmodelo.addColumn("Ubicación");
        objmodelo.addColumn("Capacidad");
        objmodelo.addColumn("Precio");
        objmodelo.addColumn("Estado");
        objmodelo.addColumn("Descripción");

        // Consulta para obtener las terrazas
        String sql = "SELECT * FROM terrazas ORDER BY id_terraza";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            tabla.setModel(objmodelo);
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();

            // Recorremos cada registro encontrado
            while (RS.next()) {

                Object[] fila = new Object[7];

                fila[0] = RS.getInt("id_terraza");
                fila[1] = RS.getString("nombre");
                fila[2] = RS.getString("ubicacion");
                fila[3] = RS.getInt("capacidad");
                fila[4] = RS.getDouble("precio");
                fila[5] = RS.getString("estado");
                fila[6] = RS.getString("descripcion");

                objmodelo.addRow(fila);
            }

            // Colocamos el modelo en la JTable
            tabla.setModel(objmodelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al mostrar las terrazas: " + e.getMessage());

            tabla.setModel(objmodelo);
        }
   }
// Modifica una terraza existente
public boolean modificarTerraza(Terrazas objterraza) {

    String sql = "UPDATE terrazas SET "
            + "nombre = ?, "
            + "ubicacion = ?, "
            + "capacidad = ?, "
            + "precio = ?, "
            + "estado = ?, "
            + "descripcion = ? "
            + "WHERE id_terraza = ?";

    Conexion objconexion = new Conexion();
    Connection conexion = objconexion.conectar();

    if (conexion == null) {
        return false;
    }

    try {

        PreparedStatement PS = conexion.prepareStatement(sql);

        PS.setString(1, objterraza.getNombre());
        PS.setString(2, objterraza.getUbicacion());
        PS.setInt(3, objterraza.getCapacidad());
        PS.setDouble(4, objterraza.getPrecio());
        PS.setString(5, objterraza.getEstado());
        PS.setString(6, objterraza.getDescripcion());
        PS.setInt(7, objterraza.getId_terraza());

        int filas = PS.executeUpdate();

        PS.close();
        conexion.close();

        return filas > 0;

    } catch (SQLException e) {

        System.out.println("Error al modificar la terraza: " + e.getMessage());

        return false;
    }
}
// Elimina una terraza por su ID
public boolean eliminarTerraza(int idTerraza) {

    String sql = "DELETE FROM terrazas WHERE id_terraza = ?";

    Conexion objconexion = new Conexion();
    Connection conexion = objconexion.conectar();

    if (conexion == null) {
        return false;
    }

    try {

        PreparedStatement PS = conexion.prepareStatement(sql);

        PS.setInt(1, idTerraza);

        int filas = PS.executeUpdate();

        PS.close();
        conexion.close();

        return filas > 0;

    } catch (SQLException e) {

        System.out.println("Error al eliminar la terraza: " + e.getMessage());

        return false;
    }
}
// Busca terrazas por nombre
public void buscarTerrazas(JTable tabla, String textoBuscar) {

    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Ubicación");
    modelo.addColumn("Capacidad");
    modelo.addColumn("Precio");
    modelo.addColumn("Estado");
    modelo.addColumn("Descripción");

    String sql = "SELECT * FROM terrazas "+ "WHERE nombre ILIKE ? "+ "ORDER BY id_terraza";

    Conexion objconexion = new Conexion();
    Connection conexion = objconexion.conectar();

    if (conexion == null) {
        tabla.setModel(modelo);
        return;
    }

    try {

        PreparedStatement PS = conexion.prepareStatement(sql);

        PS.setString(1, "%" + textoBuscar + "%");

        ResultSet RS = PS.executeQuery();

        while (RS.next()) {

            Object[] fila = new Object[7];

            fila[0] = RS.getInt("id_terraza");
            fila[1] = RS.getString("nombre");
            fila[2] = RS.getString("ubicacion");
            fila[3] = RS.getInt("capacidad");
            fila[4] = RS.getDouble("precio");
            fila[5] = RS.getString("estado");
            fila[6] = RS.getString("descripcion");

            modelo.addRow(fila);
        }

        tabla.setModel(modelo);

        RS.close();
        PS.close();
        conexion.close();

    } catch (SQLException e) {

        System.out.println( "Error al buscar terrazas: " + e.getMessage());
tabla.setModel(modelo);
    }
}
    }
