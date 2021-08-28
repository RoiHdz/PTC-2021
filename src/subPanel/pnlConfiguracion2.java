package subPanel;

import controlador.LaborC;
import yumsystem.frmLabor;
import yumsystem.frmMetodoAplicacion;

public class pnlConfiguracion2 extends javax.swing.JPanel {

    /**
     * Creates new form pnlConfiguracion2
     */
    public pnlConfiguracion2() {
        initComponents();
        /*Cambiar el controlador LaborC*/
        LaborC c;
        LaborC.setListar("");
        Pop.add(menu);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        btnDelete = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnEdit = new RSMaterialComponent.RSButtonMaterialIconOne();
        Pop = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLabores = new RSMaterialComponent.RSTableMetroCustom();
        btnAEspecie2 = new newscomponents.RSButtonFlat_new();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMetodo = new RSMaterialComponent.RSTableMetroCustom();
        btnMetodo = new newscomponents.RSButtonFlat_new();
        btnListar = new newscomponents.RSButtonFlat_new();

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setBackground(new java.awt.Color(0, 114, 81));
        btnDelete.setText("Eliminar");
        btnDelete.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        menu.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, -1));

        btnEdit.setBackground(new java.awt.Color(0, 114, 81));
        btnEdit.setText("Editar");
        btnEdit.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        menu.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        setBackground(new java.awt.Color(225, 232, 193));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jPanel6.setBackground(new java.awt.Color(242, 242, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 35, 35)), "Labores", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(35, 35, 35))); // NOI18N

        tblLabores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Labor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLabores.setBackgoundHead(new java.awt.Color(91, 180, 98));
        tblLabores.setBackgoundHover(new java.awt.Color(166, 196, 126));
        tblLabores.setBorderHead(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblLabores.setBorderRows(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblLabores.setColorBorderHead(new java.awt.Color(91, 180, 98));
        tblLabores.setColorBorderRows(new java.awt.Color(91, 180, 98));
        tblLabores.setColorPrimaryText(new java.awt.Color(91, 180, 98));
        tblLabores.setColorSecondary(new java.awt.Color(143, 217, 116));
        tblLabores.setColorSecundaryText(new java.awt.Color(0, 102, 255));
        tblLabores.setComponentPopupMenu(Pop);
        tblLabores.setGridColor(new java.awt.Color(91, 180, 98));
        tblLabores.setSelectionBackground(new java.awt.Color(166, 196, 126));
        tblLabores.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblLabores);
        if (tblLabores.getColumnModel().getColumnCount() > 0) {
            tblLabores.getColumnModel().getColumn(0).setResizable(false);
            tblLabores.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAEspecie2.setBackground(new java.awt.Color(0, 114, 81));
        btnAEspecie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_joyent_30px_2.png"))); // NOI18N
        btnAEspecie2.setText("Agregar labores");
        btnAEspecie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAEspecie2MouseClicked(evt);
            }
        });
        btnAEspecie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEspecie2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAEspecie2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(btnAEspecie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(242, 242, 242));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metodo aplicacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(35, 35, 35))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(35, 35, 35));

        tblMetodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMetodo.setBackgoundHead(new java.awt.Color(91, 180, 98));
        tblMetodo.setBorderHead(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblMetodo.setBorderRows(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 180, 98)));
        tblMetodo.setColorBorderHead(new java.awt.Color(91, 180, 98));
        tblMetodo.setColorBorderRows(new java.awt.Color(91, 180, 98));
        tblMetodo.setColorPrimaryText(new java.awt.Color(91, 180, 98));
        tblMetodo.setColorSecondary(new java.awt.Color(143, 217, 116));
        tblMetodo.setGridColor(new java.awt.Color(91, 180, 98));
        jScrollPane1.setViewportView(tblMetodo);

        btnMetodo.setBackground(new java.awt.Color(0, 114, 81));
        btnMetodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_joyent_30px_2.png"))); // NOI18N
        btnMetodo.setText("Agregar metodo\n");
        btnMetodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMetodoMouseClicked(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(0, 114, 81));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_joyent_30px_2.png"))); // NOI18N
        btnListar.setText("Consultar");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAEspecie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEspecie2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAEspecie2ActionPerformed

    private void btnAEspecie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAEspecie2MouseClicked
        new yumsystem.frmLaborUpdate().setVisible(true);
    }//GEN-LAST:event_btnAEspecie2MouseClicked

    private void btnMetodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMetodoMouseClicked
        new yumsystem.frmMetodoAplicacion().setVisible(true);
    }//GEN-LAST:event_btnMetodoMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int fila = tblLabores.getSelectedRow();
        
        new yumsystem.frmLabor().setVisible(true);
        frmLabor f = new yumsystem.frmLabor();
        f.txtLabor.setText(tblLabores.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Pop;
    public newscomponents.RSButtonFlat_new btnAEspecie2;
    private RSMaterialComponent.RSButtonMaterialIconOne btnDelete;
    private RSMaterialComponent.RSButtonMaterialIconOne btnEdit;
    public newscomponents.RSButtonFlat_new btnListar;
    private newscomponents.RSButtonFlat_new btnMetodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel menu;
    public static RSMaterialComponent.RSTableMetroCustom tblLabores;
    public RSMaterialComponent.RSTableMetroCustom tblMetodo;
    // End of variables declaration//GEN-END:variables
}
