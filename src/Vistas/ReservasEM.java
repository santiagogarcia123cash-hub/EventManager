package Vistas;
import DAO.ReservaDAO;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ReservasEM extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReservasEM.class.getName());

   
    public ReservasEM() {
        // Inicializa los componentes
    initComponents();

    // Centra la ventana
    setLocationRelativeTo(null);

    // Creamos el objeto DAO
    ReservaDAO objdao = new ReservaDAO();

    // Cargamos los clientes
    objdao.cargarClientes(cboxClientes);

    // Cargamos las terrazas disponibles
    objdao.cargarTerrazas(cboxTerrazas);

    // Mostramos las reservas registradas
    objdao.mostrarReservas(jTable1);
    }
public void limpiarCampos() {

    // Regresa los combos a la primera opción
    cboxClientes.setSelectedIndex(0);
    cboxTerrazas.setSelectedIndex(0);
    cboxEstado.setSelectedIndex(0);

    // Limpia los campos
    txtFecha.setText("");
    txtHoraInicio.setText("");
    txtHoraFin.setText("");
    txtInvitados.setText("");
    txtBuscar.setText("");

    // Quita la selección de la tabla
    jTable1.clearSelection();

    // Coloca el cursor en el combo de clientes
    cboxClientes.requestFocus();
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboxClientes = new javax.swing.JComboBox<>();
        cboxTerrazas = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        txtInvitados = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboxEstado = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHoraFin = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GESTION DE RESERVAS");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Hora inicio:");

        jLabel5.setText("Numero Invitados:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Atras");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jLabel6.setText("Terraza:");

        cboxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", " " }));

        cboxTerrazas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", " " }));

        jLabel7.setText("Estado:");

        cboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Pendiente", "Confirmada", "Cancelada", "Finalizada" }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("Buscar:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jLabel9.setText("Ejemplo: dd/MM/yyyy");

        jLabel10.setText("Formato: HH:mm");

        jLabel11.setText("Seleccione un cliente, una terraza y capture la información del evento.");

        jLabel12.setText("Hora fin:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxClientes, 0, 306, Short.MAX_VALUE)
                            .addComponent(cboxTerrazas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(91, 91, 91))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel4)
                                        .addGap(13, 13, 13)
                                        .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(228, 228, 228))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(txtInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(139, 139, 139)))))
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxTerrazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(cboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(jButton2)
                    .addComponent(btnLimpiar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   // Obtenemos los datos de la ventana
    String cliente = cboxClientes.getSelectedItem().toString();
    String terraza = cboxTerrazas.getSelectedItem().toString();
    String fecha = txtFecha.getText().trim();
    String horaInicio = txtHoraInicio.getText().trim();
    String horaFin = txtHoraFin.getText().trim();
    String invitadosTexto = txtInvitados.getText().trim();
    String estado = cboxEstado.getSelectedItem().toString();

    // Validamos el cliente
    if (cliente.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(this,"Seleccione un cliente.", "Cliente no seleccionado",JOptionPane.WARNING_MESSAGE );

        return;
    }

    // Validamos la terraza
    if (terraza.equals("Seleccione...")) {

        JOptionPane.showMessageDialog( this, "Seleccione una terraza.","Terraza no seleccionada", JOptionPane.WARNING_MESSAGE);

        return;
    }

    // Validamos los campos vacíos
    if (fecha.isEmpty() || horaInicio.isEmpty()|| horaFin.isEmpty() || invitadosTexto.isEmpty()) {

        JOptionPane.showMessageDialog( this,"Complete la fecha, hora de inicio, hora de fin e invitados.","Campos vacíos",JOptionPane.WARNING_MESSAGE);

        return;
    }

    // Validamos el estado
    if (estado.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(this,"Seleccione el estado de la reserva.","Estado no seleccionado",JOptionPane.WARNING_MESSAGE );

        return;
    }

    try {

        // Formato de fecha
        DateTimeFormatter formatoFecha
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaConvertida
                = LocalDate.parse(fecha, formatoFecha);

        // Formato de hora
        DateTimeFormatter formatoHora
                = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaInicioConvertida
                = LocalTime.parse(horaInicio, formatoHora);

        LocalTime horaFinConvertida
                = LocalTime.parse(horaFin, formatoHora);

        // La hora final debe ser posterior a la inicial
        if (!horaFinConvertida.isAfter(horaInicioConvertida)) {

            JOptionPane.showMessageDialog(this, "La hora de fin debe ser posterior a la hora de inicio.","Horario inválido",JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Convertimos invitados a número
        int invitados = Integer.parseInt(invitadosTexto);

        if (invitados <= 0) {

            JOptionPane.showMessageDialog(
 this, "El número de invitados debe ser mayor que cero.","Cantidad inválida",JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Evitamos fechas anteriores al día actual
        if (fechaConvertida.isBefore(LocalDate.now())) {

            JOptionPane.showMessageDialog(this,"La fecha de la reserva no puede ser anterior al día actual.","Fecha inválida",JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Creamos el DAO
        ReservaDAO objdao = new ReservaDAO();

        // Obtenemos los IDs
        int idCliente = objdao.obtenerIdCliente(cliente);
        int idTerraza = objdao.obtenerIdTerraza(terraza);

        if (idCliente == 0 || idTerraza == 0) {

            JOptionPane.showMessageDialog(this, "No fue posible identificar el cliente o la terraza.","Error", JOptionPane.ERROR_MESSAGE);

            return;
        }

        // Verificamos cruces de horario
        boolean existeCruce = objdao.existeCruceHorario(idTerraza, fecha,horaInicio, horaFin);

        if (existeCruce) {

            JOptionPane.showMessageDialog( this, "La terraza ya tiene una reserva pendiente o confirmada\n" + "que se cruza con el horario ingresado.", "Terraza no disponible",JOptionPane.WARNING_MESSAGE);

            return;
        }

        // Creamos el objeto de la clase Reservas
        Modelo.Reservas objreserva = new Modelo.Reservas();

        objreserva.setIdCliente(idCliente);
        objreserva.setIdTerraza(idTerraza);
        objreserva.setFecha(fecha);
        objreserva.setHoraInicio(horaInicio);
        objreserva.setHoraFin(horaFin);
        objreserva.setInvitados(invitados);
        objreserva.setEstado(estado);

        // Guardamos la reserva
        boolean resultado = objdao.guardarReserva(objreserva);

        if (resultado) {

            JOptionPane.showMessageDialog(this,"Reserva registrada correctamente.", "Registro exitoso",JOptionPane.INFORMATION_MESSAGE);

            objdao.mostrarReservas(jTable1);
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog(this,"No fue posible registrar la reserva.","Error",JOptionPane.ERROR_MESSAGE);
        }

    } catch (DateTimeParseException e) {

        JOptionPane.showMessageDialog( this,"Verifique los formatos:\n"+ "Fecha: dd/MM/yyyy\n"+ "Hora inicio: HH:mm\n" + "Hora fin: HH:mm", "Formato inválido",JOptionPane.ERROR_MESSAGE);

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(this,"El número de invitados debe contener únicamente números.","Cantidad inválida",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      
    limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
  limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
    // Obtenemos la fila seleccionada
    int fila = jTable1.getSelectedRow();

    // Verificamos que sí exista una fila seleccionada
    if (fila >= 0) {
        // Colocamos los datos de la tabla en los componentes
        cboxClientes.setSelectedItem(jTable1.getValueAt(fila, 1).toString());

        cboxTerrazas.setSelectedItem(jTable1.getValueAt(fila, 2).toString());

        txtFecha.setText( jTable1.getValueAt(fila, 3).toString());

        txtHoraInicio.setText(jTable1.getValueAt(fila, 4).toString());

        txtInvitados.setText(jTable1.getValueAt(fila, 5).toString());

        cboxEstado.setSelectedItem(jTable1.getValueAt(fila, 6).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    // Obtenemos la fila seleccionada
    int fila = jTable1.getSelectedRow();

    if (fila == -1) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione una reserva de la tabla.",
                "Sin selección",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    // Obtenemos los datos de la ventana
    String cliente = cboxClientes.getSelectedItem().toString();
    String terraza = cboxTerrazas.getSelectedItem().toString();
    String fecha = txtFecha.getText().trim();
    String horaInicio = txtHoraInicio.getText().trim();
    String horaFin = txtHoraFin.getText().trim();
    String invitadosTexto = txtInvitados.getText().trim();
    String estado = cboxEstado.getSelectedItem().toString();

    // Validamos las selecciones
    if (cliente.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione un cliente.",
                "Cliente no seleccionado",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    if (terraza.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione una terraza.",
                "Terraza no seleccionada",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    // Validamos campos vacíos
    if (fecha.isEmpty()
            || horaInicio.isEmpty()
            || horaFin.isEmpty()
            || invitadosTexto.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Complete la fecha, hora de inicio, hora de fin e invitados.",
                "Campos vacíos",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    if (estado.equals("Seleccione...")) {

        JOptionPane.showMessageDialog(
                this,
                "Seleccione el estado de la reserva.",
                "Estado no seleccionado",
                JOptionPane.WARNING_MESSAGE
        );

        return;
    }

    try {

        DateTimeFormatter formatoFecha
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaConvertida
                = LocalDate.parse(fecha, formatoFecha);

        DateTimeFormatter formatoHora
                = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime horaInicioConvertida
                = LocalTime.parse(horaInicio, formatoHora);

        LocalTime horaFinConvertida
                = LocalTime.parse(horaFin, formatoHora);

        if (!horaFinConvertida.isAfter(horaInicioConvertida)) {

            JOptionPane.showMessageDialog(
                    this,
                    "La hora de fin debe ser posterior a la hora de inicio.",
                    "Horario inválido",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        int invitados = Integer.parseInt(invitadosTexto);

        if (invitados <= 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "El número de invitados debe ser mayor que cero.",
                    "Cantidad inválida",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        if (fechaConvertida.isBefore(LocalDate.now())) {

            JOptionPane.showMessageDialog(
                    this,
                    "La fecha de la reserva no puede ser anterior al día actual.",
                    "Fecha inválida",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        // ID de la reserva seleccionada
        int idReserva = Integer.parseInt(
                jTable1.getValueAt(fila, 0).toString()
        );

        ReservaDAO objdao = new ReservaDAO();

        int idCliente = objdao.obtenerIdCliente(cliente);
        int idTerraza = objdao.obtenerIdTerraza(terraza);

        if (idCliente == 0 || idTerraza == 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible identificar el cliente o la terraza.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        // Verifica cruces ignorando la propia reserva
        boolean existeCruce = objdao.existeCruceHorarioModificar(
                idTerraza,
                fecha,
                horaInicio,
                horaFin,
                idReserva
        );

        if (existeCruce) {

            JOptionPane.showMessageDialog(
                    this,
                    "La terraza ya tiene otra reserva pendiente o confirmada\n"
                    + "que se cruza con el horario ingresado.",
                    "Terraza no disponible",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        // Creamos el objeto de la clase Reservas
        Modelo.Reservas objreserva = new Modelo.Reservas();

        objreserva.setIdReserva(idReserva);
        objreserva.setIdCliente(idCliente);
        objreserva.setIdTerraza(idTerraza);
        objreserva.setFecha(fecha);
        objreserva.setHoraInicio(horaInicio);
        objreserva.setHoraFin(horaFin);
        objreserva.setInvitados(invitados);
        objreserva.setEstado(estado);

        boolean resultado = objdao.modificarReserva(objreserva);

        if (resultado) {

            JOptionPane.showMessageDialog(
                    this,
                    "Reserva modificada correctamente.",
                    "Modificación exitosa",
                    JOptionPane.INFORMATION_MESSAGE
            );

            objdao.mostrarReservas(jTable1);
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "No fue posible modificar la reserva.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    } catch (DateTimeParseException e) {

        JOptionPane.showMessageDialog(
                this,
                "Verifique los formatos:\n"
                + "Fecha: dd/MM/yyyy\n"
                + "Hora inicio: HH:mm\n"
                + "Hora fin: HH:mm",
                "Formato inválido",
                JOptionPane.ERROR_MESSAGE
        );

    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(
                this,
                "El número de invitados debe contener únicamente números.",
                "Cantidad inválida",
                JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     // Obtenemos la fila seleccionada
    int fila = jTable1.getSelectedRow();

    // Verificamos que exista una reserva seleccionada
    if (fila == -1) {

        JOptionPane.showMessageDialog(this,"Seleccione una reserva de la tabla.","Sin selección",JOptionPane.WARNING_MESSAGE);

        return;
    }

    // Preguntamos si realmente desea eliminar
    int respuesta = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar esta reserva?","Confirmar eliminación",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
    );

    // Solo elimina si el usuario presiona Sí
    if (respuesta == JOptionPane.YES_OPTION) {

        // Obtenemos el ID desde la tabla
        int idReserva = Integer.parseInt(jTable1.getValueAt(fila, 0).toString() );

        // Creamos el objeto DAO
        ReservaDAO objdao = new ReservaDAO();

        // Intentamos eliminar
        boolean resultado = objdao.eliminarReserva(idReserva);

        if (resultado) {

            JOptionPane.showMessageDialog(  this,"Reserva eliminada correctamente.", "Eliminación exitosa",JOptionPane.INFORMATION_MESSAGE);

            // Actualizamos la tabla
            objdao.mostrarReservas(jTable1);

            // Ajustamos columnas
            //ajustarColumnas();

            // Limpiamos la ventana
            limpiarCampos();

        } else {

            JOptionPane.showMessageDialog(this,"No fue posible eliminar la reserva.","Error",JOptionPane.ERROR_MESSAGE );
        }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       // Obtenemos el texto escrito
    String textoBuscar = txtBuscar.getText().trim();

    // Creamos el objeto DAO
    ReservaDAO objdao = new ReservaDAO();

    // Si no escribió nada, mostramos todas las reservas
    if (textoBuscar.isEmpty()) {

        objdao.mostrarReservas(jTable1);

    } else {

        // Busca por nombre de cliente o terraza
        objdao.buscarReservas(jTable1, textoBuscar);
    }

    // Volvemos a ajustar las columnas
    //ajustarColumnas();

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new ReservasEM().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboxClientes;
    private javax.swing.JComboBox<String> cboxEstado;
    private javax.swing.JComboBox<String> cboxTerrazas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraFin;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtInvitados;
    // End of variables declaration//GEN-END:variables
}
