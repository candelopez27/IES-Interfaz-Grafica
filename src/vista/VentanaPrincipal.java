/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private controlador.Controlador controlador;
    /**
     * Creates new form VentanaPricipal
     */
    public VentanaPrincipal() {
        initComponents();
        panelMaterias.add(panelBotones, java.awt.BorderLayout.NORTH);
        panelMaterias.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        panelMaterias.add(lstAlertas, java.awt.BorderLayout.SOUTH);
        btnDarDeBaja.addActionListener(e -> accionDarDeBaja());
        
    this.controlador = new controlador.Controlador();
    
    btnCrearMat.addActionListener(e -> {
        CrearMateria dialogo = new CrearMateria(this, true, controlador);
        dialogo.setVisible(true);
    });
    
    inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        button2 = new java.awt.Button();
        jPanelIzquierdo = new javax.swing.JPanel();
        lblIniciales = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        btnCrearMat = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        btnDarDeBaja = new javax.swing.JButton();
        btnRegistrarNota = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();
        panelReportes = new javax.swing.JPanel();
        panelMaterias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lstAlertas = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
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
        jPanelIzquierdo.setLayout(new java.awt.GridBagLayout());

        lblIniciales.setText("\"\"");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 0, 0, 0);
        jPanelIzquierdo.add(lblIniciales, gridBagConstraints);

        lblNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 7, 0, 0);
        jPanelIzquierdo.add(lblNombre, gridBagConstraints);

        lblLegajo.setText("Legajo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 7, 0, 0);
        jPanelIzquierdo.add(lblLegajo, gridBagConstraints);

        lblCarrera.setText("Carrera");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 7, 0, 0);
        jPanelIzquierdo.add(lblCarrera, gridBagConstraints);

        lblIngreso.setText("Ingreso:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 7, 0, 0);
        jPanelIzquierdo.add(lblIngreso, gridBagConstraints);

        jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(112, 44, 131, 67);
        jPanelIzquierdo.add(jButton1, gridBagConstraints);

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        panelCentral.setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnCrearMat.setText("Crear Materia");
        btnCrearMat.addActionListener(this::btnCrearMatActionPerformed);
        panelBotones.add(btnCrearMat);

        btnInscribir.setBackground(new java.awt.Color(83, 74, 183));
        btnInscribir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnInscribir.setText("Inscribir");
        panelBotones.add(btnInscribir);

        btnDarDeBaja.setBackground(new java.awt.Color(220, 50, 50));
        btnDarDeBaja.setText("Dar de baja");
        panelBotones.add(btnDarDeBaja);

        btnRegistrarNota.setBackground(new java.awt.Color(238, 237, 254));
        btnRegistrarNota.setForeground(new java.awt.Color(83, 74, 183));
        btnRegistrarNota.setText("Registrar nota");
        panelBotones.add(btnRegistrarNota);

        btnNota.setBackground(new java.awt.Color(238, 237, 254));
        btnNota.setForeground(new java.awt.Color(83, 74, 183));
        btnNota.setText("Nota");
        panelBotones.add(btnNota);

        panelReportes.setBackground(new java.awt.Color(153, 255, 51));
        panelBotones.add(panelReportes);

        jPanel1.add(panelBotones);

        panelMaterias.setBackground(new java.awt.Color(204, 204, 255));
        panelMaterias.setLayout(new java.awt.BorderLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
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

        panelMaterias.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(panelMaterias);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAlertas.setViewportView(jList1);

        jPanel1.add(lstAlertas);

        panelCentral.add(jPanel1, "card2");

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        jMenuArchivo.setText("Archivo");

        itemCerrar.setText("Cerrar");
        jMenuArchivo.add(itemCerrar);

        jMenuBar1.add(jMenuArchivo);

        jMenuReporte.setText("Reporte");

        itemSituacion.setText("Situacion general");
        jMenuReporte.add(itemSituacion);

        itemenRiesgo.setText("Materias en riesgo");
        jMenuReporte.add(itemenRiesgo);

        itemAprobado.setText("Materias aprobadas");
        jMenuReporte.add(itemAprobado);

        jMenuBar1.add(jMenuReporte);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMatActionPerformed
        CrearMateria dialogo = new CrearMateria(this, true, controlador);
    dialogo.setVisible(true);       
    }//GEN-LAST:event_btnCrearMatActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // ── Atributos ──────────────────────────────────────────────────────────
      private dao.MateriaDAO materiaDAO = new dao.MateriaDAO();
      private dao.InscripcionDAO inscripcionDAO = new dao.InscripcionDAO();
      private java.util.ArrayList<modelo.Materia> todasLasMaterias;
      private java.util.ArrayList<modelo.InscripcionMateria> inscripciones;

    // ── Inicialización ─────────────────────────────────────────────────────
       private void inicializar() {
    todasLasMaterias = materiaDAO.leerMaterias();
    inscripciones    = inscripcionDAO.cargarInscripciones(todasLasMaterias);
    actualizarTabla();
    btnInscribir.addActionListener(e -> accionInscribir());
    btnDarDeBaja.addActionListener(e -> accionDarDeBaja());
}

    // ── Actualizar la JTable ───────────────────────────────────────────────
    private void actualizarTabla() {
     javax.swing.table.DefaultTableModel modeloTabla =
        (javax.swing.table.DefaultTableModel) jTable1.getModel();
     modeloTabla.setRowCount(0);

    for (modelo.InscripcionMateria insc : inscripciones) {
        modeloTabla.addRow(new Object[]{
            insc.getMateria().getNombre(),
            insc.getCondicion(),
            String.format("%.0f%%", insc.getPorcentajeAsistencia()),
            String.format("%.2f", insc.getPromedio())
        });
    }
}

// ── Botón Inscribir ────────────────────────────────────────────────────
    private void accionInscribir() {
    // Códigos ya inscriptos
    java.util.ArrayList<String> codigosInscritos = new java.util.ArrayList<>();
    for (modelo.InscripcionMateria insc : inscripciones) {
        codigosInscritos.add(insc.getMateria().getCodigo());
    }

    // Materias disponibles (no inscriptas aún)
    java.util.ArrayList<modelo.Materia> disponibles = new java.util.ArrayList<>();
    for (modelo.Materia m : todasLasMaterias) {
        if (!codigosInscritos.contains(m.getCodigo())) {
            disponibles.add(m);
        }
    }

    if (disponibles.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "No hay materias disponibles para inscribirse.",
            "Sin materias", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Nombres para mostrar en el diálogo
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
        null,
        opciones,
        opciones[0]
    );

    if (seleccion == null) return; // canceló

    // Buscar la materia elegida por índice
    int idx = java.util.Arrays.asList(opciones).indexOf(seleccion);
    modelo.Materia materiaElegida = disponibles.get(idx);

    // Crear inscripción, guardar y actualizar tabla
    modelo.InscripcionMateria nueva = new modelo.InscripcionMateria(materiaElegida);
    inscripciones.add(nueva);
    inscripcionDAO.guardarInscripciones(inscripciones);
    actualizarTabla();

    javax.swing.JOptionPane.showMessageDialog(this,
        "Te inscribiste en: " + materiaElegida.getNombre(),
        "¡Inscripción exitosa!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    
}
    // ── Botón Dar de Baja ──────────────────────────────────────────────────
    private void accionDarDeBaja() {
    if (inscripciones.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "No tenés materias inscriptas.",
            "Sin inscripciones", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Armar opciones con las materias inscriptas
    String[] opciones = new String[inscripciones.size()];
    for (int i = 0; i < inscripciones.size(); i++) {
        modelo.Materia m = inscripciones.get(i).getMateria();
        opciones[i] = m.getNombre() + " (Cuat. " + m.getCuatrimestre()
                    + " - Año " + m.getAnio() + ")";
    }

    String seleccion = (String) javax.swing.JOptionPane.showInputDialog(
        this,
        "Seleccioná la materia de la que querés darte de baja:",
        "Dar de baja",
        javax.swing.JOptionPane.PLAIN_MESSAGE,
        null,
        opciones,
        opciones[0]
    );

    if (seleccion == null) return; // canceló

    int idx = java.util.Arrays.asList(opciones).indexOf(seleccion);
    modelo.InscripcionMateria aEliminar = inscripciones.get(idx);
    String nombreMateria = aEliminar.getMateria().getNombre();

    // Confirmar antes de eliminar
    int confirmar = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "¿Estás segura de que querés darte de baja de \"" + nombreMateria + "\"?\n"
        + "Se perderán las notas y asistencia registradas.",
        "Confirmar baja",
        javax.swing.JOptionPane.YES_NO_OPTION,
        javax.swing.JOptionPane.WARNING_MESSAGE
    );

    if (confirmar != javax.swing.JOptionPane.YES_OPTION) return;

    inscripciones.remove(idx);
    inscripcionDAO.guardarInscripciones(inscripciones);
    actualizarTabla();

    javax.swing.JOptionPane.showMessageDialog(this,
        "Te diste de baja de: " + nombreMateria,
        "Baja exitosa", javax.swing.JOptionPane.INFORMATION_MESSAGE);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMat;
    private javax.swing.JButton btnDarDeBaja;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnNota;
    private javax.swing.JButton btnRegistrarNota;
    private java.awt.Button button2;
    private javax.swing.JMenuItem itemAprobado;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemSituacion;
    private javax.swing.JMenuItem itemenRiesgo;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuReporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JScrollPane jScrollPane1;
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
    // End of variables declaration//GEN-END:variables
}
