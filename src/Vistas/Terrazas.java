package Vistas;
import DAO.TerrazasDAO;
import javax.swing.JOptionPane;

public class Terrazas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Terrazas.class.getName());

    /**
     * Creates new form Terrazas
     */
    public Terrazas() {
    // Inicializa los componentes de la ventana
    initComponents();

    // Centra la ventana
    setLocationRelativeTo(null);

    // Muestra las terrazas registradas en la tabla
    TerrazasDAO objdao = new TerrazasDAO();
    objdao.mostrarTerrazas(table1);
    }
public void limpiarCampos() {

    // Limpia los campos de texto
    txtNombre.setText("");
    txtUbicacion.setText("");
    txtCapacidad.setText("");
    txtPrecio.setText("");
    txtDescripcion.setText("");

    // Regresa el combo a la primera opción
    cboxEstado.setSelectedIndex(0);

    // Coloca el cursor en el nombre
    txtNombre.requestFocus();

    // Quita cualquier selección de la tabla
    table1.clearSelection();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboxEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestion de Terrazas");

        lblNombre.setText("Nombre");

        jLabel2.setText("Ubicacion");

        jLabel3.setText("Capacidad");

        jLabel4.setText("Precio de Renta $");

        txtPrecio.addActionListener(this::txtPrecioActionPerformed);

        jLabel5.setText("Estado");

        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Disponible", "Mantenimiento", "Fuera de servicio", " " }));

        jLabel6.setText("Descripcion");

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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jLabel7.setText("Buscar por nombre:");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        btnSalir.setText("Atras");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)
                                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnNuevo)
                                .addGap(45, 45, 45)
                                .addComponent(btnGuardar)
                                .addGap(42, 42, 42)
                                .addComponent(btnModificar)
                                .addGap(46, 46, 46)
                                .addComponent(btnEliminar)
                                .addGap(49, 49, 49)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
   // Obtenemos la información escrita en los campos
    String nombre = txtNombre.getText().trim();
    String ubicacion = txtUbicacion.getText().trim();
    String capacidadTexto = txtCapacidad.getText().trim();
    String precioTexto = txtPrecio.getText().trim();
    String estado = cboxEstado.getSelectedItem().toString();
    String descripcion = txtDescripcion.getText().trim();

    // Validamos que los campos no estén vacíos
    if (nombre.isEmpty() || ubicacion.isEmpty()|| capacidadTexto.isEmpty()|| precioTexto.isEmpty()|| descripcion.isEmpty()) {

        JOptionPane.showMessageDialog(  this, "Complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    // Validamos que se haya seleccionado un estado
    if (estado.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(this,"Seleccione el estado de la terraza.","Estado no seleccionado",JOptionPane.WARNING_MESSAGE );

        return;
    }

    try {

        // Convertimos capacidad y precio a números
        int capacidad = Integer.parseInt(capacidadTexto);
        double precio = Double.parseDouble(precioTexto);

        // Validamos que la capacidad sea mayor que cero
        if (capacidad <= 0) {

            JOptionPane.showMessageDialog( this,"La capacidad debe ser mayor que cero.", "Capacidad inválida",JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Validamos que el precio sea mayor que cero
        if (precio <= 0) {

            JOptionPane.showMessageDialog( this,"El precio debe ser mayor que cero.","Precio inválido",  JOptionPane.WARNING_MESSAGE );

            return;
        }

        // Creamos un objeto del modelo Terrazas
        Modelo.Terrazas objterraza = new Modelo.Terrazas();

        // Enviamos los datos al objeto
        objterraza.setNombre(nombre);
        objterraza.setUbicacion(ubicacion);
        objterraza.setCapacidad(capacidad);
        objterraza.setPrecio(precio);
        objterraza.setEstado(estado);
        objterraza.setDescripcion(descripcion);

        // Creamos el objeto DAO
        TerrazasDAO objdao = new TerrazasDAO();

        // Intentamos guardar la terraza
        boolean resultado = objdao.guardarTerraza(objterraza);

        if (resultado) {

            JOptionPane.showMessageDialog(this,"Terraza registrada correctamente.","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);

            // Actualizamos la tabla
            objdao.mostrarTerrazas(table1);

            // Limpiamos los campos
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog( this, "No fue posible registrar la terraza.","Error",JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {

  JOptionPane.showMessageDialog(this,"Capacidad y precio deben contener únicamente números.","Datos inválidos",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      // Limpia todos los componentes del formulario
    limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
 // Obtenemos la fila seleccionada
    int fila = table1.getSelectedRow();

    // Verificamos que sí exista una fila seleccionada
    if (fila >= 0) {
        // Colocamos los datos de la tabla en los campos
        txtNombre.setText(table1.getValueAt(fila, 1).toString());
        txtUbicacion.setText(table1.getValueAt(fila, 2).toString());
        txtCapacidad.setText(table1.getValueAt(fila, 3).toString());
        txtPrecio.setText(table1.getValueAt(fila, 4).toString());
        cboxEstado.setSelectedItem(table1.getValueAt(fila, 5).toString());
        txtDescripcion.setText(table1.getValueAt(fila, 6).toString());
    }
    }//GEN-LAST:event_table1MouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  // Verificamos que exista una fila seleccionada
    int fila = table1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog( this, "Seleccione una terraza de la tabla.","Sin selección", JOptionPane.WARNING_MESSAGE);

        return;
    }

    // Obtenemos los datos
    String nombre = txtNombre.getText().trim();
    String ubicacion = txtUbicacion.getText().trim();
    String capacidadTexto = txtCapacidad.getText().trim();
    String precioTexto = txtPrecio.getText().trim();
    String estado = cboxEstado.getSelectedItem().toString();
    String descripcion = txtDescripcion.getText().trim();

    // Validamos campos vacíos
    if (nombre.isEmpty()|| ubicacion.isEmpty()|| capacidadTexto.isEmpty()|| precioTexto.isEmpty()|| descripcion.isEmpty()) {

        JOptionPane.showMessageDialog( this,  "Complete todos los campos.","Campos vacíos",JOptionPane.WARNING_MESSAGE );

        return;
    }

    try {

        // Obtenemos el ID desde la tabla
        int idTerraza = Integer.parseInt(table1.getValueAt(fila, 0).toString() );
        int capacidad = Integer.parseInt(capacidadTexto);
        double precio = Double.parseDouble(precioTexto);

        // Creamos el objeto
        Modelo.Terrazas objterraza = new Modelo.Terrazas();

        objterraza.setId_terraza(idTerraza);
        objterraza.setNombre(nombre);
        objterraza.setUbicacion(ubicacion);
        objterraza.setCapacidad(capacidad);
        objterraza.setPrecio(precio);
        objterraza.setEstado(estado);
        objterraza.setDescripcion(descripcion);

        TerrazasDAO objdao = new TerrazasDAO();

        boolean resultado = objdao.modificarTerraza(objterraza);

        if (resultado) {

            JOptionPane.showMessageDialog(this,"Terraza modificada correctamente.","Modificación exitosa", JOptionPane.INFORMATION_MESSAGE);

            objdao.mostrarTerrazas(table1);
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog( this,"No fue posible modificar la terraza.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(this, "Capacidad y precio deben ser numéricos.","Datos inválidos",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    int fila = table1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(this, "Seleccione una terraza de la tabla.", "Sin selección",JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de eliminar esta terraza?", "Confirmar eliminación",  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );

    if (respuesta == JOptionPane.YES_OPTION) {

        int idTerraza = Integer.parseInt(
                table1.getValueAt(fila, 0).toString()
        );

        TerrazasDAO objdao = new TerrazasDAO();

        boolean resultado = objdao.eliminarTerraza(idTerraza);

        if (resultado) {

            JOptionPane.showMessageDialog(this, "Terraza eliminada correctamente.","Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);

            objdao.mostrarTerrazas(table1);
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog( this,"No fue posible eliminar la terraza.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
 String textoBuscar = txtbuscar.getText().trim();

    TerrazasDAO objdao = new TerrazasDAO();

    if (textoBuscar.isEmpty()) {

        objdao.mostrarTerrazas(table1);

    } else {

        objdao.buscarTerrazas(table1, textoBuscar);
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

    limpiarCampos();

    txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Terrazas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
