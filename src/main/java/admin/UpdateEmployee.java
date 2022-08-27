/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import databaseConnectivity.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.UserModel;

/**
 *
 * @author hi
 */
public class UpdateEmployee extends javax.swing.JFrame {

    UserModel userModel;
    /**
     * Creates new form UpdateEmployee
     */
    public UpdateEmployee() {
        initComponents();
    }
    
    public UpdateEmployee(UserModel userModel) {
        initComponents();
        this.userModel = userModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(614, 358));
        getContentPane().setLayout(null);

        jLabel1.setText("Name:-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 70, 100, 30);

        jLabel2.setText("E-mail:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 110, 70, 30);

        jLabel3.setText("Password:-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 60, 16);

        jLabel4.setText("Address:-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 70, 40);

        jLabel5.setText("Update  Employee");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 10, 160, 40);
        getContentPane().add(nameTF);
        nameTF.setBounds(120, 70, 280, 30);
        getContentPane().add(emailTF);
        emailTF.setBounds(120, 110, 280, 30);
        getContentPane().add(passwordTF);
        passwordTF.setBounds(120, 150, 280, 30);
        getContentPane().add(addressTF);
        addressTF.setBounds(120, 190, 280, 40);

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 260, 110, 40);

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 260, 110, 40);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(520, 10, 72, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name  = nameTF.getText();
        String email = emailTF.getText();
        String password = passwordTF.getText();
        String address = addressTF.getText();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter email");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter password");
        } else if(name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter name ");
        } else if(address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "enter adddress ");
        } 
        
        else {
            final String searchStatement = "SELECT * from users where email=? && id!=?";

            try {
                PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
                searchPreparedStatement.setString(1, email);
                searchPreparedStatement.setString(2, Integer.toString(userModel.getID()));

                ResultSet searhResultSet = searchPreparedStatement.executeQuery();

                while (searhResultSet.next()) {
                    JOptionPane.showMessageDialog(null, "Email already exists");
                    return;
                }
                final String insertStatement = "update users set `name`=?, `email`=?, `password`=?, `address`=?, `role`=? where `id`=?";
                PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, password);
                preparedStatement.setString(4, address);
                preparedStatement.setInt(5, 2);
                preparedStatement.setString(6, Integer.toString(userModel.getID()));

                final int isAdded = preparedStatement.executeUpdate();

                if (isAdded > 0) {
                    JOptionPane.showMessageDialog(null, "Value Updated");
                    ViewEmployee viewEmployee = new ViewEmployee();
                viewEmployee.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (SQLException ex) {
                System.out.println("error in " + AddAdmin.class.getName() + " = " + ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    final String statement = "delete from users where `id`=?";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);
            preparedStatement.setString(1, Integer.toString(userModel.getID()));
            int f=preparedStatement.executeUpdate();
            if(f>0) {
                JOptionPane.showMessageDialog(null, "Account Deleted");
                ViewEmployee viewUsers = new ViewEmployee();
                viewUsers.setVisible(true);
                dispose();
            }
            else
            {
                System.out.println("Account Not Deleted");
                JOptionPane.showMessageDialog(null, "Account Not Deleted");
            }
        } catch (SQLException ex) {
                System.out.println("error in " + AddEmployee.class.getName() + " = " + ex);
        }   // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ViewEmployee ob=new ViewEmployee();
    ob.setVisible(true);
    dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField passwordTF;
    // End of variables declaration//GEN-END:variables
}