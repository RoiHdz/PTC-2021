package subPanel;

import controlador.EspecieConfigC;
import controlador.VariacionC;

public class pnlConfiguracion1 extends javax.swing.JPanel {

    public pnlConfiguracion1() {
        initComponents();
        EspecieConfigC c;
        EspecieConfigC.setListar("");
        VariacionC d;
        VariacionC.setListar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEspecies = new RSMaterialComponent.RSTableMetroCustom();
        btnAEspecie = new newscomponents.RSButtonFlat_new();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVariacion = new RSMaterialComponent.RSTableMetroCustom();
        btnAVariacion = new newscomponents.RSButtonFlat_new();

        setBackground(new java.awt.Color(225, 232, 193));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(35, 35, 35))); // NOI18N

        jScrollPane2.setToolTipText("Click derecho para editar o eliminar");

        tblEspecies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Especie", "Dias Germinacion", "Dias de Cosecha", "Dias de riego", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEspecies.setBackgoundHead(new java.awt.Color(91, 180, 98));
        tblEspecies.setBackgoundHover(new java.awt.Color(166, 196, 126));
        tblEspecies.setBorderHead(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblEspecies.setBorderRows(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblEspecies.setColorBorderHead(new java.awt.Color(91, 180, 98));
        tblEspecies.setColorBorderRows(new java.awt.Color(91, 180, 98));
        tblEspecies.setColorPrimaryText(new java.awt.Color(91, 180, 98));
        tblEspecies.setColorSecondary(new java.awt.Color(143, 217, 116));
        tblEspecies.setColorSecundaryText(new java.awt.Color(0, 102, 255));
        tblEspecies.setGridColor(new java.awt.Color(91, 180, 98));
        tblEspecies.setSelectionBackground(new java.awt.Color(166, 196, 126));
        jScrollPane2.setViewportView(tblEspecies);

        btnAEspecie.setBackground(new java.awt.Color(0, 114, 81));
        btnAEspecie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_joyent_30px_2.png"))); // NOI18N
        btnAEspecie.setText("Agregar especie");
        btnAEspecie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAEspecieMouseClicked(evt);
            }
        });
        btnAEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEspecieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnAEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Variacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(35, 35, 35))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(35, 35, 35));

        tblVariacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variacion", "Especie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVariacion.setBackgoundHead(new java.awt.Color(91, 180, 98));
        tblVariacion.setBorderHead(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblVariacion.setBorderRows(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblVariacion.setColorBorderHead(new java.awt.Color(91, 180, 98));
        tblVariacion.setColorBorderRows(new java.awt.Color(91, 180, 98));
        tblVariacion.setColorPrimaryText(new java.awt.Color(91, 180, 98));
        tblVariacion.setColorSecondary(new java.awt.Color(143, 217, 116));
        tblVariacion.setGridColor(new java.awt.Color(91, 180, 98));
        jScrollPane1.setViewportView(tblVariacion);

        btnAVariacion.setBackground(new java.awt.Color(0, 114, 81));
        btnAVariacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_joyent_30px_2.png"))); // NOI18N
        btnAVariacion.setText("Agregar variacion");
        btnAVariacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAVariacionMouseClicked(evt);
            }
        });
        btnAVariacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAVariacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(btnAVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAEspecieActionPerformed

    private void btnAVariacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAVariacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAVariacionActionPerformed

    private void btnAEspecieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAEspecieMouseClicked
        new yumsystem.frmEspecie().setVisible(true);
    }//GEN-LAST:event_btnAEspecieMouseClicked

    private void btnAVariacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAVariacionMouseClicked
        new yumsystem.frmVariacion().setVisible(true);
    }//GEN-LAST:event_btnAVariacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btnAEspecie;
    private newscomponents.RSButtonFlat_new btnAVariacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static RSMaterialComponent.RSTableMetroCustom tblEspecies;
    public static RSMaterialComponent.RSTableMetroCustom tblVariacion;
    // End of variables declaration//GEN-END:variables
}
