package main.java.model;

import main.java.model.entity.*;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchDAO extends DAO {
    // Searching Hotel data from the database
    public static List<Hotel> searchHotels(String search) {
        String query = "SELECT *\n" +
                "FROM Hotel\n" +
                "WHERE CodeH LIKE '%'||:search||'%'\n" +
                "OR NomH LIKE '%'||:search||'%'";
        List<Hotel> hotels = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Chambre data from the database
    public static List<Chambre> searchChambres(String search) {
        String query = "SELECT *\n" +
                "FROM Chambre\n" +
                "WHERE NumCh LIKE '%'||:search||'%'\n" +
                "OR DescCH LIKE '%'||:search||'%'\n" +
                "OR TypeCh LIKE '%'||:search||'%'\n" +
                "OR PrixCh LIKE '%'||:search||'%'\n" +
                "OR CategorieCode LIKE '%'||:search||'%'\n" +
                "OR HotelCode LIKE '%'||:search||'%'";
        List<Chambre> chambres = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Categorie data from the database
    public static List<Categorie> searchCategories(String search) {
        String query = "SELECT *\n" +
                "FROM Categorie\n" +
                "WHERE CodeCat LIKE '%'||:search||'%'\n" +
                "OR Description LIKE '%'||:search||'%'";
        List<Categorie> categories = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Employe data from the database
    public static List<Employe> searchEmployes(String search) {
        String query = "SELECT *\n" +
                "FROM Employe\n" +
                "WHERE CodeEmp LIKE '%'||:search||'%'\n" +
                "OR NomEmp LIKE '%'||:search||'%'\n" +
                "OR PrenomEmp LIKE '%'||:search||'%'\n" +
                "OR AdrEmp LIKE '%'||:search||'%'\n" +
                "OR SalaireEmp LIKE '%'||:search||'%'\n" +
                "OR HotelCode LIKE '%'||:search||'%'";
        List<Employe> employes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Gere data from the database
    public static List<Gere> searchGeres(String search) {
        String query = "SELECT *\n" +
                "FROM Gere\n" +
                "WHERE ChambreNum LIKE '%'||:search||'%'\n" +
                "OR EmployeCode LIKE '%'||:search||'%'";
        List<Gere> geres = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Service data from the database
    public static List<Service> searchServices(String search) {
        String query = "SELECT *\n" +
                "FROM Service\n" +
                "WHERE IdS LIKE '%'||:search||'%'\n" +
                "OR NomS LIKE '%'||:search||'%'\n" +
                "OR PrixS LIKE '%'||:search||'%'";
        List<Service> services = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Execute data from the database
    public static List<Execute> searchExecutes(String search) {
        String query = "SELECT *\n" +
                "FROM Execute\n" +
                "WHERE EmployeCode LIKE '%'||:search||'%'\n" +
                "OR ServiceId LIKE '%'||:search||'%'";
        List<Execute> executes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Client data from the database
    public static List<Client> searchClients(String search) {
        String query = "SELECT *\n" +
                "FROM Client\n" +
                "WHERE CodeCl LIKE '%'||:search||'%'\n" +
                "OR NomCl LIKE '%'||:search||'%'\n" +
                "OR PrenomCl LIKE '%'||:search||'%'";
        List<Client> clients = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Reservation data from the database
    public static List<Reservation> searchReservations(String search) {
        String query = "SELECT *\n" +
                "FROM Reservation\n" +
                "WHERE RefRe LIKE '%'||:search||'%'\n" +
                "OR ChambreNum LIKE '%'||:search||'%'\n" +
                "OR DateD LIKE '%'||:search||'%'\n" +
                "OR DateF LIKE '%'||:search||'%'";
        List<Reservation> reservations = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Passe data from the database
    public static List<Passe> searchPasses(String search) {
        String query = "SELECT *\n" +
                "FROM Passe\n" +
                "WHERE ClientCode LIKE '%'||:search||'%'\n" +
                "OR ReservationRef LIKE '%'||:search||'%'\n" +
                "OR Type LIKE '%'||:search||'%'";
        List<Passe> passes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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


    // Searching Demande data from the database
    public static List<Demande> searchDemandes(String search) {
        String query = "SELECT *\n" +
                "FROM Demande\n" +
                "WHERE ClientCode LIKE '%'||:search||'%'\n" +
                "OR ServiceId LIKE '%'||:search||'%'";
        List<Demande> demandes = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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

    // Searching Facture data from the database
    public static List<Facture> searchFactures(String search) {
        String query = "SELECT *\n" +
                "FROM Facture\n" +
                "WHERE CodeFact LIKE '%'||:search||'%'\n" +
                "OR LibFact LIKE '%'||:search||'%'";
        List<Facture> factures = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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

    // Searching Paie data from the database
    public static List<Paie> searchPaies(String search) {
        String query = "SELECT *\n" +
                "FROM Paie\n" +
                "WHERE ClientCode LIKE '%'||:search||'%'\n" +
                "OR ServiceId LIKE '%'||:search||'%'\n" +
                "OR FactureCode LIKE '%'||:search||'%'\n" +
                "OR Montant LIKE '%'||:search||'%'";
        List<Paie> paies = new ArrayList<>();
        connect();
        try (PreparedStatement statement = con.prepareStatement(query);) {
            ((OraclePreparedStatement) statement).setStringAtName("search", search);
            ResultSet resultSet = statement.executeQuery();
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
