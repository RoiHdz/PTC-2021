package yumsystem;

import javax.swing.JOptionPane;
import modelo.Parcela;

public class frmParcelaActualizar extends javax.swing.JFrame {

    public frmParcelaActualizar() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialOne();
        lblcodigoParcela = new javax.swing.JLabel();
        txtTipot = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialOne4 = new RSMaterialComponent.RSButtonMaterialOne();
        jLabel4 = new javax.swing.JLabel();
        txtPerimetro1 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel5 = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        cmbEstado = new RSMaterialComponent.RSComboBox();
        lbID = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 160, 95));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo Suelo:");

        btnGuardar.setBackground(new java.awt.Color(0, 114, 81));
        btnGuardar.setText("Actualizar");
        btnGuardar.setBackgroundHover(new java.awt.Color(0, 114, 81));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblcodigoParcela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcodigoParcela.setText("Codigo de Parcela:");

        txtTipot.setBackground(new java.awt.Color(240, 240, 240));
        txtTipot.setForeground(new java.awt.Color(0, 0, 0));
        txtTipot.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtTipot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTipot.setPhColor(new java.awt.Color(102, 102, 102));
        txtTipot.setPlaceholder("Tipo de Suelo");
        txtTipot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipotActionPerformed(evt);
            }
        });
        txtTipot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipotKeyTyped(evt);
            }
        });

        rSButtonMaterialOne4.setBackground(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne4.setText("Cancelar");
        rSButtonMaterialOne4.setBackgroundHover(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMaterialOne4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Perimetro:");

        txtPerimetro1.setBackground(new java.awt.Color(240, 240, 240));
        txtPerimetro1.setForeground(new java.awt.Color(0, 0, 0));
        txtPerimetro1.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtPerimetro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPerimetro1.setPhColor(new java.awt.Color(102, 102, 102));
        txtPerimetro1.setPlaceholder("Perimetro");
        txtPerimetro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPerimetro1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        lblRegistro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(0, 114, 81));
        lblRegistro.setText("ACTUALIZAR PARCELA");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        cmbEstado.setColorArrow(new java.awt.Color(0, 114, 81));
        cmbEstado.setColorFondo(new java.awt.Color(0, 114, 81));
        cmbEstado.setColorSeleccion(new java.awt.Color(0, 114, 81));
        cmbEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbID.setEditable(false);
        lbID.setBackground(new java.awt.Color(242, 242, 242));
        lbID.setForeground(new java.awt.Color(0, 114, 81));
        lbID.setColorMaterial(new java.awt.Color(0, 114, 81));
        lbID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbID.setPhColor(new java.awt.Color(102, 102, 102));
        lbID.setPlaceholder("ID");
        lbID.setSelectionColor(new java.awt.Color(0, 114, 81));
        lbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 325, Short.MAX_VALUE))
                                    .addComponent(txtTipot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPerimetro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonMaterialOne4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcodigoParcela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(lblRegistro))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel5)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcodigoParcela)
                    .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPerimetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialOne4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(107, 107, 107)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        if (txtPerimetro1.getText().equals("") || txtTipot.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Porfavor llene todos los datos");

        } else {
            /*Cambiar el modelo*/
            modelo.Parcela act = new modelo.Parcela();
            /*Aplicar los set correspondientes al modelo*/
            act.setCodigoParcela(Integer.parseInt(this.lbID.getText()));
            act.setPerimetro(Double.parseDouble(this.txtPerimetro1.getText()));
            act.setTipoTierra(this.txtTipot.getText());
            act.setEstado(this.cmbEstado.getSelectedItem().toString());
            /*Cambiar el controlador LaborC*/
            if (controlador.ParcelaC.isUpdate(act)) {
                /*Cambiar el controlador LaborC*/
                controlador.ParcelaC.setListar("");
                JOptionPane.showMessageDialog(this, "Datos Actualizados con Exito");
            } else {
                JOptionPane.showMessageDialog(this, "Error al Actualizar Porfavor llene todos los datos");
            }

        }

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void txtTipotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipotActionPerformed

    private void rSButtonMaterialOne4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMaterialOne4MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_rSButtonMaterialOne4MouseClicked

    private void txtPerimetro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerimetro1KeyTyped
        // validacion solo numeros

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {

            evt.consume();
        }

        /*char c= evt.getKeyChar();
       if(c<'0' ||c>'9')  evt.consume(); */

    }//GEN-LAST:event_txtPerimetro1KeyTyped

    private void txtTipotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipotKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z') {
            evt.consume();
        }

    }//GEN-LAST:event_txtTipotKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void lbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbIDActionPerformed

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
            java.util.logging.Logger.getLogger(frmParcelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmParcelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmParcelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmParcelaActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmParcelaActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonMaterialOne btnGuardar;
    public static javax.swing.ButtonGroup buttonGroup1;
    public static RSMaterialComponent.RSComboBox cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static RSMaterialComponent.RSTextFieldMaterial lbID;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblcodigoParcela;
    public RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne4;
    public static RSMaterialComponent.RSTextFieldMaterial txtPerimetro1;
    public static RSMaterialComponent.RSTextFieldMaterial txtTipot;
    // End of variables declaration//GEN-END:variables
}
