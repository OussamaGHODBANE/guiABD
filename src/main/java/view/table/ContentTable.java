package main.java.view.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ContentTable extends JTable {
    private final DefaultTableModel model;

    public ContentTable() {
        this(null, null);
    }

    public ContentTable(TableColumns table) {
        this(null, table);
    }

    public ContentTable(Object[][] data, TableColumns table) {
        super();
        String[] columnNames = getColumnsForTable(table);
        this.model = new DefaultTableModel(data, columnNames);
        this.setModel(this.model);
    }

    public void addRows(Object[][] rows) {
        for (Object[] row : rows)
            this.addRow(row);
    }

    public void addRow(Object[] row) {
        ((DefaultTableModel) this.getModel()).addRow(row);
        this.updateUI();
    }

    public void deleteAllRows() {
        int i = this.model.getRowCount();
        if (i == 0)
            return;
        while (i > 0) {
            this.model.removeRow(--i);
        }
    }

    public static String[] getColumnsForTable(TableColumns table) {
        switch (table) {
            case Hotel:
                return TableColumns.Hotel.getColumns();
            case Chambre:
                return TableColumns.Chambre.getColumns();
            case Categorie:
                return TableColumns.Categorie.getColumns();
            case Employe:
                return TableColumns.Employe.getColumns();
            case Gere:
                return TableColumns.Gere.getColumns();
            case Service:
                return TableColumns.Service.getColumns();
            case Execute:
                return TableColumns.Execute.getColumns();
            case Client:
                return TableColumns.Client.getColumns();
            case Reservation:
                return TableColumns.Reservation.getColumns();
            case Passe:
                return TableColumns.Passe.getColumns();
            case Demande:
                return TableColumns.Demande.getColumns();
            case Facture:
                return TableColumns.Facture.getColumns();
            case Paie:
                return TableColumns.Paie.getColumns();
            default:
                throw new IllegalArgumentException("Unsupported table: " + table);
        }
    }
}
