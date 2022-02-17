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

public class Bloc4_16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nombre = 1;
        int comptador;
        int comptaprimers = 0;
        boolean primer;

        while (nombre != 0) {
            primer = true;
            System.out.printf("Quin nombre vols comprovar si es primer...");
            nombre = in.nextInt();
            for (comptador = 2; comptador <= nombre / 2 && primer; comptador++) {
                if (nombre % comptador == 0) {
                    primer = false;
                }
            }
            if (primer) {
                System.out.printf("El nombre %d és un nombre primer\n", nombre);
                comptaprimers++;
            } else {
                System.out.printf("El nombre %d no és un nombre primer\n", nombre);
            }
        }
        System.out.printf("A la sequència hi ha %d nombres primers", comptaprimers);

    }
}
