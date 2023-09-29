package model;

import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Beschrijft een Cirkel en diens eigenschappen
 */
public class Cirkel {
    private static final int DEFAULT_STRAAL = 1;
    private static final String DEFAULT_KLEUR = "magenta";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal,Punt middelpunt, String kleur) { // All args
        setStraal(straal);
        this.middelpunt = middelpunt;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() { // Default
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverDeGrootte() {
        if (geefOppervlakte() < GRENSWAARDE_GROOT_FIGUUR) {
            return "Zij zijn groot en ik ben klein en dat is niet eerlijk!";
        } else {
            return "Deal with it!";
        }
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.err.printf("De straal moet positief zijn. De straal wordt nu op %d gezet.\n", DEFAULT_STRAAL);
            this.straal = DEFAULT_STRAAL;
        } else {
            this.straal = straal;
        }
    }

    public String getKleur() {
        return kleur;
    }
}
