/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.ui;

import java.awt.event.WindowEvent;

/**
 *
 * @author Susana
 */
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    public Factura() {
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

        jlbl_factura = new javax.swing.JLabel();
        jlbl_nombreyapellido = new javax.swing.JLabel();
        jtxt_nombreyapellido = new javax.swing.JTextField();
        jlbl_fechadeemision = new javax.swing.JLabel();
        jtxt_fechadeemision = new javax.swing.JTextField();
        jlbl_detallefactura = new javax.swing.JLabel();
        jtxt_detallefactura = new javax.swing.JTextField();
        jlbl_cantidad = new javax.swing.JLabel();
        jspn_unodostrescuatcincseisietochonuevediez = new javax.swing.JSpinner();
        jlbl_preciounitario = new javax.swing.JLabel();
        jtxt_preciounitario = new javax.swing.JTextField();
        jlbl_precioTotal = new javax.swing.JLabel();
        jtxt_precioTotal = new javax.swing.JTextField();
        jbtn_aceptar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_factura.setText("Factura");

        jlbl_nombreyapellido.setText("Nombre y Apellido:");

        jlbl_fechadeemision.setText("Fecha de Emisión:");

        jlbl_detallefactura.setText("Detalle Factura:");

        jlbl_cantidad.setText("Cantidad:");

        jlbl_preciounitario.setText("PrecioUnitario:");

        jlbl_precioTotal.setText("Precio Total:");

        jbtn_aceptar.setText("Aceptar");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        jbtn_cancelar.setText("Cancelar");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_factura)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_nombreyapellido)
                                    .addComponent(jlbl_fechadeemision)
                                    .addComponent(jlbl_detallefactura)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbl_cantidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jspn_unodostrescuatcincseisietochonuevediez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_nombreyapellido)
                                    .addComponent(jtxt_fechadeemision)
                                    .addComponent(jtxt_detallefactura)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbl_preciounitario)
                                            .addComponent(jlbl_precioTotal))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxt_preciounitario)
                                            .addComponent(jtxt_precioTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlbl_factura)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_nombreyapellido)
                    .addComponent(jtxt_nombreyapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_fechadeemision)
                    .addComponent(jtxt_fechadeemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_detallefactura)
                    .addComponent(jtxt_detallefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_cantidad)
                    .addComponent(jspn_unodostrescuatcincseisietochonuevediez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_preciounitario)
                    .addComponent(jtxt_preciounitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_precioTotal)
                    .addComponent(jtxt_precioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_aceptar)
                    .addComponent(jbtn_cancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        if( jtxt_nombreyapellido != null && jtxt_fechadeemision != null && jtxt_detallefactura != null && jspn_unodostrescuatcincseisietochonuevediez != null && jtxt_preciounitario != null && jtxt_precioTotal != null)
            
      System.out.println("No se puede guardar");
    }//GEN-LAST:event_jbtn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JLabel jlbl_cantidad;
    private javax.swing.JLabel jlbl_detallefactura;
    private javax.swing.JLabel jlbl_factura;
    private javax.swing.JLabel jlbl_fechadeemision;
    private javax.swing.JLabel jlbl_nombreyapellido;
    private javax.swing.JLabel jlbl_precioTotal;
    private javax.swing.JLabel jlbl_preciounitario;
    private javax.swing.JSpinner jspn_unodostrescuatcincseisietochonuevediez;
    private javax.swing.JTextField jtxt_detallefactura;
    private javax.swing.JTextField jtxt_fechadeemision;
    private javax.swing.JTextField jtxt_nombreyapellido;
    private javax.swing.JTextField jtxt_precioTotal;
    private javax.swing.JTextField jtxt_preciounitario;
    // End of variables declaration//GEN-END:variables
}