/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controlador;
import modelo.Materia;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private controlador.Controlador controlador;
    /**
     * Creates new form VentanaPricipal
     */
    public VentanaPrincipal(Controlador controlador1) {
        initComponents();
        this.controlador = controlador1;
        configurarTabla();
        panelMaterias.add(panelBotones, java.awt.BorderLayout.NORTH);
        panelMaterias.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        panelMaterias.add(lstAlertas, java.awt.BorderLayout.SOUTH);
        btnInscribir.addActionListener(e -> accionInscribir());
        btnDarDeBaja.addActionListener(e -> accionDarDeBaja());
        btnCrearMat.addActionListener(e -> {
            CrearMateria dialogo = new CrearMateria(this, true, controlador);
            dialogo.setLocationRelativeTo(this);
            dialogo.setVisible(true);
            actualizarTabla();
        });
        inicializar();
    }
    

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        jPanelIzquierdo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLegajo = new javax.swing.JLabel();
        lblIniciales = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        btnNavegacion = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnCrearMat = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        btnDarDeBaja = new javax.swing.JButton();
        btnRegistrarNota = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();
        panelMaterias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lstAlertas = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelReportes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaReportes = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();
        jMenuReporte = new javax.swing.JMenu();
        itemSituacion = new javax.swing.JMenuItem();
        itemenRiesgo = new javax.swing.JMenuItem();
        itemAprobado = new javax.swing.JMenuItem();

        button2.setLabel("button2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Autogestión Estudiantil");

        jPanelIzquierdo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIzquierdo.setPreferredSize(new java.awt.Dimension(200, 0));

        lblLegajo.setText("Legajo:");

        lblIniciales.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblIniciales.setText("\"\"");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCarrera.setText("Carrera");

        lblIngreso.setText("Ingreso:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCarrera))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIngreso))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblNombre))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblIniciales, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblIniciales, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblLegajo)
                .addGap(18, 18, 18)
                .addComponent(lblCarrera)
                .addGap(18, 18, 18)
                .addComponent(lblIngreso)
                .addContainerGap())
        );

        btnReportes.setBackground(new java.awt.Color(153, 153, 153));
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(this::btnReportesActionPerformed);

        btnNavegacion.setBackground(new java.awt.Color(102, 102, 102));
        btnNavegacion.setFont(new java.awt.Font("Segoe UI Historic", 2, 18)); // NOI18N
        btnNavegacion.setText("Navegación");
        btnNavegacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelIzquierdoLayout = new javax.swing.GroupLayout(jPanelIzquierdo);
        jPanelIzquierdo.setLayout(jPanelIzquierdoLayout);
        jPanelIzquierdoLayout.setHorizontalGroup(
            jPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIzquierdoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
            .addGroup(jPanelIzquierdoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnNavegacion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIzquierdoLayout.setVerticalGroup(
            jPanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNavegacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        panelCentral.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel1.setText(" Materias y Reportes");

        btnCrearMat.setText("Crear Materia");
        btnCrearMat.addActionListener(this::btnCrearMatActionPerformed);
        panelBotones.add(btnCrearMat);

        btnInscribir.setBackground(new java.awt.Color(83, 74, 183));
        btnInscribir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(this::btnInscribirActionPerformed);
        panelBotones.add(btnInscribir);

        btnDarDeBaja.setBackground(new java.awt.Color(220, 50, 50));
        btnDarDeBaja.setText("Dar de baja");
        btnDarDeBaja.addActionListener(this::btnDarDeBajaActionPerformed);
        panelBotones.add(btnDarDeBaja);

        btnRegistrarNota.setBackground(new java.awt.Color(238, 237, 254));
        btnRegistrarNota.setForeground(new java.awt.Color(83, 74, 183));
        btnRegistrarNota.setText("Registrar nota");
        btnRegistrarNota.addActionListener(this::btnRegistrarNotaActionPerformed);
        panelBotones.add(btnRegistrarNota);

        btnNota.setBackground(new java.awt.Color(238, 237, 254));
        btnNota.setForeground(new java.awt.Color(83, 74, 183));
        btnNota.setText("Nota");
        btnNota.addActionListener(this::btnNotaActionPerformed);
        panelBotones.add(btnNota);

        panelMaterias.setBackground(new java.awt.Color(204, 204, 255));
        panelMaterias.setLayout(new java.awt.BorderLayout());

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Materia", "Condición", "Asistencia", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelMaterias.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAlertas.setViewportView(jList1);

        panelReportes.setBackground(new java.awt.Color(204, 204, 204));
        panelReportes.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setEnabled(false);
        jScrollPane2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        txtAreaReportes.setColumns(20);
        txtAreaReportes.setRows(5);
        jScrollPane2.setViewportView(txtAreaReportes);

        panelReportes.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lstAlertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lstAlertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        panelCentral.add(jPanel1, "card2");

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        jMenuArchivo.setText("Archivo");

        itemCerrar.setText("Cerrar");
        jMenuArchivo.add(itemCerrar);

        jMenuBar1.add(jMenuArchivo);

        jMenuReporte.setText("Reporte");

        itemSituacion.setText("Situacion general");
        itemSituacion.addActionListener(this::itemSituacionActionPerformed);
        jMenuReporte.add(itemSituacion);

        itemenRiesgo.setText("Materias en riesgo");
        itemenRiesgo.addActionListener(this::itemenRiesgoActionPerformed);
        jMenuReporte.add(itemenRiesgo);

        itemAprobado.setText("Materias aprobadas");
        jMenuReporte.add(itemAprobado);

        jMenuBar1.add(jMenuReporte);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMatActionPerformed
      
    }//GEN-LAST:event_btnCrearMatActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDarDeBajaActionPerformed

    private void btnRegistrarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNotaActionPerformed
             int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Seleccioná una materia de la tabla.");
            return;
        }
        String input = javax.swing.JOptionPane.showInputDialog(this,
            "Ingresá la nota (0-10):", "Registrar nota",
            javax.swing.JOptionPane.PLAIN_MESSAGE);
        if (input == null || input.isBlank()) return;
        try {
            double nota = Double.parseDouble(input);
            String codigo = controlador.getInscripciones().get(fila).getMateria().getCodigo();
            String error = controlador.registrarNota(codigo, nota);
            if (error != null) {
                javax.swing.JOptionPane.showMessageDialog(this, error, "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                actualizarTabla();
                javax.swing.JOptionPane.showMessageDialog(this, "Nota registrada.");
            }
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingresá un número válido.");
        }
    }//GEN-LAST:event_btnRegistrarNotaActionPerformed

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed
         int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Seleccioná una materia de la tabla.");
            return;
        }
        String[] opciones = {"Presente", "Ausente"};
        int respuesta = javax.swing.JOptionPane.showOptionDialog(this,
            "¿Asistió a clase?", "Registrar asistencia",
            javax.swing.JOptionPane.DEFAULT_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null, opciones, opciones[0]);
        if (respuesta == -1) return;
        boolean presente = (respuesta == 0);
        String codigo = controlador.getInscripciones().get(fila).getMateria().getCodigo();
        controlador.registrarAsistencia(codigo, presente);
        actualizarTabla();
        javax.swing.JOptionPane.showMessageDialog(this,
            presente ? "Asistencia registrada." : "Ausencia registrada.");
    }//GEN-LAST:event_btnNotaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
       mostrarReporteSituacion();
       java.awt.CardLayout cl = (java.awt.CardLayout) panelCentral.getLayout();
       cl.show(panelCentral, "card3");
    }//GEN-LAST:event_btnReportesActionPerformed

    private void itemSituacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSituacionActionPerformed
        mostrarReporteSituacion();
        java.awt.CardLayout cl = (java.awt.CardLayout) panelCentral.getLayout();
        cl.show(panelCentral, "card3");
    }//GEN-LAST:event_itemSituacionActionPerformed

    private void itemenRiesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemenRiesgoActionPerformed
       mostrarReporteRiesgo();
    java.awt.CardLayout cl = (java.awt.CardLayout) panelCentral.getLayout();
    cl.show(panelCentral, "card3");
    
    }//GEN-LAST:event_itemenRiesgoActionPerformed

    /**
     * @param args the command line arguments
     */

    // ── Inicialización ─────────────────────────────────────────────────────
    private void inicializar() {
       actualizarTabla();
       cargarPerfil();
    }

    // ── Actualizar la JTable ───────────────────────────────────────────────
    private void actualizarTabla() {
        javax.swing.table.DefaultTableModel modeloTabla =
             (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modeloTabla.setRowCount(0);

        for (modelo.InscripcionMateria insc : controlador.getInscripciones()) {
            modeloTabla.addRow(new Object[]{
                 insc.getMateria().getNombre(),
                 insc.getCondicion(),
                 String.format("%.0f%%", insc.getPorcentajeAsistencia()),
                 String.format("%.2f", insc.getPromedio())
             });
        }
         actualizarAlertas(); 
    }
    private void actualizarAlertas() {
     javax.swing.DefaultListModel<String> modelo = new javax.swing.DefaultListModel<>();
     for (modelo.InscripcionMateria ins : controlador.getMateriasCriticas()) {
        modelo.addElement(ins.getMateria().getNombre() +
        " - " + String.format("%.0f%%", ins.getPorcentajeAsistencia()));
    }
    jList1.setModel(modelo);
    }
    
   private void configurarTabla() {
        javax.swing.table.DefaultTableModel modeloTabla = 
            new javax.swing.table.DefaultTableModel(
                new Object[]{"Materia", "Condición", "Asistencia", "Promedio"}, 0
            ) {
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return String.class; // todas las columnas son String
                }
            };
        jTable1.setModel(modeloTabla);
   }

