package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Spelen met meetkunde
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Figuur> figuren = new ArrayList<>();

        figuren.add(new Cirkel(3, new Punt(1,4), "groen"));
        figuren.add(new Cirkel());

        System.out.printf("Er zijn %d figuren\n", figuren.size());
        figuren.add(new Cirkel(6));
        System.out.printf("Er zijn %d figuren\n", figuren.size());
        figuren.remove(0);
        System.out.printf("Er zijn %d figuren\n", figuren.size());


        for (Figuur figuur : figuren) {
            System.out.println(figuur);
            System.out.println();
        }

        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverDeGrootte());
        System.out.println();
    }
}
