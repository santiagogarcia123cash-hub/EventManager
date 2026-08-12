package Test;

import Modelo.Usuarios;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void probarDatosUsuario() {

        // Creamos un objeto de la clase Usuarios
        Usuarios objusuario = new Usuarios();

        // Le asignamos datos de prueba
        objusuario.setIdUsuario(1);
        objusuario.setNombre("Juan Perez");
        objusuario.setUsuario("juan");
        objusuario.setPassword("1234");
        objusuario.setRol("Administrador");
        objusuario.setEstado("Activo");

        // Verificamos que los datos guardados sean correctos
        assertEquals(1, objusuario.getIdUsuario());
        assertEquals("Juan Perez", objusuario.getNombre());
        assertEquals("juan", objusuario.getUsuario());
        assertEquals("1234", objusuario.getPassword());
        assertEquals("Administrador", objusuario.getRol());
        assertEquals("Activo", objusuario.getEstado());
    }
}
