package com.kingaspx.menu;

import com.kingaspx.util.BrowserController;
import com.kingaspx.util.BrowserModel;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Menu extends javax.swing.JFrame {

    private final BrowserController browserController;
    private boolean isClickedMax = false;
    private int indexTab = 0;
    private int xMouse = 0, yMouse = 0;
    private List<BrowserModel> listBrowsers;

    public Menu() {
        initComponents();
        
        setIcon();

        browserController = new BrowserController(url_txtfield, button_back, button_forward);
        listBrowsers = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        url_txtfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reload_button = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        button_forward = new javax.swing.JButton();
        button_back = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        add_tab_btn = new javax.swing.JButton();
        Body = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        browserPanel = new javax.swing.JTabbedPane();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Toolbar Group-right.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Safari Browser");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(25, 28, 31));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(25, 28, 31));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeaderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HeaderMouseReleased(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(25, 28, 31));

        url_txtfield.setBackground(new java.awt.Color(0, 0, 0));
        url_txtfield.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        url_txtfield.setForeground(new java.awt.Color(255, 255, 255));
        url_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        url_txtfield.setBorder(null);
        url_txtfield.setCaretColor(new java.awt.Color(255, 255, 255));
        url_txtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        url_txtfield.setEnabled(false);
        url_txtfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                url_txtfieldFocusGained(evt);
            }
        });
        url_txtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                url_txtfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                url_txtfieldKeyReleased(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Lock.png"))); // NOI18N

        reload_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Refresh.png"))); // NOI18N
        reload_button.setBorder(null);
        reload_button.setContentAreaFilled(false);
        reload_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reload_button.setEnabled(false);
        reload_button.setFocusPainted(false);
        reload_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reload_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(url_txtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reload_button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(url_txtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(reload_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jPanel6.setBackground(new java.awt.Color(25, 28, 31));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/close.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/minimize.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/fullscreen.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Toolbar Item0.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        button_forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/forward-blocked.png"))); // NOI18N
        button_forward.setBorder(null);
        button_forward.setContentAreaFilled(false);
        button_forward.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_forward.setEnabled(false);
        button_forward.setFocusPainted(false);
        button_forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_forwardActionPerformed(evt);
            }
        });
        jPanel6.add(button_forward, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 30, 30));

        button_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/back-blocked.png"))); // NOI18N
        button_back.setBorder(null);
        button_back.setContentAreaFilled(false);
        button_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_back.setEnabled(false);
        button_back.setFocusPainted(false);
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });
        jPanel6.add(button_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 30));

        jPanel7.setBackground(new java.awt.Color(25, 28, 31));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_tab_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/AddTab.png"))); // NOI18N
        add_tab_btn.setBorder(null);
        add_tab_btn.setContentAreaFilled(false);
        add_tab_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_tab_btn.setFocusPainted(false);
        add_tab_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_tab_btnActionPerformed(evt);
            }
        });
        jPanel7.add(add_tab_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 50, 50));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(Header, java.awt.BorderLayout.PAGE_START);

        Body.setBackground(new java.awt.Color(56, 57, 58));
        Body.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(56, 57, 58));
        jPanel3.setLayout(new java.awt.CardLayout());

        welcomePanel.setBackground(new java.awt.Color(56, 57, 58));

        jPanel2.setBackground(new java.awt.Color(56, 57, 58));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/happy-guy.png"))); // NOI18N
        jLabel1.setText("Create a new tab to get started");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("New Tab");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(210, 210, 210))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(184, 184, 184))
        );

        jPanel3.add(welcomePanel, "card3");

        browserPanel.setBackground(new java.awt.Color(56, 57, 58));
        browserPanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        browserPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                browserPanelStateChanged(evt);
            }
        });
        browserPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                browserPanelFocusGained(evt);
            }
        });
        browserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browserPanelMouseClicked(evt);
            }
        });
        jPanel3.add(browserPanel, "card2");

        Body.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(Body, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(990, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void url_txtfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_url_txtfieldKeyReleased
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            for (BrowserModel browser : listBrowsers) {
                if (browser.getId() == browserPanel.getSelectedIndex()) {
                    browserController.changeURL(browserPanel.getSelectedIndex(),
                            browser.getBrowser(),
                            url_txtfield.getText(),
                            browserPanel
                    );
                }
            }
        }
    }//GEN-LAST:event_url_txtfieldKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!isClickedMax) {
            setExtendedState(6);
            isClickedMax = true;
        } else {
            setExtendedState(0);
            isClickedMax = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
    }//GEN-LAST:event_button_backActionPerformed

    private void button_forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_forwardActionPerformed
    }//GEN-LAST:event_button_forwardActionPerformed

    private void reload_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reload_buttonActionPerformed
        for (BrowserModel browser : listBrowsers) {
            if (browser.getId() == browserPanel.getSelectedIndex()) {
                browser.getBrowser().reload();
            }
        }
    }//GEN-LAST:event_reload_buttonActionPerformed

    private void url_txtfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_url_txtfieldFocusGained
        url_txtfield.selectAll();
    }//GEN-LAST:event_url_txtfieldFocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void browserPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_browserPanelStateChanged

    }//GEN-LAST:event_browserPanelStateChanged

    private void url_txtfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_url_txtfieldKeyPressed

    }//GEN-LAST:event_url_txtfieldKeyPressed

    private void browserPanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_browserPanelFocusGained
    }//GEN-LAST:event_browserPanelFocusGained

    private void browserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browserPanelMouseClicked
        for (BrowserModel browser : listBrowsers) {
            if (browser.getId() == browserPanel.getSelectedIndex()) {
                url_txtfield.setText(browserController.getUrlTab(browser.getBrowser()));
                browserController.checkPreferences(browser.getBrowser());
            }
        }
    }//GEN-LAST:event_browserPanelMouseClicked

    private void add_tab_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_tab_btnActionPerformed
        novaAba();
    }//GEN-LAST:event_add_tab_btnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        novaAba();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        setOpacity((float) 0.8);
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_HeaderMouseReleased

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseClicked
        if (evt.getClickCount() == 2) {
            if (!isClickedMax) {
                setExtendedState(6);
                isClickedMax = true;
            } else {
                setExtendedState(0);
                isClickedMax = false;
            }
        }
    }//GEN-LAST:event_HeaderMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JButton add_tab_btn;
    private javax.swing.JTabbedPane browserPanel;
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_forward;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton reload_button;
    private javax.swing.JTextField url_txtfield;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    private void novaAba() {
        url_txtfield.setEnabled(true);
        button_back.setEnabled(true);
        button_forward.setEnabled(true);
        reload_button.setEnabled(true);
        welcomePanel.hide();
        browserPanel.show();

        Browser browser = new Browser();

        BrowserModel browserModel = new BrowserModel();
        browserModel.setId(indexTab);
        browserModel.setBrowser(browser);

        browserPanel.addTab("", new BrowserView(browser));

        browserController.newBrowser(indexTab, browser, "https://github.com/kingaspx", browserPanel);
        browserPanel.setSelectedIndex(indexTab);

        indexTab++;

        listBrowsers.add(browserModel);
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/kingaspx/icon/safari_logo.png")));
    }

}
