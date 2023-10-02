package controller;

import model.*;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Spelen met meetkunde
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak oppervlak = new Oppervlak(10, 10);

        oppervlak.voegFiguurToe(new Cirkel());
        oppervlak.voegFiguurToe(new Cirkel(3));
        oppervlak.voegFiguurToe(new Cirkel(6));
        oppervlak.voegFiguurToe(new Rechthoek());
        oppervlak.voegFiguurToe(new Rechthoek(15, 6));
        oppervlak.voegFiguurToe(new Rechthoek(6, 15));
        oppervlak.voegFiguurToe(new Rechthoek(6, 9));

        System.out.println(oppervlak);

        System.out.println(oppervlak.figurenMetEenGroterOppervlak(25));
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverDeGrootte());
        System.out.println();
    }
}
