package TicTacToe;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.*;

public class Game extends javax.swing.JFrame {

//    create new 
    public void init() {
        arrIntBoard = new int[3][3];
        arrBtnBoard = new JButton[3][3];

//        add normal value for array integer
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrIntBoard[i][j] = 0;
            }
        }
    }

    public void init2() {
        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/img/Avatar/" + Memory.iconName + ".png")));

        jLabel1.setText(Memory.Player_Name);
    }

    public Game() {
        init();
        initComponents();
        init2();

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
        lblSound = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlBoard = createBoardGame();
        lblPlayerScore = new javax.swing.JLabel();
        lblBotScore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBackMouseReleased(evt);
            }
        });
        jPanel2.add(lblBack);
        lblBack.setBounds(300, 0, 100, 90);

        lblSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/img/Black Sound.png"))); // NOI18N
        jPanel2.add(lblSound);
        lblSound.setBounds(120, 50, 50, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PLAYER NAME");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(126, 6, 174, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 100);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        pnlBoard.setBackground(new java.awt.Color(225, 225, 225));
        pnlBoard.setToolTipText("");
        pnlBoard.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout pnlBoardLayout = new javax.swing.GroupLayout(pnlBoard);
        pnlBoard.setLayout(pnlBoardLayout);
        pnlBoardLayout.setHorizontalGroup(
            pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        pnlBoardLayout.setVerticalGroup(
            pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        lblPlayerScore.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblPlayerScore.setForeground(new java.awt.Color(0, 0, 0));
        lblPlayerScore.setText("0");

        lblBotScore.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblBotScore.setForeground(new java.awt.Color(0, 0, 0));
        lblBotScore.setText("0");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(":");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPlayerScore)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotScore)
                        .addGap(143, 143, 143))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerScore)
                    .addComponent(lblBotScore)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_lblBackMouseReleased

    private void lblBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBackMousePressed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBotScore;
    private javax.swing.JLabel lblPlayerScore;
    private javax.swing.JLabel lblSound;
    private javax.swing.JPanel pnlBoard;
    // End of variables declaration//GEN-END:variables

    int x_Mouse, y_Mouse;
    int[][] arrIntBoard;
    JButton[][] arrBtnBoard;

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

