/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PointOfSale;

import static PointOfSale.Database.ConnecttoDB;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jovy
 */
public class loginFrame extends javax.swing.JFrame {

    Database dbconn = new Database();
    StringBuilder keypadLogin = new StringBuilder("");
    String userPass = null;
    Connection conn = null;

    /**
     * Creates new form loginFrame
     */
    public loginFrame() {
        initComponents();
        conn = Database.ConnecttoDB();
        Toolkit fillScreenSize = Toolkit.getDefaultToolkit();
        Dimension dim = new Dimension(fillScreenSize.getScreenSize());
        int h = (int) dim.getHeight();
        int w = (int) dim.getWidth();
        setSize(w, h);
        
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelKeypad3 = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btn005 = new javax.swing.JButton();
        btn006 = new javax.swing.JButton();
        btn004 = new javax.swing.JButton();
        btn008 = new javax.swing.JButton();
        btn009 = new javax.swing.JButton();
        btn000 = new javax.swing.JButton();
        btn007 = new javax.swing.JButton();
        btnClear3 = new javax.swing.JButton();
        btn003 = new javax.swing.JButton();
        btn002 = new javax.swing.JButton();
        btnEnter3 = new javax.swing.JButton();
        passLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnOne.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btn005.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn005.setText("5");
        btn005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn005ActionPerformed(evt);
            }
        });

        btn006.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn006.setText("6");
        btn006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn006ActionPerformed(evt);
            }
        });

        btn004.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn004.setText("4");
        btn004.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn004ActionPerformed(evt);
            }
        });

        btn008.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn008.setText("8");
        btn008.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn008ActionPerformed(evt);
            }
        });

        btn009.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn009.setText("9");
        btn009.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn009ActionPerformed(evt);
            }
        });

        btn000.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn000.setText("0");
        btn000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn000ActionPerformed(evt);
            }
        });

        btn007.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn007.setText("7");
        btn007.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn007ActionPerformed(evt);
            }
        });

        btnClear3.setBackground(new java.awt.Color(204, 255, 255));
        btnClear3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClear3.setText("Clear");
        btnClear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear3ActionPerformed(evt);
            }
        });

        btn003.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn003.setText("3");
        btn003.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn003ActionPerformed(evt);
            }
        });

        btn002.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btn002.setText("2");
        btn002.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn002ActionPerformed(evt);
            }
        });

        btnEnter3.setBackground(new java.awt.Color(153, 255, 255));
        btnEnter3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEnter3.setText("Enter");
        btnEnter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnter3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelKeypad3Layout = new javax.swing.GroupLayout(PanelKeypad3);
        PanelKeypad3.setLayout(PanelKeypad3Layout);
        PanelKeypad3Layout.setHorizontalGroup(
            PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeypad3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKeypad3Layout.createSequentialGroup()
                        .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelKeypad3Layout.createSequentialGroup()
                                .addComponent(btn007, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn008)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn009))
                            .addGroup(PanelKeypad3Layout.createSequentialGroup()
                                .addComponent(btn004, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn005)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn006)))
                        .addGap(21, 21, 21))
                    .addGroup(PanelKeypad3Layout.createSequentialGroup()
                        .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelKeypad3Layout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn002)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn003))
                            .addGroup(PanelKeypad3Layout.createSequentialGroup()
                                .addComponent(btnClear3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn000)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelKeypad3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn000, btn002, btn003, btn004, btn005, btn006, btn007, btn008, btn009, btnClear3, btnEnter3, btnOne});

        PanelKeypad3Layout.setVerticalGroup(
            PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKeypad3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn002)
                    .addComponent(btn003))
                .addGap(0, 0, 0)
                .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn005)
                    .addComponent(btn006)
                    .addComponent(btn004))
                .addGap(0, 0, 0)
                .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn008)
                    .addComponent(btn009)
                    .addComponent(btn007))
                .addGap(0, 0, 0)
                .addGroup(PanelKeypad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClear3)
                    .addComponent(btn000)
                    .addComponent(btnEnter3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelKeypad3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn000, btn002, btn003, btn004, btn005, btn006, btn007, btn008, btn009, btnClear3, btnEnter3, btnOne});

        passLogin.setBackground(new java.awt.Color(206, 244, 244));
        passLogin.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        passLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Enter User ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(passLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelKeypad3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelKeypad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 15, 34, 15);
        jPanel1.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean isFourdigits(String userPass) {
        boolean is4digits = false;
        if (userPass.length() == 4) {
            is4digits = true;
        } else {

        }
        return is4digits;
    }
    private void passLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passLoginActionPerformed
        // TODO add your handling code here:
        if (keypadLogin.length() != 4) {
            btnEnter3.setEnabled(false);
        } else {
            btnEnter3.setEnabled(true);
        }
    }//GEN-LAST:event_passLoginActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        // TODO add your handling code here:

        passLogin.setText(keypadLogin.append("1").toString());

    }//GEN-LAST:event_btnOneActionPerformed

    private void btn005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn005ActionPerformed
        // TODO add your handling code here:

        passLogin.setText(keypadLogin.append("5").toString());
    }//GEN-LAST:event_btn005ActionPerformed

    private void btn006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn006ActionPerformed
        // TODO add your handling code here:

        passLogin.setText(keypadLogin.append("6").toString());
    }//GEN-LAST:event_btn006ActionPerformed

    private void btn004ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn004ActionPerformed
        // TODO add your handling code here:

        passLogin.setText(keypadLogin.append("4").toString());
    }//GEN-LAST:event_btn004ActionPerformed

    private void btn008ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn008ActionPerformed
        // TODO add your handling code here:
        passLogin.setText(keypadLogin.append("8").toString());
    }//GEN-LAST:event_btn008ActionPerformed

    private void btn009ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn009ActionPerformed
        // TODO add your handling code here:
        passLogin.setText(keypadLogin.append("9").toString());
    }//GEN-LAST:event_btn009ActionPerformed

    private void btn000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn000ActionPerformed
        // TODO add your handling code here:

        passLogin.setText(keypadLogin.append("0").toString());
    }//GEN-LAST:event_btn000ActionPerformed

    private void btn007ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn007ActionPerformed
        // TODO add your handling code here:
        passLogin.setText(keypadLogin.append("7").toString());
    }//GEN-LAST:event_btn007ActionPerformed

    private void btnClear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear3ActionPerformed
        // TODO add your handling code here:

        passLogin.setText(null);
        keypadLogin.delete(0, keypadLogin.length());
    }//GEN-LAST:event_btnClear3ActionPerformed

    private void btn003ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn003ActionPerformed
        // TODO add your handling code here:
        passLogin.setText(keypadLogin.append("3").toString());
    }//GEN-LAST:event_btn003ActionPerformed

    private void btn002ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn002ActionPerformed
        // TODO add your handling code here:
        passLogin.setText(keypadLogin.append("2").toString());
    }//GEN-LAST:event_btn002ActionPerformed

    private void btnEnter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnter3ActionPerformed
        // TODO add your handling code here:
        userPass = passLogin.getText();
        if (keypadLogin.length() != 4) {
            JOptionPane.showMessageDialog(rootPane, "Please enter 4 digits only!");
            passLogin.setText(null);
            keypadLogin.delete(0, keypadLogin.length());
        } else {
            
            System.out.println("Correct User ID!");

            String sql = "SELECT * FROM employeeDB WHERE empId=?;";
            ResultSet rs = null;
            PreparedStatement pst = null;
            boolean isCorrectPass = false;
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, userPass);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String waiter = dbconn.loginWaiter(Integer.parseInt(userPass));
                    conn.close();
                    this.setVisible(false);
                    UserInterface POS = new UserInterface();
                    POS.hasWaiterName(waiter);
                    POS.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect. Please enter valid ID!");
                    passLogin.setText(null);
                    keypadLogin.delete(0, keypadLogin.length());
                }

            } catch (Exception e) {

                System.out.println("login from db:" + e);
            }
        }


    }//GEN-LAST:event_btnEnter3ActionPerformed

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelKeypad3;
    private javax.swing.JButton btn000;
    private javax.swing.JButton btn002;
    private javax.swing.JButton btn003;
    private javax.swing.JButton btn004;
    private javax.swing.JButton btn005;
    private javax.swing.JButton btn006;
    private javax.swing.JButton btn007;
    private javax.swing.JButton btn008;
    private javax.swing.JButton btn009;
    private javax.swing.JButton btnClear3;
    private javax.swing.JButton btnEnter3;
    private javax.swing.JButton btnOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passLogin;
    // End of variables declaration//GEN-END:variables
}
