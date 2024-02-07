package main.java.model.entity;

public class Employe {
    private int codeEmp;
    private String nomEmp;
    private String prenomEmp;
    private String adrEmp;
    private double salaireEmp;
    private int hotelCode;

    // Getters and setters

    public int getCodeEmp() {
        return codeEmp;
    }

    public void setCodeEmp(int codeEmp) {
        this.codeEmp = codeEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getPrenomEmp() {
        return prenomEmp;
    }

    public void setPrenomEmp(String prenomEmp) {
        this.prenomEmp = prenomEmp;
    }

    public String getAdrEmp() {
        return adrEmp;
    }

    public void setAdrEmp(String adrEmp) {
        this.adrEmp = adrEmp;
    }

    public double getSalaireEmp() {
        return salaireEmp;
    }

    public void setSalaireEmp(double salaireEmp) {
        this.salaireEmp = salaireEmp;
    }

    public int getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(int hotelCode) {
        this.hotelCode = hotelCode;
    }
}