//    Create play game button group
    private JPanel createBoardGame() {
        JPanel panel = new JPanel();

        panel.setSize(350, 350);
        panel.setLayout(null);

        int xPos = 10, yPos = 10;

//        Array[3][3]
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrBtnBoard[i][j] = new JButton();

                System.out.println("Create new btn " + i + " " + j);

                arrBtnBoard[i][j].setName(i + " " + j);
                arrBtnBoard[i][j].setSize(80, 80);
                arrBtnBoard[i][j].setLocation(xPos, yPos);
                arrBtnBoard[i][j].setRequestFocusEnabled(false);

//                Add action mouse Click
                arrBtnBoard[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent me) {
                        JButton src = (JButton) me.getSource();
                        String[] s = src.getName().split(" ");

                        if (src.isEnabled() == false) {
                            System.out.println("Loi");
                        } else {
                            btnClick(Integer.parseInt(s[0]), Integer.parseInt(s[1]), 1);
                        }
                    }
                });

                xPos += 90;
                panel.add(arrBtnBoard[i][j]);
            }
            xPos = 10;
            yPos += 90;
        }

        return panel;
    }

    public void btnClick(int xPos, int yPos, int iValue) {
        System.out.println("x = " + xPos + " and y = " + yPos + " is Pressed");

//        number 1 for player 1
//        number 2 for player 2 or bot
        if (iValue == 1) {
            arrBtnBoard[xPos][yPos].setText("X");
            setDataSelected(xPos, yPos, 1);

//        display arr;
            displayArrInt();
        }
        arrBtnBoard[xPos][yPos].setEnabled(false);

//        check win
        int iCheck = checkWin();
        if (iCheck == 1 || iCheck == 2) {
            displayWinner(iCheck);
        } else {

            //        Full??
            if (isFull()) {
                int re = JOptionPane.showConfirmDialog(null, "DRAW");
                if (re != 1) {
                    reset();
                } else {
                    this.setVisible(false);
                    Home home = new Home();
                    home.setVisible(true);
                }
            } else {
                botGo();
                iCheck = checkWin();
                if (iCheck == 1 || iCheck == 2) {
                    displayWinner(iCheck);
                }
//        display arr;
                displayArrInt();
            }
        }
    }

    /**
     * Set data to array integer
     *
     * @param xPos
     * @param yPos
     * @param iValue
     */
    public void setDataSelected(int xPos, int yPos, int iValue) {
        arrIntBoard[xPos][yPos] = iValue;
    }

    public void botGo() {
        if (botAtt() != 0) {
            System.out.println("Bot Attack");
        } else if (botDef() != 0) {
            System.out.println("Bot Defend");
        } else {
            System.out.println("Bot go to random move");
            botRandom();
        }
    }

    public int botAtt() {
//        check by row
        for (int i = 0; i < 3; i++) {
            int a = arrIntBoard[i][0];
            int b = arrIntBoard[i][1];
            int c = arrIntBoard[i][2];

            if (a == 1 || b == 1 || c == 1) {
                System.out.println("Bot bi chan");
            } else if ((a / 2) + (b / 2) + (c / 2) == 2) {
                botRandomTurn(i, 0);
                botRandomTurn(i, 1);
                botRandomTurn(i, 2);

                return 1;
            }
        }

//        check by col
        for (int j = 0; j < 3; j++) {
            int a = arrIntBoard[0][j];
            int b = arrIntBoard[1][j];
            int c = arrIntBoard[2][j];

            if (a == 1 || b == 1 || c == 1) {
                System.out.println("Bot bi chan");
            } else if ((a / 2) + (b / 2) + (c / 2) == 2
                    && a != 1 && b != 1 && c != 1) {
                botRandomTurn(0, j);
                botRandomTurn(1, j);
                botRandomTurn(2, j);

                return 1;
            }
        }

//        check another
        if ((arrIntBoard[0][0] / 2) + (arrIntBoard[1][1] / 2)
                + (arrIntBoard[2][2] / 2) == 4) {

            if (arrIntBoard[0][0] == 1
                    || arrIntBoard[1][1] == 1
                    || arrIntBoard[2][2] == 1) {
                botRandomTurn(0, 0);
                botRandomTurn(1, 1);
                botRandomTurn(2, 2);
                return 1;
            }
        }

        if ((arrIntBoard[0][2] / 2) + (arrIntBoard[1][1] / 2)
                + (arrIntBoard[2][0] / 2) == 4) {

            if (arrIntBoard[0][2] == 1
                    || arrIntBoard[1][1] == 1
                    || arrIntBoard[2][0] == 1) {
                botRandomTurn(0, 2);
                botRandomTurn(1, 1);
                botRandomTurn(2, 0);
                return 1;
            }
        }

        return 0;
    }

    public int botDef() {
//        check by row
        for (int i = 0; i < 3; i++) {
            int a = arrIntBoard[i][0];
            int b = arrIntBoard[i][1];
            int c = arrIntBoard[i][2];

            if ((a & 2) + (b % 2) + (c % 2) == 2) {
                if (a == 2 || b == 2 || c == 2) {
                    System.out.println("Da bi chan");
                    break;
                }
                if (a == 0) {
                    botRandomTurn(i, 0);
                }
                if (b == 0) {
                    botRandomTurn(i, 1);
                }
                if (c == 0) {
                    botRandomTurn(i, 2);
                }

                return 1;
            }
        }

//        check by col
        for (int j = 0; j < 3; j++) {
            int a = arrIntBoard[0][j];
            int b = arrIntBoard[1][j];
            int c = arrIntBoard[2][j];

            if ((a % 2) + (b % 2) + (c % 2) == 2) {
                if (a == 2 || b == 2 || c == 2) {
                    System.out.println("Da bi chan");
                    break;
                }
                if (a == 0) {
                    botRandomTurn(0, j);
                }
                if (b == 0) {
                    botRandomTurn(1, j);
                }
                if (c == 0) {
                    botRandomTurn(2, j);
                }

                return 1;
            }
        }

//        check another
        if ((arrIntBoard[0][0] % 2) + (arrIntBoard[1][1] % 2)
                + (arrIntBoard[2][2] % 2) == 2) {

            if (arrIntBoard[0][0] == 2 || arrIntBoard[1][1] == 2 || arrIntBoard[2][2] == 2) {
                System.out.println("Da bi chan");
            } else {
                if (arrIntBoard[0][0] == 0) {
                    botRandomTurn(0, 0);
                }
                if (arrIntBoard[1][1] == 0) {
                    botRandomTurn(1, 1);
                }
                if (arrIntBoard[2][2] == 0) {
                    botRandomTurn(2, 2);
                }
                return 1;
            }
        }

        if ((arrIntBoard[0][2] % 2) + (arrIntBoard[1][1] % 2)
                + (arrIntBoard[2][0] % 2) == 2) {
            if (arrIntBoard[2][0] == 2 || arrIntBoard[1][1] == 2 || arrIntBoard[0][2] == 2) {
                System.out.println("Da bi chan");
            } else {
                if (arrIntBoard[0][2] == 0) {
                    botRandomTurn(0, 2);
                }
                if (arrIntBoard[1][1] == 0) {
                    botRandomTurn(1, 1);
                }
                if (arrIntBoard[2][0] == 0) {
                    botRandomTurn(2, 0);
                }
                return 1;
            }
        }

        return 0;
    }

    public void botRandom() {
        boolean flag = true;
        Random rand = new Random();

        do {
            int i = rand.nextInt(3);
            int j = rand.nextInt(3);

            if (arrIntBoard[i][j] == 0) {
                arrBtnBoard[i][j].setText("O");
                arrBtnBoard[i][j].setEnabled(false);
                setDataSelected(i, j, 2);
                flag = false;
            }
        } while (flag == true);
    }

    public void botRandomTurn(int xPos, int yPos) {
        arrIntBoard[xPos][yPos] = 2;

        arrBtnBoard[xPos][yPos].setText("O");
        arrBtnBoard[xPos][yPos].setEnabled(false);
    }

    /**
     * @return 0 if no one win <br> 1 if player 1 win <br> 2 if player 2 win
     */
    public int checkWin() {
//        check by col
        for (int i = 0; i < 3; i++) {
            if (arrIntBoard[i][0] == arrIntBoard[i][1]
                    && arrIntBoard[i][1] == arrIntBoard[i][2] && arrIntBoard[i][2] != 0) {
                return arrIntBoard[i][0];
            }
        }

//        check by col
        for (int j = 0; j < 3; j++) {
            if (arrIntBoard[0][j] == arrIntBoard[1][j]
                    && arrIntBoard[1][j] == arrIntBoard[2][j] && arrIntBoard[2][j] != 0) {
                return arrIntBoard[0][j];
            }
        }

//        check another
        if (arrIntBoard[0][0] == arrIntBoard[1][1]
                && arrIntBoard[1][1] == arrIntBoard[2][2] && arrIntBoard[2][2] != 0) {
            return arrIntBoard[0][0];
        }

        if (arrIntBoard[0][2] == arrIntBoard[1][1]
                && arrIntBoard[1][1] == arrIntBoard[2][0] && arrIntBoard[2][0] != 0) {
            return arrIntBoard[0][2];
        }
        return 0;

    }

    public void displayWinner(int iCheck) {
        String s = "";
        if (iCheck == 1) {
            int temp = Integer.parseInt(lblPlayerScore.getText());

            s = Memory.Player_Name + " win";
            System.out.println(s);
            temp++;
            lblPlayerScore.setText(String.valueOf(temp));
        } else {
            int temp = Integer.parseInt(lblBotScore.getText());

            s = "Bot win";
            System.out.println(s);
            temp++;
            lblBotScore.setText(String.valueOf(temp));
        }
        int re = JOptionPane.showConfirmDialog(null, s + " ,Reset?");
        if (re != 1) {
            reset();
        } else {
            this.setVisible(false);
            Home home = new Home();
            home.setVisible(true);
        }
    }

    public void displayArrInt() {
        System.out.println("Array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(arrIntBoard[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void reset() {
//        rest button display
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrBtnBoard[i][j].setText("");
                arrBtnBoard[i][j].setEnabled(true);
            }
        }

//        reset array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrIntBoard[i][j] = 0;
            }
        }

        System.out.println("Re-new succes");
    }

    public boolean isFull() {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arrIntBoard[i][j] != 0) {
                    count++;
                }
            }
        }

        if (count == 9) {
            return true;
        }
        return false;
    }
}
