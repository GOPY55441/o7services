/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.BuyProductModel;
import models.ProductModel;

/**
 *
 * @author hi
 */
public class ReceiptScreen extends javax.swing.JFrame {
    ArrayList<BuyProductModel> buyProductArray = new ArrayList<BuyProductModel>();
    String totalprice;
    /**
     * Creates new form Print
     */
    public ReceiptScreen() {
        initComponents();
    }
    public ReceiptScreen(ArrayList<BuyProductModel> buyProductArray,String totalprice  ){
//         ArrayList<BuyProductModel> buyProductArray = new ArrayList<BuyProductModel>();
        initComponents();
        this.buyProductArray=buyProductArray;
        this.totalprice=totalprice;
        createReceiptText();
    }
    
    private void createReceiptText()
    {
         String billReceiptText = "";
        billReceiptText = "\tSuperMarket                                      \n";
        billReceiptText = billReceiptText + "***********************************************************************\n";
        billReceiptText = billReceiptText +"\t supermarket.com\t";
        billReceiptText = billReceiptText+"\n\t Address Village Daduwal,near Mahilpur n";
        billReceiptText = billReceiptText+"\n \twww.instagram.com/superMarket ";
        billReceiptText = billReceiptText+"\n \t 7009855441 ";
        billReceiptText = billReceiptText+"\n*********************************************************************";
        billReceiptText = billReceiptText+"\n****************     Bill     **************************";
        billReceiptText = billReceiptText+"\n************************************************************************\n";
        billReceiptText = billReceiptText+ "\t"+"Customer name ="+nameTF.getText();
        billReceiptText = billReceiptText+"\n";
        billReceiptText = billReceiptText+ "\t"+"Customer PhoneNo. = "+phoneNoTF.getText();
        billReceiptText = billReceiptText+"\n ";
        for(BuyProductModel bpm: buyProductArray) {
            String productname=bpm.productModel.getName();
            String price=bpm.productModel.getPrice();
            int qty=bpm.quantity;
            String finalPrice=bpm.totalPrice;
            billReceiptText = billReceiptText +productname +"\t"+price +"\t"+qty+"\t"+finalPrice+"\n";
        }
        
        billReceiptText = billReceiptText +"\t"+"Total Price ="+"\t"+totalprice+"\t";
        billReceiptText = billReceiptText +"\n*****************************************************************************";
        billReceiptText = billReceiptText +"\n******************        THANKU       *******************************\n";
        billReceiptText = billReceiptText +"\n************* ******   COME AGAIN   **********************************";
          
        billReceiptTA.setText(billReceiptText);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        billReceiptTA = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        updateDataButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        phoneNoTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(678, 505));
        getContentPane().setLayout(null);

        billReceiptTA.setColumns(20);
        billReceiptTA.setRows(5);
        jScrollPane1.setViewportView(billReceiptTA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 580, 290);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(590, 10, 72, 22);

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton);
        printButton.setBounds(160, 440, 72, 22);

        generateButton.setText("Generate Receipt");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(generateButton);
        generateButton.setBounds(400, 440, 119, 22);

        updateDataButton.setText("Update Data");
        updateDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateDataButton);
        updateDataButton.setBounds(290, 70, 95, 22);

        jLabel1.setText("Name:-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 0, 40, 40);

        jLabel2.setText("Phone No.:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 70, 30);

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        getContentPane().add(nameTF);
        nameTF.setBounds(80, 10, 240, 22);
        getContentPane().add(phoneNoTF);
        phoneNoTF.setBounds(80, 40, 240, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        BuyList obj=new BuyList();
        obj.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        if(nameTF.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(null,"enter name");
        }else if(phoneNoTF.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"enter mobile no.");  
        }else{
        
        String fileName=nameTF.getText()+phoneNoTF.getText()+".txt";
        final String billRecipt = billReceiptTA.getText();
        try {
            FileWriter fw = new FileWriter(fileName);
            for(int i=0;i<billRecipt.length();i++) {
                fw.write(billRecipt.charAt(i));
            }
            fw.close();
        } catch(IOException e) {
            Logger.getLogger(ReceiptScreen.class.getName()).log(Level.SEVERE, null, e);
        }
        JOptionPane.showMessageDialog(null," Receipt Generated");
        BuyList bill = new BuyList();
        bill.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_generateButtonActionPerformed
    }
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            billReceiptTA.print();
        } catch (PrinterException e) {
            Logger.getLogger(ReceiptScreen.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void updateDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataButtonActionPerformed
         if(nameTF.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(null,"enter name");
        }else if(phoneNoTF.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"enter mobile no.");  
        }else{
        createReceiptText();
        }
    }//GEN-LAST:event_updateDataButtonActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

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
            java.util.logging.Logger.getLogger(ReceiptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiptScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea billReceiptTA;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneNoTF;
    private javax.swing.JButton printButton;
    private javax.swing.JButton updateDataButton;
    // End of variables declaration//GEN-END:variables
}
