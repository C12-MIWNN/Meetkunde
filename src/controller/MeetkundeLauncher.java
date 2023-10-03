package controller;

import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Spelen met meetkunde
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            System.out.print("Wat moet de straal van de cirkel zijn? ");
            try {
                double straal = keyboard.nextDouble();
                Cirkel cirkel = new Cirkel(straal);
                System.out.println(cirkel);
                onjuisteInvoer = false;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Ik verwacht wel een getal van je...");
                keyboard.nextLine();
            }

            System.out.println("Je invoer, goed of fout, is nu afgehandeld");

        }

        onjuisteInvoer = true;

        while (onjuisteInvoer) {
            System.out.print("Wat is de lengte? ");
            double lengte = keyboard.nextDouble();
            System.out.print("Wat is de breedte? ");
            double breedte = keyboard.nextDouble();

            try {
                Rechthoek rechthoek = new Rechthoek(lengte, breedte);
                System.out.println(rechthoek);
                onjuisteInvoer = false;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            }
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverDeGrootte());
        System.out.println();
    }
}
