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

public class Bloc4_7 {

    public static void main(String[] args) {

        int multiples2 = 0, multiples5 = 0, i;

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                multiples2++;
            }
            if (i % 5 == 0) {
                multiples5++;
            }

        }
        System.out.printf("El nombre de múltiples de 2 és %d", multiples2);
        System.out.printf("El nombre de múltiples de 5 és %d", multiples5);

    }

}
