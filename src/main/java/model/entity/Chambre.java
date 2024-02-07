package main.java.model.entity;

public class Chambre {
    private int numCh;
    private String descCH;
    private String typeCh;
    private double prixCh;
    private int categorieCode;
    private int hotelCode;

    // Getters and setters

    public int getNumCh() {
        return numCh;
    }

    public void setNumCh(int numCh) {
        this.numCh = numCh;
    }

    public String getDescCH() {
        return descCH;
    }

    public void setDescCH(String descCH) {
        this.descCH = descCH;
    }

    public String getTypeCh() {
        return typeCh;
    }

    public void setTypeCh(String typeCh) {
        this.typeCh = typeCh;
    }

    public double getPrixCh() {
        return prixCh;
    }

    public void setPrixCh(double prixCh) {
        this.prixCh = prixCh;
    }

    public int getCategorieCode() {
        return categorieCode;
    }

    public void setCategorieCode(int categorieCode) {
        this.categorieCode = categorieCode;
    }

    public int getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(int hotelCode) {
        this.hotelCode = hotelCode;
    }
}
