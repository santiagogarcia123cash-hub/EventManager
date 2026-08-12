package DAO;
// Importamos la conexión y la clase Pagos
import Modelo.Conexion;
import Modelo.Pagos;

// Importaciones para PostgreSQL
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Importaciones para fechas
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Componentes de Swing
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PagosDAO {

    // Carga las reservas en el ComboBox
    public void cargarReservas(JComboBox<String> cboxReserva) {

        // Limpiamos las opciones anteriores
        cboxReserva.removeAllItems();

        // Primera opción
        cboxReserva.addItem("Seleccione...");

        // Consulta para mostrar ID, cliente, terraza y fecha
        String sql = "SELECT "
                + "r.id_reserva, "
                + "c.nombre AS cliente, "
                + "t.nombre AS terraza, "
                + "TO_CHAR(r.fecha, 'DD/MM/YYYY') AS fecha "
                + "FROM reservas r "
                + "INNER JOIN clientes c "
                + "ON r.id_cliente = c.id_cliente "
                + "INNER JOIN terrazas t "
                + "ON r.id_terraza = t.id_terraza "
                + "WHERE r.estado IN ('Pendiente', 'Confirmada') "
                + "ORDER BY r.id_reserva";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                int idReserva = RS.getInt("id_reserva");
                String cliente = RS.getString("cliente");
                String terraza = RS.getString("terraza");
                String fecha = RS.getString("fecha");

                // Ejemplo:
                // 3 - Carlos Hernández - Terraza Aurora - 20/08/2026
                String textoReserva = idReserva
                        + " - " + cliente + " - " + terraza+ " - " + fecha;

                cboxReserva.addItem(textoReserva);
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al cargar las reservas: " + e.getMessage());
        }
    }

    // Obtiene el ID desde el texto del ComboBox
    public int obtenerIdReserva(String textoReserva) {

        try {

            // Divide el texto usando el guion
            String[] partes = textoReserva.split(" - ");

            // La primera parte contiene el ID
            return Integer.parseInt(partes[0].trim());

        } catch (Exception e) {

            System.out.println("Error al obtener ID de reserva: " + e.getMessage() );

            return 0;
        }
    }

    // Muestra el monto total, total pagado y saldo pendiente
    public void mostrarResumenPago(
            int idReserva,
            JTextField txtMontoTotal,
            JTextField txtTotalPagado,
            JTextField txtSaldo) {

        String sql = "SELECT "
                + "t.precio AS monto_total, "
                + "COALESCE(SUM(p.abono), 0) AS total_pagado, "
                + "t.precio - COALESCE(SUM(p.abono), 0) AS saldo "
                + "FROM reservas r "
                + "INNER JOIN terrazas t "
                + "ON r.id_terraza = t.id_terraza "
                + "LEFT JOIN pagos p "
                + "ON r.id_reserva = p.id_reserva "
                + "WHERE r.id_reserva = ? "
                + "GROUP BY t.precio";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idReserva);

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {

                double montoTotal = RS.getDouble("monto_total");
                double totalPagado = RS.getDouble("total_pagado");
                double saldo = RS.getDouble("saldo");

                txtMontoTotal.setText(String.format("%.2f", montoTotal));

                txtTotalPagado.setText(String.format("%.2f", totalPagado));

                txtSaldo.setText( String.format("%.2f", saldo));
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al mostrar resumen del pago: " + e.getMessage() );
        }
    }

    // Obtiene el saldo pendiente de una reserva
    public double obtenerSaldo(int idReserva) {

        double saldo = 0;

        String sql = "SELECT "
                + "t.precio - COALESCE(SUM(p.abono), 0) AS saldo "
                + "FROM reservas r "
                + "INNER JOIN terrazas t "
                + "ON r.id_terraza = t.id_terraza "
                + "LEFT JOIN pagos p "
                + "ON r.id_reserva = p.id_reserva "
                + "WHERE r.id_reserva = ? "
                + "GROUP BY t.precio";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return 0;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idReserva);

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {
                saldo = RS.getDouble("saldo");
            }

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al obtener saldo: " + e.getMessage());
        }

        return saldo;
    }

    // Guarda un nuevo abono
    public boolean guardarPago(Pagos objpago) {

        String sql = "INSERT INTO pagos " 
                + "(id_reserva, fecha_pago, abono, metodo_pago, observacion) "+ "VALUES (?, ?, ?, ?, ?)";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            // Formato que escribe el usuario
            DateTimeFormatter formatoFecha
                    = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate fechaConvertida = LocalDate.parse(objpago.getFechaPago(),formatoFecha);

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, objpago.getIdReserva());

            PS.setDate(2, java.sql.Date.valueOf(fechaConvertida));

            PS.setDouble(3, objpago.getAbono());
            PS.setString(4, objpago.getMetodoPago());
            PS.setString(5, objpago.getObservacion());

            PS.executeUpdate();

            PS.close();
            conexion.close();

            return true;

        } catch (Exception e) {

            System.out.println( "Error al guardar el pago: " + e.getMessage());

            return false;
        }
    }

    // Muestra el historial de pagos
    public void mostrarPagos(JTable tabla) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Reserva");
        modelo.addColumn("Cliente");
        modelo.addColumn("Terraza");
        modelo.addColumn("Fecha de pago");
        modelo.addColumn("Abono");
        modelo.addColumn("Método");
        modelo.addColumn("Observación");

        String sql = "SELECT " + "p.id_pago, "+ "r.id_reserva, " + "c.nombre AS cliente, "+ "t.nombre AS terraza, " + "TO_CHAR(p.fecha_pago, 'DD/MM/YYYY') AS fecha_pago, "+ "p.abono, "+ "p.metodo_pago, " + "p.observacion "+ "FROM pagos p " + "INNER JOIN reservas r " + "ON p.id_reserva = r.id_reserva " + "INNER JOIN clientes c " + "ON r.id_cliente = c.id_cliente "+ "INNER JOIN terrazas t " + "ON r.id_terraza = t.id_terraza "+ "ORDER BY p.id_pago";

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

                fila[0] = RS.getInt("id_pago");
                fila[1] = RS.getInt("id_reserva");
                fila[2] = RS.getString("cliente");
                fila[3] = RS.getString("terraza");
                fila[4] = RS.getString("fecha_pago");
                fila[5] = RS.getDouble("abono");
                fila[6] = RS.getString("metodo_pago");
                fila[7] = RS.getString("observacion");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println( "Error al mostrar pagos: " + e.getMessage());

            tabla.setModel(modelo);
        }
    }

    // Elimina un pago
    public boolean eliminarPago(int idPago) {

        String sql = "DELETE FROM pagos WHERE id_pago = ?";

        Conexion objconexion = new Conexion();
        Connection conexion = objconexion.conectar();

        if (conexion == null) {
            return false;
        }

        try {

            PreparedStatement PS = conexion.prepareStatement(sql);

            PS.setInt(1, idPago);

            int filas = PS.executeUpdate();

            PS.close();
            conexion.close();

            return filas > 0;

        } catch (SQLException e) {

            System.out.println("Error al eliminar pago: " + e.getMessage() );

            return false;
        }
    }

    // Busca pagos por cliente, terraza o método
    public void buscarPagos(JTable tabla, String textoBuscar) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Reserva");
        modelo.addColumn("Cliente");
        modelo.addColumn("Terraza");
        modelo.addColumn("Fecha de pago");
        modelo.addColumn("Abono");
        modelo.addColumn("Método");
        modelo.addColumn("Observación");

        String sql = "SELECT "+ "p.id_pago, " + "r.id_reserva, "+ "c.nombre AS cliente, " + "t.nombre AS terraza, "+ "TO_CHAR(p.fecha_pago, 'DD/MM/YYYY') AS fecha_pago, "  + "p.abono, "+ "p.metodo_pago, " + "p.observacion "+ "FROM pagos p " + "INNER JOIN reservas r " + "ON p.id_reserva = r.id_reserva " + "INNER JOIN clientes c " + "ON r.id_cliente = c.id_cliente " + "INNER JOIN terrazas t "+ "ON r.id_terraza = t.id_terraza "+ "WHERE c.nombre ILIKE ? " + "OR t.nombre ILIKE ? "+ "OR p.metodo_pago ILIKE ? "+ "ORDER BY p.id_pago";

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
            PS.setString(3, "%" + textoBuscar + "%");

            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                Object[] fila = new Object[8];

                fila[0] = RS.getInt("id_pago");
                fila[1] = RS.getInt("id_reserva");
                fila[2] = RS.getString("cliente");
                fila[3] = RS.getString("terraza");
                fila[4] = RS.getString("fecha_pago");
                fila[5] = RS.getDouble("abono");
                fila[6] = RS.getString("metodo_pago");
                fila[7] = RS.getString("observacion");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);

            RS.close();
            PS.close();
            conexion.close();

        } catch (SQLException e) {

            System.out.println("Error al buscar pagos: " + e.getMessage());

            tabla.setModel(modelo);
        }
    }
}