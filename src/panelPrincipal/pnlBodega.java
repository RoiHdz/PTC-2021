/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package panelPrincipal;

import subPanel.pnlBodega4;
import subPanel.pnlBodega2;
import subPanel.pnlBodega1;
import subPanel.pnlBodega3;
import clase.CambiaPanel;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Rodri
 */
public class pnlBodega extends javax.swing.JPanel {

    /** Creates new form pnlBodega */
    public pnlBodega() {
        initComponents();
        
        new CambiaPanel(pnlContainer, new pnlBodega1());
    }

    
    //Funcion Para el cambio de color al mantener y soltar un elemento
    public void cambioColor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMaquinaria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGeneral = new javax.swing.JPanel();
        lblEspecies = new javax.swing.JLabel();
        btnFaq = new javax.swing.JPanel();
        lblMaquinaria = new javax.swing.JLabel();
        btnCosech = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(225, 232, 193));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(225, 232, 193));
        jPanel1.setPreferredSize(new java.awt.Dimension(725, 50));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 50));

        btnMaquinaria.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 55));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bodega Maquinaria");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMaquinariaLayout = new javax.swing.GroupLayout(btnMaquinaria);
        btnMaquinaria.setLayout(btnMaquinariaLayout);
        btnMaquinariaLayout.setHorizontalGroup(
            btnMaquinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaquinariaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnMaquinariaLayout.setVerticalGroup(
            btnMaquinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnGeneral.setBackground(new java.awt.Color(242, 242, 242));

        lblEspecies.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEspecies.setForeground(new java.awt.Color(51, 51, 55));
        lblEspecies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecies.setText("Bodega General");
        lblEspecies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEspeciesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEspeciesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEspeciesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGeneralLayout = new javax.swing.GroupLayout(btnGeneral);
        btnGeneral.setLayout(btnGeneralLayout);
        btnGeneralLayout.setHorizontalGroup(
            btnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEspecies, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        btnGeneralLayout.setVerticalGroup(
            btnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEspecies, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnFaq.setBackground(new java.awt.Color(242, 242, 242));

        lblMaquinaria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaquinaria.setForeground(new java.awt.Color(51, 51, 55));
        lblMaquinaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaquinaria.setText("Bodega FAQ");
        lblMaquinaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaquinariaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMaquinariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMaquinariaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnFaqLayout = new javax.swing.GroupLayout(btnFaq);
        btnFaq.setLayout(btnFaqLayout);
        btnFaqLayout.setHorizontalGroup(
            btnFaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFaqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFaqLayout.setVerticalGroup(
            btnFaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFaqLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCosech.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 55));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bodega cosecha");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCosechLayout = new javax.swing.GroupLayout(btnCosech);
        btnCosech.setLayout(btnCosechLayout);
        btnCosechLayout.setHorizontalGroup(
            btnCosechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCosechLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCosechLayout.setVerticalGroup(
            btnCosechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(btnFaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCosech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnFaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCosech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlContainer.setBackground(new java.awt.Color(225, 232, 193));
        pnlContainer.setLayout(new javax.swing.BoxLayout(pnlContainer, javax.swing.BoxLayout.LINE_AXIS));
        add(pnlContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaquinariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaquinariaMouseClicked
        new CambiaPanel(pnlContainer, new pnlBodega3());
    }//GEN-LAST:event_lblMaquinariaMouseClicked

    private void lblMaquinariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaquinariaMouseEntered
        cambioColor(btnFaq, new Color(204,204,204));
    }//GEN-LAST:event_lblMaquinariaMouseEntered

    private void lblMaquinariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaquinariaMouseExited
        cambioColor(btnFaq, new Color(242,242,242));
    }//GEN-LAST:event_lblMaquinariaMouseExited

    private void lblEspeciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspeciesMouseClicked
        new CambiaPanel(pnlContainer, new pnlBodega1());
    }//GEN-LAST:event_lblEspeciesMouseClicked

    private void lblEspeciesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspeciesMouseEntered
        cambioColor(btnGeneral, new Color(204,204,204));
    }//GEN-LAST:event_lblEspeciesMouseEntered

    private void lblEspeciesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEspeciesMouseExited
       cambioColor(btnGeneral, new Color(242,242,242));
    }//GEN-LAST:event_lblEspeciesMouseExited

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        cambioColor(btnMaquinaria, new Color(242,242,242));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        cambioColor(btnMaquinaria, new Color(204,204,204));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new CambiaPanel(pnlContainer, new pnlBodega2());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        cambioColor(btnCosech, new Color(242,242,242));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        cambioColor(btnCosech, new Color(204,204,204));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new CambiaPanel(pnlContainer, new pnlBodega4());
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCosech;
    private javax.swing.JPanel btnFaq;
    private javax.swing.JPanel btnGeneral;
    private javax.swing.JPanel btnMaquinaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEspecies;
    private javax.swing.JLabel lblMaquinaria;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables

}
