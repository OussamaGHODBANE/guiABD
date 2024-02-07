package main.java.model.entity;

public class Paie {
    private int clientCode;
    private int serviceId;
    private int factureCode;
    private double montant;

    // Getters and setters

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getFactureCode() {
        return factureCode;
    }

    public void setFactureCode(int factureCode) {
        this.factureCode = factureCode;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
