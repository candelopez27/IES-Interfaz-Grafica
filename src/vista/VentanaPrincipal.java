/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    /**
     * Creates new form VentanaPricipal
     */
    public VentanaPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        jPanelIzquierdo = new javax.swing.JPanel();
        lblIniciales = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        button1 = new java.awt.Button();
        button3 = new java.awt.Button();
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
        jPanelIzquierdo.setLayout(new javax.swing.BoxLayout(jPanelIzquierdo, javax.swing.BoxLayout.Y_AXIS));

        lblIniciales.setText("\"\"");
        jPanelIzquierdo.add(lblIniciales);

        lblNombre.setText("Nombre:");
        jPanelIzquierdo.add(lblNombre);

        lblLegajo.setText("Legajo:");
        jPanelIzquierdo.add(lblLegajo);

        lblCarrera.setText("Carrera");
        jPanelIzquierdo.add(lblCarrera);

        lblIngreso.setText("Ingreso:");
        jPanelIzquierdo.add(lblIngreso);
        jPanelIzquierdo.add(jSeparator1);

        button1.setLabel("button1");
        jPanelIzquierdo.add(button1);

        button3.setLabel("button3");
        jPanelIzquierdo.add(button3);

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.WEST);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JMenuItem itemAprobado;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemSituacion;
    private javax.swing.JMenuItem itemenRiesgo;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuReporte;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblIniciales;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
