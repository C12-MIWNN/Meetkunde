package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * Beschrijft de algemene eigenschappen van een figuur
 */
public class Figuur {
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

    public double geefOmtrek() {
        return 0;
    }

    public double geefOppervlakte() {
        return 0;
    }

    public String vertelOverDeGrootte() {
        if (geefOppervlakte() < GRENSWAARDE_GROOT_FIGUUR) {
            return "Zij zijn groot en ik ben klein en dat is niet eerlijk!";
        } else {
            return "Deal with it!";
        }
    }

    public String getKleur() {
        return kleur;
    }
}
