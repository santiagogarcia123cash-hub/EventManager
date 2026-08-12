package DAO;

import Modelo.Conexion;
import Modelo.Reservas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReservaDAO {

    // Carga clientes en el JComboBox
    public void cargarClientes(JComboBox<String> cboxCliente) {

        cboxCliente.removeAllItems();
        cboxCliente.addItem("Seleccione...");

        String sql = "SELECT nombre FROM clientes ORDER BY nombre";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {
                cboxCliente.addItem(RS.getString("nombre"));
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println( "Error al cargar clientes: " + e.getMessage());
        }
    }

    // Carga solamente terrazas disponibles
    public void cargarTerrazas(JComboBox<String> cboxTerraza) {

        cboxTerraza.removeAllItems();
        cboxTerraza.addItem("Seleccione...");

        String sql = "SELECT nombre FROM terrazas "+ "WHERE estado = 'Disponible' "+ "ORDER BY nombre";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {
                cboxTerraza.addItem(RS.getString("nombre"));
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println( "Error al cargar terrazas: " + e.getMessage());
        }
    }

    // Obtiene el ID de un cliente usando su nombre
    public int obtenerIdCliente(String nombreCliente) {

        int idCliente = 0;

        String sql = "SELECT id_cliente " + "FROM clientes "+ "WHERE nombre = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return 0;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            PS.setString(1, nombreCliente);

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {
                idCliente = RS.getInt("id_cliente");
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al obtener ID del cliente: " + e.getMessage());
        }

        return idCliente;
    }

    // Obtiene el ID de una terraza usando su nombre
    public int obtenerIdTerraza(String nombreTerraza) {

        int idTerraza = 0;

        String sql = "SELECT id_terraza " + "FROM terrazas "+ "WHERE nombre = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return 0;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            PS.setString(1, nombreTerraza);

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {
                idTerraza = RS.getInt("id_terraza");
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al obtener ID de la terraza: " + e.getMessage());
        }

        return idTerraza;
    }

    // Guarda una reserva
    public boolean guardarReserva(Reservas objreserva) {

        String sql = "INSERT INTO reservas " + "(id_cliente, fecha, hora_inicio, hora_fin, invitados, estado, id_terraza) "+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            DateTimeFormatter formatoFecha =DateTimeFormatter.ofPattern("dd/MM/yyyy");

            DateTimeFormatter formatoHora =DateTimeFormatter.ofPattern("HH:mm");

            LocalDate fechaConvertida =LocalDate.parse(objreserva.getFecha(), formatoFecha);

            LocalTime horaInicioConvertida =LocalTime.parse(objreserva.getHoraInicio(), formatoHora);

            LocalTime horaFinConvertida =LocalTime.parse(objreserva.getHoraFin(), formatoHora);

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, objreserva.getIdCliente());

            PS.setDate( 2,java.sql.Date.valueOf(fechaConvertida) );

            PS.setTime(3, java.sql.Time.valueOf(horaInicioConvertida));

            PS.setTime( 4, java.sql.Time.valueOf(horaFinConvertida) );
            
            PS.setInt(5, objreserva.getInvitados());
            
            PS.setString(6, objreserva.getEstado());
            
            PS.setInt(7, objreserva.getIdTerraza());

            PS.executeUpdate();

            PS.close();
            conexion.close();

            return true;

        } catch (Exception e) {

            System.out.println("Error al guardar la reserva: " + e.getMessage());

            return false;
        }
    }

    // Muestra todas las reservas
    public void mostrarReservas(JTable tabla) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Cliente");
        modelo.addColumn("Terraza");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora inicio");
        modelo.addColumn("Hora fin");
        modelo.addColumn("Invitados");
        modelo.addColumn("Estado");

        String sql = "SELECT " + "r.id_reserva, " + "c.nombre AS cliente, " + "t.nombre AS terraza, "+ "TO_CHAR(r.fecha, 'DD/MM/YYYY') AS fecha, "+ "TO_CHAR(r.hora_inicio, 'HH24:MI') AS hora_inicio, " + "TO_CHAR(r.hora_fin, 'HH24:MI') AS hora_fin, " + "r.invitados, "+ "r.estado "+ "FROM reservas r "+ "INNER JOIN clientes c "+ "ON r.id_cliente = c.id_cliente "+ "INNER JOIN terrazas t " + "ON r.id_terraza = t.id_terraza " + "ORDER BY r.id_reserva";

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

                Object[] fila = new Object[8];

                fila[0] = RS.getInt("id_reserva");
                fila[1] = RS.getString("cliente");
                fila[2] = RS.getString("terraza");
                fila[3] = RS.getString("fecha");
                fila[4] = RS.getString("hora_inicio");
                fila[5] = RS.getString("hora_fin");
                fila[6] = RS.getInt("invitados");
                fila[7] = RS.getString("estado");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al mostrar reservas: " + e.getMessage());

            tabla.setModel(modelo);
        }
    }

    // Modifica una reserva
    public boolean modificarReserva(Reservas objreserva) {

        String sql = "UPDATE reservas SET "+ "id_cliente = ?, "+ "fecha = ?, " + "hora_inicio = ?, "+ "hora_fin = ?, " + "invitados = ?, "+ "estado = ?, "+ "id_terraza = ? "+ "WHERE id_reserva = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            DateTimeFormatter formatoFecha =DateTimeFormatter.ofPattern("dd/MM/yyyy");

            DateTimeFormatter formatoHora =DateTimeFormatter.ofPattern("HH:mm");

            LocalDate fechaConvertida = LocalDate.parse(objreserva.getFecha(), formatoFecha);

            LocalTime horaInicioConvertida = LocalTime.parse(objreserva.getHoraInicio(), formatoHora);

            LocalTime horaFinConvertida =LocalTime.parse(objreserva.getHoraFin(), formatoHora);

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, objreserva.getIdCliente());

            PS.setDate(2, java.sql.Date.valueOf(fechaConvertida));
            PS.setTime( 3,java.sql.Time.valueOf(horaInicioConvertida));
            PS.setTime( 4,java.sql.Time.valueOf(horaFinConvertida));
            PS.setInt(5, objreserva.getInvitados());
            PS.setString(6, objreserva.getEstado());
            PS.setInt(7, objreserva.getIdTerraza());
            PS.setInt(8, objreserva.getIdReserva());

            int filas = PS.executeUpdate();

            PS.close();
            conexion.close();

            return filas > 0;

        } catch (Exception e) {

            System.out.println("Error al modificar la reserva: " + e.getMessage());

            return false;
        }
    }

    // Elimina una reserva
    public boolean eliminarReserva(int idReserva) {

        String sql = "DELETE FROM reservas WHERE id_reserva = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idReserva);

            int filas = PS.executeUpdate();

            PS.close();
            conexion.close();

            return filas > 0;

        } catch (SQLException e) {

            System.out.println("Error al eliminar la reserva: " + e.getMessage());

            return false;
        }
    }

    // Busca reservas por cliente o terraza
    public void buscarReservas(JTable tabla, String textoBuscar) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Cliente");
        modelo.addColumn("Terraza");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora inicio");
        modelo.addColumn("Hora fin");
        modelo.addColumn("Invitados");
        modelo.addColumn("Estado");

        String sql = "SELECT "+ "r.id_reserva, "+ "c.nombre AS cliente, " + "t.nombre AS terraza, "+ "TO_CHAR(r.fecha, 'DD/MM/YYYY') AS fecha, "+ "TO_CHAR(r.hora_inicio, 'HH24:MI') AS hora_inicio, "+ "TO_CHAR(r.hora_fin, 'HH24:MI') AS hora_fin, "+ "r.invitados, "+ "r.estado " + "FROM reservas r "+ "INNER JOIN clientes c "+ "ON r.id_cliente = c.id_cliente " + "INNER JOIN terrazas t "+ "ON r.id_terraza = t.id_terraza "+ "WHERE c.nombre ILIKE ? "+ "OR t.nombre ILIKE ? "+ "ORDER BY r.id_reserva";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            tabla.setModel(modelo);
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setString(1, "%" + textoBuscar + "%");
            PS.setString(2, "%" + textoBuscar + "%");

            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                Object[] fila = new Object[8];

                fila[0] = RS.getInt("id_reserva");
                fila[1] = RS.getString("cliente");
                fila[2] = RS.getString("terraza");
                fila[3] = RS.getString("fecha");
                fila[4] = RS.getString("hora_inicio");
                fila[5] = RS.getString("hora_fin");
                fila[6] = RS.getInt("invitados");
                fila[7] = RS.getString("estado");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al buscar reservas: " + e.getMessage());

            tabla.setModel(modelo);
        }
    }

    // Verifica si existe cruce de horario al guardar
    public boolean existeCruceHorario(
            int idTerraza,
            String fecha,
            String horaInicio,
            String horaFin) {

        String sql = "SELECT COUNT(*) AS cantidad "+ "FROM reservas "+ "WHERE id_terraza = ? "+ "AND fecha = TO_DATE(?, 'DD/MM/YYYY') "+ "AND estado IN ('Pendiente', 'Confirmada') "+ "AND ?::time < hora_fin "+ "AND ?::time > hora_inicio";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idTerraza);
            PS.setString(2, fecha);
            PS.setString(3, horaInicio);
            PS.setString(4, horaFin);

            ResultSet RS = PS.executeQuery();

            boolean existeCruce = false;

            if (RS.next()) {
                existeCruce = RS.getInt("cantidad") > 0;
            }

            RS.close();
            PS.close();
            conexion.close();

            return existeCruce;

        } catch (SQLException e) {

            System.out.println("Error al verificar horario: " + e.getMessage());

            return false;
        }
    }

    // Verifica cruces al modificar ignorando la misma reserva
    public boolean existeCruceHorarioModificar(
            int idTerraza,
            String fecha,
            String horaInicio,
            String horaFin,
            int idReserva) {

        String sql = "SELECT COUNT(*) AS cantidad " + "FROM reservas " + "WHERE id_terraza = ? " + "AND fecha = TO_DATE(?, 'DD/MM/YYYY') "+ "AND estado IN ('Pendiente', 'Confirmada') "+ "AND id_reserva <> ? "+ "AND ?::time < hora_fin "+ "AND ?::time > hora_inicio";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idTerraza);
            PS.setString(2, fecha);
            PS.setInt(3, idReserva);
            PS.setString(4, horaInicio);
            PS.setString(5, horaFin);

            ResultSet RS = PS.executeQuery();

            boolean existeCruce = false;

            if (RS.next()) {
                existeCruce = RS.getInt("cantidad") > 0;
            }

            RS.close();
            PS.close();
            conexion.close();

            return existeCruce;

        } catch (SQLException e) {

            System.out.println( "Error al verificar horario al modificar: "+ e.getMessage());

            return false;
        }
    }
}