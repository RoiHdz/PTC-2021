package yumsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class frmEspecie extends javax.swing.JFrame {

    /**
     * Creates new form frmEspecie
     */
    public frmEspecie() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel6 = new javax.swing.JLabel();
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
        btnVerano = new RSMaterialComponent.RSRadioButtonMaterial();
        btnInvierno = new RSMaterialComponent.RSRadioButtonMaterial();
        jLabel11 = new javax.swing.JLabel();
        btnActivo = new RSMaterialComponent.RSRadioButtonMaterial();
        btnInactivo = new RSMaterialComponent.RSRadioButtonMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(149, 160, 95));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de la especie:");

        txtEspecie.setBackground(new java.awt.Color(242, 242, 242));
        txtEspecie.setForeground(new java.awt.Color(0, 0, 0));
        txtEspecie.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtEspecie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEspecie.setPhColor(new java.awt.Color(102, 102, 102));
        txtEspecie.setPlaceholder("Nombre de especie");
        txtEspecie.setSelectionColor(new java.awt.Color(0, 114, 81));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>Dias de germinacion:<html>");

        txtGerminacion.setBackground(new java.awt.Color(242, 242, 242));
        txtGerminacion.setForeground(new java.awt.Color(0, 0, 0));
        txtGerminacion.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtGerminacion.setPhColor(new java.awt.Color(102, 102, 102));
        txtGerminacion.setPlaceholder("30");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("<html>Marco de plantacion:<html>");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("cm");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("<html>Dias de cosecha:<html>");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("c\nm");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("<html>Dias de riego:<html>");

        txtCosecha.setBackground(new java.awt.Color(242, 242, 242));
        txtCosecha.setForeground(new java.awt.Color(0, 0, 0));
        txtCosecha.setColorMaterial(new java.awt.Color(0, 114, 81));
        txtCosecha.setPhColor(new java.awt.Color(102, 102, 102));
        txtCosecha.setPlaceholder("30");

        buttonGroup1.add(btnVerano);
        btnVerano.setForeground(new java.awt.Color(0, 114, 81));
        btnVerano.setText("Verano");
        btnVerano.setColorCheck(new java.awt.Color(122, 201, 104));
        btnVerano.setColorUnCheck(new java.awt.Color(0, 114, 81));

        buttonGroup1.add(btnInvierno);
        btnInvierno.setForeground(new java.awt.Color(0, 114, 81));
        btnInvierno.setText("Invierno");
        btnInvierno.setColorCheck(new java.awt.Color(122, 201, 104));
        btnInvierno.setColorUnCheck(new java.awt.Color(0, 114, 81));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Temporada:");

        buttonGroup2.add(btnActivo);
        btnActivo.setForeground(new java.awt.Color(0, 114, 81));
        btnActivo.setText("Activo");
        btnActivo.setColorCheck(new java.awt.Color(122, 201, 104));
        btnActivo.setColorUnCheck(new java.awt.Color(0, 114, 81));

        buttonGroup2.add(btnInactivo);
        btnInactivo.setForeground(new java.awt.Color(0, 114, 81));
        btnInactivo.setText("Inactivo");
        btnInactivo.setColorCheck(new java.awt.Color(122, 201, 104));
        btnInactivo.setColorUnCheck(new java.awt.Color(0, 114, 81));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
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
                            .addComponent(txtEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtGerminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCosecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSButtonMaterialOne3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerano, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(226, 226, 226)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rSButtonMaterialOne2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonMaterialOne1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1))
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerano, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
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
            modelo.EspecieConfig s = new modelo.EspecieConfig();
            /*Aplicar los set correspondientes al modelo*/
            s.setEspecie(this.txtEspecie.getText());
            s.setGerminacion(Integer.parseInt(this.txtGerminacion.getText()));
            s.setDiasCosecha(Integer.parseInt(this.txtCosecha.getText()));
            s.setMarcoPlantacion(Integer.parseInt(this.txtPlantacion.getText()));
            s.setDiasRiego(Integer.parseInt(this.txtRiego.getText()));
            s.setFoto("Sin foto");
            if (btnInvierno.isSelected() == true) {
                s.setTemporada("Invierno");
            }
            else if(btnVerano.isSelected() == true){
                s.setTemporada("Verano");
            }
            if (btnActivo.isSelected() == true) {
                s.setEstado("Activo");
            } else if (btnInactivo.isSelected() == true) {
                s.setEstado("Inactivo");
            }
            if (controlador.EspecieConfigC.isRegister(s)) {
                controlador.EspecieConfigC.setListar("");
                JOptionPane.showMessageDialog(this, "Se ingresaron los datos con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un error");
            }
        }
    }//GEN-LAST:event_rSButtonMaterialOne2MouseClicked
    
    public void limpiar(){
        txtEspecie.setText(null);
        txtGerminacion.setText(null);
        txtCosecha.setText(null);
        txtPlantacion.setText(null);
        btnInvierno.setSelected(false);
        btnVerano.isSelected();
        btnActivo.isSelected();
        btnInactivo.setSelected(false);
        txtRiego.setText(null);
    }
    
    private void txtRiegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRiegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRiegoActionPerformed

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
            java.util.logging.Logger.getLogger(frmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEspecie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSRadioButtonMaterial btnActivo;
    private RSMaterialComponent.RSRadioButtonMaterial btnInactivo;
    private RSMaterialComponent.RSRadioButtonMaterial btnInvierno;
    private RSMaterialComponent.RSRadioButtonMaterial btnVerano;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne1;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne2;
    private RSMaterialComponent.RSButtonMaterialOne rSButtonMaterialOne3;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage1;
    private RSMaterialComponent.RSTextFieldMaterial txtCosecha;
    private RSMaterialComponent.RSTextFieldMaterial txtEspecie;
    private RSMaterialComponent.RSTextFieldMaterial txtGerminacion;
    private RSMaterialComponent.RSTextFieldMaterial txtPlantacion;
    private RSMaterialComponent.RSTextFieldMaterial txtRiego;
    // End of variables declaration//GEN-END:variables
}
