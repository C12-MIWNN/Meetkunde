package controller;

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
        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();

        try (Scanner invoerBestand = new Scanner(new File("resources/Rechthoek.csv"))) {
            while (invoerBestand.hasNextLine()) {
                String[] waardenVanRechthoek = invoerBestand.nextLine().split(",");

                double lengte = Double.parseDouble(waardenVanRechthoek[0]);
                double breedte = Double.parseDouble(waardenVanRechthoek[1]);
                double xCoordinaat = Double.parseDouble(waardenVanRechthoek[2]);
                double yCoordinaat = Double.parseDouble(waardenVanRechthoek[3]);
                String kleur = waardenVanRechthoek[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand is niet gevonden");
        }

        File uitvoerBestand = new File("resources/Rechthoeken.txt");
        try (PrintWriter printWriter = new PrintWriter(uitvoerBestand)) {
            for (Rechthoek rechthoek : rechthoeken) {
                printWriter.println(rechthoek + "\n");
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het is niet gelukt het bestand aan te maken");
        }
    }

}
