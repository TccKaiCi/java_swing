package DisplayItem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    BUS list_Weapon = null;

    public void init() {
        try {
            list_Weapon = new BUS();
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public GUI() {
        init();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = createPanelWeapon("null");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(1010, 549));
        jPanel3.setMinimumSize(new java.awt.Dimension(1010, 549));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Damage");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Image");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Range");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setMaximumSize(new java.awt.Dimension(938, 469));
        jPanel5.setMinimumSize(new java.awt.Dimension(938, 469));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel4)
                .addGap(125, 125, 125)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(84, 84, 84)
                .addComponent(jLabel5)
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JPanel createPanelWeapon(String req) {
        JPanel Panel = new JPanel();
        JPanel[] arrPanel = new JPanel[3];
        JLabel[] arrlbl = new JLabel[4];
        String[] arrImages = new String[10];
        Weapon[] weapons = list_Weapon.getInfor();

        arrImages = list_Weapon.getInforImage();
        Panel.setLayout(new FlowLayout(0, 30, 10));

        int ypos = 0;
        if (req.equalsIgnoreCase("null") == true) {
            for (int i = 0; i < 3; i++) {

                arrlbl[0] = new JLabel(new ImageIcon("./src/DisplayItem/images/" + arrImages[i]));
                arrlbl[0].setFont(new java.awt.Font("Dialog", 1, 24));

                arrlbl[1] = new JLabel(weapons[i].getStrName());
                arrlbl[1].setForeground(Color.BLACK);
                arrlbl[1].setFont(new java.awt.Font("Dialog", 1, 20));

                arrlbl[2] = new JLabel(String.valueOf(weapons[i].getiDamage()));
                arrlbl[2].setForeground(Color.BLACK);
                arrlbl[2].setFont(new java.awt.Font("Dialog", 1, 24));

                arrlbl[3] = new JLabel(String.valueOf(weapons[i].getiRange()));
                arrlbl[3].setForeground(Color.BLACK);
                arrlbl[3].setFont(new java.awt.Font("Dialog", 1, 24));

                arrPanel[i] = new JPanel();
                arrPanel[i].setLayout(null);
                arrPanel[i].setBackground(Color.CYAN);
                arrPanel[i].setBounds(0, ypos, 938, 130);
                arrPanel[i].add(arrlbl[0]);
                arrPanel[i].add(arrlbl[1]);
                arrPanel[i].add(arrlbl[2]);
                arrPanel[i].add(arrlbl[3]);

                arrlbl[0].setBounds(20, 20, 100, 100);
                arrlbl[1].setBounds(235, 20, 500, 100);
                arrlbl[2].setBounds(680, 20, 100, 100);
                arrlbl[3].setBounds(850, 20, 100, 100);

                Panel.add(arrPanel[i]);
                ypos += 145;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if (weapons[i].getStrName().indexOf(req) != -1) {
                    System.out.println("not found");
                    break;
                }
                System.out.println(weapons[i].getStrName());
                arrlbl[0] = new JLabel(new ImageIcon("./src/DisplayItem/images/" + arrImages[i]));
                arrlbl[0].setFont(new java.awt.Font("Dialog", 1, 24));

                arrlbl[1] = new JLabel(weapons[i].getStrName());
                arrlbl[1].setForeground(Color.BLACK);
                arrlbl[1].setFont(new java.awt.Font("Dialog", 1, 20));

                arrlbl[2] = new JLabel(String.valueOf(weapons[i].getiDamage()));
                arrlbl[2].setForeground(Color.BLACK);
                arrlbl[2].setFont(new java.awt.Font("Dialog", 1, 24));

                arrlbl[3] = new JLabel(String.valueOf(weapons[i].getiRange()));
                arrlbl[3].setForeground(Color.BLACK);
                arrlbl[3].setFont(new java.awt.Font("Dialog", 1, 24));

                arrPanel[i] = new JPanel();
                arrPanel[i].setLayout(null);
                arrPanel[i].setBackground(Color.CYAN);
                arrPanel[i].setBounds(0, ypos, 938, 130);
                arrPanel[i].add(arrlbl[0]);
                arrPanel[i].add(arrlbl[1]);
                arrPanel[i].add(arrlbl[2]);
                arrPanel[i].add(arrlbl[3]);

                arrlbl[0].setBounds(20, 20, 100, 100);
                arrlbl[1].setBounds(235, 20, 500, 100);
                arrlbl[2].setBounds(680, 20, 100, 100);
                arrlbl[3].setBounds(850, 20, 100, 100);

                Panel.add(arrPanel[i]);
                ypos += 145;
            }
        }

        return Panel;
    }

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
