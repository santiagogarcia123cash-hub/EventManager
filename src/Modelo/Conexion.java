//clase de Conexion, establece la conexion con la base de datos.
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  public Connection conectar() {

    String url = "jdbc:postgresql://localhost:5432/eventmanager";
    String usuario = "postgres";
    String password = "0000";

    Connection objConnection = null;

    try {
        objConnection = DriverManager.getConnection(url, usuario, password);

        if (objConnection != null) {
            System.out.println("Si se pudo conectar");
        }

    } catch (SQLException e) {
        System.err.println("No se pudo conectar");
        System.err.println(e.toString());
    }

    return objConnection;
  }}
