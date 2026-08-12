package Vistas;
import javax.swing.JOptionPane;
import Modelo.Sesion;

public class MenuPrincipal extends javax.swing.JFrame {
  
    
// Guarda el rol del usuario que inició sesión
String rolUsuario;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        // Inicializa los componentes
    initComponents();
    // Centra la ventana
    setLocationRelativeTo(null);
    // Aplica los permisos según el rol guardado
    aplicarPermisos();
    }

  public MenuPrincipal(String rol) {

    // Inicializa los componentes
    initComponents();

    // Centra la ventana
    setLocationRelativeTo(null);

    // Guarda el rol recibido desde el Login
    rolUsuario = rol;

    // Aplica los permisos del usuario
    aplicarPermisos();
}
 public void aplicarPermisos() {

    // Primero dejamos todos los botones desactivados
    btnClientes.setEnabled(false);
   Terrazas.setEnabled(false);
    Reservas.setEnabled(false);
    Pagos.setEnabled(false);
    btnUsuarios.setEnabled(false);

    // Permisos del administrador
    if (Sesion.rol.equals("Administrador")) {

        btnClientes.setEnabled(true);
        Terrazas.setEnabled(true);
        Reservas.setEnabled(true);
        Pagos.setEnabled(true);
        btnUsuarios.setEnabled(true);
    }

    // Permisos del recepcionista
    if (Sesion.rol.equals("Recepcionista")) {

        btnClientes.setEnabled(true);
        Reservas.setEnabled(true);
        Pagos.setEnabled(true);
    }

    // Permisos del organizador
    if (Sesion.rol.equals("Organizador")) {

       Reservas.setEnabled(true);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        Reservas = new javax.swing.JButton();
        Pagos = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        Terrazas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EVENT MANAGER");

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        Reservas.setText("Reservas");
        Reservas.addActionListener(this::ReservasActionPerformed);

        Pagos.setText("Pagos");
        Pagos.addActionListener(this::PagosActionPerformed);

        btnCerrar.setText("Cerrar Sesion");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        Terrazas.setText("Terrazas");
        Terrazas.addActionListener(this::TerrazasActionPerformed);

        jLabel2.setText("gestion de eventos y terrazas");

        jLabel3.setText("Registrar y consultar");

        jLabel4.setText("Administrar espacios");

        jLabel5.setText("Programar eventos");

        jLabel6.setText("Registrar abonos (pagos)");

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(this::btnUsuariosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCerrar)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Terrazas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Terrazas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Reservas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Pagos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(35, 35, 35)
                .addComponent(btnUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
     
    Clientes objclientes = new Clientes();

    objclientes.setLocationRelativeTo(null);
    objclientes.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

    int respuesta = JOptionPane.showConfirmDialog(this,"¿Desea cerrar la sesión?","Cerrar sesión",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {

        // Limpiamos los datos guardados
        Sesion.idUsuario = 0;
        Sesion.nombre = null;
        Sesion.usuario = null;
        Sesion.rol = null;

        // Regresamos al Login
        Login objlogin = new Login();

        objlogin.setLocationRelativeTo(null);
        objlogin.setVisible(true);

        this.dispose();
    }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void TerrazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerrazasActionPerformed
   Terrazas objterrazas = new Terrazas();

    objterrazas.setLocationRelativeTo(null);
    objterrazas.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_TerrazasActionPerformed

    private void ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservasActionPerformed
        ReservasEM objreservas = new ReservasEM();

    objreservas.setLocationRelativeTo(null);
    objreservas.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_ReservasActionPerformed

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
  PagosEM objpagos = new PagosEM();

    objpagos.setLocationRelativeTo(null);
    objpagos.setVisible(true);

    this.dispose();
    }//GEN-LAST:event_PagosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
//Abre la ventana de administración de usuarios
    Registro objregistro = new Registro();

    objregistro.setLocationRelativeTo(null);
    objregistro.setVisible(true);

    // Cierra temporalmente el menú
    this.dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pagos;
    private javax.swing.JButton Reservas;
    private javax.swing.JButton Terrazas;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
