/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc5;

import java.util.Scanner;
//import java.lang.Character;
//import java.lang.String;
//import java.lang.Math;

public class Bloc5_2 {

    private static final double COMPONENTS = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vec = new int[5];
        int i, parells = 0, imparells = 0;

        System.out.printf("Introduce %d valores: \n", COMPONENTS);

        for (i = 0; i < COMPONENTS; i++) {
            System.out.printf("\nIntrodueix el valor %d: ", i + 1);
            vec[i] = in.nextInt();
        }
        for (i = 0; i < COMPONENTS; i++) {
            if (i % 2 == 0) {
                parells = parells + vec[i];
            } else {
                imparells = imparells + vec[i];
            }
        }
        System.out.printf("\nLa suma dels parells es %d , idel imparells %d \n", parells, imparells);
    }

}
