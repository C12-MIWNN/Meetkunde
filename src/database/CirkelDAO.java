package database;

import model.Cirkel;
import model.Rechthoek;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CirkelDAO {
    DBaccess dBaccess;

    public CirkelDAO(DBaccess dBaccess) {
        this.dBaccess = dBaccess;
    }

    public void slaCirkelOp(Cirkel cirkel) {
        String sql = "INSERT INTO Figuur (kleur) VALUES (?);";
        int figuurnummer = 0;

        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cirkel.getKleur());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.first()) {
                figuurnummer = resultSet.getInt(1);
            }
        } catch (SQLException sqlException) {
            System.err.println("SQL fout: " + sqlException.getMessage());
        }

        String sql2 = "INSERT INTO Cirkel (figuurnummer, straal, xcoordinaat, ycoordinaat) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql2);
            preparedStatement.setInt(1, figuurnummer);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.err.println("SQL fout: " + sqlException.getMessage());
        }

    }
}
