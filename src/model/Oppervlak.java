package model;

import java.util.ArrayList;
import java.util.Collections;

public class Oppervlak {

    private final double lengte;
    private final double breedte;
    private final ArrayList<Figuur> figuren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        figuren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuurPastInOppervlak(figuur)) {
            figuren.add(figuur);
            System.out.println("Het figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot en gaan we fijn negeren");
        }
    }

    private boolean figuurPastInOppervlak(Figuur figuur) {
        if (figuur instanceof Rechthoek) {
            return (((Rechthoek) figuur).getLengte() <= lengte && ((Rechthoek) figuur).getBreedte() <= breedte);
        } else if (figuur instanceof Cirkel) {
            return ((Cirkel) figuur).getStraal() <= lengte / 2 && ((Cirkel) figuur).getStraal() <= breedte / 2;
        } else {
            return false;
        }
    }

    public ArrayList<Figuur> figurenMetEenGroterOppervlak(double grenswaarde) {
        ArrayList<Figuur> groteFiguren = new ArrayList<>();

        for (Figuur figuur : figuren) {
            if (figuur.geefOppervlakte() > grenswaarde) {
                groteFiguren.add(figuur);
            }
        }

        return groteFiguren;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Collections.sort(figuren);

        for (Figuur figuur : figuren) {
            stringBuilder.append(figuur.toString()).append("\n\n");
        }

        return stringBuilder.toString();
    }
}
