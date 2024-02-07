package main.java;

import main.java.model.SearchDAO;
import main.java.model.entity.Hotel;
import main.java.view.MainGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI ABD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MainGUI());
        frame.pack();
        frame.setVisible(true);

        for (Hotel h : SearchDAO.searchHotels("A")) {
            System.out.println(h.getCodeH() + ": " + h.getNomH());
        }

    }
}
