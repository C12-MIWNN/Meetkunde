package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Spelen met meetkunde
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("figuren", "userFiguren","userFigurenPW");
        dBaccess.openConnection();
        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);
        // cirkelDAO.slaCirkelOp(new Cirkel(5, new Punt(3, 7), "menopause sweater purple"));

        PuntDAO puntDAO = new PuntDAO(dBaccess);
        System.out.println(puntDAO.geefPunten());

        dBaccess.closeConnection();
    }

}
