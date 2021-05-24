/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HistoryOfVaccination {
    private int ID;
    private int IDPatient;
    private int IDRoom;
    private Date injectionDate;
    private String kindOfVaccin;
    private String SoLo;
    private String phanUngSauTiem;

    public HistoryOfVaccination() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDPatient() {
        return IDPatient;
    }

    public void setIDPatient(int IDPatient) {
        this.IDPatient = IDPatient;
    }

    public int getIDRoom() {
        return IDRoom;
    }

    public void setIDRoom(int IDRoom) {
        this.IDRoom = IDRoom;
    }

    public Date getInjectionDate() {
        return injectionDate;
    }

    public void setInjectionDate(Date injectionDate) {
        this.injectionDate = injectionDate;
    }

    public String getKindOfVaccin() {
        return kindOfVaccin;
    }

    public void setKindOfVaccin(String kindOfVaccin) {
        this.kindOfVaccin = kindOfVaccin;
    }

    public String getSoLo() {
        return SoLo;
    }

    public void setSoLo(String SoLo) {
        this.SoLo = SoLo;
    }

    public String getPhanUngSauTiem() {
        return phanUngSauTiem;
    }

    public void setPhanUngSauTiem(String phanUngSauTiem) {
        this.phanUngSauTiem = phanUngSauTiem;
    }
    
    
}
