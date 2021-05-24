/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import connection.ClinicDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HistoryOfVaccination;
import model.Patient;

/**
 *
 * @author Admin
 */
public class FrameThemLichSuTiemChung extends javax.swing.JFrame implements  ActionListener{

    /**
     * Creates new form FrameThemLichSuTiemChung
     */
    private ArrayList<HistoryOfVaccination> listLSTC = new ClinicDAO().getAllHistoryOfVaccinations();
    private int idMaxLSTC = listLSTC.get(listLSTC.size()-1).getID();
    public FrameThemLichSuTiemChung() {
        initComponents();
        setLocationRelativeTo(null);
        jButtonExit.addActionListener(this);
        jButtonAdd.addActionListener(this);
        jButtonReset.addActionListener(this);
        labelErrorIDBenhNhan.setText("");
        labelErrorNgayTiem.setText("");
        labelErrorLoaiVacxin.setText("");
        
        labelErrorIDphongkham.setText("");
        jTextFieldIDLSTC.setText(String.valueOf(idMaxLSTC+1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIDLSTC = new javax.swing.JTextField();
        jTextFieldIDBenhNhanLSTC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldNgayTiem = new javax.swing.JTextField();
        jTextFieldLoaiVacxin = new javax.swing.JTextField();
        jTextFieldSoLo = new javax.swing.JTextField();
        jTextFieldIDPhongKham = new javax.swing.JTextField();
        jTextFieldPhanUngSauTiem = new javax.swing.JTextField();
        labelErrorNgayTiem = new javax.swing.JLabel();
        labelErrorLoaiVacxin = new javax.swing.JLabel();
        labelErrorIDphongkham = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelErrorIDBenhNhan = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(184, 98, 77, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("IDBenhNhan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 161, 77, 17);

        jTextFieldIDLSTC.setEnabled(false);
        jTextFieldIDLSTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDLSTCActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIDLSTC);
        jTextFieldIDLSTC.setBounds(370, 95, 400, 30);

        jTextFieldIDBenhNhanLSTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDBenhNhanLSTCActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIDBenhNhanLSTC);
        jTextFieldIDBenhNhanLSTC.setBounds(370, 161, 400, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ngày tiêm");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 251, 62, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Loại Vaccin");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 351, 67, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Số Lô");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(180, 441, 35, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("ID Phòng Khám (1-5)");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(180, 531, 132, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Phản ứng sau tiêm");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(180, 611, 115, 17);
        getContentPane().add(jTextFieldNgayTiem);
        jTextFieldNgayTiem.setBounds(370, 241, 400, 30);

        jTextFieldLoaiVacxin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoaiVacxinActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLoaiVacxin);
        jTextFieldLoaiVacxin.setBounds(370, 341, 400, 30);
        getContentPane().add(jTextFieldSoLo);
        jTextFieldSoLo.setBounds(370, 431, 400, 30);
        getContentPane().add(jTextFieldIDPhongKham);
        jTextFieldIDPhongKham.setBounds(370, 521, 400, 30);
        getContentPane().add(jTextFieldPhanUngSauTiem);
        jTextFieldPhanUngSauTiem.setBounds(370, 601, 400, 30);

        labelErrorNgayTiem.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorNgayTiem.setText("jLabel12");
        getContentPane().add(labelErrorNgayTiem);
        labelErrorNgayTiem.setBounds(370, 281, 320, 20);

        labelErrorLoaiVacxin.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorLoaiVacxin.setText("jLabel12");
        getContentPane().add(labelErrorLoaiVacxin);
        labelErrorLoaiVacxin.setBounds(370, 381, 160, 20);

        labelErrorIDphongkham.setForeground(new java.awt.Color(255, 51, 51));
        labelErrorIDphongkham.setText("jLabel12");
        getContentPane().add(labelErrorIDphongkham);
        labelErrorIDphongkham.setBounds(370, 561, 290, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("THÊM LỊCH SỬ TIÊM CHỦNG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(369, 25, 401, 32);

        labelErrorIDBenhNhan.setForeground(new java.awt.Color(255, 0, 0));
        labelErrorIDBenhNhan.setText("jLabel1");
        getContentPane().add(labelErrorIDBenhNhan);
        labelErrorIDBenhNhan.setBounds(370, 201, 400, 14);

        jButtonExit.setBackground(new java.awt.Color(0, 153, 102));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Quay lại");
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(180, 703, 104, 37);

        jButtonAdd.setBackground(new java.awt.Color(0, 153, 102));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setText("Thêm");
        getContentPane().add(jButtonAdd);
        jButtonAdd.setBounds(469, 703, 96, 37);

        jButtonReset.setBackground(new java.awt.Color(0, 153, 102));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReset.setText("Làm mới");
        getContentPane().add(jButtonReset);
        jButtonReset.setBounds(776, 703, 101, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/48360123_1946174842344109_3833490493317054464_n.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDLSTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDLSTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDLSTCActionPerformed

    private void jTextFieldIDBenhNhanLSTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDBenhNhanLSTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDBenhNhanLSTCActionPerformed

    private void jTextFieldLoaiVacxinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoaiVacxinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoaiVacxinActionPerformed

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
//            java.util.logging.Logger.getLogger(FrameThemLichSuTiemChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrameThemLichSuTiemChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrameThemLichSuTiemChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrameThemLichSuTiemChung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrameThemLichSuTiemChung().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldIDBenhNhanLSTC;
    private javax.swing.JTextField jTextFieldIDLSTC;
    private javax.swing.JTextField jTextFieldIDPhongKham;
    private javax.swing.JTextField jTextFieldLoaiVacxin;
    private javax.swing.JTextField jTextFieldNgayTiem;
    private javax.swing.JTextField jTextFieldPhanUngSauTiem;
    private javax.swing.JTextField jTextFieldSoLo;
    private javax.swing.JLabel labelErrorIDBenhNhan;
    private javax.swing.JLabel labelErrorIDphongkham;
    private javax.swing.JLabel labelErrorLoaiVacxin;
    private javax.swing.JLabel labelErrorNgayTiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jButtonAdd)){
            btnAddClick();
        }
        else if(e.getSource().equals(jButtonExit)){
            btnExitClick();
        }
        
        else ;
    }
    public void btnExitClick(){
        new FrameLichSuTiemChung().setVisible(true);
        this.dispose();
    }
    public void btnAddClick(){
        HistoryOfVaccination lstc = new HistoryOfVaccination();
        labelErrorIDBenhNhan.setText("");
        labelErrorNgayTiem.setText("");
        labelErrorLoaiVacxin.setText("");
        
        labelErrorIDphongkham.setText("");
        boolean test = true;
        try {
            ++idMaxLSTC;
            lstc.setID(idMaxLSTC);
            // them ID Benh nhan
            try {
                int IDPatient = Integer.parseInt(jTextFieldIDBenhNhanLSTC.getText());
                ArrayList<Patient> listPatient = new ClinicDAO().getAllPatient();
                ArrayList<Patient> listChildren = new ArrayList<>();
                for (Patient patient : listPatient) {
                    if (patient.getKindOfPatient().equals("Trẻ em")) {
                        listChildren.add(patient);
                    }
                }
                boolean existedID = false;
                for (Patient patient : listChildren) {
                    if (IDPatient==patient.getID()) {
                        existedID = true;
                        break;
                    }
                }
                if (existedID) {
                    lstc.setIDPatient(IDPatient);
                }
                else{
                    labelErrorIDBenhNhan.setText("ID Bệnh nhân không tồn tại ");
                    test = false;
                }
                
                
            } catch (Exception e) {
                labelErrorIDBenhNhan.setText("ID Bệnh nhân phải là một số");
                test = false;
            }
            
            try {// them ID phong kham
                int idPhongkham  = Integer.parseInt(jTextFieldIDPhongKham.getText());
                if (idPhongkham>5||idPhongkham<1) {
                labelErrorIDphongkham.setText("ID Phòng khám phải trong khoảng (1-5)");
                test = false;
            }
            else{
                    lstc.setIDRoom(Integer.parseInt(jTextFieldIDPhongKham.getText()));
                }
            
                } catch (Exception e) {
                    labelErrorIDphongkham.setText("ID Phòng khám phải là một số");
                }
            // nhập và kiểm tra ngày tiêm
            String patternDate = "[0-9]{2}/[0-9]{2}/[0-9]{4}"; // định dạng cua ngày sinh dd/MM/yyyy
                if (jTextFieldNgayTiem.getText().matches(patternDate)) { // kiểm tra xem nhày sinh nhập vào có đúng định dạng không
                    String date = jTextFieldNgayTiem.getText().substring(0, 2); // lấy ngày
                    String month = jTextFieldNgayTiem.getText().substring(3, 5); // lấy tháng
                    String year = jTextFieldNgayTiem.getText().substring(6, 10); // lấy năm
                    int dateNumber = Integer.parseInt(date); // chuyển ngày sang kiểu Int
                    int monthNumber = Integer.parseInt(month);
                    int yearNumber = Integer.parseInt(year);
                    if(monthNumber<0||monthNumber>12||dateNumber<0||dateNumber>31){ // nếu tháng > 12 hoặc <0 hoặc ngày < 0 hoặc ngày > 31 thì ngày sinh không hợp lệ
                        labelErrorNgayTiem.setText("Ngày tháng không hợp lệ");
                        test = false;
                        
                    }
                    else{
                        if(monthNumber==4||monthNumber==6||monthNumber==9||monthNumber==11) // nếu là tháng có 30 ngày
                        {
                            if(dateNumber==31){ // ngày = 31 không hợp lệ
                                 labelErrorNgayTiem.setText("Ngày tháng không hợp lệ");
                                test = false;
                                
                            }
                        }
                        if(monthNumber==2){ // nếu là tháng 2
                            if (!((yearNumber % 4 == 0 && yearNumber % 100 != 0) || (yearNumber % 400 == 0))){ // nếu không phải năm nhuận
                                if(dateNumber>=29){ // nếu xuất hiện ngày 29/2 trong năm không phải năm nhuận
                                 labelErrorNgayTiem.setText("Ngày tháng không hợp lệ");
                                test = false;
                               
                                }
                            }
                            else{ // nếu là năm nhuận
                                if (dateNumber>29) { // tháng 2 có thể có ngyaf 29
                                 labelErrorNgayTiem.setText("Ngày tháng không hợp lệ");
                                test = false;
                                
                                }
                            }
                        }
                    }
                    
                    try {
                         lstc.setInjectionDate(new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldNgayTiem.getText())); // thiết lập ngày tiêm
                    } catch (Exception e) {
                         labelErrorNgayTiem.setText("Ngày tháng phải nhập theo định dạng dd/MM/yyyy");
                    }
                     
                } else { // else if (jTextFieldNgaySinh.getText().matches(patternDate))
                   labelErrorNgayTiem.setText("Ngày tháng phải nhập theo định dạng dd/MM/yyyy");
                   test = false;
                   
                }
            if(jTextFieldLoaiVacxin.getText().length()>50){
                labelErrorLoaiVacxin.setText("Loai vacxin quá kí tự");
                test = false;
            }
            else{
                 lstc.setKindOfVaccin(jTextFieldLoaiVacxin.getText());
            }
           
            lstc.setPhanUngSauTiem(jTextFieldPhanUngSauTiem.getText());
            lstc.setSoLo(jTextFieldSoLo.getText());
            if (test) {
                if (new ClinicDAO().addNew(lstc)) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                    }
                }
            
        } catch (Exception e) {
             e.printStackTrace();
        }
        
    }
    public void btnResetClick(){
      jTextFieldSoLo.setText("");
        jTextFieldPhanUngSauTiem.setText("");
        jTextFieldLoaiVacxin.setText("");
        jTextFieldIDPhongKham.setText("");
        jTextFieldNgayTiem.setText("");
        jTextFieldIDBenhNhanLSTC.setText("");
    }
}