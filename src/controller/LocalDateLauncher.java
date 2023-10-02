package controller;

import java.time.LocalDate;

/**
 * @author Vincent Velthuizen
 *
 * Laat zien hoe de LocalDate klasse gebruikt kan worden
 */
public class LocalDateLauncher {

    public static void main(String[] args) {

        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);

        LocalDate beginVan2023 = LocalDate.parse("2023-01-01");
        System.out.println(beginVan2023);

        LocalDate koningsdag2023 = LocalDate.of(2023, 4, 27);
        System.out.println(koningsdag2023);

        System.out.println(koningsdag2023.plusMonths(6));

        if (koningsdag2023.equals(vandaag)) {
            System.out.println("Koningsdag is nog niet geweest");
        } else {
            System.out.println("Koningsdag is al wel geweest");
        }
    }
}
