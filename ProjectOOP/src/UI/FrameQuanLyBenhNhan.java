/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import connection.ClinicDAO;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.util.converter.IntegerStringConverter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;

/**
 *
 * @author Admin
 */
public class FrameQuanLyBenhNhan extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form FrameQuanLyBenhNhan
     */
    private DefaultTableModel tblModel;
    public FrameQuanLyBenhNhan() {
        initComponents();
        setLocationRelativeTo(null);
        jButtonThemBN.addActionListener((ActionListener) this);
        jButtonShowAll.addActionListener(this);
        jButtonSuaBN.addActionListener(this);
        jButtonXoaBN.addActionListener(this);
        jButtonQuayLai.addActionListener(this);
        jbuttonSearch.addActionListener(this);
        ArrayList<Patient> listPatient = new ClinicDAO().getAllPatient();
        tblModel = (DefaultTableModel) jTablePatient.getModel();
        for (Patient patient : listPatient) {
                    tblModel.addRow(new Object[]{patient.getID(), patient.getName(), patient.getDateOfBirth(),
                        patient.getAddress(), patient.getPhoneNumer(), patient.getEmail(), patient.getSex(),
                        patient.getKindOfPatient()
                    });
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonThemBN = new javax.swing.JButton();
        jButtonXoaBN = new javax.swing.JButton();
        jButtonSuaBN = new javax.swing.JButton();
        jButtonQuayLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonShowAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jbuttonSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý bệnh nhân");
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonThemBN.setBackground(new java.awt.Color(0, 153, 102));
        jButtonThemBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThemBN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemBN.setText("THÊM");
        jButtonThemBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemBNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonThemBN);
        jButtonThemBN.setBounds(350, 720, 79, 39);

        jButtonXoaBN.setBackground(new java.awt.Color(0, 153, 102));
        jButtonXoaBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonXoaBN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoaBN.setText("XÓA");
        jButtonXoaBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaBNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonXoaBN);
        jButtonXoaBN.setBounds(480, 720, 78, 39);

        jButtonSuaBN.setBackground(new java.awt.Color(0, 153, 102));
        jButtonSuaBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSuaBN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSuaBN.setText("SỬA");
        getContentPane().add(jButtonSuaBN);
        jButtonSuaBN.setBounds(620, 720, 78, 39);

        jButtonQuayLai.setBackground(new java.awt.Color(0, 153, 102));
        jButtonQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        jButtonQuayLai.setText("QUAY LẠI");
        jButtonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQuayLai);
        jButtonQuayLai.setBounds(190, 720, 105, 39);

        jTablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Ngày Sinh", "Địa Chỉ", "Số Điện Thoại", "Email", "Giới Tính", "Loại Bệnh Nhân"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePatient);
        if (jTablePatient.getColumnModel().getColumnCount() > 0) {
            jTablePatient.getColumnModel().getColumn(0).setResizable(false);
            jTablePatient.getColumnModel().getColumn(0).setPreferredWidth(3);
            jTablePatient.getColumnModel().getColumn(1).setResizable(false);
            jTablePatient.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTablePatient.getColumnModel().getColumn(2).setResizable(false);
            jTablePatient.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTablePatient.getColumnModel().getColumn(3).setResizable(false);
            jTablePatient.getColumnModel().getColumn(3).setPreferredWidth(110);
            jTablePatient.getColumnModel().getColumn(4).setResizable(false);
            jTablePatient.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTablePatient.getColumnModel().getColumn(5).setResizable(false);
            jTablePatient.getColumnModel().getColumn(6).setResizable(false);
            jTablePatient.getColumnModel().getColumn(6).setPreferredWidth(30);
            jTablePatient.getColumnModel().getColumn(7).setResizable(false);
            jTablePatient.getColumnModel().getColumn(7).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 1000, 590);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ BỆNH NHÂN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 20, 210, 31);

        jButtonShowAll.setBackground(new java.awt.Color(0, 153, 102));
        jButtonShowAll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonShowAll.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowAll.setText("HIỆN TẤT CẢ ");
        getContentPane().add(jButtonShowAll);
        jButtonShowAll.setBounds(730, 720, 130, 39);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nhập họ tên bệnh nhân: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 64, 160, 20);
        getContentPane().add(jTextFieldSearch);
        jTextFieldSearch.setBounds(260, 60, 360, 30);

        jbuttonSearch.setBackground(new java.awt.Color(0, 153, 102));
        jbuttonSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbuttonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonSearch.setText("TÌM KIẾM");
        getContentPane().add(jbuttonSearch);
        jbuttonSearch.setBounds(660, 60, 120, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/48360123_1946174842344109_3833490493317054464_n.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThemBNActionPerformed

    private void jButtonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonQuayLaiActionPerformed

    private void jButtonXoaBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonXoaBNActionPerformed

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
//            java.util.logging.Logger.getLogger(FrameQuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrameQuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrameQuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrameQuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameQuanLyBenhNhan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuayLai;
    private javax.swing.JButton jButtonShowAll;
    private javax.swing.JButton jButtonSuaBN;
    private javax.swing.JButton jButtonThemBN;
    private javax.swing.JButton jButtonXoaBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePatient;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JButton jbuttonSearch;
    // End of variables declaration//GEN-END:variables

    private void setTableData(ArrayList<Patient> patients){
        tblModel = (DefaultTableModel) jTablePatient.getModel();
        tblModel.setRowCount(0);
        for (Patient patient : patients) {
                    tblModel.addRow(new Object[]{patient.getID(), patient.getName(), patient.getDateOfBirth(),
                        patient.getAddress(), patient.getPhoneNumer(), patient.getEmail(), patient.getSex(),
                        patient.getKindOfPatient()
                    });
                }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(jButtonThemBN)){
            btnAddClick();
        }
        else if(e.getSource().equals(jButtonShowAll)){
            btnShowAllClick();
        }
        else if(e.getSource().equals(jButtonXoaBN)){
            btnDeleteClick();
        }
        else if(e.getSource().equals(jButtonSuaBN)){
            btnEditClick();
        }
        else if(e.getSource().equals(jbuttonSearch)){
            btnSearchClick();
        }
        else btnExitClick();
    }
    public void btnAddClick(){
        
        new FrameThemBenhNhan().setVisible(true);
        this.dispose();
    }
    public void btnEditClick(){
        int row = jTablePatient.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn bệnh nhân trước"
                    + "", "Lỗi: ", JOptionPane.ERROR_MESSAGE);   
        }
        else{
        int patientID = Integer.valueOf(String.valueOf(jTablePatient.getValueAt(row, 0)));
         ArrayList<Patient> patients = new ClinicDAO().getAllPatient();
                
        int idEdit = patients.get(row).getID();
        new FrameSuaTTBenhNhan(idEdit).setVisible(true);
        this.dispose();
        }
    }       
    public void btnDeleteClick(){
        int row = jTablePatient.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn bệnh nhân trước"
                    + "", "Lỗi: ", JOptionPane.ERROR_MESSAGE);   
        }
        else{
            int cofirm = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn xóa bệnh nhân này không?");
            if (cofirm==JOptionPane.YES_OPTION) {
                int patientID = Integer.valueOf(String.valueOf(jTablePatient.getValueAt(row, 0)));
                ArrayList<Patient> patients = new ClinicDAO().getAllPatient();
                
                int idDelete = patients.get(row).getID();
                new ClinicDAO().DeletePatient(idDelete);
                tblModel.setRowCount(0);
                setTableData(new ClinicDAO().getAllPatient());
            }
        }
    }
    public void btnExitClick(){
       new FrameTrangChu().setVisible(true);
       this.dispose();
    }
    public void btnShowAllClick(){
       // tblModel.setRowCount(0);
        setTableData(new ClinicDAO().getAllPatient());
        
    }
    public void btnSearchClick(){
        ArrayList<Patient> list = new ArrayList<>();
        String name = jTextFieldSearch.getText().trim();
        try {
            list = new ClinicDAO().getPatientByName(name);
            if (list.size()<1) {
                setTableData(list);
                JOptionPane.showMessageDialog(rootPane, "Không có bệnh nhân nào phù hợp!");
            }
            else{
                setTableData(list);
            }
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
        
    }
    
}