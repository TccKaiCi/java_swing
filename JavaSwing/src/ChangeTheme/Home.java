/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeTheme;

import java.awt.Color;

/**
 *
 * @author HiamKaito
 */
public class Home extends javax.swing.JFrame {

    Color colorTheme;
    
    private void init() {
        colorTheme = new Color(255,153,102);
    }
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrdbRed = new javax.swing.JRadioButton();
        jrdbBlue = new javax.swing.JRadioButton();
        jrdbYellow = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jrdbWhite = new javax.swing.JRadioButton();
        jrdbBlack = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        buttonGroup1.add(jrdbRed);
        jrdbRed.setText("Red");
        jrdbRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrdbRedMousePressed(evt);
            }
        });

        buttonGroup1.add(jrdbBlue);
        jrdbBlue.setText("Blue");
        jrdbBlue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrdbBlueMousePressed(evt);
            }
        });

        buttonGroup1.add(jrdbYellow);
        jrdbYellow.setText("Green");
        jrdbYellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrdbYellowMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nice Too Meet U");

        buttonGroup1.add(jrdbWhite);
        jrdbWhite.setText("White");
        jrdbWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrdbWhiteMousePressed(evt);
            }
        });
        jrdbWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdbWhiteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrdbBlack);
        jrdbBlack.setText("Black");
        jrdbBlack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrdbBlackMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button Menu/40_20/3 chấm trắng.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrdbRed)
                                .addGap(33, 33, 33)
                                .addComponent(jrdbBlue)
                                .addGap(30, 30, 30)
                                .addComponent(jrdbYellow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jrdbWhite)
                                .addGap(40, 40, 40)
                                .addComponent(jrdbBlack))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdbRed)
                    .addComponent(jrdbBlue)
                    .addComponent(jrdbYellow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdbWhite)
                    .addComponent(jrdbBlack))
                .addContainerGap(46, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrdbRedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdbRedMousePressed
        colorTheme = new Color(255,0,0);
        changeTheme(colorTheme);
    }//GEN-LAST:event_jrdbRedMousePressed

    private void jrdbBlueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdbBlueMousePressed
        colorTheme = new Color(0,0, 255);
        changeTheme(colorTheme);
    }//GEN-LAST:event_jrdbBlueMousePressed

    private void jrdbYellowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdbYellowMousePressed
        colorTheme = new Color(0,255,0);
        changeTheme(colorTheme);
    }//GEN-LAST:event_jrdbYellowMousePressed

    private void jrdbWhiteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdbWhiteMousePressed
        colorTheme = new Color(255,255,255);
        changeTheme(colorTheme);
        changeTextColor(new Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button Menu/40_20/3 chấm đen.png")));
    }//GEN-LAST:event_jrdbWhiteMousePressed

    private void jrdbBlackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdbBlackMousePressed
       colorTheme = new Color(0,0,0);
        changeTheme(colorTheme);
        changeTextColor(new Color(255,255,255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button Menu/40_20/3 chấm trắng.png")));
    }//GEN-LAST:event_jrdbBlackMousePressed

    private void jrdbWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdbWhiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdbWhiteActionPerformed

    public void changeTheme(Color color) {
        jPanel1.setBackground(color);
    }
    
    public void changeTextColor(Color color) {
        jLabel1.setForeground(color);
        jrdbBlack.setForeground(color);
        jrdbWhite.setForeground(color);
        jrdbYellow.setForeground(color);
        jrdbRed.setForeground(color);
        jrdbBlue.setForeground(color);
    }
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrdbBlack;
    private javax.swing.JRadioButton jrdbBlue;
    private javax.swing.JRadioButton jrdbRed;
    private javax.swing.JRadioButton jrdbWhite;
    private javax.swing.JRadioButton jrdbYellow;
    // End of variables declaration//GEN-END:variables
}