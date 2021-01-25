package OneTwoThree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class GUI extends javax.swing.JFrame {

    private int iHeal_1 = 460;
    private int iHeal_2 = 460;
    private int xHeal_1 = 20;
    private boolean sound = true;
    private RunnableDemo R;

    public void playSound(String namepath) {
        String s = "C:/Users/HiamKaito/Desktop/Java/java_swing/JavaSwing/src/OneTwoThree/" + namepath;
        try {
            FileInputStream fileInputStream = new FileInputStream(s);
            Player player = new Player(fileInputStream);
            System.out.println("Song is playing...");
            System.out.println(s);
            player.play();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JavaLayerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public GUI() {
        R = new RunnableDemo("Music");
        R.start();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelHeal_1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelHeal_2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        board_2 = new javax.swing.JLabel();
        board_1 = new javax.swing.JLabel();
        jLabel_BOARD2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jwhowin = new javax.swing.JLabel();
        jLabel_enemy_turn = new javax.swing.JLabel();
        jLabel_you_turn = new javax.swing.JLabel();
        jLabel_you_bao = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_you_keo = new javax.swing.JLabel();
        jLabel_you_bua = new javax.swing.JLabel();
        jLabel_enemy_bao = new javax.swing.JLabel();
        jLabel_enemy_bua = new javax.swing.JLabel();
        jLabel_enemy_keo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(1138, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(1138, 500));
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

        board_2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        board_2.setForeground(new java.awt.Color(255, 255, 0));
        board_2.setText("0");

        board_1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        board_1.setForeground(new java.awt.Color(255, 255, 0));
        board_1.setText("0");

        jLabel_BOARD2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel_BOARD2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_BOARD2.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(board_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel_BOARD2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(board_2)
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(board_2)
                    .addComponent(board_1)
                    .addComponent(jLabel_BOARD2))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(510, 50, 100, 70);

        jwhowin.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jwhowin.setForeground(new java.awt.Color(0, 0, 0));
        jwhowin.setText("WHO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jwhowin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jwhowin)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(420, 220, 300, 40);

        jLabel_enemy_turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bao.png"))); // NOI18N
        jLabel_enemy_turn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_enemy_turnMouseReleased(evt);
            }
        });
        jPanel1.add(jLabel_enemy_turn);
        jLabel_enemy_turn.setBounds(660, 110, 100, 100);

        jLabel_you_turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bao.png"))); // NOI18N
        jLabel_you_turn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_you_turnMouseReleased(evt);
            }
        });
        jPanel1.add(jLabel_you_turn);
        jLabel_you_turn.setBounds(360, 120, 100, 100);

        jLabel_you_bao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bao.png"))); // NOI18N
        jLabel_you_bao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_you_baoMouseReleased(evt);
            }
        });
        jPanel1.add(jLabel_you_bao);
        jLabel_you_bao.setBounds(150, 230, 100, 100);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel9.setText("Enemy");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(630, 20, 170, 60);

        jLabel_you_keo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/keo.png"))); // NOI18N
        jLabel_you_keo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_you_keoMousePressed(evt);
            }
        });
        jPanel1.add(jLabel_you_keo);
        jLabel_you_keo.setBounds(240, 350, 100, 100);

        jLabel_you_bua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OneTwoThree/bua.png"))); // NOI18N
        jLabel_you_bua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel_you_buaMouseReleased(evt);
            }
        });
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
        jLabel8.setText("You");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 20, 100, 60);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton1.setText("MUSIC OFF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 310, 240, 70);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_you_baoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_you_baoMouseReleased
        int iRes = rule("bao");
        fight(iRes);
    }//GEN-LAST:event_jLabel_you_baoMouseReleased

    private void jLabel_you_buaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_you_buaMouseReleased
        int iRes = rule("bua");
        fight(iRes);
    }//GEN-LAST:event_jLabel_you_buaMouseReleased

    private void jLabel_you_keoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_you_keoMousePressed
        int iRes = rule("keo");
        fight(iRes);
    }//GEN-LAST:event_jLabel_you_keoMousePressed

    private void jLabel_enemy_turnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_enemy_turnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_enemy_turnMouseReleased

    private void jLabel_you_turnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_you_turnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_you_turnMouseReleased

    public boolean flagMusic = true;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (flagMusic) {
            R.stop();
            flagMusic = !flagMusic;
            jButton1.setText("MUSIC ON");
        }
        else {
            R = new RunnableDemo("Music");
            R.start();
            flagMusic = !flagMusic;
            jButton1.setText("MUSIC OFF");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setIconTurn(String namePlayer, String nameTurn) {
        if (namePlayer.equalsIgnoreCase("You") == true) {
            jLabel_you_turn.setIcon(new ImageIcon(
                    getClass().getResource("/OneTwoThree/" + nameTurn + ".png")));
        } else {
            jLabel_enemy_turn.setIcon(new ImageIcon(
                    getClass().getResource("/OneTwoThree/" + nameTurn + ".png")));
        }
    }

    /**
     * Keo bua bao
     *
     * @param key ten loai dau vao
     * @return 1 neu thang, 0 hoa, -1 thua
     */
    private int rule(String key) {
        Random rand = new Random();
        int iKey = rand.nextInt(3) + 1;
        // 1 2 3 keo bua bao
        switch (iKey) {
            case 1://keo
                setIconTurn("Enemy", "keo");
                if (key.equalsIgnoreCase("bao") == true) {
                    setIconTurn("You", "bao");
                    return -1;
                } else {
                    if (key.equalsIgnoreCase("keo") == true) {
                        setIconTurn("You", "keo");
                        return 0;
                    } else {
                        return 1;
                    }
                }
            case 2://bua
                setIconTurn("Enemy", "bua");
                if (key.equalsIgnoreCase("keo") == true) {
                    setIconTurn("You", "keo");
                    return -1;
                } else {
                    if (key.equalsIgnoreCase("bua") == true) {
                        setIconTurn("You", "bua");
                        return 0;
                    } else {
                        return 1;
                    }
                }
            case 3://bao
                setIconTurn("Enemy", "bao");
                if (key.equalsIgnoreCase("bua") == true) {
                    setIconTurn("You", "bua");
                    return -1;
                } else {
                    if (key.equalsIgnoreCase("bao") == true) {
                        setIconTurn("You", "bao");
                        return 0;
                    } else {
                        return 1;
                    }
                }
        }
        return 0;
    }

    private void fight(int iKey) {
        //460 20
        //20 70
        if (iKey == 1) {
            // You win
            jwhowin.setText("YOU WIN");
            System.out.println("Player thang");
            iHeal_2 -= 50;
            jPanelHeal_2.setSize(iHeal_2, 20);
//            playSound("Quack Sound Effect.mp3");
        } else if (iKey == 0) {
            //draw
            jwhowin.setText("DRAW");
            System.out.println("Hoa nhau");
        } else {
            //You lose
            jwhowin.setText("ENEMY WIN");
            System.out.println("PLayer Thua");
            iHeal_1 -= 50;
            jPanelHeal_1.setSize(iHeal_1, 20);
            xHeal_1 += 50;
            jPanelHeal_1.setLocation(xHeal_1, 70);
//            playSound("Roblox Death Sound - OOF - Sound Effect.mp3");
        }

        if (iHeal_1 < 0) {
            System.out.println("");
            playSound("Mario Dead - Sound Effects.mp3");
            int re = JOptionPane.showConfirmDialog(null, "You lose.Reset?");
            if (re != 1) {
                reset();
                int temp = Integer.parseInt(board_2.getText());
                temp++;
                board_2.setText(String.valueOf(temp));
            } else {
                System.exit(0);
            }
        }
        if (iHeal_2 < 0) {
            System.out.println("");
            playSound("Victory sound effect.mp3");
            int re = JOptionPane.showConfirmDialog(null, "You win.Reset?");
            if (re != 1) {
                reset();
                int temp = Integer.parseInt(board_1.getText());
                temp++;
                board_1.setText(String.valueOf(temp));
            } else {
                System.exit(0);
            }
        }

        //play sound
        if (iHeal_1 < 50 && sound) {
            playSound("That's a lot of damage.mp3");
            sound = !sound;
        }
    }

    public void reset() {
        iHeal_1 = 460;
        iHeal_2 = 460;
        xHeal_1 = 20;

        jPanelHeal_1.setSize(460, 20);
        jPanelHeal_2.setSize(460, 20);
        jPanelHeal_1.setLocation(20, 70);
        sound = !sound;
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
    private javax.swing.JLabel board_1;
    private javax.swing.JLabel board_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_BOARD2;
    private javax.swing.JLabel jLabel_enemy_bao;
    private javax.swing.JLabel jLabel_enemy_bua;
    private javax.swing.JLabel jLabel_enemy_keo;
    private javax.swing.JLabel jLabel_enemy_turn;
    private javax.swing.JLabel jLabel_you_bao;
    private javax.swing.JLabel jLabel_you_bua;
    private javax.swing.JLabel jLabel_you_keo;
    private javax.swing.JLabel jLabel_you_turn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelHeal_1;
    private javax.swing.JPanel jPanelHeal_2;
    private javax.swing.JLabel jwhowin;
    // End of variables declaration//GEN-END:variables
}
