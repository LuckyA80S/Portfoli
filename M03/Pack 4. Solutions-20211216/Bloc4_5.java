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

public class Bloc4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int suma = 0, producte = 1, i;

        for (i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            } else {
                producte = producte * i;
            }
        }
        System.out.printf("El producte dels imparells es %d", producte);
        System.out.printf("\nLa suma dels parells es %d", suma);
    }

}
