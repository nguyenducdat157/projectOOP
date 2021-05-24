/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrameGuiCanhBao extends javax.swing.JFrame {

    /**
     * Creates new form FrameGuiCanhBao
     */
    public FrameGuiCanhBao() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButtonSent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButtonEixt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gửi cảnh báo");
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GỬI CẢNH BÁO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 232, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cảnh báo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 71, 17);

        jButtonSent.setBackground(new java.awt.Color(0, 153, 102));
        jButtonSent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSent.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSent.setText("Gửi");
        jButtonSent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSentActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSent);
        jButtonSent.setBounds(850, 700, 124, 53);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(140, 100, 830, 267);

        jButtonEixt.setBackground(new java.awt.Color(0, 153, 102));
        jButtonEixt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEixt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEixt.setText("Quay lại");
        jButtonEixt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEixtActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEixt);
        jButtonEixt.setBounds(600, 700, 150, 53);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/48360123_1946174842344109_3833490493317054464_n.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSentActionPerformed
        // khi ấn nút gửi thì sẽ thông báo gửi thành công
        JOptionPane.showMessageDialog(rootPane, "Gửi thành công!");
            // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSentActionPerformed

    private void jButtonEixtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEixtActionPerformed
        new FrameXemChiSoDinhDuong().setVisible(true); // khi ấn nút quay lại thì hiện giao diện của Xem chỉ số dinh dưỡng
        this.dispose(); //giao diện hiện tại ẩn đi 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEixtActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrameGuiCanhBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrameGuiCanhBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrameGuiCanhBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrameGuiCanhBao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameGuiCanhBao().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEixt;
    private javax.swing.JButton jButtonSent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}