package mvc;

import Modelo.Conexion;
import Vistas.Login;

public class MVC {

    public static void main(String[] args) {

        Conexion objconexion = new Conexion();
        objconexion.conectar();

        Login login = new Login();
        login.setVisible(true);
  }
}