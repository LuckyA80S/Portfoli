/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc4;

import java.util.Scanner;
//import java.lang.Character;
//import java.lang.String;
//import java.lang.Math;

public class Bloc4_17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double habitantspetites = 0.0, habitantsmitjanes = 0.0, habitantsgrans = 0.0, habitantstotals = 0.0;
        double habitants = 0.0;

        System.out.printf("Quan s'acabin les ciutats introdueix el 0\n");
        do {
            habitantstotals = habitantstotals + habitants;
            System.out.printf("Indica els habitants...");
            habitants = in.nextInt();
            if (habitants <= 2000.0) {
                habitantspetites = habitants + habitantspetites;
                System.out.printf(" %.0f habitants en petites ciutats\n", habitantspetites);
            } else if (habitants <= 30000.0) {
                habitantsmitjanes = habitants + habitantsmitjanes;
                System.out.printf(" %.0f habitants en mitjanes ciutats\n", habitantsmitjanes);
            } else {
                habitantsgrans = habitants + habitantsgrans;
                System.out.printf(" %.0f habitants en grans ciutats\n", habitantsgrans);
            }

        } while (habitants != 0);
        System.out.printf("El %.2f  %% de la població viu en ciutats petites\n", habitantspetites / habitantstotals * 100);
        System.out.printf("El %.2f  %% de la població viu en ciutats mitjanes\n", habitantsmitjanes / habitantstotals * 100);
        System.out.printf("El %.2f  %% de la població viu en ciutats grans\n", habitantsgrans / habitantstotals * 100);

    }
}
