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

public class Bloc5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vec = new int[5];

        int i, ac = 0;
        System.out.printf("Introduce 5 valores: \n");
        
        for (i = 0; i < 5; i++) {
            vec[i] = in.nextInt();
        }
        int suma = 0;
        for (i = 0; i < 5; i++) {
            suma += vec[i];
        }        
 
        System.out.printf("El valor de la suma es %d\n", suma);
        System.out.printf("Els valors introduits han estat...\n");
        for (i = 0; i < 5; i++) {
            System.out.printf("%d\n", vec[i]);
        }
    }

}
