package yumsystem;

import panelPrincipal.pnlConfiguracion;
import panelPrincipal.pnlParcela;
import panelPrincipal.pnlPersonal;
import panelPrincipal.pnlCultivo;
import panelPrincipal.pnlBodega;
import panelPrincipal.pnlDashboard;
import clase.CambiaPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class menuPrincipal extends javax.swing.JFrame {

    boolean a = true;
    
    public menuPrincipal() {
        initComponents();
        new CambiaPanel(pnlContainer, new pnlDashboard());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        iconMinMaxClose = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        btnMax = new javax.swing.JPanel();
        lblMax = new javax.swing.JLabel();
        btnMin = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlMenuIcon = new javax.swing.JPanel();
        linemenu = new javax.swing.JPanel();
        btnHidden = new javax.swing.JPanel();
        lblHidden = new javax.swing.JLabel();
        btnSettings = new javax.swing.JPanel();
        lblSettings = new javax.swing.JLabel();
        linesetting = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlMenuHidden = new javax.swing.JPanel();
        pnlUser = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserRol = new javax.swing.JLabel();
        lblUserState = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        btnCultivo = new javax.swing.JPanel();
        lblCultivo = new javax.swing.JLabel();
        btnPersonal = new javax.swing.JPanel();
        lblPersonal = new javax.swing.JLabel();
        btnParcela = new javax.swing.JPanel();
        lblParcela = new javax.swing.JLabel();
        btnBodega = new javax.swing.JPanel();
        lblBodega = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        pnlContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlHeader.setBackground(new java.awt.Color(91, 180, 100));
        pnlHeader.setPreferredSize(new java.awt.Dimension(1000, 45));
        pnlHeader.setLayout(new java.awt.BorderLayout());

        iconMinMaxClose.setBackground(new java.awt.Color(91, 180, 100));
        iconMinMaxClose.setPreferredSize(new java.awt.Dimension(140, 45));
        iconMinMaxClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(91, 180, 100));
        btnClose.setPreferredSize(new java.awt.Dimension(45, 45));

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_window_26px_1.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        iconMinMaxClose.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 40, -1));

        btnMax.setBackground(new java.awt.Color(91, 180, 100));
        btnMax.setPreferredSize(new java.awt.Dimension(45, 45));

        lblMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_full_screen_32px.png"))); // NOI18N
        lblMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMaxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMaxLayout = new javax.swing.GroupLayout(btnMax);
        btnMax.setLayout(btnMaxLayout);
        btnMaxLayout.setHorizontalGroup(
            btnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMax, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnMaxLayout.setVerticalGroup(
            btnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMax, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        iconMinMaxClose.add(btnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, -1));

        btnMin.setBackground(new java.awt.Color(91, 180, 100));
        btnMin.setPreferredSize(new java.awt.Dimension(45, 45));

        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_minimize_window_26px.png"))); // NOI18N
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMinLayout = new javax.swing.GroupLayout(btnMin);
        btnMin.setLayout(btnMinLayout);
        btnMinLayout.setHorizontalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMinLayout.createSequentialGroup()
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnMinLayout.setVerticalGroup(
            btnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMin, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        iconMinMaxClose.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, -1));

        pnlHeader.add(iconMinMaxClose, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlMenu.setPreferredSize(new java.awt.Dimension(275, 555));
        pnlMenu.setLayout(new java.awt.BorderLayout());

        pnlMenuIcon.setBackground(new java.awt.Color(91, 180, 100));
        pnlMenuIcon.setPreferredSize(new java.awt.Dimension(50, 555));
        pnlMenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linemenu.setBackground(new java.awt.Color(91, 180, 100));
        linemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linemenuLayout = new javax.swing.GroupLayout(linemenu);
        linemenu.setLayout(linemenuLayout);
        linemenuLayout.setHorizontalGroup(
            linemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linemenuLayout.setVerticalGroup(
            linemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlMenuIcon.add(linemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        btnHidden.setBackground(new java.awt.Color(91, 180, 100));
        btnHidden.setLayout(new java.awt.BorderLayout());

        lblHidden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHidden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_more_than_30px.png"))); // NOI18N
        lblHidden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHiddenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHiddenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHiddenMouseExited(evt);
            }
        });
        btnHidden.add(lblHidden, java.awt.BorderLayout.CENTER);

        pnlMenuIcon.add(btnHidden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        btnSettings.setBackground(new java.awt.Color(91, 180, 100));

        lblSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_settings_32px.png"))); // NOI18N
        lblSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSettingsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSettingsLayout = new javax.swing.GroupLayout(btnSettings);
        btnSettings.setLayout(btnSettingsLayout);
        btnSettingsLayout.setHorizontalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSettingsLayout.setVerticalGroup(
            btnSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlMenuIcon.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        linesetting.setBackground(new java.awt.Color(91, 180, 100));
        linesetting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linesettingLayout = new javax.swing.GroupLayout(linesetting);
        linesetting.setLayout(linesettingLayout);
        linesettingLayout.setHorizontalGroup(
            linesettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesettingLayout.setVerticalGroup(
            linesettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        pnlMenuIcon.add(linesetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, -1));

        jPanel1.setBackground(new java.awt.Color(91, 180, 100));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_close_pane_32px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenuIcon.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 50, 50));

        pnlMenu.add(pnlMenuIcon, java.awt.BorderLayout.LINE_START);

        pnlMenuHidden.setBackground(new java.awt.Color(143, 217, 116));
        pnlMenuHidden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUser.setBackground(new java.awt.Color(143, 217, 116));
        pnlUser.setPreferredSize(new java.awt.Dimension(225, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_male_user_50px.png"))); // NOI18N

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(35, 35, 35));
        lblUsername.setText("Username");

        lblUserRol.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserRol.setForeground(new java.awt.Color(35, 35, 35));
        lblUserRol.setText("Rol user");

        lblUserState.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserState.setForeground(new java.awt.Color(35, 35, 35));
        lblUserState.setText("Online");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserRol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserState, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserState)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlMenuHidden.add(pnlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        btnDashboard.setBackground(new java.awt.Color(143, 217, 116));

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(35, 35, 35));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_32px.png"))); // NOI18N
        lblMenu.setText("           Dashboard");
        lblMenu.setToolTipText("");
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDashboardLayout = new javax.swing.GroupLayout(btnDashboard);
        btnDashboard.setLayout(btnDashboardLayout);
        btnDashboardLayout.setHorizontalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDashboardLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDashboardLayout.setVerticalGroup(
            btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 225, 50));

        btnCultivo.setBackground(new java.awt.Color(143, 217, 116));

        lblCultivo.setBackground(new java.awt.Color(35, 35, 35));
        lblCultivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCultivo.setForeground(new java.awt.Color(35, 35, 35));
        lblCultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_plant_35px.png"))); // NOI18N
        lblCultivo.setText("           Cultivo");
        lblCultivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCultivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCultivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCultivoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCultivoLayout = new javax.swing.GroupLayout(btnCultivo);
        btnCultivo.setLayout(btnCultivoLayout);
        btnCultivoLayout.setHorizontalGroup(
            btnCultivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCultivoLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(lblCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCultivoLayout.setVerticalGroup(
            btnCultivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(btnCultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        btnPersonal.setBackground(new java.awt.Color(143, 217, 116));

        lblPersonal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPersonal.setForeground(new java.awt.Color(35, 35, 35));
        lblPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_people_33px.png"))); // NOI18N
        lblPersonal.setText("           Personal");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPersonalLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(lblPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnPersonalLayout.setVerticalGroup(
            btnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(btnPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        btnParcela.setBackground(new java.awt.Color(143, 217, 116));

        lblParcela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblParcela.setForeground(new java.awt.Color(35, 35, 35));
        lblParcela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_field_33px.png"))); // NOI18N
        lblParcela.setText("           Parcela");
        lblParcela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblParcelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblParcelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblParcelaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnParcelaLayout = new javax.swing.GroupLayout(btnParcela);
        btnParcela.setLayout(btnParcelaLayout);
        btnParcelaLayout.setHorizontalGroup(
            btnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnParcelaLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(lblParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnParcelaLayout.setVerticalGroup(
            btnParcelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblParcela, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(btnParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        btnBodega.setBackground(new java.awt.Color(143, 217, 116));

        lblBodega.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBodega.setForeground(new java.awt.Color(35, 35, 35));
        lblBodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_warehouse_33px.png"))); // NOI18N
        lblBodega.setText("           Bodega");
        lblBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBodegaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBodegaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBodegaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBodegaLayout = new javax.swing.GroupLayout(btnBodega);
        btnBodega.setLayout(btnBodegaLayout);
        btnBodegaLayout.setHorizontalGroup(
            btnBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBodegaLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(lblBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnBodegaLayout.setVerticalGroup(
            btnBodegaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBodega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(btnBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 225, -1));

        btnReportes.setBackground(new java.awt.Color(143, 217, 116));

        lblReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(35, 35, 35));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit_Pie_Chart_Report_33px.png"))); // NOI18N
        lblReportes.setText("           Reportes");
        lblReportes.setToolTipText("");
        lblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jPanel9.setBackground(new java.awt.Color(143, 217, 116));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlMenuHidden.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        pnlMenu.add(pnlMenuHidden, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlMenu, java.awt.BorderLayout.LINE_START);

        pnlContainer.setBackground(new java.awt.Color(242, 242, 242));
        pnlContainer.setLayout(new javax.swing.BoxLayout(pnlContainer, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(pnlContainer, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1000, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Funcion Para el cambio de color al mantener y soltar un elemento
    public void cambioColor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    //Funcion para mantener color cuando haces click
    public void clickMenu(JPanel h1, JPanel h2, int numberbool){
        if (numberbool  == 1) {
            h1.setBackground(new Color (76, 164, 86));
            h2.setBackground(new Color (91,180,100));
        }
        else{
            h1.setBackground(new Color (91,180,100));
            h2.setBackground(new Color (76, 164, 86));
        }
    }
    
    //Cambiar Imagen del menu
    public void cambiarImagen(JLabel button, String img){
        ImageIcon aimg = new ImageIcon(getClass().getResource(img));
        button.setIcon(aimg);
    }
    
    //Mostrar u ocultar panel
    public void hideshow(JPanel mshowhide, boolean contenedor/*, JLabel boton*/){
        if (contenedor == true) {
            mshowhide.setPreferredSize(new Dimension(50, mshowhide.getHeight()));
            //cambiarImagen(boton, "img/icons8_more_than_30px");
        }
        else{
            mshowhide.setPreferredSize(new Dimension(275, mshowhide.getHeight()));
            //cambiarImagen(boton, "img/icons8_menu_32px");
        }
    }
    
    /* Configuracion de btnClose*/
    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        cambioColor(btnClose, new Color(76, 164, 86));
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        cambioColor(btnClose, new Color(91,180,100));
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    /* Configuracion de btnMax */
    private void lblMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseExited
        cambioColor(btnMax, new Color(91,180,100));
    }//GEN-LAST:event_lblMaxMouseExited

    private void lblMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseEntered
        cambioColor(btnMax, new Color(76, 164, 86));
    }//GEN-LAST:event_lblMaxMouseEntered

    private void lblMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMouseClicked
        if (this.getExtendedState() != menuPrincipal.MAXIMIZED_BOTH) {
            this.setExtendedState(menuPrincipal.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(menuPrincipal.NORMAL);
        }
    }//GEN-LAST:event_lblMaxMouseClicked

    /* Configuracion de btnMin */
    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseEntered
        cambioColor(btnMin, new Color(76, 164, 86));
    }//GEN-LAST:event_lblMinMouseEntered

    private void lblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseExited
        cambioColor(btnMin, new Color(91,180,100));
    }//GEN-LAST:event_lblMinMouseExited

    /* Configuracion icono de menu */
    private void lblHiddenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHiddenMouseEntered
        cambioColor(linemenu, new Color(247, 70, 105));
    }//GEN-LAST:event_lblHiddenMouseEntered

    private void lblHiddenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHiddenMouseExited
        cambioColor(linemenu, new Color(91,180,100));
    }//GEN-LAST:event_lblHiddenMouseExited

    private void lblHiddenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHiddenMouseClicked
        clickMenu(btnHidden, btnSettings, 1);
        //Funcion mostrar u ocultar el menu
        if (a == true) {
            hideshow(pnlMenu, a/*, lblHidden*/);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;
        }
        else{
            hideshow(pnlMenu, a/*, lblHidden*/);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }
    }//GEN-LAST:event_lblHiddenMouseClicked

    /* Configuracion btnSettings */
    private void lblSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseEntered
        cambioColor(linesetting, new Color(247, 70, 105));
    }//GEN-LAST:event_lblSettingsMouseEntered

    private void lblSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseExited
        cambioColor(linesetting, new Color(91,180,100));
    }//GEN-LAST:event_lblSettingsMouseExited

    private void lblSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingsMouseClicked
        clickMenu(btnSettings, btnHidden, 1);
        new CambiaPanel(pnlContainer, new pnlConfiguracion());
    }//GEN-LAST:event_lblSettingsMouseClicked

    
    /*Configuracion btnDashboard*/
    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        cambioColor(btnDashboard, new Color(76, 164, 86));
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        cambioColor(btnDashboard, new Color(143,217,116));
    }//GEN-LAST:event_lblMenuMouseExited

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        new CambiaPanel(pnlContainer, new pnlDashboard());
    }//GEN-LAST:event_lblMenuMouseClicked

    /* brtnCultivos */
    private void lblCultivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCultivoMouseClicked
        new CambiaPanel(pnlContainer, new pnlCultivo());
    }//GEN-LAST:event_lblCultivoMouseClicked

    private void lblCultivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCultivoMouseExited
        cambioColor(btnCultivo, new Color(143,217,116));
    }//GEN-LAST:event_lblCultivoMouseExited

    private void lblCultivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCultivoMouseEntered
        cambioColor(btnCultivo, new Color(76, 164, 86));
    }//GEN-LAST:event_lblCultivoMouseEntered

    
    /* btnPersonal */
    private void lblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseClicked
        new CambiaPanel(pnlContainer, new pnlPersonal());
    }//GEN-LAST:event_lblPersonalMouseClicked

    private void lblPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseExited
        cambioColor(btnPersonal, new Color(143,217,116));
    }//GEN-LAST:event_lblPersonalMouseExited

    private void lblPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonalMouseEntered
        cambioColor(btnPersonal, new Color(76, 164, 86));
    }//GEN-LAST:event_lblPersonalMouseEntered

    
    /* btnParcela */
    private void lblParcelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParcelaMouseClicked
        new CambiaPanel(pnlContainer, new pnlParcela());
    }//GEN-LAST:event_lblParcelaMouseClicked

    private void lblParcelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParcelaMouseExited
        cambioColor(btnParcela, new Color(143,217,116));
    }//GEN-LAST:event_lblParcelaMouseExited

    private void lblParcelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblParcelaMouseEntered
        cambioColor(btnParcela, new Color(76, 164, 86));
    }//GEN-LAST:event_lblParcelaMouseEntered

    
    /* btnBodega */
    private void lblBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBodegaMouseClicked
        new CambiaPanel(pnlContainer, new pnlBodega());
    }//GEN-LAST:event_lblBodegaMouseClicked

    private void lblBodegaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBodegaMouseExited
        cambioColor(btnBodega, new Color(143,217,116));
    }//GEN-LAST:event_lblBodegaMouseExited

    private void lblBodegaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBodegaMouseEntered
        cambioColor(btnBodega, new Color(76, 164, 86));
    }//GEN-LAST:event_lblBodegaMouseEntered

    
    /* btnReportes */
    private void lblReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseClicked
       new yumsystem.Reportes().setVisible(true);
    }//GEN-LAST:event_lblReportesMouseClicked

    private void lblReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportesMouseExited

    private void lblReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportesMouseEntered

    
    
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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBodega;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnCultivo;
    private javax.swing.JPanel btnDashboard;
    private javax.swing.JPanel btnHidden;
    private javax.swing.JPanel btnMax;
    private javax.swing.JPanel btnMin;
    private javax.swing.JPanel btnParcela;
    private javax.swing.JPanel btnPersonal;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JPanel btnSettings;
    private javax.swing.JPanel iconMinMaxClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblBodega;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblCultivo;
    private javax.swing.JLabel lblHidden;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblParcela;
    private javax.swing.JLabel lblPersonal;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblSettings;
    private javax.swing.JLabel lblUserRol;
    private javax.swing.JLabel lblUserState;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel linemenu;
    private javax.swing.JPanel linesetting;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenuHidden;
    private javax.swing.JPanel pnlMenuIcon;
    private javax.swing.JPanel pnlUser;
    // End of variables declaration//GEN-END:variables

}
