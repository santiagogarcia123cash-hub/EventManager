package Vistas;
import DAO.UsuariosDAO;
import javax.swing.JOptionPane;




public class Registro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Registro.class.getName());

    /**
     * Creates new form Registro
     */
    public Registro() {

    // Inicializa los componentes
    initComponents();

    // Centra la ventana
    setLocationRelativeTo(null);

    // Muestra los usuarios registrados
    UsuariosDAO objdao = new UsuariosDAO();
    objdao.mostrarUsuarios(jTable1);
    }

public void limpiarCampos() {

    // Limpia los campos
    txtnombre.setText("");
    txtUsuario.setText("");
    txtPassword.setText("");

    // Regresa los combos a su primera opción
    cboxRol.setSelectedIndex(0);
    cboxEstado.setSelectedIndex(0);

    // Quita la selección de la tabla
    jTable1.clearSelection();

    // Coloca el cursor en el nombre
    txtnombre.requestFocus();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboxRol = new javax.swing.JComboBox<>();
        cboxEstado = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrear.setText("CREAR USUARIO");
        btnCrear.addActionListener(this::btnCrearActionPerformed);

        jLabel1.setText("GESTION DE USUARIOS");

        jLabel2.setText("Crea y administra las cuentas del sistema ");

        jLabel3.setText("Nombre y Apellidos:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Contraseña:");

        jLabel6.setText("Rol");

        jLabel7.setText("Estado");

        cboxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Administrador", "Recepcionista", "Organizador" }));

        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSalir.setText("Volver al menu");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        jLabel8.setText("Usuarios registrados:");

        btnEliminar.setText("ELIMINAR USUARIO");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

    // Obtenemos los datos de la ventana
    String nombre = txtnombre.getText().trim();
    String usuario = txtUsuario.getText().trim();
    String password = txtPassword.getText().trim();
    String rol = cboxRol.getSelectedItem().toString();
    String estado = cboxEstado.getSelectedItem().toString();

    // Validamos campos vacíos
    if (nombre.isEmpty() || usuario.isEmpty()|| password.isEmpty()) {

        JOptionPane.showMessageDialog(this, "Complete el nombre, usuario y contraseña.", "Campos vacíos",  JOptionPane.WARNING_MESSAGE );

        return;
    }

    // Validamos rol
    if (rol.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un rol.",
                "Rol no seleccionado",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    // Validamos estado
    if (estado.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un estado.",
                "Estado no seleccionado",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    // Validación básica de usuario
    if (usuario.contains(" ")) {

        JOptionPane.showMessageDialog(
                this,
                "El nombre de usuario no debe contener espacios.",
                "Usuario inválido",
                JOptionPane.WARNING_MESSAGE
        );

        txtUsuario.requestFocus();
        return;
    }

    // Validación básica de contraseña
    if (password.length() < 4) {

        JOptionPane.showMessageDialog(this,"La contraseña debe tener al menos 4 caracteres.","Contraseña muy corta",JOptionPane.WARNING_MESSAGE);

        txtPassword.requestFocus();
        return;
    }

    UsuariosDAO objdao = new UsuariosDAO();

    // Evita usuarios repetidos
    if (objdao.existeUsuario(usuario)) {

        JOptionPane.showMessageDialog(this,"Ese nombre de usuario ya está registrado.","Usuario duplicado",JOptionPane.WARNING_MESSAGE);

        txtUsuario.requestFocus();
        return;
    }

    // Creamos el objeto de la clase Usuarios
    Modelo.Usuarios objusuario = new Modelo.Usuarios();

    objusuario.setNombre(nombre);
    objusuario.setUsuario(usuario);
    objusuario.setPassword(password);
    objusuario.setRol(rol);
    objusuario.setEstado(estado);

    boolean resultado = objdao.crearUsuario(objusuario);

    if (resultado) {

        JOptionPane.showMessageDialog(this, "Usuario creado correctamente.","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);

        objdao.mostrarUsuarios(jTable1);
        limpiarCampos();

    } else {

        JOptionPane.showMessageDialog(this,"No fue posible crear el usuario.","Error", JOptionPane.ERROR_MESSAGE);
    }        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    // Obtenemos la fila seleccionada
    int fila = jTable1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un usuario de la tabla.",
                "Sin selección",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    // Obtenemos ID, nombre de usuario y rol
    int idUsuario = Integer.parseInt(
            jTable1.getValueAt(fila, 0).toString()
    );

    String nombreUsuario =
            jTable1.getValueAt(fila, 2).toString();

    String rol =
            jTable1.getValueAt(fila, 3).toString();

    UsuariosDAO objdao = new UsuariosDAO();

    // Evita eliminar al último administrador
    if (rol.equals("Administrador")
            && objdao.contarAdministradores() <= 1) {

        JOptionPane.showMessageDialog(
                this,
                "No puede eliminar al último administrador del sistema.",
                "Operación no permitida",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de eliminar al usuario "
            + nombreUsuario + "?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
    );

    if (respuesta == JOptionPane.YES_OPTION) {

        boolean resultado =
                objdao.eliminarUsuario(idUsuario);

        if (resultado) {

            JOptionPane.showMessageDialog(
                    this,
                    "Usuario eliminado correctamente.",
                    "Eliminación exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            objdao.mostrarUsuarios(jTable1);
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible eliminar el usuario.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      MenuPrincipal objmenu = new MenuPrincipal();

    objmenu.setLocationRelativeTo(null);
    objmenu.setVisible(true);

    this.dispose();
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
        java.awt.EventQueue.invokeLater(() -> new Registro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JComboBox<String> cboxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
