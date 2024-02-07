package main.java.model.entity;

import java.util.Date;

public class Reservation {
    private int refRe;
    private int chambreNum;
    private Date dateD;
    private Date dateF;

    // Getters and setters

    public int getRefRe() {
        return refRe;
    }

    public void setRefRe(int refRe) {
        this.refRe = refRe;
    }

    public int getChambreNum() {
        return chambreNum;
    }

    public void setChambreNum(int chambreNum) {
        this.chambreNum = chambreNum;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }
}
