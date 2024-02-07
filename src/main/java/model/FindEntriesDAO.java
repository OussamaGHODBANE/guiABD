package main.java.model;

import main.java.model.entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FindEntriesDAO extends DAO {

    // Retrieve Hotel data from the database
    public static List<Hotel> getHotels() {
        String query = "SELECT * FROM Hotel";
        List<Hotel> hotels = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Hotel hotel = new Hotel();
                hotel.setCodeH(resultSet.getInt("CodeH"));
                hotel.setNomH(resultSet.getString("NomH"));
                hotels.add(hotel);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hotels;
    }


    // Retrieve Chambre data from the database
    public static List<Chambre> getChambres() {
        String query = "SELECT * FROM Chambre";
        List<Chambre> chambres = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Chambre chambre = new Chambre();
                chambre.setNumCh(resultSet.getInt("NumCh"));
                chambre.setDescCH(resultSet.getString("DescCH"));
                chambre.setTypeCh(resultSet.getString("TypeCh"));
                chambre.setPrixCh(resultSet.getDouble("PrixCh"));
                chambre.setCategorieCode(resultSet.getInt("CategorieCode"));
                chambre.setHotelCode(resultSet.getInt("HotelCode"));
                chambres.add(chambre);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return chambres;
    }


    // Retrieve Categorie data from the database
    public static List<Categorie> getCategories() {
        String query = "SELECT * FROM Categorie";
        List<Categorie> categories = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Categorie categorie = new Categorie();
                categorie.setCodeCat(resultSet.getInt("CodeCat"));
                categorie.setDescription(resultSet.getString("Description"));
                categories.add(categorie);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categories;
    }


    // Retrieve Employe data from the database
    public static List<Employe> getEmployes() {
        String query = "SELECT * FROM Employe";
        List<Employe> employes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Employe employe = new Employe();
                employe.setCodeEmp(resultSet.getInt("CodeEmp"));
                employe.setNomEmp(resultSet.getString("NomEmp"));
                employe.setPrenomEmp(resultSet.getString("PrenomEmp"));
                employe.setAdrEmp(resultSet.getString("AdrEmp"));
                employe.setSalaireEmp(resultSet.getDouble("SalaireEmp"));
                employe.setHotelCode(resultSet.getInt("HotelCode"));
                employes.add(employe);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employes;
    }


    // Retrieve Gere data from the database
    public static List<Gere> getGeres() {
        String query = "SELECT * FROM Gere";
        List<Gere> geres = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Gere gere = new Gere();
                gere.setChambreNum(resultSet.getInt("ChambreNum"));
                gere.setEmployeCode(resultSet.getInt("EmployeCode"));
                geres.add(gere);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return geres;
    }


    // Retrieve Service data from the database
    public static List<Service> getServices() {
        String query = "SELECT * FROM Service";
        List<Service> services = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Service service = new Service();
                service.setIdS(resultSet.getInt("IdS"));
                service.setNomS(resultSet.getString("NomS"));
                service.setPrixS(resultSet.getDouble("PrixS"));
                services.add(service);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return services;
    }


    // Retrieve Execute data from the database
    public static List<Execute> getExecutes() {
        String query = "SELECT * FROM Execute";
        List<Execute> executes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Execute execute = new Execute();
                execute.setEmployeCode(resultSet.getInt("EmployeCode"));
                execute.setServiceId(resultSet.getInt("ServiceId"));
                executes.add(execute);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return executes;
    }


    // Retrieve Client data from the database
    public static List<Client> getClients() {
        String query = "SELECT * FROM Client";
        List<Client> clients = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Client client = new Client();
                client.setCodeCl(resultSet.getInt("CodeCl"));
                client.setNomCl(resultSet.getString("NomCl"));
                client.setPrenomCl(resultSet.getString("PrenomCl"));
                clients.add(client);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clients;
    }


    // Retrieve Reservation data from the database
    public static List<Reservation> getReservations() {
        String query = "SELECT * FROM Reservation";
        List<Reservation> reservations = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Reservation reservation = new Reservation();
                reservation.setRefRe(resultSet.getInt("RefRe"));
                reservation.setChambreNum(resultSet.getInt("ChambreNum"));
                reservation.setDateD(resultSet.getDate("DateD"));
                reservation.setDateF(resultSet.getDate("DateF"));
                reservations.add(reservation);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return reservations;
    }


    // Retrieve Passe data from the database
    public static List<Passe> getPasses() {
        String query = "SELECT * FROM Passe";
        List<Passe> passes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Passe passe = new Passe();
                passe.setClientCode(resultSet.getInt("ClientCode"));
                passe.setReservationRef(resultSet.getInt("ReservationRef"));
                passe.setType(resultSet.getString("Type"));
                passes.add(passe);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return passes;
    }


    // Retrieve Demande data from the database
    public static List<Demande> getDemandes() {
        String query = "SELECT * FROM Demande";
        List<Demande> demandes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Demande demande = new Demande();
                demande.setClientCode(resultSet.getInt("ClientCode"));
                demande.setServiceId(resultSet.getInt("ServiceId"));
                demandes.add(demande);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return demandes;
    }


    // Retrieve Facture data from the database
    public static List<Facture> getFactures() {
        String query = "SELECT * FROM Facture";
        List<Facture> factures = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Facture facture = new Facture();
                facture.setCodeFact(resultSet.getInt("CodeFact"));
                facture.setLibFact(resultSet.getString("LibFact"));
                factures.add(facture);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return factures;
    }


    // Retrieve Paie data from the database
    public static List<Paie> getPaies() {
        String query = "SELECT * FROM Paie";
        List<Paie> paies = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery();) {
            while (resultSet.next()) {
                Paie paie = new Paie();
                paie.setClientCode(resultSet.getInt("ClientCode"));
                paie.setServiceId(resultSet.getInt("ServiceId"));
                paie.setFactureCode(resultSet.getInt("FactureCode"));
                paie.setMontant(resultSet.getDouble("Montant"));
                paies.add(paie);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return paies;
    }

}
