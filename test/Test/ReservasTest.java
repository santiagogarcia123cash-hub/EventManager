
package Test;

import Modelo.Reservas;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReservasTest {

    @Test
    public void probarDatosReserva() {

        // Creamos un objeto de la clase Reservas
        Reservas objreserva = new Reservas();

        // Asignamos datos de prueba
        objreserva.setIdReserva(10);
        objreserva.setIdCliente(3);
        objreserva.setIdTerraza(2);
        objreserva.setFecha("20/08/2026");
        objreserva.setHoraInicio("14:00");
        objreserva.setHoraFin("18:00");
        objreserva.setInvitados(100);
        objreserva.setEstado("Confirmada");

        // Verificamos que los datos guardados sean correctos
        assertEquals(10, objreserva.getIdReserva());
        assertEquals(3, objreserva.getIdCliente());
        assertEquals(2, objreserva.getIdTerraza());
        assertEquals("20/08/2026", objreserva.getFecha());
        assertEquals("14:00", objreserva.getHoraInicio());
        assertEquals("18:00", objreserva.getHoraFin());
        assertEquals(100, objreserva.getInvitados());
        assertEquals("Confirmada", objreserva.getEstado());
    }
}