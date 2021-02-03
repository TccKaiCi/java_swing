package TicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Host extends javax.swing.JFrame {

    public void init() {
        lblAvatar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/TicTacToe/img/Avatar/" + Memory.iconName + ".png")));

        jLabel1.setText(Memory.Player_Name);
        
//        Create server
        Memory.server = new Server();

        Timer time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Memory.playerConnect) {
                    jLabel2.setText(Memory.playerConnectName);
                }
                else {
                    jLabel2.setText("NOT FOUND");
                }
            }
        });
        time.start();
    }

    public Host() {
        initComponents();
        init();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnInvate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblAvatar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(250, 160, 100));
        jPanel2.setForeground(new java.awt.Color(51, 255, 255));
        jPanel2.setLayout(null);

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/img/Avatar/boy 1.png"))); // NOI18N
        jPanel2.add(lblAvatar);
        lblAvatar.setBounds(0, 0, 120, 100);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/img/Black Exit.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });
        jPanel2.add(lblBack);
        lblBack.setBounds(300, 0, 100, 90);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PLAYER NAME");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(126, 6, 174, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnInvate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnInvate.setText("PLAY");
        btnInvate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvateActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(250, 160, 100));
        jPanel4.setForeground(new java.awt.Color(51, 255, 255));
        jPanel4.setLayout(null);

        lblAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/img/Avatar/boy 2.png"))); // NOI18N
        jPanel4.add(lblAvatar1);
        lblAvatar1.setBounds(0, 0, 120, 100);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PLAYER NAME");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(140, 30, 180, 40);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnInvate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInvate, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 400, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        this.setVisible(false);
        Mult_Player mult = new Mult_Player();
        mult.setVisible(true);
    }//GEN-LAST:event_lblBackMouseReleased

    private void btnInvateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvateActionPerformed
        if (jLabel2.getText().equalsIgnoreCase("NOT FOUND") == true) {
            System.out.println("Cant find server");
        } else {
            Memory.client = new Client();
            if (Memory.client.Connect()) {
                this.setVisible(false);
                Game_Mult game = new Game_Mult();
                game.setVisible(true);
            } else {
                jLabel2.setText("NOT FOUND");
            }
        }
    }//GEN-LAST:event_btnInvateActionPerformed

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
            java.util.logging.Logger.getLogger(Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Host.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Host().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblAvatar1;
    private javax.swing.JLabel lblBack;
    // End of variables declaration//GEN-END:variables

    int x_Mouse, y_Mouse;

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        x_Mouse = evt.getX();
        y_Mouse = evt.getY();
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - x_Mouse, y - y_Mouse);
    }
}
