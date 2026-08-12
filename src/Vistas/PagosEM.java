package Vistas;
import DAO.PagosDAO;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PagosEM extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PagosEM.class.getName());

    /**
     * Creates new form PagosEM
     */
    public PagosEM() {
    // Inicializa los componentes
    initComponents();

    // Centra la ventana
    setLocationRelativeTo(null);

    // Crea el DAO
    PagosDAO objdao = new PagosDAO();

    // Carga las reservas en el combo
    objdao.cargarReservas(cboxReserva);

    // Muestra los pagos registrados
    objdao.mostrarPagos(jTable1);
}
    public void limpiarCampos() {

    // Regresa los combos a la primera opción
    cboxReserva.setSelectedIndex(0);
    cboxMetodoPago.setSelectedIndex(0);

    // Limpia los campos
    txtMontoTotal.setText("");
    txtTotalPagado.setText("");
    txtSaldo.setText("");
    txtAbono.setText("");
    txtFechaPago.setText("");
    txtObservacion.setText("");
    txtBuscar.setText("");

    // Quita la selección de la tabla
    jTable1.clearSelection();

    // Coloca el cursor en el combo de reservas
    cboxReserva.requestFocus();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cboxReserva = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        txtTotalPagado = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboxMetodoPago = new javax.swing.JComboBox<>();
        txtAbono = new javax.swing.JTextField();
        txtFechaPago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        btnNuevo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GESTION DE PAGOS");

        jLabel2.setText("Reserva");

        jLabel3.setText("Monto Total");

        jLabel4.setText("Nuevo abono");

        jButton1.setText("Guardar Abono");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnEliminar.setText("Eliminar Pago");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        jButton3.setText("Buscar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Atras");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        cboxReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxReserva.addActionListener(this::cboxReservaActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("Total Pagado");

        jLabel7.setText("Saldo pendiente");

        txtMontoTotal.setEditable(false);

        txtTotalPagado.setEditable(false);

        txtSaldo.setEditable(false);

        jLabel8.setText("Fecha de pago");

        jLabel9.setText("Metodo");

        cboxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Efectivo", "Transferencia", "Tarjeta" }));

        jLabel10.setText("Observacion:");

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        jScrollPane2.setViewportView(txtObservacion);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        jLabel5.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(107, 107, 107))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(102, 102, 102)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtTotalPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6))
                                                .addGap(134, 134, 134))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(92, 92, 92)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(102, 102, 102)
                                                        .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(126, 126, 126))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cboxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(16, 16, 16)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(btnNuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(377, 377, 377))
                                        .addComponent(cboxReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jButton1)
                    .addComponent(btnLimpiar)
                    .addComponent(btnNuevo))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxReservaActionPerformed
 // Evita errores mientras se carga el combo
    if (cboxReserva.getSelectedItem() == null) {
        return;
    }

    String reservaSeleccionada = cboxReserva.getSelectedItem().toString();

    if (reservaSeleccionada.equals("Seleccione...")) {

        txtMontoTotal.setText("");
        txtTotalPagado.setText("");
        txtSaldo.setText("");

        return;
    }

    PagosDAO objdao = new PagosDAO();

    int idReserva = objdao.obtenerIdReserva(reservaSeleccionada);

    if (idReserva > 0) {

        objdao.mostrarResumenPago(idReserva,txtMontoTotal,txtTotalPagado,txtSaldo);
    }
    }//GEN-LAST:event_cboxReservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    // Obtenemos los datos de la ventana
    String reservaSeleccionada =cboxReserva.getSelectedItem().toString();

    String abonoTexto =  txtAbono.getText().trim();

    String fechaPago = txtFechaPago.getText().trim();

    String metodoPago = cboxMetodoPago.getSelectedItem().toString();

    String observacion = txtObservacion.getText().trim();

    // Validamos reserva
    if (reservaSeleccionada.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(this, "Seleccione una reserva.", "Reserva no seleccionada", JOptionPane.WARNING_MESSAGE);

        return;
    }

    // Validamos campos vacíos
    if (abonoTexto.isEmpty() || fechaPago.isEmpty()) {

        JOptionPane.showMessageDialog(this, "Complete el abono y la fecha de pago.","Campos vacíos", JOptionPane.WARNING_MESSAGE );

        return;
    }

    // Validamos método de pago
    if (metodoPago.equals("Seleccione...")) {

        JOptionPane.showMessageDialog( this,"Seleccione un método de pago.", "Método no seleccionado", JOptionPane.WARNING_MESSAGE );

        return;
    }

    try {

        // Validamos la fecha
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaConvertida = LocalDate.parse(fechaPago, formatoFecha);

        // La fecha del pago no puede ser futura
        if (fechaConvertida.isAfter(LocalDate.now())) {

            JOptionPane.showMessageDialog(this, "La fecha del pago no puede ser futura.","Fecha inválida", JOptionPane.WARNING_MESSAGE );

            return;
        }

        // Convertimos el abono
        double abono = Double.parseDouble(abonoTexto);

        if (abono <= 0) {

            JOptionPane.showMessageDialog( this,"El abono debe ser mayor que cero.","Abono inválido",JOptionPane.WARNING_MESSAGE);

            return;
        }

        PagosDAO objdao = new PagosDAO();

        int idReserva =
                objdao.obtenerIdReserva(reservaSeleccionada);

        if (idReserva == 0) {

            JOptionPane.showMessageDialog(this,"No fue posible identificar la reserva.","Error", JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Obtenemos el saldo actual
        double saldo =
                objdao.obtenerSaldo(idReserva);

        if (saldo <= 0) {

            JOptionPane.showMessageDialog(this, "Esta reserva ya está completamente pagada.", "Reserva liquidada", JOptionPane.INFORMATION_MESSAGE);

            return;
        }

        // Evita abonos mayores al saldo pendiente
        if (abono > saldo) {

            JOptionPane.showMessageDialog(this, "El abono no puede ser mayor al saldo pendiente.\n" + "Saldo actual: $" + String.format("%.2f", saldo),"Abono mayor al saldo",JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Creamos el objeto de la clase Pagos
        Modelo.Pagos objpago = new Modelo.Pagos();

        objpago.setIdReserva(idReserva);
        objpago.setFechaPago(fechaPago);
        objpago.setAbono(abono);
        objpago.setMetodoPago(metodoPago);
        objpago.setObservacion(observacion);

        boolean resultado = objdao.guardarPago(objpago);

        if (resultado) {

            JOptionPane.showMessageDialog(this, "Abono registrado correctamente.","Pago exitoso",JOptionPane.INFORMATION_MESSAGE);

            // Actualiza el historial
            objdao.mostrarPagos(jTable1);

            // Actualiza el resumen
            objdao.mostrarResumenPago(idReserva, txtMontoTotal,txtTotalPagado,txtSaldo);

            // Limpia solo los datos del nuevo abono
            txtAbono.setText("");
            txtFechaPago.setText("");
            txtObservacion.setText("");
            cboxMetodoPago.setSelectedIndex(0);

        } else {

            JOptionPane.showMessageDialog( this,"No fue posible registrar el abono.","Error",JOptionPane.ERROR_MESSAGE);
        }

    } catch (DateTimeParseException e) {

        JOptionPane.showMessageDialog(this,"La fecha debe tener el formato dd/MM/yyyy.", "Formato inválido",JOptionPane.ERROR_MESSAGE);

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(this,"El abono debe contener únicamente números.","Abono inválido", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea regresar al menú principal?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        // Abre el menú
        MenuPrincipal objmenu = new MenuPrincipal();
        objmenu.setLocationRelativeTo(null);
        objmenu.setVisible(true);

        // Cierra Pagos
        this.dispose();
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   
    int fila = jTable1.getSelectedRow();

    if (fila >= 0) {

        // Fecha del pago
        txtFechaPago.setText( jTable1.getValueAt(fila, 4).toString());

        // Abono
        txtAbono.setText( jTable1.getValueAt(fila, 5).toString());

        // Método
        cboxMetodoPago.setSelectedItem( jTable1.getValueAt(fila, 6).toString() );

        // Observación
        Object observacion = jTable1.getValueAt(fila, 7);

        txtObservacion.setText(observacion == null ? "" : observacion.toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    int fila = jTable1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(this, "Seleccione un pago de la tabla.","Sin selección", JOptionPane.WARNING_MESSAGE);

        return;
    }

    int respuesta = JOptionPane.showConfirmDialog(
            this, "¿Está seguro de eliminar este pago?","Confirmar eliminación",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {

        int idPago = Integer.parseInt( jTable1.getValueAt(fila, 0).toString());

        PagosDAO objdao = new PagosDAO();

        boolean resultado = objdao.eliminarPago(idPago);

        if (resultado) {

            JOptionPane.showMessageDialog(this, "Pago eliminado correctamente.","Eliminación exitosa",JOptionPane.INFORMATION_MESSAGE);

                  
            objdao.mostrarPagos(jTable1);

            // Si hay una reserva seleccionada, actualiza el saldo
            if (cboxReserva.getSelectedItem() != null&& !cboxReserva.getSelectedItem().toString().equals("Seleccione...")) {

                int idReserva = objdao.obtenerIdReserva( cboxReserva.getSelectedItem().toString());

                objdao.mostrarResumenPago(idReserva,txtMontoTotal, txtTotalPagado,txtSaldo);
            }

            txtAbono.setText("");
            txtFechaPago.setText("");
            txtObservacion.setText("");
            cboxMetodoPago.setSelectedIndex(0);
            jTable1.clearSelection();

        } else {

            JOptionPane.showMessageDialog( this,"No fue posible eliminar el pago.","Error",JOptionPane.ERROR_MESSAGE );
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  String textoBuscar = txtBuscar.getText().trim();

    PagosDAO objdao = new PagosDAO();

    if (textoBuscar.isEmpty()) {

        objdao.mostrarPagos(jTable1);

    } else {

        objdao.buscarPagos(jTable1, textoBuscar);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PagosEM().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboxMetodoPago;
    private javax.swing.JComboBox<String> cboxReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAbono;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTotalPagado;
    // End of variables declaration//GEN-END:variables
}
