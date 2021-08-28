/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelPrincipal;

import subPanel.pnlPersonal2;
import subPanel.pnlPersonal1;
import clase.CambiaPanel;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Rodri
 */
public class pnlPersonal extends javax.swing.JPanel {

    /**
     * Creates new form pnlPersonal
     */
    public pnlPersonal() {
        initComponents();
        
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlPersonal1());
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
        jPanel4 = new javax.swing.JPanel();
        btnPersonal = new javax.swing.JPanel();
        lblPersonal = new javax.swing.JLabel();
        btnLabor = new javax.swing.JPanel();
        lblLabor = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 242));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(225, 232, 193));
        jPanel2.setPreferredSize(new java.awt.Dimension(725, 50));

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));

        btnPersonal.setBackground(new java.awt.Color(242, 242, 242));
        btnPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPersonalMouseEntered(evt);
            }
        });

        lblPersonal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPersonal.setForeground(new java.awt.Color(51, 51, 55));
        lblPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonal.setText("Personal");
        lblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPersonalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPersonalLayout = new javax.swing.GroupLayout(btnPersonal);
        btnPersonal.setLayout(btnPersonalLayout);
        btnPersonalLayout.setHorizontalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        btnPersonalLayout.setVerticalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPersonalLayout.createSequentialGroup()
                .addComponent(lblPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnLabor.setBackground(new java.awt.Color(242, 242, 242));

        lblLabor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLabor.setForeground(new java.awt.Color(51, 51, 55));
        lblLabor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLabor.setText("Registro");
        lblLabor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLaborMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLaborMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLaborMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLaborLayout = new javax.swing.GroupLayout(btnLabor);
        btnLabor.setLayout(btnLaborLayout);
        btnLaborLayout.setHorizontalGroup(
            btnLaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLaborLayout.createSequentialGroup()
                .addComponent(lblLabor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnLaborLayout.setVerticalGroup(
            btnLaborLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLaborLayout.createSequentialGroup()
                .addComponent(lblLabor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pnlContainer.setBackground(new java.awt.Color(225, 232, 193));
        pnlContainer.setLayout(new javax.swing.BoxLayout(pnlContainer, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(pnlContainer, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblLaborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLaborMouseClicked
        new CambiaPanel(pnlContainer, new pnlPersonal2());
    }//GEN-LAST:event_lblLaborMouseClicked

    private void lblLaborMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLaborMouseEntered
        cambioColor(btnLabor, new Color(204,204,204));
    }//GEN-LAST:event_lblLaborMouseEntered

    private void lblLaborMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLaborMouseExited
        cambioColor(btnLabor, new Color(242,242,242));
    }//GEN-LAST:event_lblLaborMouseExited

    private void lblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseClicked
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlPersonal1());
    }//GEN-LAST:event_lblPersonalMouseClicked

    private void lblPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseEntered
        cambioColor(btnPersonal, new Color(204,204,204));
    }//GEN-LAST:event_lblPersonalMouseEntered

    private void lblPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseExited
        cambioColor(btnPersonal, new Color(242,242,242));
    }//GEN-LAST:event_lblPersonalMouseExited

    private void btnPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPersonalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPersonalMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLabor;
    private javax.swing.JPanel btnPersonal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblLabor;
    private javax.swing.JLabel lblPersonal;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
