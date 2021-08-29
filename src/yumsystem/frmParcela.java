package yumsystem;

import javax.swing.JOptionPane;

public class frmParcela extends javax.swing.JFrame {

    public frmParcela() {
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
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new RSMaterialComponent.RSTextFieldMaterial();
        txtTipot = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialOne4 = new RSMaterialComponent.RSButtonMaterialOne();
        jLabel4 = new javax.swing.JLabel();
        txtPerimetro1 = new RSMaterialComponent.RSTextFieldMaterial();
        btnActivo = new RSMaterialComponent.RSRadioButtonMaterial();
        btnInactivo = new RSMaterialComponent.RSRadioButtonMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(149, 160, 95));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo Suelo");

        btnGuardar.setBackground(new java.awt.Color(0, 114, 81));
        btnGuardar.setText("Guardar");
        btnGuardar.setBackgroundHover(new java.awt.Color(0, 114, 81));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        lblId.setText(".");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Codigo de Parcela");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Estado");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(240, 240, 240));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtCodigo.setEnabled(false);
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.setPhColor(new java.awt.Color(102, 102, 102));
        txtCodigo.setPlaceholder("Codigo parcela");

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

        rSButtonMaterialOne4.setBackground(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne4.setText("cancelar");
        rSButtonMaterialOne4.setBackgroundHover(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMaterialOne4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Perimetro");

        txtPerimetro1.setBackground(new java.awt.Color(240, 240, 240));
        txtPerimetro1.setForeground(new java.awt.Color(0, 0, 0));
        txtPerimetro1.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtPerimetro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPerimetro1.setPhColor(new java.awt.Color(102, 102, 102));
        txtPerimetro1.setPlaceholder("Perimetro");

        buttonGroup1.add(btnActivo);
        btnActivo.setForeground(new java.awt.Color(0, 114, 81));
        btnActivo.setText("Activo");
        btnActivo.setColorCheck(new java.awt.Color(122, 201, 104));
        btnActivo.setColorUnCheck(new java.awt.Color(0, 114, 81));

        buttonGroup1.add(btnInactivo);
        btnInactivo.setForeground(new java.awt.Color(0, 114, 81));
        btnInactivo.setText("Inactivo");
        btnInactivo.setColorCheck(new java.awt.Color(122, 201, 104));
        btnInactivo.setColorUnCheck(new java.awt.Color(0, 114, 81));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(317, 317, 317))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTipot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPerimetro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonMaterialOne4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPerimetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialOne4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        /*Cambiar el modelo*/
        modelo.Parcela s = new modelo.Parcela();
        /*Aplicar los set correspondientes al modelo*/
        s.setPerimetro(Double.parseDouble(this.txtPerimetro1.getText()));
        s.setTipoTierra(this.txtTipot.getText());
        if (btnActivo.isSelected() == true) {
            s.setEstado("Activo");
        }
        else if (btnInactivo.isSelected()==true) {
            s.setEstado("Inactivo");
        }
        /*Cambiar el controlador LaborC*/
        if (controlador.ParcelaC.isRegister(s)) {
            /*Cambiar el controlador LaborC*/
            controlador.ParcelaC.setListar("");
            JOptionPane.showMessageDialog(this, "Exitoso");
        }
        else{
            JOptionPane.showMessageDialog(this, "Error");
        }
        txtCodigo.setText(null);
        txtTipot.setText(null);
        txtCodigo.setText(null);
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void txtTipotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipotActionPerformed

    private void rSButtonMaterialOne4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMaterialOne4MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_rSButtonMaterialOne4MouseClicked

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
            java.util.logging.Logger.getLogger(frmParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmParcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmParcela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSRadioButtonMaterial btnActivo;
    public RSMaterialComponent.RSButtonMaterialOne btnGuardar;
    private RSMaterialComponent.RSRadioButtonMaterial btnInactivo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblId;
    public RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne4;
    public RSMaterialComponent.RSTextFieldMaterial txtCodigo;
    public RSMaterialComponent.RSTextFieldMaterial txtPerimetro1;
    public RSMaterialComponent.RSTextFieldMaterial txtTipot;
    // End of variables declaration//GEN-END:variables
}
