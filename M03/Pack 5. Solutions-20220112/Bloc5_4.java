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

public class Bloc5_4 {

    private static final int COMPONENTS = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        int[] vec = new int[COMPONENTS];
        int nota = 0, aprovats = 0;
        float mitjana;

        System.out.printf("Introduce %d valores: \n", COMPONENTS);
        for (i = 0; i < COMPONENTS; i++) {
            vec[i] = in.nextInt();
            nota = nota + vec[i];
        }
        mitjana = (float) nota / vec.length;
        System.out.printf("La mitjana dels aprovats és %.2f\n", mitjana);
    }

}
