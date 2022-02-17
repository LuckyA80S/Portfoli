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

public class Bloc4_12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nombre, i;
        int comptador;

        for (i = 10; i >= 6; i--) {
            for (comptador = i; comptador >= 0; comptador--) {
                System.out.printf("%d", comptador);
            }
            System.out.printf("\n");
        }

    }
}
