/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChiSoDinhDuong;
import model.HistoryOfVaccination;
import model.Patient;
import model.Relatives;
import model.Room;
import model.ThaiKi;
import sun.nio.cs.HistoricallyNamedCharset;

/**
 *
 * @author Admin
 */
public class ClinicDAO {
    private Connection connection;
    public  ClinicDAO(){
        if(connection==null){
           try {
               connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=Test9;username=sa;password=123");
               // lấy kết nối đến cơ sở dữ liệu
           } catch (SQLException ex) {
               Logger.getLogger(ClinicDAO.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }
    public ArrayList<Patient> getAllPatient(){ // hàm trả về danh sách các bệnh nhân trong cơ sở dữ liệu
            ArrayList<Patient> list = new ArrayList<>();
            String sql = "select * from BenhNhan ";
            try {
                PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Patient patient = new Patient();
                    patient.setID(rs.getInt(1));
                    patient.setName(rs.getString(2));
                    patient.setDateOfBirth(rs.getDate(3));
                    patient.setAddress(rs.getString(4));
                    patient.setPhoneNumer(rs.getString(5));
                    patient.setEmail(rs.getString(6));
                    patient.setSex(rs.getString(7));
                    patient.setKindOfPatient(rs.getString(8));
                    
                    list.add(patient);
                    
                      
        }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           return list;
    }
    public ArrayList<ThaiKi> getAllThaiKi(){ // hàm trả về danh sách thai kì của các mẹ mang thai trong cơ sở dữ liệu
        ArrayList<ThaiKi> list = new ArrayList<>();
            String sql = "select * from ThaiKi ";
            try {
                PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    ThaiKi thaiKi = new ThaiKi();
                    thaiKi.setIDPatient(rs.getInt(1));
                    thaiKi.setThoiGianMangThai(rs.getInt(2));
                    thaiKi.setWeight(rs.getFloat(3));
                    thaiKi.setNearestExaminationDate(rs.getDate(4));
                    thaiKi.setReExaminationDate(rs.getDate(5));    
                    list.add(thaiKi);
                    
                      
        }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           return list;
    }
    public ArrayList<ChiSoDinhDuong> getAllChiSoDinhDuong(){ // hàm trả về danh dách chỉ số dinh dưỡng của trẻ trong cơ sở dữ liệu
        ArrayList<ChiSoDinhDuong> list = new ArrayList<ChiSoDinhDuong>();
        String sql = "select * from ChiSoDinhDuong";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    ChiSoDinhDuong csdd = new ChiSoDinhDuong();
                    csdd.setIDPatient(rs.getInt(1));
                    csdd.setHeight(rs.getFloat(2));
                    csdd.setWeight(rs.getFloat(3));
                    csdd.setMaxHeight(rs.getFloat(4));
                    csdd.setMinHeight(rs.getFloat(5));
                    csdd.setMaxWeight(rs.getFloat(6));
                    csdd.setMinWeight(rs.getFloat(7));
                    list.add(csdd);
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return list;
    }
    public ArrayList<Relatives> getAllRelatives(){ // hàm trả về danh sách người thân của bệnh nhân
        ArrayList<Relatives> list = new ArrayList<>();
        String sql = "select * from NguoiThan";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Relatives relative = new Relatives();
                    relative.setID(rs.getInt(1));
                    relative.setIDPatient(rs.getInt(2));
                    relative.setName(rs.getString(3));
                    relative.setPhoneNumber(rs.getString(4));
                    relative.setAddress(rs.getString(5));
                    relative.setRelation(rs.getString(6));
                    
                    list.add(relative);
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return list;
    }
    public ArrayList<HistoryOfVaccination> getAllHistoryOfVaccinations(){ // hàm trả về danh sách lịch sửu tiêm chủng lấy từ cơ sở dữ liệu
        ArrayList<HistoryOfVaccination> list = new ArrayList<>();
        String sql = "select * from LSTiemChung";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    HistoryOfVaccination lstc = new HistoryOfVaccination();
                    lstc.setID(rs.getInt(1));
                    lstc.setInjectionDate(rs.getDate(2));
                    lstc.setKindOfVaccin(rs.getString(3));
                    lstc.setSoLo(rs.getString(4));
                    lstc.setIDPatient(rs.getInt(5));
                    lstc.setPhanUngSauTiem(rs.getString(6));
                    lstc.setIDRoom(rs.getInt(7));
                    list.add(lstc);
                    
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return list;
    }  
    public ArrayList<Room> getAllRoom(){ // hàm trả về danh sách phòng khám trong cơ sở dữ liệu
        ArrayList<Room> list = new ArrayList<>();
        String sql = "select * from PhongKham";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Room room = new Room();
                    room.setID(rs.getInt(1));
                    room.setLocation(rs.getString(2));
                    room.setName(rs.getString(3));
                    list.add(room);
                }
                    
                      
        } catch (SQLException e) {
                 e.printStackTrace();
                }
        return list;
    }
    public boolean addNew(Patient patient) { //  hàm thêm mới một bệnh nhân vào cơ sở dữ liệu
        String sql = "INSERT INTO BenhNhan(IDBenhNhan, Ten, NgaySinh, DiaChi, SoDienThoai, Email, GioiTinh, TinhTrang)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        /// Sửa đến đây

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, patient.getID());
            ps.setString(2, patient.getName());
            ps.setTimestamp(3, new Timestamp(patient.getDateOfBirth().getTime()));
            ps.setString(4, patient.getAddress());
            ps.setString(5, patient.getPhoneNumer());
            ps.setString(6, patient.getEmail());
            ps.setString(7, patient.getSex());
            ps.setString(8, patient.getKindOfPatient());
            ps.executeUpdate();
            return true; // trả về true nếu thêm thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean addNew(ThaiKi tk){ //  hàm thêm mới một thai kì vào cơ sở dữ liệu
        String sql = "Insert Into ThaiKi(IDBenhNhan, ThoiGianMangThai, NgayKhamGanNhat, NgayTaiKham, CanNang)"
                        + "VALUES(?,?, ?,?,?)";
                
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, tk.getIDPatient());
            ps.setInt(2, tk.getThoiGianMangThai());
            ps.setTimestamp(3, new Timestamp(tk.getNearestExaminationDate().getTime()));
            ps.setTimestamp(4, new Timestamp(tk.getReExaminationDate().getTime()));
            ps.setFloat(5, tk.getWeight());
            ps.executeUpdate();
            
