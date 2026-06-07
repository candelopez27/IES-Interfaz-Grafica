
package vista;

import javax.swing.JOptionPane;

public class VentanaRegistroIngresar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRegistroIngresar.class.getName());
    private controlador.Controlador controlador; 

    public VentanaRegistroIngresar(controlador.Controlador controlador) {
        initComponents();
        this.controlador = controlador;
        panelRegistro.setVisible(false); //lo vuelve invisible hasta que se valide que existe su legajo en la base
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        lblTituloIngreso = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        txtFLegajo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelRegistro = new javax.swing.JPanel();
        txtNombreEstudiante = new javax.swing.JTextField();
        btnResgistrar = new javax.swing.JButton();
        txtCarrera = new javax.swing.JTextField();
        lblAnio = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lblNotenescuenta = new javax.swing.JLabel();
        lblRegstrate = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloIngreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloIngreso.setText("Sistema de Autogestión Estudiantil");

        lblSubtitulo.setText("Ingresá tu legajo para continuar");

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBienvenida.setText("Bienvenida/do!");

        btnIngresar.setBackground(new java.awt.Color(204, 204, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(this::btnIngresarActionPerformed);

        txtNombreEstudiante.addActionListener(this::txtNombreEstudianteActionPerformed);

        btnResgistrar.setBackground(new java.awt.Color(204, 204, 255));
        btnResgistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResgistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnResgistrar.setText("Registrar");
        btnResgistrar.addActionListener(this::btnResgistrarActionPerformed);

        txtCarrera.addActionListener(this::txtCarreraActionPerformed);

        lblAnio.setText("Año de ingreso:");

        lblNotenescuenta.setText("No tenes cuenta?");

        lblRegstrate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegstrate.setText("Registrate!");

        lblNombre.setText("Nombre:");

        lblCarrera.setText("Carrera:");

        lblLegajo.setText("Legajo");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLegajo)
                    .addComponent(lblCarrera)
                    .addComponent(lblAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnResgistrar)
                            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRegstrate))
                    .addComponent(lblNotenescuenta))
                .addGap(111, 111, 111))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNotenescuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegstrate)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLegajo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLegajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarrera))
                .addGap(23, 23, 23)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResgistrar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addComponent(lblBienvenida)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addComponent(lblTituloIngreso)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSubtitulo)
                            .addGroup(panelInicioLayout.createSequentialGroup()
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelInicioLayout.createSequentialGroup()
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGap(8, 8, 8)))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtitulo)
                .addGap(29, 29, 29)
                .addComponent(txtFLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnIngresar)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstudianteActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
         String legajo = txtFLegajo.getText().trim();
    
        if (legajo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresá tu legajo.");
            return;
        }

        if (controlador.existeEstudiante() && controlador.login(legajo)) {
            new VentanaPrincipal(controlador).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, 
                "No estás registrado. Completá el formulario.",
                "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
            // oculta componentes de login
            txtFLegajo.setVisible(false);
            btnIngresar.setVisible(false);
            lblSubtitulo.setVisible(false);
            // muestra registro
            panelRegistro.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void btnResgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResgistrarActionPerformed
        String nombre = txtNombreEstudiante.getText().trim();
        String legajo = txtFLegajo.getText(); // ya tiene el legajo ingresado antes
        String carrera = txtCarrera.getText().trim();
        String anio = txtAnio.getText().trim();

        String resultado = controlador.crearEstudiante(nombre, legajo, carrera, anio);

        if (resultado == null) {
            JOptionPane.showMessageDialog(this, 
                "¡Registro exitoso! Ahora ingresá con tu legajo.",
                "Bienvenido/a", JOptionPane.INFORMATION_MESSAGE);
            // vuelve al login
            panelRegistro.setVisible(false);
            txtFLegajo.setVisible(true);
            btnIngresar.setVisible(true);
            lblSubtitulo.setVisible(true);
            txtFLegajo.setText("");
        } else {
            JOptionPane.showMessageDialog(this, resultado, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnResgistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            // oculta el panel de registro
        panelRegistro.setVisible(false);
        // vuelve a mostrar los componentes de login
        txtFLegajo.setVisible(true);
        btnIngresar.setVisible(true);
        lblSubtitulo.setVisible(true);
        // limpia el campo legajo para que ingrese de nuevo
        txtFLegajo.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        controlador.Controlador ctrl = new controlador.Controlador();
        new VentanaRegistroIngresar(ctrl).setVisible(true);});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnResgistrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNotenescuenta;
    private javax.swing.JLabel lblRegstrate;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTituloIngreso;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtFLegajo;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
