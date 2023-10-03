package model;

import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Beschrijft de algemene eigenschappen van een figuur
 */
public abstract class Figuur implements Comparable<Figuur>, ToelaatbaarInOppervlak {
    private static final String DEFAULT_KLEUR = "crimson";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private final String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten.";
    }

    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

    public String vertelOverDeGrootte() {
        if (geefOppervlakte() < GRENSWAARDE_GROOT_FIGUUR) {
            return "Zij zijn groot en ik ben klein en dat is niet eerlijk!";
        } else {
            return "Deal with it!";
        }
    }

    @Override
    public int compareTo(Figuur anderFiguur) {
        if (this.geefOppervlakte() > anderFiguur.geefOppervlakte()) {
            return 1;
        } else if (this.geefOppervlakte() < anderFiguur.geefOppervlakte()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("kleur: %s\nomtrek: %.2f\noppervlakte: %.2f",
                this.kleur, this.geefOmtrek(), this.geefOppervlakte());
    }

    public String getKleur() {
        return kleur;
    }
}
