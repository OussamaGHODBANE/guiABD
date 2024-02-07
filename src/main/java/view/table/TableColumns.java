package main.java.view.table;

public enum TableColumns {
    Hotel("CodeH", "NomH"),
    Chambre("NumCh", "DescCH", "TypeCh", "PrixCh", "CategorieCode", "HotelCode"),
    Categorie("CodeCat", "Description"),
    Employe("CodeEmp", "NomEmp", "PrenomEmp", "AdrEmp", "SalaireEmp", "HotelCode"),
    Gere("ChambreNum", "EmployeCode"),
    Service("IdS", "NomS", "PrixS"),
    Execute("EmployeCode", "ServiceId"),
    Client("CodeCl", "NomCl", "PrenomCl"),
    Reservation("RefRe", "ChambreNum", "DateD", "DateF"),
    Passe("ClientCode", "ReservationRef", "Type"),
    Demande("ClientCode", "ServiceId"),
    Facture("CodeFact", "LibFact"),
    Paie("ClientCode", "ServiceId", "FactureCode", "Montant");

    private final String[] columns;

    TableColumns(String... columns) {
        this.columns = columns;
    }

    public String[] getColumns() {
        return columns;
    }
}
