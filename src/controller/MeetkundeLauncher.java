package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Spelen met meetkunde
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];
        mijnCirkelArray[0] = new Cirkel(3, new Punt(1,4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length;
             arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller]);
            System.out.println(mijnCirkelArray[arrayTeller].vertelOverDeGrootte());
            System.out.println();
        }

        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length;
             arrayTeller++) {
            System.out.println(mijnRechthoekArray[arrayTeller]);
            System.out.println(mijnRechthoekArray[arrayTeller].
                    vertelOverDeGrootte());
            System.out.println();
        }
    }
}
