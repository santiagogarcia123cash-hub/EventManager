/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import Modelo.Pagos;
import org.junit.Test;
import static org.junit.Assert.*;

public class PagosTest {

    @Test
    public void probarDatosPago() {

        // Creamos un objeto de la clase Pagos
        Pagos objpago = new Pagos();

        // Asignamos datos de prueba
        objpago.setIdPago(1);
        objpago.setIdReserva(5);
        objpago.setFechaPago("12/08/2026");
        objpago.setAbono(2500.00);
        objpago.setMetodoPago("Transferencia");
        objpago.setObservacion("Primer abono");

        // Verificamos que los datos guardados sean correctos
        assertEquals(1, objpago.getIdPago());
        assertEquals(5, objpago.getIdReserva());
        assertEquals("12/08/2026", objpago.getFechaPago());
        assertEquals(2500.00, objpago.getAbono(), 0.01);
        assertEquals("Transferencia", objpago.getMetodoPago());
        assertEquals("Primer abono", objpago.getObservacion());
    }
}
