package database;

import model.Cirkel;
import model.Rechthoek;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CirkelDAO extends AbstractDAO {

    public CirkelDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaCirkelOp(Cirkel cirkel) {
        String sql = "INSERT INTO Figuur (kleur) VALUES (?);";
        int figuurnummer = 0;

        try {
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1, cirkel.getKleur());
            figuurnummer = executeInsertStatementWithKey();
        } catch (SQLException sqlException) {
            sqlExceptionWarning(sqlException);
        }

        String sql2 = "INSERT INTO Cirkel (figuurnummer, straal, xcoordinaat, ycoordinaat) VALUES (?, ?, ?, ?);";

        try {
            setupPreparedStatement(sql2);
            preparedStatement.setInt(1, figuurnummer);
            preparedStatement.setDouble(2, cirkel.getStraal());
            preparedStatement.setDouble(3, cirkel.getMiddelpunt().getxCoordinaat());
            preparedStatement.setDouble(4, cirkel.getMiddelpunt().getyCoordinaat());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            sqlExceptionWarning(sqlException);
        }

    }
}
