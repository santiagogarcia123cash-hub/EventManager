package Vistas;
import DAO.ClientesDAO;
import javax.swing.JOptionPane;


public class Clientes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Clientes.class.getName());

    /**
     * Creates new form Clientes
     */
    public Clientes() {
       // Inicializa los componentes
    initComponents();

    // Centra la ventana
    setLocationRelativeTo(null);

    // Muestra los clientes registrados
    ClientesDAO objdao = new ClientesDAO();
    objdao.mostrarClientes(jTable1);
    }
    public void limpiarCampos() {

    txtNombre.setText("");
    txtTelefono.setText("");
    txtCorreo.setText("");
    txtDireccion.setText("");
    txtBuscar.setText("");

    jTable1.clearSelection();

    txtNombre.requestFocus();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GESTION DE CLIENTES");

        jLabel2.setText("Nombre");

        jLabel3.setText("Telefono");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Correo");

        jLabel5.setText("Direccion");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        jLabel6.setText("Buscar :");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        btnSalir.setText("Atras");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(22, 22, 22)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(txtTelefono))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String nombre = txtNombre.getText().trim();
    String telefono = txtTelefono.getText().trim();
    String correo = txtCorreo.getText().trim();
    String direccion = txtDireccion.getText().trim();

    // Validamos campos vacíos
    if (nombre.isEmpty() || telefono.isEmpty()|| correo.isEmpty() || direccion.isEmpty()) {

        JOptionPane.showMessageDialog( this, "Complete todos los campos.","Campos vacíos",  JOptionPane.WARNING_MESSAGE );

        return;
    }

    // Validación sencilla del correo
    if (!correo.contains("@") || !correo.contains(".")) {

        JOptionPane.showMessageDialog( this,  "Ingrese un correo válido.", "Correo inválido",JOptionPane.WARNING_MESSAGE );

        txtCorreo.requestFocus();
        return;
    }

    // Validación sencilla del teléfono
    if (!telefono.matches("[0-9]+")) {

        JOptionPane.showMessageDialog(this, "El teléfono debe contener únicamente números.", "Teléfono inválido",JOptionPane.WARNING_MESSAGE );

        txtTelefono.requestFocus();
        return;
    }

    Modelo.Clientes objcliente = new Modelo.Clientes();

    objcliente.setNombre(nombre);
    objcliente.setTelefono(telefono);
    objcliente.setCorreo(correo);
    objcliente.setDireccion(direccion);

    ClientesDAO objdao = new ClientesDAO();

    boolean resultado = objdao.guardarCliente(objcliente);

    if (resultado) {

        JOptionPane.showMessageDialog(this,"Cliente registrado correctamente.","Registro exitoso",JOptionPane.INFORMATION_MESSAGE );

        objdao.mostrarClientes(jTable1);
        limpiarCampos();

    } else {

        JOptionPane.showMessageDialog(  this, "No fue posible registrar el cliente.", "Error", JOptionPane.ERROR_MESSAGE );
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  int fila = jTable1.getSelectedRow();

    if (fila >= 0) {

        txtNombre.setText( jTable1.getValueAt(fila, 1).toString());

        txtTelefono.setText(jTable1.getValueAt(fila, 2).toString());

        txtCorreo.setText( jTable1.getValueAt(fila, 3).toString());

        txtDireccion.setText(jTable1.getValueAt(fila, 4).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  int fila = jTable1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(this,"Seleccione un cliente de la tabla.","Sin selección", JOptionPane.WARNING_MESSAGE);

        return;
    }

    String nombre = txtNombre.getText().trim();
    String telefono = txtTelefono.getText().trim();
    String correo = txtCorreo.getText().trim();
    String direccion = txtDireccion.getText().trim();

    if (nombre.isEmpty() || telefono.isEmpty()|| correo.isEmpty()|| direccion.isEmpty()) {

        JOptionPane.showMessageDialog(this, "Complete todos los campos.", "Campos vacíos",JOptionPane.WARNING_MESSAGE);

        return;
    }

    if (!correo.contains("@") || !correo.contains(".")) {

        JOptionPane.showMessageDialog( this,"Ingrese un correo válido.","Correo inválido",JOptionPane.WARNING_MESSAGE);

        return;
    }

    if (!telefono.matches("[0-9]+")) {

        JOptionPane.showMessageDialog(this,"El teléfono debe contener únicamente números.","Teléfono inválido",JOptionPane.WARNING_MESSAGE );

        return;
    }

    int idCliente = Integer.parseInt(
            jTable1.getValueAt(fila, 0).toString()
    );

    Modelo.Clientes objcliente = new Modelo.Clientes();

    objcliente.setId_cliente(idCliente);
    objcliente.setNombre(nombre);
    objcliente.setTelefono(telefono);
    objcliente.setCorreo(correo);
    objcliente.setDireccion(direccion);

    ClientesDAO objdao = new ClientesDAO();

    boolean resultado = objdao.modificarCliente(objcliente);

    if (resultado) {

        JOptionPane.showMessageDialog( this,"Cliente modificado correctamente.","Modificación exitosa",JOptionPane.INFORMATION_MESSAGE );

        objdao.mostrarClientes(jTable1);
        limpiarCampos();

    } else {

        JOptionPane.showMessageDialog( this, "No fue posible modificar el cliente.","Error",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int fila = jTable1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(  this,"Seleccione un cliente de la tabla.", "Sin selección", JOptionPane.WARNING_MESSAGE);

        return;
    }

    int respuesta = JOptionPane.showConfirmDialog( this, "¿Está seguro de eliminar este cliente?","Confirmar eliminación", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );

    if (respuesta == JOptionPane.YES_OPTION) {

        int idCliente = Integer.parseInt(jTable1.getValueAt(fila, 0).toString() );

        ClientesDAO objdao = new ClientesDAO();

        boolean resultado = objdao.eliminarCliente(idCliente);

        if (resultado) {

            JOptionPane.showMessageDialog( this, "Cliente eliminado correctamente.","Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);

            objdao.mostrarClientes(jTable1);
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog(this, "No fue posible eliminar el cliente.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      String textoBuscar = txtBuscar.getText().trim();

    ClientesDAO objdao = new ClientesDAO();

    if (textoBuscar.isEmpty()) {

        objdao.mostrarClientes(jTable1);

    } else {

        objdao.buscarClientes(jTable1, textoBuscar);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     // Preguntamos si realmente desea salir
    int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea regresar al menú principal?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        // Abre el menú
        MenuPrincipal objmenu = new MenuPrincipal();
        objmenu.setLocationRelativeTo(null);
        objmenu.setVisible(true);

        // Cierra Pagos
        this.dispose();
    }
    }//GEN-LAST:event_btnSalirActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Clientes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
