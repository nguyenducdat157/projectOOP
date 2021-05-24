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
public class ThaiKi {
    private int IDPatient;
    private int thoiGianMangThai;
    private Date nearestExaminationDate;
    private Date reExaminationDate;
    private float weight;

    public ThaiKi() {
    }

    public ThaiKi(int IDPatient) {
        this.IDPatient = IDPatient;
    }
    

    public int getIDPatient() {
        return IDPatient;
    }

    public void setIDPatient(int IDPatient) {
        this.IDPatient = IDPatient;
    }

    public int getThoiGianMangThai() {
        return thoiGianMangThai;
    }

    public void setThoiGianMangThai(int thoiGianMangThai) {
        this.thoiGianMangThai = thoiGianMangThai;
    }

    public Date getNearestExaminationDate() {
        return nearestExaminationDate;
    }

    public void setNearestExaminationDate(Date nearestExaminationDate) {
        this.nearestExaminationDate = nearestExaminationDate;
    }

    public Date getReExaminationDate() {
        return reExaminationDate;
    }

    public void setReExaminationDate(Date reExaminationDate) {
        this.reExaminationDate = reExaminationDate;
    }
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