            return true; // trả về true nếu thêm thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return  false;
    }
    public boolean addNew(ChiSoDinhDuong csdd){ //  hàm thêm mới một chỉ số dinh dưỡng vào cơ sở dữ liệu
        String sql = "Insert Into ChiSoDinhDuong(IDBenhNhan, ChieuCao, CanNang, ChieuCaoMax, ChieuCaoMin, CanNangMax, CanNangMin)"
                        + "VALUES(?,?, ?,?, ?,?,?)";
                
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, csdd.getIDPatient());
            ps.setFloat(2, csdd.getHeight());
            ps.setFloat(3, csdd.getWeight());
            ps.setFloat(4, csdd.getMaxHeight());
            ps.setFloat(5, csdd.getMinHeight());
            ps.setFloat(6, csdd.getMaxWeight());
            ps.setFloat(7, csdd.getMinHeight());
            
            ps.executeUpdate();

            return true; // trả về true nếu thêm thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return  false;
    }
    public boolean addNew(HistoryOfVaccination lstc){ // hàm thêm mới lịch sử tiêm chủng vào cơ sở dữ liệu
         String sql = "Insert Into LSTiemChung(ID,Ngaytiem,LoaiVacxin,Solo,IDBenhNhan, PhanUngSauTiem, IDPhongKham)"
                         +"VALUES(?, ?,?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, lstc.getID());
            ps.setTimestamp(2, new Timestamp(lstc.getInjectionDate().getTime()));
            ps.setString(3, lstc.getKindOfVaccin());
            ps.setString(4, lstc.getSoLo());
            ps.setInt(5, lstc.getIDPatient());
            ps.setString(6, lstc.getPhanUngSauTiem());
            ps.setInt(7, lstc.getIDRoom());
            ps.executeUpdate();

            return true; // trả về true nếu thêm thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return  false;
    }
    public boolean addNew(Relatives nt){ // hàm thêm mới một người thân vào cơ sở dữ liệu
        String sql = "INSERT INTO NguoiThan(ID, IDBenhNhan, Name, Phone, Adress, Quanhe)"
               + "VALUES(?,?,?, ?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, nt.getID());
            ps.setInt(2, nt.getIDPatient());
            ps.setString(3, nt.getName());
            ps.setString(4, nt.getPhoneNumber());
            ps.setString(5, nt.getAddress());
            ps.setString(6, nt.getRelation());
            ps.executeUpdate();
   
            return true; // trả về true nếu thêm thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return  false;
    }
    public boolean UpdatePatient(Patient patient){ // hàm sử thông tin của một bệnh nhân
        String sql = "Update BenhNhan set IDBenhNhan = ?, Ten = ?, NgaySinh = ?,"
                + " DiaChi = ?, SoDienThoai = ?, Email = ?, GioiTinh = ?,"
                + " TinhTrang = ? where IDBenhNhan = "+ patient.getID();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, patient.getID());
            ps.setString(2, patient.getName());
            ps.setTimestamp(3, new Timestamp(patient.getDateOfBirth().getTime()));
            ps.setString(4, patient.getAddress());
            ps.setString(5, patient.getPhoneNumer());
            ps.setString(6, patient.getEmail());
            ps.setString(7, patient.getSex());
            ps.setString(8, patient.getKindOfPatient());
            ps.executeUpdate();
            return true; // trả về true nếu sửa thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;
    }
    public boolean UpdateRelative(Relatives nt){ // hàm sửa thông tin của người thân
        String sql = "Update NguoiThan set ID = ?, IDBenhNhan = ?, Name = ?,"
                + " Phone = ?, Adress = ?, Quanhe = ? where IDBenhNhan = "+ nt.getIDPatient();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, nt.getID());
            ps.setInt(2, nt.getIDPatient());
            ps.setString(3, nt.getName());
            ps.setString(4, nt.getPhoneNumber());
            ps.setString(5, nt.getAddress());
            ps.setString(6, nt.getRelation());
            ps.executeUpdate();
           return  true; // trả về true nếu sửa thành công 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public void DeletePatient(int id){ // hàm xóa thông tin một bệnh nhân bằng id
        ArrayList<Patient> listPatient  = new ClinicDAO().getAllPatient(); // lấy ra danh sách các bệnh nhân
        int idInArrayList = 0;
        for (int i = 0; i < listPatient.size(); i++) {
            if (listPatient.get(i).getID()==id) {
                idInArrayList = i;
                break;
            }
        }
        
        String sql = "";
        if (listPatient.get(idInArrayList).getKindOfPatient().equalsIgnoreCase("Trẻ em")) { // nếu bệnh nhân là trẻ em
            sql = "delete from ChiSoDinhDuong where IDBenhNhan = "+ id + // xóa các thông tin về chỉ số dinh dưỡng của trẻ
                "delete from LSTiemChung where IDBenhNhan = "+ id+ // xóa các thông tin về lịch sử tiêm chủng của trẻ
                "delete from NguoiThan where IDBenhNhan = "+ id+ // xóa các thông tin về người thân của trẻ
                "delete from BenhNhan where IDBenhNhan = "+ id; // xóa thông tin cơ bản của trẻ
        }
        else{// nếu bệnh nhân là mẹ mang thai
            sql = "delete from ThaiKi where IDBenhNhan ="+ id+ // xóa thông tin về thai kì của mẹ
                "delete from NguoiThan where IDBenhNhan ="+ id+ // xóa thông tin về người thân
                "delete from BenhNhan where IDBenhNhan = "+ id; // xóa thông tin của mẹ

        }
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Patient getPatientByID(int id){ // hàm lấy ra một bệnh nhân thông qua id
        
            String sql = "select * from BenhNhan where IDBenhNhan = ?";
            try {
                PreparedStatement ps = connection.prepareCall(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Patient patient = new Patient();
                    patient.setID(rs.getInt(1));
                    patient.setName(rs.getString(2));
                    patient.setDateOfBirth(rs.getDate(3));
                    patient.setAddress(rs.getString(4));
                    patient.setPhoneNumer(rs.getString(5));
                    patient.setEmail(rs.getString(6));
                    patient.setSex(rs.getString(7));
                    patient.setKindOfPatient(rs.getString(8));
                    return patient;
                    
                      
        }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           return null ;
    }
    public Relatives getRelativeByID(int relativeID){ // hàm lấy ra một người thân thông qua id
        
        String sql = "select * from NguoiThan where IDBenhNhan = "+ relativeID;
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Relatives relative = new Relatives();
                    relative.setID(rs.getInt(1));
                    relative.setIDPatient(rs.getInt(2));
                    relative.setName(rs.getString(3));
                    relative.setPhoneNumber(rs.getString(4));
                    relative.setAddress(rs.getString(5));
                    relative.setRelation(rs.getString(6));
                    
                    return relative;
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return null;
    }
    public ThaiKi getThaiKiByID(int ID){ // hàm lấy ra một thai kì thông qua id
        
        String sql = "select * from ThaiKi where IDBenhNhan = "+ ID;
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    ThaiKi tk = new ThaiKi();
                    tk.setIDPatient(rs.getInt(1));
                    tk.setThoiGianMangThai(rs.getInt(2));
                    tk.setWeight(rs.getFloat(3));
                    tk.setNearestExaminationDate(rs.getDate(4));
                    tk.setReExaminationDate(rs.getDate(5));
                    return tk;
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return null;
    }
    public boolean UpdateThaiKi(ThaiKi tk){ // hàm sửa thông tin thai kì thông qua id
        String sql = "Update ThaiKi set IDBenhNhan = ?, ThoiGianMangThai = ?, CanNang = ?,"
                + " NgayKhamGanNhat = ?, NgayTaiKham = ? where IDBenhNhan = "+ tk.getIDPatient();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, tk.getIDPatient());
            ps.setInt(2, tk.getThoiGianMangThai());
            ps.setFloat(3, tk.getWeight());
            ps.setTimestamp(4, new Timestamp(tk.getNearestExaminationDate().getTime()));
            ps.setTimestamp(5, new Timestamp(tk.getReExaminationDate().getTime()));
            ps.executeUpdate();
           return  true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public HistoryOfVaccination getLSTiemChungByID(int ID){  // hàm lấy ra lịch sử tiêm chủng thông qua id lịch sử tiêm chủng
        
        String sql = "select * from LSTiemChung where ID = "+ ID;
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    HistoryOfVaccination lstc = new HistoryOfVaccination();
                    lstc.setID(rs.getInt(1));
                    lstc.setInjectionDate(rs.getDate(2));
                    lstc.setKindOfVaccin(rs.getString(3));
                    lstc.setSoLo(rs.getString(4));
                    lstc.setIDPatient(rs.getInt(5));
                    lstc.setPhanUngSauTiem(rs.getString(6));
                    lstc.setIDRoom(rs.getInt(7));
                    return lstc;
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return null;
    }
    public ArrayList<HistoryOfVaccination> getLSTiemChungByIDPatient(int ID){ // hàm lấy ra một list lịch sử tiêm chủng thông qua id bệnh nhân
        ArrayList<HistoryOfVaccination> list = new ArrayList<>();
        String sql = "select * from LSTiemChung where IDBenhNhan = "+ ID;
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    HistoryOfVaccination lstc = new HistoryOfVaccination();
                    lstc.setID(rs.getInt(1));
                    lstc.setInjectionDate(rs.getDate(2));
                    lstc.setKindOfVaccin(rs.getString(3));
                    lstc.setSoLo(rs.getString(4));
                    lstc.setIDPatient(rs.getInt(5));
                    lstc.setPhanUngSauTiem(rs.getString(6));
                    lstc.setIDRoom(rs.getInt(7));
                    list.add(lstc);
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return list;
    }
    public boolean UpdateLSTiemChung(HistoryOfVaccination lstc){ // hàm sửa lịch sử tiêm chủng
        String sql = "Update LSTiemChung set ID = ?, NgayTiem = ?, LoaiVacxin = ?,"
                + " SoLo = ?, IDBenhNhan = ?, PhanUngSauTiem = ?, IDPhongKham = ? "
                + "where ID = "+ lstc.getID();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, lstc.getID());
            ps.setTimestamp(2, new Timestamp(lstc.getInjectionDate().getTime()));
            ps.setString(3, lstc.getKindOfVaccin());
            ps.setString(4, lstc.getSoLo());
            ps.setInt(5, lstc.getIDPatient());
            ps.setString(6, lstc.getPhanUngSauTiem());
            ps.setInt(7, lstc.getIDRoom());
            ps.executeUpdate();
           return  true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public ChiSoDinhDuong getChiSoDinhDuongByID(int ID){ // hàm lấy ra chỉ số dinh dưỡng thông qua id
        
        String sql = "select * from ChiSoDinhDuong where IDBenhNhan = "+ ID;
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    ChiSoDinhDuong csdd = new ChiSoDinhDuong();
                    csdd.setIDPatient(rs.getInt(1));
                    csdd.setHeight(rs.getFloat(2));
                    csdd.setWeight(rs.getFloat(3));
                    csdd.setMaxHeight(rs.getFloat(4));
                    csdd.setMinHeight(rs.getFloat(5));
                    csdd.setMaxWeight(rs.getFloat(6));
                    csdd.setMinWeight(rs.getFloat(7));
                    return csdd;
                }
                    
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return null;
    }
    public boolean UpdateChiSoDinhDuong(ChiSoDinhDuong csdd){ // hàm sửa chỉ số dinh dưỡng
        String sql = "Update ChiSoDinhDuong set IDBenhNhan = ?, ChieuCao = ?, CanNang = ?,"
                + " ChieuCaoMax = ?, ChieuCaoMin = ?, CanNangMax = ?, CanNangMin = ? "
                + "where IDBenhNhan = "+ csdd.getIDPatient();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, csdd.getIDPatient());
            ps.setFloat(2, csdd.getHeight());
            ps.setFloat(3, csdd.getWeight());
            ps.setFloat(4, csdd.getMaxHeight());
            ps.setFloat(5, csdd.getMinHeight());
            ps.setFloat(6, csdd.getMaxWeight());
            ps.setFloat(7, csdd.getMinWeight());
            ps.executeUpdate();
           return  true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public ArrayList<Patient> MakeEvent(int a, int b){ // hàm để tạo sự kiện cho các bà mẹ độ tuổi từ a-b
        ArrayList<Patient> listMom = new ArrayList<>();
        String sql = "select * from BenhNhan where TinhTrang = N'Mẹ mang thai'\n" +
                    "and YEAR(GETDATE()) - YEAR( NgaySinh) >=" + a+ " and\n" +
                    "YEAR(GETDATE()) - YEAR( NgaySinh) <="+ b;
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Patient patient = new Patient();
                    patient.setID(rs.getInt(1));
                    patient.setName(rs.getString(2));
                    patient.setDateOfBirth(rs.getDate(3));
                    patient.setAddress(rs.getString(4));
                    patient.setPhoneNumer(rs.getString(5));
                    patient.setEmail(rs.getString(6));
                    patient.setSex(rs.getString(7));
                    patient.setKindOfPatient(rs.getString(8));
                    listMom.add(patient);
                }
            return listMom;
                      
        } catch (Exception e) {
                 e.printStackTrace();
                }
        return null;
    }
    public ArrayList<Patient> getPatientByName(String name){ // hàm lấy ra một list bệnh nhân thông qua tên
        ArrayList<Patient> listPatient = new ArrayList<>();
        String sql = "select * from BenhNhan where Ten like"
                + " N'%"+ name + "%'";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Patient patient = new Patient();
                    patient.setID(rs.getInt(1));
                    patient.setName(rs.getString(2));
                    patient.setDateOfBirth(rs.getDate(3));
                    patient.setAddress(rs.getString(4));
                    patient.setPhoneNumer(rs.getString(5));
                    patient.setEmail(rs.getString(6));
                    patient.setSex(rs.getString(7));
                    patient.setKindOfPatient(rs.getString(8));
                    listPatient.add(patient);
                }
            return listPatient;
                 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPatient;
        
    }

    
//    public static void main(String[] args) {
//        new ClinicDAO();
//    }
    
}

    