// ── Botón Inscribir ────────────────────────────────────────────────────
private void accionInscribir() {
   java.util.ArrayList<modelo.Materia> disponibles = controlador.getMateriasDisponibles();

    if (disponibles.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "No hay materias disponibles para inscribirse.",
            "Sin materias", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String[] opciones = new String[disponibles.size()];
    for (int i = 0; i < disponibles.size(); i++) {
        modelo.Materia m = disponibles.get(i);
        opciones[i] = m.getNombre() + " (Cuat. " + m.getCuatrimestre()
                    + " - Año " + m.getAnio() + ")";
    }

    String seleccion = (String) javax.swing.JOptionPane.showInputDialog(
        this,
        "Seleccioná una materia para inscribirte:",
        "Inscribir materia",
        javax.swing.JOptionPane.PLAIN_MESSAGE,
        null, opciones, opciones[0]
    );

    if (seleccion == null) return;

    int idx = java.util.Arrays.asList(opciones).indexOf(seleccion);
    modelo.Materia elegida = disponibles.get(idx);

    // el controlador se encarga de inscribir y guardar
    controlador.inscribirMateria(elegida.getNombre(), elegida.getCodigo(),
                                  elegida.getCuatrimestre(), elegida.getAnio());
    actualizarTabla();

    javax.swing.JOptionPane.showMessageDialog(this,
        "Te inscribiste en: " + elegida.getNombre(),
        "¡Inscripción exitosa!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMat;
    private javax.swing.JButton btnDarDeBaja;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JLabel btnNavegacion;
    private javax.swing.JButton btnNota;
    private javax.swing.JButton btnRegistrarNota;
    private javax.swing.JButton btnReportes;
    private java.awt.Button button2;
    private javax.swing.JMenuItem itemAprobado;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemSituacion;
    private javax.swing.JMenuItem itemenRiesgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblIniciales;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JScrollPane lstAlertas;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JTextArea txtAreaReportes;
    // End of variables declaration//GEN-END:variables

    private void accionDarDeBaja() {
       int fila = jTable1.getSelectedRow();
    if (fila == -1) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Seleccioná una materia de la tabla.");
        return;
    }
    String nombre = (String) jTable1.getValueAt(fila, 0);
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
        "¿Dar de baja \"" + nombre + "\"?", "Confirmar baja",
        javax.swing.JOptionPane.YES_NO_OPTION,
        javax.swing.JOptionPane.WARNING_MESSAGE);
    if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

    String codigo = controlador.getInscripciones().get(fila).getMateria().getCodigo();
    controlador.darDeBaja(codigo);
    actualizarTabla();
   }
   private void cargarPerfil() {
      modelo.Estudiante e = controlador.getEstudiante();
     if (e == null) return;
      String nombre = e.getNombre();
      String[] partes = nombre.split(" ");
      String iniciales = partes.length >= 2
       ? "" + partes[0].charAt(0) + partes[1].charAt(0)
       : "" + partes[0].charAt(0);
     lblIniciales.setText(iniciales.toUpperCase());
     lblNombre.setText(nombre);
     lblLegajo.setText("Legajo: " + e.getLegajo());
     lblCarrera.setText(e.getCarrera());
     lblIngreso.setText("Ingreso: " + e.getAnioIngreso());
    }
    private void mostrarReporteSituacion() {
    StringBuilder sb = new StringBuilder();
    sb.append("=== SITUACIÓN GENERAL ===\n\n");
    java.util.ArrayList<modelo.InscripcionMateria> inscripciones = controlador.getInscripciones();
    if (inscripciones.isEmpty()) {
        sb.append("No tenés materias inscriptas.");
    } else {
        for (modelo.InscripcionMateria ins : inscripciones) {
            sb.append("• ").append(ins.getMateria().getNombre())
              .append("\n  Condición: ").append(ins.getCondicion())
              .append("\n  Asistencia: ").append(String.format("%.0f%%", ins.getPorcentajeAsistencia()))
              .append("\n  Promedio: ").append(String.format("%.2f", ins.getPromedio()))
              .append("\n\n");
        }
        sb.append("Promedio general: ").append(String.format("%.2f", controlador.getPromedioGeneral()));
    }
    txtAreaReportes.setText(sb.toString());
    }

   private void mostrarReporteRiesgo() {
    StringBuilder sb = new StringBuilder();
    sb.append("=== MATERIAS EN RIESGO ===\n\n");
    java.util.ArrayList<modelo.InscripcionMateria> criticas = controlador.getMateriasCriticas();
    if (criticas.isEmpty()) {
        sb.append("No hay materias en riesgo.");
    } else {
        criticas.sort((a, b) -> Double.compare(
            a.getPorcentajeAsistencia(), b.getPorcentajeAsistencia()));
        for (modelo.InscripcionMateria ins : criticas) {
            sb.append("• ").append(ins.getMateria().getNombre())
              .append(" - Asistencia: ")
              .append(String.format("%.0f%%", ins.getPorcentajeAsistencia()))
              .append("\n");
        }
    }
    txtAreaReportes.setText(sb.toString());
}

   private void mostrarReporteAprobadas() {
    StringBuilder sb = new StringBuilder();
    sb.append("=== MATERIAS APROBADAS ===\n\n");
    java.util.ArrayList<modelo.InscripcionMateria> aprobadas = new java.util.ArrayList<>();
    for (modelo.InscripcionMateria ins : controlador.getInscripciones()) {
        if (ins.estaAprobada()) aprobadas.add(ins);
    }
    if (aprobadas.isEmpty()) {
        sb.append("No tenés materias aprobadas.");
    } else {
        double max = 0, min = 10, suma = 0;
        for (modelo.InscripcionMateria ins : aprobadas) {
            double prom = ins.getPromedio();
            if (prom > max) max = prom;
            if (prom < min) min = prom;
            suma += prom;
            sb.append("• ").append(ins.getMateria().getNombre())
              .append(" - Promedio: ").append(String.format("%.2f", prom))
              .append("\n");
        }
        sb.append("\nNota máxima: ").append(String.format("%.2f", max));
        sb.append("\nNota mínima: ").append(String.format("%.2f", min));
        sb.append("\nPromedio conjunto: ").append(String.format("%.2f", suma / aprobadas.size()));
    }
    txtAreaReportes.setText(sb.toString());
  }
}
