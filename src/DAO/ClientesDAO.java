package DAO;
// Importamos la conexión
import Modelo.Conexion;
// Importamos el modelo Clientes
import Modelo.Clientes;
// Importaciones para PostgreSQL
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// Importaciones para la JTable
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ClientesDAO {
      // Guarda un cliente
    public boolean guardarCliente(Clientes objcliente) {

        String sql = "INSERT INTO clientes " + "(nombre, telefono, correo, direccion) "+ "VALUES (?, ?, ?, ?)";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setString(1, objcliente.getNombre());
            PS.setString(2, objcliente.getTelefono());
            PS.setString(3, objcliente.getCorreo());
            PS.setString(4, objcliente.getDireccion());

            PS.executeUpdate();

            PS.close();
            conexion.close();

            return true;

        } catch (SQLException e) {

 System.out.println( "Error al guardar el cliente: " + e.getMessage() );

            return false;
        }
    }

    // Muestra todos los clientes
    public void mostrarClientes(JTable tabla) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");
        modelo.addColumn("Dirección");

        String sql = "SELECT * FROM clientes ORDER BY id_cliente";

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

                fila[0] = RS.getInt("id_cliente");
                fila[1] = RS.getString("nombre");
                fila[2] = RS.getString("telefono");
                fila[3] = RS.getString("correo");
                fila[4] = RS.getString("direccion");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al mostrar los clientes: " + e.getMessage() );

            tabla.setModel(modelo);
        }
    }

    // Modifica un cliente
    public boolean modificarCliente(Clientes objcliente) {

        String sql = "UPDATE clientes SET " + "nombre = ?, "+ "telefono = ?, " + "correo = ?, "+ "direccion = ? "+ "WHERE id_cliente = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setString(1, objcliente.getNombre());
            PS.setString(2, objcliente.getTelefono());
            PS.setString(3, objcliente.getCorreo());
            PS.setString(4, objcliente.getDireccion());
            PS.setInt(5, objcliente.getId_cliente());

            int filas = PS.executeUpdate();

            PS.close();
            conexion.close();

            return filas > 0;

        } catch (SQLException e) {

            System.out.println("Error al modificar el cliente: " + e.getMessage());

            return false;
        }
    }

    // Elimina un cliente
    public boolean eliminarCliente(int idCliente) {

        String sql = "DELETE FROM clientes WHERE id_cliente = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idCliente);

            int filas = PS.executeUpdate();

            PS.close();
            conexion.close();

            return filas > 0;

        } catch (SQLException e) {

            System.out.println( "Error al eliminar el cliente: " + e.getMessage() );

            return false;
        }
    }

    // Busca clientes por nombre
    public void buscarClientes(JTable tabla, String textoBuscar) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");
        modelo.addColumn("Dirección");

        String sql = "SELECT * FROM clientes " + "WHERE nombre ILIKE ? "+ "ORDER BY id_cliente";

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

                Object[] fila = new Object[5];

                fila[0] = RS.getInt("id_cliente");
                fila[1] = RS.getString("nombre");
                fila[2] = RS.getString("telefono");
                fila[3] = RS.getString("correo");
                fila[4] = RS.getString("direccion");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al buscar clientes: " + e.getMessage());

            tabla.setModel(modelo);
        }
    }
}
