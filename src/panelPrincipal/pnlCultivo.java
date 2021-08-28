package panelPrincipal;

import subPanel.pnlCultivo3;
import subPanel.pnlCultivo2;
import subPanel.pnlCultivo5;
import subPanel.pnlCultivo4;
import subPanel.pnlCultivo1;
import clase.CambiaPanel;
import java.awt.Color;
import javax.swing.JPanel;

public class pnlCultivo extends javax.swing.JPanel {


    public pnlCultivo() {
        initComponents();
        
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlCultivo1());
    }
    
    //Funcion Para el cambio de color al mantener y soltar un elemento
    public void cambioColor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        btnNuevos = new javax.swing.JPanel();
        lblNuevos = new javax.swing.JLabel();
        btnRiego = new javax.swing.JPanel();
        lblRiego = new javax.swing.JLabel();
        btnFertilizante = new javax.swing.JPanel();
        lblFertilizante = new javax.swing.JLabel();
        btnCosecha = new javax.swing.JPanel();
        lblCosecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(725, 582));
        setLayout(new java.awt.BorderLayout());

        menu.setBackground(new java.awt.Color(225, 232, 193));
        menu.setPreferredSize(new java.awt.Dimension(725, 50));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistro.setBackground(new java.awt.Color(242, 242, 242));

        lblRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(51, 51, 55));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registro");
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistroLayout = new javax.swing.GroupLayout(btnRegistro);
        btnRegistro.setLayout(btnRegistroLayout);
        btnRegistroLayout.setHorizontalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnRegistroLayout.setVerticalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 120, -1));

        btnNuevos.setBackground(new java.awt.Color(242, 242, 242));
        btnNuevos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevosMouseEntered(evt);
            }
        });

        lblNuevos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNuevos.setForeground(new java.awt.Color(51, 51, 55));
        lblNuevos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevos.setText("Nuevos cultivos");
        lblNuevos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNuevosLayout = new javax.swing.GroupLayout(btnNuevos);
        btnNuevos.setLayout(btnNuevosLayout);
        btnNuevosLayout.setHorizontalGroup(
            btnNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNuevos, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        btnNuevosLayout.setVerticalGroup(
            btnNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNuevos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, -1));

        btnRiego.setBackground(new java.awt.Color(242, 242, 242));

        lblRiego.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRiego.setForeground(new java.awt.Color(51, 51, 55));
        lblRiego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRiego.setText("Cuaderno de riego");
        lblRiego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRiegoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRiegoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRiegoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRiegoLayout = new javax.swing.GroupLayout(btnRiego);
        btnRiego.setLayout(btnRiegoLayout);
        btnRiegoLayout.setHorizontalGroup(
            btnRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRiego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnRiegoLayout.setVerticalGroup(
            btnRiegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRiego, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnRiego, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 140, -1));

        btnFertilizante.setBackground(new java.awt.Color(242, 242, 242));

        lblFertilizante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFertilizante.setForeground(new java.awt.Color(51, 51, 55));
        lblFertilizante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFertilizante.setText("Fertilizante");
        lblFertilizante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFertilizanteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFertilizanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFertilizanteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnFertilizanteLayout = new javax.swing.GroupLayout(btnFertilizante);
        btnFertilizante.setLayout(btnFertilizanteLayout);
        btnFertilizanteLayout.setHorizontalGroup(
            btnFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnFertilizanteLayout.setVerticalGroup(
            btnFertilizanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFertilizante, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnFertilizante, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 50));

        btnCosecha.setBackground(new java.awt.Color(242, 242, 242));

        lblCosecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCosecha.setForeground(new java.awt.Color(51, 51, 55));
        lblCosecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCosecha.setText("Cosecha");
        lblCosecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCosechaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCosechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCosechaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCosechaLayout = new javax.swing.GroupLayout(btnCosecha);
        btnCosecha.setLayout(btnCosechaLayout);
        btnCosechaLayout.setHorizontalGroup(
            btnCosechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCosecha, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnCosechaLayout.setVerticalGroup(
            btnCosechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCosecha, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnCosecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 120, 50));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(menu, java.awt.BorderLayout.PAGE_START);

        pnlContainer.setBackground(new java.awt.Color(225, 232, 193));
        pnlContainer.setLayout(new javax.swing.BoxLayout(pnlContainer, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlContainer);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    /*  */
    private void lblNuevosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevosMouseClicked
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlCultivo1());
    }//GEN-LAST:event_lblNuevosMouseClicked

    private void lblNuevosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevosMouseEntered
        cambioColor(btnNuevos, new Color(204,204,204));
    }//GEN-LAST:event_lblNuevosMouseEntered

    private void lblNuevosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevosMouseExited
        cambioColor(btnNuevos, new Color(242,242,242));
    }//GEN-LAST:event_lblNuevosMouseExited

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlCultivo2());
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void lblRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseExited
        cambioColor(btnRegistro, new Color(242,242,242));
    }//GEN-LAST:event_lblRegistroMouseExited

    private void lblRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseEntered
        cambioColor(btnRegistro, new Color(204,204,204));
    }//GEN-LAST:event_lblRegistroMouseEntered

    private void lblRiegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiegoMouseExited
        cambioColor(btnRiego, new Color(242,242,242));
    }//GEN-LAST:event_lblRiegoMouseExited

    private void lblRiegoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiegoMouseEntered
        cambioColor(btnRiego, new Color(204,204,204));
    }//GEN-LAST:event_lblRiegoMouseEntered

    private void lblFertilizanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFertilizanteMouseExited
        cambioColor(btnFertilizante, new Color(242,242,242));
    }//GEN-LAST:event_lblFertilizanteMouseExited

    private void lblFertilizanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFertilizanteMouseEntered
        cambioColor(btnFertilizante, new Color(204,204,204));
    }//GEN-LAST:event_lblFertilizanteMouseEntered

    private void lblCosechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCosechaMouseExited
        cambioColor(btnCosecha, new Color(242,242,242));
    }//GEN-LAST:event_lblCosechaMouseExited

    private void lblCosechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCosechaMouseEntered
        cambioColor(btnCosecha, new Color(204,204,204));
    }//GEN-LAST:event_lblCosechaMouseEntered

    private void btnNuevosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevosMouseEntered

    private void lblRiegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiegoMouseClicked
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlCultivo3());
    }//GEN-LAST:event_lblRiegoMouseClicked

    private void lblCosechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCosechaMouseClicked
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlCultivo5());
    }//GEN-LAST:event_lblCosechaMouseClicked

    private void lblFertilizanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFertilizanteMouseClicked
        CambiaPanel cambiaPanel = new CambiaPanel(pnlContainer, new pnlCultivo4());
    }//GEN-LAST:event_lblFertilizanteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCosecha;
    private javax.swing.JPanel btnFertilizante;
    private javax.swing.JPanel btnNuevos;
    private javax.swing.JPanel btnRegistro;
    private javax.swing.JPanel btnRiego;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCosecha;
    private javax.swing.JLabel lblFertilizante;
    private javax.swing.JLabel lblNuevos;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblRiego;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
