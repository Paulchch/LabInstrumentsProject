/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calibraciones;

/**
 *
 * @author XPC
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instrumentoPanel = new javax.swing.JPanel();
        bttLimpiar = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        InstrumentoLabel = new javax.swing.JLabel();
        calibracionLabel = new javax.swing.JLabel();
        calibracionPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        medicionesLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtMediciones = new javax.swing.JTextField();
        busquedaLabel = new javax.swing.JLabel();
        busquedaPanel = new javax.swing.JPanel();
        numeroLabel2 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        bttReporte = new javax.swing.JButton();
        bttBuscar = new javax.swing.JButton();
        ListadoPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoLabel = new javax.swing.JLabel();
        guardarBtt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout instrumentoPanelLayout = new javax.swing.GroupLayout(instrumentoPanel);
        instrumentoPanel.setLayout(instrumentoPanelLayout);
        instrumentoPanelLayout.setHorizontalGroup(
            instrumentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        instrumentoPanelLayout.setVerticalGroup(
            instrumentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        bttLimpiar.setText("Limpiar");

        borrarButton.setText("Borrar");
        borrarButton.setEnabled(false);
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });

        InstrumentoLabel.setText("Instrumento");

        calibracionLabel.setText("Calibración");

        nameLabel.setText("Número");

        medicionesLabel.setText("Mediciones");

        fechaLabel.setText("Fecha");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtMediciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicionesActionPerformed(evt);
            }
        });

        busquedaLabel.setText("Búsqueda");

        javax.swing.GroupLayout calibracionPanelLayout = new javax.swing.GroupLayout(calibracionPanel);
        calibracionPanel.setLayout(calibracionPanelLayout);
        calibracionPanelLayout.setHorizontalGroup(
            calibracionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calibracionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calibracionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calibracionPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(calibracionPanelLayout.createSequentialGroup()
                        .addComponent(medicionesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMediciones, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(busquedaLabel))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        calibracionPanelLayout.setVerticalGroup(
            calibracionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calibracionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calibracionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(fechaLabel)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(calibracionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicionesLabel)
                    .addComponent(txtMediciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(busquedaLabel))
        );

        numeroLabel2.setText("Número");

        bttReporte.setText("Reporte");
        bttReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttReporteActionPerformed(evt);
            }
        });

        bttBuscar.setText("Buscar");

        javax.swing.GroupLayout busquedaPanelLayout = new javax.swing.GroupLayout(busquedaPanel);
        busquedaPanel.setLayout(busquedaPanelLayout);
        busquedaPanelLayout.setHorizontalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroLabel2)
                .addGap(28, 28, 28)
                .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttReporte)
                .addGap(18, 18, 18)
                .addComponent(bttBuscar)
                .addGap(83, 83, 83))
        );
        busquedaPanelLayout.setVerticalGroup(
            busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(busquedaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(busquedaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel2)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttReporte)
                    .addComponent(bttBuscar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ListadoPanelLayout = new javax.swing.GroupLayout(ListadoPanel);
        ListadoPanel.setLayout(ListadoPanelLayout);
        ListadoPanelLayout.setHorizontalGroup(
            ListadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        ListadoPanelLayout.setVerticalGroup(
            ListadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        listadoLabel.setText("Listado");

        guardarBtt.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(InstrumentoLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calibracionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(borrarButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(guardarBtt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttLimpiar)))
                        .addGap(105, 105, 105))
                    .addComponent(busquedaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calibracionLabel)
                            .addComponent(instrumentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listadoLabel)
                                    .addComponent(ListadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 66, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(InstrumentoLabel)
                .addGap(7, 7, 7)
                .addComponent(instrumentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calibracionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calibracionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttLimpiar)
                            .addComponent(guardarBtt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busquedaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listadoLabel)
                .addGap(7, 7, 7)
                .addComponent(ListadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed

    }//GEN-LAST:event_borrarButtonActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtMedicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicionesActionPerformed

    private void bttReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttReporteActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InstrumentoLabel;
    private javax.swing.JPanel ListadoPanel;
    public javax.swing.JButton borrarButton;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttLimpiar;
    private javax.swing.JButton bttReporte;
    private javax.swing.JLabel busquedaLabel;
    private javax.swing.JPanel busquedaPanel;
    private javax.swing.JLabel calibracionLabel;
    private javax.swing.JPanel calibracionPanel;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JButton guardarBtt;
    private javax.swing.JPanel instrumentoPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listadoLabel;
    private javax.swing.JLabel medicionesLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel numeroLabel2;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMediciones;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}