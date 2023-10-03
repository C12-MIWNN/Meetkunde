package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Spelen met meetkunde
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<String> regelsUitHetBestand = new ArrayList<>();

        File rechthoekenBestand = new File("resources/Rechthoek.csv");

        try {
            Scanner invoerBestand = new Scanner(rechthoekenBestand);

            while (invoerBestand.hasNextLine()) {
                regelsUitHetBestand.add(invoerBestand.nextLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand is niet gevonden");
        }

        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();

        for (String regelMetRechthoek : regelsUitHetBestand) {
            String[] waardenVanRechthoek = regelMetRechthoek.split(",");

            double lengte = Double.parseDouble(waardenVanRechthoek[0]);
            double breedte = Double.parseDouble(waardenVanRechthoek[1]);
            double xCoordinaat = Double.parseDouble(waardenVanRechthoek[2]);
            double yCoordinaat = Double.parseDouble(waardenVanRechthoek[3]);
            String kleur = waardenVanRechthoek[4];

            rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
        }

        System.out.println(rechthoeken);
    }

}
