package database;

import model.Punt;
import model.Rechthoek;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PuntDAO extends AbstractDAO {
    public PuntDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public ArrayList<Punt> geefPunten() {
        ArrayList<Punt> punten = new ArrayList<>();
        String sql = "SELECT xcoordinaat, ycoordinaat FROM Punt;";

        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = executeSelectStatement();

            while (resultSet.next()) {
                double xcoordinaat = resultSet.getDouble("xcoordinaat");
                double ycoordinaat = resultSet.getDouble("ycoordinaat");

                punten.add(new Punt(xcoordinaat, ycoordinaat));
            }
        } catch (SQLException sqlException) {
            sqlExceptionWarning(sqlException);
        }

        return punten;
    }
}
