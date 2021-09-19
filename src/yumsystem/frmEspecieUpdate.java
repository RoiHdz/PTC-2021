package yumsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class frmEspecieUpdate extends javax.swing.JFrame {

    /**
     * Creates new form frmEspecie
     */
    public frmEspecieUpdate() {
        initComponents();
        setLocationRelativeTo(null);
        this.lbID.setText(controlador.EspecieConfigC.extraerIDMax());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEspecie = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel3 = new javax.swing.JLabel();
        txtGerminacion = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rSPanelMaterialImage1 = new RSMaterialComponent.RSPanelMaterialImage();
        rSButtonMaterialOne1 = new RSMaterialComponent.RSButtonMaterialOne();
        rSButtonMaterialOne2 = new RSMaterialComponent.RSButtonMaterialOne();
        rSButtonMaterialOne3 = new RSMaterialComponent.RSButtonMaterialOne();
        txtPlantacion = new RSMaterialComponent.RSTextFieldMaterial();
        txtRiego = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCosecha = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel11 = new javax.swing.JLabel();
        cmbTemporada = new RSMaterialComponent.RSComboBox();
        cmbEstado = new RSMaterialComponent.RSComboBox();
        lbID = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel2 = new javax.swing.JLabel();
        txtVariacion = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 160, 95));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de la especie:");

        txtEspecie.setBackground(new java.awt.Color(242, 242, 242));
        txtEspecie.setForeground(new java.awt.Color(0, 0, 0));
        txtEspecie.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtEspecie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspecie.setPhColor(new java.awt.Color(102, 102, 102));
        txtEspecie.setPlaceholder("Nombre de especie");
        txtEspecie.setSelectionColor(new java.awt.Color(0, 114, 81));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>Dias de germinacion:<html>");

        txtGerminacion.setBackground(new java.awt.Color(242, 242, 242));
        txtGerminacion.setForeground(new java.awt.Color(0, 0, 0));
        txtGerminacion.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtGerminacion.setPhColor(new java.awt.Color(102, 102, 102));
        txtGerminacion.setPlaceholder("30");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("<html>Marco de plantacion:<html>");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("<html>Dias de cosecha:<html>");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Foto de la especie:");

        rSPanelMaterialImage1.setImagen(null);
        rSPanelMaterialImage1.setShadowBottom(false);
        rSPanelMaterialImage1.setShadowLeft(false);
        rSPanelMaterialImage1.setShadowRight(false);
        rSPanelMaterialImage1.setShadowTop(false);

        javax.swing.GroupLayout rSPanelMaterialImage1Layout = new javax.swing.GroupLayout(rSPanelMaterialImage1);
        rSPanelMaterialImage1.setLayout(rSPanelMaterialImage1Layout);
        rSPanelMaterialImage1Layout.setHorizontalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelMaterialImage1Layout.setVerticalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        rSButtonMaterialOne1.setBackground(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne1.setText("Cancelar");
        rSButtonMaterialOne1.setBackgroundHover(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMaterialOne1MouseClicked(evt);
            }
        });

        rSButtonMaterialOne2.setBackground(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne2.setText("Guardar");
        rSButtonMaterialOne2.setBackgroundHover(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonMaterialOne2MouseClicked(evt);
            }
        });

        rSButtonMaterialOne3.setBackground(new java.awt.Color(0, 114, 81));
        rSButtonMaterialOne3.setText("Escoger imagen");
        rSButtonMaterialOne3.setBackgroundHover(new java.awt.Color(0, 114, 81));

        txtPlantacion.setBackground(new java.awt.Color(242, 242, 242));
        txtPlantacion.setForeground(new java.awt.Color(0, 0, 0));
        txtPlantacion.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtPlantacion.setPhColor(new java.awt.Color(102, 102, 102));
        txtPlantacion.setPlaceholder("30");

        txtRiego.setBackground(new java.awt.Color(242, 242, 242));
        txtRiego.setForeground(new java.awt.Color(0, 0, 0));
        txtRiego.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtRiego.setPhColor(new java.awt.Color(102, 102, 102));
        txtRiego.setPlaceholder("30");
        txtRiego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRiegoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("c\nm");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("<html>Dias de riego:<html>");

        txtCosecha.setBackground(new java.awt.Color(242, 242, 242));
        txtCosecha.setForeground(new java.awt.Color(0, 0, 0));
        txtCosecha.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtCosecha.setPhColor(new java.awt.Color(102, 102, 102));
        txtCosecha.setPlaceholder("30");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Temporada:");

        cmbTemporada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Invierno", "Verano" }));
        cmbTemporada.setColorArrow(new java.awt.Color(0, 114, 81));
        cmbTemporada.setColorFondo(new java.awt.Color(0, 114, 81));
        cmbTemporada.setColorSeleccion(new java.awt.Color(0, 114, 81));
        cmbTemporada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        cmbEstado.setColorArrow(new java.awt.Color(0, 114, 81));
        cmbEstado.setColorFondo(new java.awt.Color(0, 114, 81));
        cmbEstado.setColorSeleccion(new java.awt.Color(0, 114, 81));
        cmbEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbID.setEditable(false);
        lbID.setBackground(new java.awt.Color(242, 242, 242));
        lbID.setForeground(new java.awt.Color(0, 114, 81));
        lbID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Variacion:");

        txtVariacion.setBackground(new java.awt.Color(242, 242, 242));
        txtVariacion.setForeground(new java.awt.Color(0, 0, 0));
        txtVariacion.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtVariacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtVariacion.setPhColor(new java.awt.Color(102, 102, 102));
        txtVariacion.setPlaceholder("Variacion");
        txtVariacion.setSelectionColor(new java.awt.Color(0, 114, 81));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(189, 189, 189)
                        .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rSButtonMaterialOne2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonMaterialOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtPlantacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(98, 98, 98)
                                                .addComponent(jLabel4))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtGerminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtCosecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rSButtonMaterialOne3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGerminacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtRiego, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPlantacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(rSButtonMaterialOne3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialOne2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void rSButtonMaterialOne1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMaterialOne1MouseClicked
        this.dispose();
    }//GEN-LAST:event_rSButtonMaterialOne1MouseClicked

    private void rSButtonMaterialOne2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonMaterialOne2MouseClicked
        if (   txtEspecie.equals("") 
            || txtGerminacion.equals("")
            || txtCosecha.equals("")
            || txtRiego.equals("")
            || txtPlantacion.equals("")
            //|| (btnActivo  == null && btnInactivo == null)
            /*|| (btnVerano == null  && btnInvierno == null)*/) {
            
            JOptionPane.showMessageDialog(this, "Porfavor llene todos los datos");

        } else {
            modelo.EspecieConfig s1 = new modelo.EspecieConfig();
            /*Aplicar los set correspondientes al modelo*/
            s1.setId(Integer.parseInt(this.lbID.getText()));
            s1.setEspecie(this.txtEspecie.getText());
            s1.setGerminacion(Integer.parseInt(this.txtGerminacion.getText()));
            s1.setDiasCosecha(Integer.parseInt(this.txtCosecha.getText()));
            s1.setMarcoPlantacion(Integer.parseInt(this.txtPlantacion.getText()));
            s1.setDiasRiego(Integer.parseInt(this.txtRiego.getText()));
            s1.setFoto("Sin foto");
            s1.setEstado(this.cmbEstado.getSelectedItem().toString());
            s1.setTemporada(this.cmbTemporada.getSelectedItem().toString());
            s1.setVariacion(this.txtVariacion.getText());
            if (controlador.EspecieConfigC.isUpdate(s1)) {
                controlador.EspecieConfigC.setListar("");
                JOptionPane.showMessageDialog(this, "Se ingresaron los datos con exito");
                
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error");
            }
        }
    }//GEN-LAST:event_rSButtonMaterialOne2MouseClicked
    

  
    
    private void txtRiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRiegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRiegoActionPerformed

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
            java.util.logging.Logger.getLogger(frmEspecieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEspecieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEspecieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEspecieUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEspecieUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static RSMaterialComponent.RSComboBox cmbEstado;
    public static RSMaterialComponent.RSComboBox cmbTemporada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static RSMaterialComponent.RSTextFieldMaterial lbID;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne1;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne2;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne3;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage1;
    public static RSMaterialComponent.RSTextFieldMaterial txtCosecha;
    public static RSMaterialComponent.RSTextFieldMaterial txtEspecie;
    public static RSMaterialComponent.RSTextFieldMaterial txtGerminacion;
    public static RSMaterialComponent.RSTextFieldMaterial txtPlantacion;
    public static RSMaterialComponent.RSTextFieldMaterial txtRiego;
    public static RSMaterialComponent.RSTextFieldMaterial txtVariacion;
    // End of variables declaration//GEN-END:variables
}
