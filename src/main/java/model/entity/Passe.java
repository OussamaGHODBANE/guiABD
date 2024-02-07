package main.java.model.entity;

public class Passe {
    private int clientCode;
    private int reservationRef;
    private String type;

    // Getters and setters

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getReservationRef() {
        return reservationRef;
    }

    public void setReservationRef(int reservationRef) {
        this.reservationRef = reservationRef;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
