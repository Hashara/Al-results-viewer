/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultviewer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public boolean post=false;
    
    public Frame() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        indexField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        ExamLable = new javax.swing.JPanel();
        examLable = new javax.swing.JLabel();
        ExamValLable = new javax.swing.JLabel();
        yearValueLable = new javax.swing.JLabel();
        yearLable = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        nameValLable = new javax.swing.JLabel();
        indexLable = new javax.swing.JLabel();
        indexValLable = new javax.swing.JLabel();
        DRLable = new javax.swing.JLabel();
        DRValLable = new javax.swing.JLabel();
        IRValLable = new javax.swing.JLabel();
        IRLable = new javax.swing.JLabel();
        Zlable = new javax.swing.JLabel();
        ZValLable = new javax.swing.JLabel();
        streamLable = new javax.swing.JLabel();
        streamValLable = new javax.swing.JLabel();
        s1Lable = new javax.swing.JLabel();
        s1valLable = new javax.swing.JLabel();
        s2Lable = new javax.swing.JLabel();
        s2ValLable = new javax.swing.JLabel();
        s3Lable = new javax.swing.JLabel();
        s3ValLable = new javax.swing.JLabel();
        s4Lable = new javax.swing.JLabel();
        s4ValLable = new javax.swing.JLabel();
        s5ValLable = new javax.swing.JLabel();
        s5Lable = new javax.swing.JLabel();
        invalid = new javax.swing.JLabel();
        invalidLable = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Results Viewer");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        indexField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("enter the admission number");

        SubmitButton.setBackground(new java.awt.Color(153, 102, 255));
        SubmitButton.setText("Show results");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ExamLable.setBackground(new java.awt.Color(204, 210, 234));

        javax.swing.GroupLayout ExamLableLayout = new javax.swing.GroupLayout(ExamLable);
        ExamLable.setLayout(ExamLableLayout);
        ExamLableLayout.setHorizontalGroup(
            ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamLableLayout.createSequentialGroup()
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExamLableLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(s5Lable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s5ValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(s4Lable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s4ValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(s3Lable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s3ValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(s2Lable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s2ValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(s1Lable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s1valLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(streamLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(streamValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(Zlable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ZValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(IRLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IRValLable))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamLableLayout.createSequentialGroup()
                                .addComponent(DRLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DRValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(indexLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(indexValLable))
                            .addGroup(ExamLableLayout.createSequentialGroup()
                                .addComponent(nameLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameValLable))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamLableLayout.createSequentialGroup()
                                .addComponent(yearLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yearValueLable))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamLableLayout.createSequentialGroup()
                                .addComponent(examLable)
                                .addGap(125, 125, 125)
                                .addComponent(ExamValLable))))
                    .addGroup(ExamLableLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalid, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invalidLable, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExamLableLayout.setVerticalGroup(
            ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamLableLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(invalid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidLable)
                .addGap(42, 42, 42)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examLable)
                    .addComponent(ExamValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearValueLable)
                    .addComponent(yearLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLable)
                    .addComponent(nameValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indexLable)
                    .addComponent(indexValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DRValLable)
                    .addComponent(DRLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IRLable)
                    .addComponent(IRValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zlable)
                    .addComponent(ZValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streamLable)
                    .addComponent(streamValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1Lable)
                    .addComponent(s1valLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2Lable)
                    .addComponent(s2ValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3Lable)
                    .addComponent(s3ValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s4Lable)
                    .addComponent(s4ValLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExamLableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s5Lable)
                    .addComponent(s5ValLable))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(indexField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitButton)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExamLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExamLable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indexFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        //System.out.print(indexField.getText());
        try {
            //post=true;
           ResultViewer.webpage(indexField.getText(),this);
            //System.out.println(variables);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel DRLable;
    public javax.swing.JLabel DRValLable;
    private javax.swing.JPanel ExamLable;
    public javax.swing.JLabel ExamValLable;
    public javax.swing.JLabel IRLable;
    public javax.swing.JLabel IRValLable;
    private javax.swing.JButton SubmitButton;
    public javax.swing.JLabel ZValLable;
    public javax.swing.JLabel Zlable;
    public javax.swing.JLabel examLable;
    private javax.swing.JTextField indexField;
    public javax.swing.JLabel indexLable;
    public javax.swing.JLabel indexValLable;
    private javax.swing.JLabel invalid;
    public javax.swing.JLabel invalidLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel nameLable;
    public javax.swing.JLabel nameValLable;
    public javax.swing.JLabel s1Lable;
    public javax.swing.JLabel s1valLable;
    public javax.swing.JLabel s2Lable;
    public javax.swing.JLabel s2ValLable;
    public javax.swing.JLabel s3Lable;
    public javax.swing.JLabel s3ValLable;
    public javax.swing.JLabel s4Lable;
    public javax.swing.JLabel s4ValLable;
    public javax.swing.JLabel s5Lable;
    public javax.swing.JLabel s5ValLable;
    public javax.swing.JLabel streamLable;
    public javax.swing.JLabel streamValLable;
    public javax.swing.JLabel yearLable;
    public javax.swing.JLabel yearValueLable;
    // End of variables declaration//GEN-END:variables
}
