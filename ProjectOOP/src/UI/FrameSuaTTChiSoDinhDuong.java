/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import connection.ClinicDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.ChiSoDinhDuong;

/**
 *
 * @author Admin
 */
public class FrameSuaTTChiSoDinhDuong extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form FrameSuaTTChiSoDinhDuong
     */
    public FrameSuaTTChiSoDinhDuong(int CSDDID) {
        initComponents();
        setLocationRelativeTo(null);
        ChiSoDinhDuong csdd = new ClinicDAO().getChiSoDinhDuongByID(CSDDID);
        jTextFieldIDBenhNhanCSDD.setText("" + csdd.getIDPatient());
        jTextFieldChieuCao.setText(String.valueOf(csdd.getHeight()));
        jTextFieldChieuCaoMax.setText(String.valueOf(csdd.getMaxHeight()));
        JTextFieldChieuCaoMin.setText(String.valueOf(csdd.getMinHeight()));
        jTextFieldCanNang.setText(String.valueOf(csdd.getWeight()));
        jTextFieldCanNangMax.setText(String.valueOf(csdd.getMaxWeight()));
        jTextFieldCanNangMin.setText(String.valueOf(csdd.getMinWeight()));
        
        jButtonExit.addActionListener(this);
        jButtonReset.addActionListener(this);
        jButtonEdit.addActionListener(this);
        labelErrorChieuCaoMax.setText("");
        labelErrorCanNangMin.setText("");
        labelErrorCanNangMax.setText("");
        labelErrorChieuCaoMin.setText("");
        labelErrorChieuCao.setText("");
        labelErrorCanNang.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldIDBenhNhanCSDD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldChieuCaoMax = new javax.swing.JTextField();
        JTextFieldChieuCaoMin = new javax.swing.JTextField();
        jTextFieldCanNangMax = new javax.swing.JTextField();
        jTextFieldCanNangMin = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldChieuCao = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCanNang = new javax.swing.JTextField();
        labelErrorChieuCaoMax = new javax.swing.JLabel();
        labelErrorChieuCaoMin = new javax.swing.JLabel();
        labelErrorCanNangMax = new javax.swing.JLabel();
        labelErrorCanNangMin = new javax.swing.JLabel();
        labelErrorCanNang = new javax.swing.JLabel();
        labelErrorChieuCao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S???a ch??? s??? dinh d?????ng");
        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextFieldIDBenhNhanCSDD.setEnabled(false);
        getContentPane().add(jTextFieldIDBenhNhanCSDD);
        jTextFieldIDBenhNhanCSDD.setBounds(220, 80, 400, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("S???A CH??? S??? DINH D?????NG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 20, 350, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID B???nh nh??n");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 90, 84, 17);

        jButtonReset.setBackground(new java.awt.Color(0, 153, 102));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReset.setText("L??m m???i");
        getContentPane().add(jButtonReset);
        jButtonReset.setBounds(370, 690, 140, 40);

        jButtonExit.setBackground(new java.awt.Color(0, 153, 102));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Quay L???i");
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(160, 690, 120, 40);

        jButtonEdit.setBackground(new java.awt.Color(0, 153, 102));
        jButtonEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEdit.setText("S???a");
        getContentPane().add(jButtonEdit);
        jButtonEdit.setBounds(610, 690, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Chi???u cao t???i ??a");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 110, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Chi???u cao t???i thi???u");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 250, 120, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("C??n n???ng t???i ??a");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 340, 110, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("C??n n???ng t???i thi???u");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 440, 120, 17);
        getContentPane().add(jTextFieldChieuCaoMax);
        jTextFieldChieuCaoMax.setBounds(220, 160, 400, 30);
        getContentPane().add(JTextFieldChieuCaoMin);
        JTextFieldChieuCaoMin.setBounds(220, 240, 400, 30);
        getContentPane().add(jTextFieldCanNangMax);
        jTextFieldCanNangMax.setBounds(220, 340, 400, 30);
        getContentPane().add(jTextFieldCanNangMin);
        jTextFieldCanNangMin.setBounds(220, 430, 400, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Chi???u cao");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(70, 530, 80, 17);
        getContentPane().add(jTextFieldChieuCao);
        jTextFieldChieuCao.setBounds(220, 520, 400, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("C??n  n???ng");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(70, 610, 80, 17);

        jTextFieldCanNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCanNangActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCanNang);
        jTextFieldCanNang.setBounds(220, 600, 400, 30);

        labelErrorChieuCaoMax.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorChieuCaoMax.setText("jLabel12");
        getContentPane().add(labelErrorChieuCaoMax);
        labelErrorChieuCaoMax.setBounds(220, 200, 160, 14);

        labelErrorChieuCaoMin.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorChieuCaoMin.setText("jLabel12");
        getContentPane().add(labelErrorChieuCaoMin);
        labelErrorChieuCaoMin.setBounds(220, 280, 160, 14);

        labelErrorCanNangMax.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorCanNangMax.setText("jLabel12");
        getContentPane().add(labelErrorCanNangMax);
        labelErrorCanNangMax.setBounds(220, 380, 160, 14);

        labelErrorCanNangMin.setForeground(new java.awt.Color(255, 51, 51));
        labelErrorCanNangMin.setText("jLabel12");
        getContentPane().add(labelErrorCanNangMin);
        labelErrorCanNangMin.setBounds(220, 470, 160, 14);

        labelErrorCanNang.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorCanNang.setText("jLabel12");
        getContentPane().add(labelErrorCanNang);
        labelErrorCanNang.setBounds(220, 650, 160, 14);

        labelErrorChieuCao.setForeground(new java.awt.Color(255, 0, 51));
        labelErrorChieuCao.setText("jLabel12");
        getContentPane().add(labelErrorChieuCao);
        labelErrorChieuCao.setBounds(220, 560, 160, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/48360123_1946174842344109_3833490493317054464_n.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCanNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCanNangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCanNangActionPerformed

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
//            java.util.logging.Logger.getLogger(FrameSuaTTChiSoDinhDuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrameSuaTTChiSoDinhDuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrameSuaTTChiSoDinhDuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrameSuaTTChiSoDinhDuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameSuaTTChiSoDinhDuong().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldChieuCaoMin;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldCanNang;
    private javax.swing.JTextField jTextFieldCanNangMax;
    private javax.swing.JTextField jTextFieldCanNangMin;
    private javax.swing.JTextField jTextFieldChieuCao;
    private javax.swing.JTextField jTextFieldChieuCaoMax;
    private javax.swing.JTextField jTextFieldIDBenhNhanCSDD;
    private javax.swing.JLabel labelErrorCanNang;
    private javax.swing.JLabel labelErrorCanNangMax;
    private javax.swing.JLabel labelErrorCanNangMin;
    private javax.swing.JLabel labelErrorChieuCao;
    private javax.swing.JLabel labelErrorChieuCaoMax;
    private javax.swing.JLabel labelErrorChieuCaoMin;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jButtonEdit)){
            btnEditClick();
        }
        else if(e.getSource().equals(jButtonExit)){
            btnQuayLaiClick();
        }
        else {
            btnLamMoiClick();
        }
    }
    public void  btnEditClick(){
       ChiSoDinhDuong csdd = new ChiSoDinhDuong();
       labelErrorChieuCaoMax.setText("");
        labelErrorCanNangMin.setText("");
        labelErrorCanNangMax.setText("");
        labelErrorChieuCaoMin.setText("");
        labelErrorChieuCao.setText("");
        labelErrorCanNang.setText("");
            boolean test = true;
            
            try { // try1
                try { // s???a chi???u cao
                float chieuCao = Float.parseFloat(jTextFieldChieuCao.getText());
                if (chieuCao < 0) {
                    labelErrorChieuCao.setText("Chi???u cao kh??ng h???p l???");
                    test = false;
                } else {
                    csdd.setHeight(chieuCao);
                }
            } catch (NumberFormatException e) {
                labelErrorChieuCao.setText("Chi???u cao ph???i l?? m???t s???");
                test = false;
            }
                try { // s???a c??n n???ng
                float canNang = Float.parseFloat(jTextFieldCanNang.getText());
                if (canNang < 0) {
                    labelErrorCanNang.setText("C??n n???ng kh??ng h???p l???");
                    test = false;
                } else {
                    csdd.setWeight(canNang);
                }
            } catch (NumberFormatException e) {
                labelErrorCanNang.setText("C??n n???ng ph???i l?? m???t s???");
                test = false;
            }
                try { // s???a chi???u cao max
                float chieuCaoMax = Float.parseFloat(jTextFieldChieuCaoMax.getText());
                
                if (chieuCaoMax < 0) {
                    labelErrorChieuCaoMax.setText("Chi???u cao kh??ng h???p l???");
                    test = false;
                } else {
                    csdd.setMaxHeight(chieuCaoMax);
                }
                
            } catch (NumberFormatException e) {
                labelErrorChieuCaoMax.setText("Chi???u cao ph???i l?? m???t s???");
                test = false;
            }
                try { // s???a chi???u cao min
                float chieuCaoMin = Float.parseFloat(JTextFieldChieuCaoMin.getText());
                if (chieuCaoMin < 0) {
                    labelErrorChieuCaoMin.setText("Chi???u cao kh??ng h???p l???");
                    test = false;
                } else {
                    csdd.setMinHeight(chieuCaoMin);
                }
            } catch (NumberFormatException e) {
                labelErrorChieuCaoMin.setText("Chi???u cao ph???i l?? m???t s???");
                test = false;
            }
                try { // s???a c??n n???ng max
                float canNangMax = Float.parseFloat(jTextFieldCanNangMax.getText());
                if (canNangMax < 0) {
                    labelErrorCanNangMax.setText("C??n n???ng kh??ng h???p l???");
                    test = false;
                } else {
                    csdd.setMaxWeight(canNangMax);
                }
            } catch (NumberFormatException e) {
                labelErrorCanNangMax.setText("C??n n???ng ph???i l?? m???t s???");
                test = false;
            }
                try { // s???a c??n n???ng min
                float canNangMin = Float.parseFloat(jTextFieldCanNangMin.getText());
                if (canNangMin < 0) {
                    labelErrorCanNangMin.setText("C??n n???ng kh??ng h???p l???");
                    test = false;
                } else {
                    csdd.setWeight(canNangMin);
                }
            } catch (NumberFormatException e) {
                labelErrorCanNangMin.setText("C??n n???ng ph???i l?? m???t s???");
                test = false;
            }
                try {
                    if(Float.parseFloat(jTextFieldChieuCaoMax.getText())<=Float.parseFloat(JTextFieldChieuCaoMin.getText())||
                            Float.parseFloat(jTextFieldCanNangMax.getText())<=Float.parseFloat(jTextFieldCanNangMin.getText())){
                        JOptionPane.showMessageDialog(rootPane, "C??c ch??? s??? t???i ??a ph???i l???n h??n ch??? s??? t???i thi???u");
                        test = false;
                    }
                } catch (Exception e) {
                }
              
            csdd.setIDPatient(Integer.parseInt(jTextFieldIDBenhNhanCSDD.getText()));
                if (test) {
                    if (new ClinicDAO().UpdateChiSoDinhDuong(csdd)&&test) {
                JOptionPane.showMessageDialog(rootPane, "S???a th??nh c??ng!");
            }
                }
              
        } catch (Exception e) {
        }
    }
    public void btnQuayLaiClick(){
        new FrameXemChiSoDinhDuong().setVisible(true);
        this.dispose();
    }
    
    public void  btnLamMoiClick(){
        jTextFieldIDBenhNhanCSDD.setText("");
        jTextFieldChieuCao.setText("");
        jTextFieldChieuCaoMax.setText("");
        JTextFieldChieuCaoMin.setText("");
        jTextFieldCanNang.setText("");
        jTextFieldCanNangMax.setText("");
        jTextFieldCanNangMin.setText("");
    }
}
