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

public class Bloc4_9_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nombre = 0;
        int comptador;
        int nombreprimers = 0;
        boolean primer = true;

        System.out.printf("El nombre 1 és un nombre primer\n");
        while (nombreprimers < 25) {
            primer = true;
            nombre++;
            for (comptador = 2; comptador <= nombre / 2 && primer; comptador++) {
                if (nombre % comptador == 0) {
                    primer = false;
                }
            }
            if (primer) {
                System.out.print(nombre + " - ");
                nombreprimers++;
            } 
        }
    }
}
