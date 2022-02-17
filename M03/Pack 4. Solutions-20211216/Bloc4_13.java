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

public class Bloc4_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, num, maxim = 0, nombre = 0;
        System.out.printf("Introdueix la xifra...");
        maxim = in.nextInt();

        for (i = 1; i < 10; i++) {
            System.out.printf("Introdueix la xifra...");
            num = in.nextInt();

            if (num == maxim) {
                nombre++;
            } else if (num > maxim) {
                maxim = num;
                nombre = 1;
            }
        }
        System.out.printf("el màxim és %d i es repeteix %d vegades", maxim, nombre);

    }
}
