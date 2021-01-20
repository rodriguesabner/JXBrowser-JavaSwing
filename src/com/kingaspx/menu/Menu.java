package com.kingaspx.menu;

import com.formdev.flatlaf.FlatDarkLaf;
import com.kingaspx.util.AbrirSite;
import java.awt.Frame;
import java.awt.event.KeyEvent;

public class Menu extends javax.swing.JFrame {

    AbrirSite site = new AbrirSite();

    public Menu() {
        initComponents();
        site.abrirPanel("http://memoji.kingaspx.com", jPanel3, jLabel1, url_txtfield, button_back, button_forward);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        url_txtfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        button_forward = new javax.swing.JButton();
        button_back = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Safari Java Swing");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(25, 28, 31));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(25, 28, 31));

        jPanel5.setBackground(new java.awt.Color(25, 28, 31));

        url_txtfield.setBackground(new java.awt.Color(0, 0, 0));
        url_txtfield.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        url_txtfield.setForeground(new java.awt.Color(255, 255, 255));
        url_txtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        url_txtfield.setText("https://memoji.kingaspx.com");
        url_txtfield.setBorder(null);
        url_txtfield.setCaretColor(new java.awt.Color(255, 255, 255));
        url_txtfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                url_txtfieldFocusGained(evt);
            }
        });
        url_txtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                url_txtfieldKeyReleased(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Lock.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Refresh.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                .addComponent(url_txtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(url_txtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        button_forward.setFocusPainted(false);
        button_forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_forwardActionPerformed(evt);
            }
        });
        jPanel6.add(button_forward, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 30, 30));

        button_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/back-allowed.png"))); // NOI18N
        button_back.setBorder(null);
        button_back.setContentAreaFilled(false);
        button_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_back.setFocusPainted(false);
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });
        jPanel6.add(button_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 30));

        jPanel7.setBackground(new java.awt.Color(25, 28, 31));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/Toolbar Group-right.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(Header, java.awt.BorderLayout.PAGE_START);

        Body.setBackground(new java.awt.Color(56, 57, 58));
        Body.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(56, 57, 58));
        jPanel3.setLayout(new java.awt.BorderLayout());
        Body.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(Body, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(990, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void url_txtfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_url_txtfieldKeyReleased
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            site.browser.loadURL(url_txtfield.getText());
        }
    }//GEN-LAST:event_url_txtfieldKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setExtendedState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

    boolean isClickedMax = false;

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
        site.browser.goBack();
    }//GEN-LAST:event_button_backActionPerformed

    private void button_forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_forwardActionPerformed
        site.browser.goForward();
    }//GEN-LAST:event_button_forwardActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        site.browser.reload();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void url_txtfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_url_txtfieldFocusGained
        url_txtfield.selectAll();
    }//GEN-LAST:event_url_txtfieldFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatDarkLaf.install();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JButton button_back;
    private javax.swing.JButton button_forward;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField url_txtfield;
    // End of variables declaration//GEN-END:variables
}
