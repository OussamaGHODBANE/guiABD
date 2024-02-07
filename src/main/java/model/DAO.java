package main.java.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    final static String USER = "GestionHotel";
    final static String PASSWORD = "abduser";

    static Connection con;

    public static Connection connect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            if (con == null) con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return FindEntriesDAO.con;
    }
}
