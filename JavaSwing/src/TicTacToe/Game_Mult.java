package TicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Game_Mult extends javax.swing.JFrame {

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

//        Find anything change from other client
        Timer time = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                We have messenger to add move
                if (Memory.playerMessenger == true
                        && !Memory.messenger.equalsIgnoreCase(" ")) {

//                    take a messenger
                    System.out.println("thời gian chạy");
                    String[] s = Memory.messenger.split(" ");
                    System.out.println("Tin nhan dc nhan: " + Memory.messenger);

//                    is thats a move already moved  
                    if (arrIntBoard[Integer.parseInt(s[0])][Integer.parseInt(s[1])] == 0) {
                        btnClick(Integer.parseInt(s[0]),
                                Integer.parseInt(s[1]), Integer.parseInt(s[2]));
//                        we send messenger and wait ... 
                        Memory.playerMessenger = false;
                        Memory.playerTurn = true;
                    }
                    Memory.messenger = " ";
                }

//                we have a messenger to change status battle
                if (Memory.statusMessenger.equalsIgnoreCase(" ") == false) {
                    System.out.println("Tin nhan trang thai duoc nhan: " + Memory.statusMessenger);

//                    thats reset table
                    if (Memory.statusMessenger.equalsIgnoreCase("RESET") == true) {
                        reset();
                        Memory.statusMessenger = " ";
                    }
//                    CLient quit game
                    if (Memory.statusMessenger.equalsIgnoreCase("END") == true) {
                        System.exit(0);
                        Memory.statusMessenger = " ";
                    }

//                    who win?
                    if (Memory.statusMessenger.equalsIgnoreCase("Host win") == true) {
                        int temp = Integer.parseInt(lblHostScore.getText());
                        temp++;
                        lblHostScore.setText(String.valueOf(temp));

                        Memory.statusMessenger = " ";
                        resetDialog("Host");
                    }
                    if (Memory.statusMessenger.equalsIgnoreCase("Client win") == true) {
                        int temp = Integer.parseInt(lblClientScore.getText());
                        temp++;
                        lblClientScore.setText(String.valueOf(temp));

                        Memory.statusMessenger = " ";
                        resetDialog("Client");
                    }
                }

            }
        });
        time.start();
    }

    public Game_Mult() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlBoard = createBoardGame();
        lblHostScore = new javax.swing.JLabel();
        lblClientScore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
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
        jLabel1.setBounds(130, 30, 174, 40);

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

        lblHostScore.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblHostScore.setForeground(new java.awt.Color(0, 0, 0));
        lblHostScore.setText("0");

        lblClientScore.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblClientScore.setForeground(new java.awt.Color(0, 0, 0));
        lblClientScore.setText("0");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(":");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText(Memory.version);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Copyright © HiamKaito");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lblHostScore)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblClientScore))
                            .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHostScore)
                    .addComponent(lblClientScore)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
            java.util.logging.Logger.getLogger(Game_Mult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Mult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Mult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Mult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Game_Mult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblClientScore;
    private javax.swing.JLabel lblHostScore;
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
                            if (Memory.playerTurn == true) {
                                btnClick(Integer.parseInt(s[0]),
                                        Integer.parseInt(s[1]), Memory.iValue);
                                Memory.playerTurn = false;
                            }

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
        } else {
            arrBtnBoard[xPos][yPos].setText("O");
        }
        setDataSelected(xPos, yPos, iValue);

//        display arr;
        displayArrInt();
//          disable for not play
        arrBtnBoard[xPos][yPos].setEnabled(false);

//        Sent messenger: i am play this turn at: x y valuePlayer(X or O)
        Memory.messenger = String.valueOf(xPos) + " " + String.valueOf(yPos)
                + " " + String.valueOf(iValue);
        Memory.client.sendMessenger();

//        check win
        int iCheck = checkWin();
        if (iCheck == 1 || iCheck == 2) {
            displayWinner(iCheck);
        } else {

//                    is the chest Full??
            if (isFull()) {
                int re = JOptionPane.showConfirmDialog(null, "DRAW");
                if (re != 1) {
//                    CALL RESET GAME
                    Memory.statusMessenger = "RESET";
                    Memory.client.sendStatusMessenger();
                } else {
//                    CALL END GAME
                    Memory.statusMessenger = "END";
                    Memory.client.sendStatusMessenger();

//                    exit
                    this.setVisible(false);
                    Home home = new Home();
                    home.setVisible(true);
                }
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
            s = "Host win";

        } else {
            s = "Client win";
        }

//            send status messenger
        Memory.statusMessenger = s;
        Memory.client.sendStatusMessenger();

//==============================================================================
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

    public void resetDialog(String player) {
        //        display dialog
        int re = JOptionPane.showConfirmDialog(null, player + " win,Reset?");
        if (re != 1) {
            Memory.statusMessenger = "RESET";
            Memory.client.sendStatusMessenger();
        } else {
            this.setVisible(false);
            Home home = new Home();
            home.setVisible(true);
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
