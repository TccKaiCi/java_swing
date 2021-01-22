package OneTwoThree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class GUI extends javax.swing.JFrame {

    public void playMusic() {
        InputStream music;
        try {
            music = new FileInputStream(new File("music"));
            AudioStream audio = new AudioStream(music);
            AudioPlayer.player.start(audio);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public GUI() {
        initComponents();
//        playMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelHeal_1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelHeal_2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_you_bao = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_you_keo = new javax.swing.JLabel();
        jLabel_you_bua = new javax.swing.JLabel();
        jLabel_enemy_bao = new javax.swing.JLabel();
        jLabel_enemy_bua = new javax.swing.JLabel();
        jLabel_enemy_keo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1138, 500));

        jPanel1.setLayout(null);

        jPanelHeal_1.setBackground(new java.awt.Color(80, 245, 80));

        javax.swing.GroupLayout jPanelHeal_1Layout = new javax.swing.GroupLayout(jPanelHeal_1);
        jPanelHeal_1.setLayout(jPanelHeal_1Layout);
        jPanelHeal_1Layout.setHorizontalGroup(
            jPanelHeal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanelHeal_1Layout.setVerticalGroup(
            jPanelHeal_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelHeal_1);
        jPanelHeal_1.setBounds(20, 70, 460, 20);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 70, 470, 20);

        jPanelHeal_2.setBackground(new java.awt.Color(80, 245, 80));

        javax.swing.GroupLayout jPanelHeal_2Layout = new javax.swing.GroupLayout(jPanelHeal_2);
        jPanelHeal_2.setLayout(jPanelHeal_2Layout);
        jPanelHeal_2Layout.setHorizontalGroup(
            jPanelHeal_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanelHeal_2Layout.setVerticalGroup(
            jPanelHeal_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelHeal_2);
        jPanelHeal_2.setBounds(630, 70, 460, 20);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(630, 70, 470, 20);

        jLabel_you_bao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bao.png"))); // NOI18N
        jPanel1.add(jLabel_you_bao);
        jLabel_you_bao.setBounds(150, 230, 100, 100);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Enemy");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(630, 20, 170, 60);

        jLabel_you_keo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/keo.png"))); // NOI18N
        jPanel1.add(jLabel_you_keo);
        jLabel_you_keo.setBounds(240, 350, 100, 100);

        jLabel_you_bua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bua.png"))); // NOI18N
        jPanel1.add(jLabel_you_bua);
        jLabel_you_bua.setBounds(50, 350, 100, 100);

        jLabel_enemy_bao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bao.png"))); // NOI18N
        jPanel1.add(jLabel_enemy_bao);
        jLabel_enemy_bao.setBounds(920, 230, 100, 100);

        jLabel_enemy_bua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bua.png"))); // NOI18N
        jPanel1.add(jLabel_enemy_bua);
        jLabel_enemy_bua.setBounds(1000, 350, 100, 100);

        jLabel_enemy_keo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/keo.png"))); // NOI18N
        jPanel1.add(jLabel_enemy_keo);
        jLabel_enemy_keo.setBounds(820, 350, 100, 100);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("You");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 20, 100, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_enemy_bao;
    private javax.swing.JLabel jLabel_enemy_bua;
    private javax.swing.JLabel jLabel_enemy_keo;
    private javax.swing.JLabel jLabel_you_bao;
    private javax.swing.JLabel jLabel_you_bua;
    private javax.swing.JLabel jLabel_you_keo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelHeal_1;
    private javax.swing.JPanel jPanelHeal_2;
    // End of variables declaration//GEN-END:variables
}
