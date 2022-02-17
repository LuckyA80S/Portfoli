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

public class Bloc4_20 {

    public static void main(String[] args) {
      
    Scanner in= new Scanner(System.in);
    String nom="";
    int anys;
    float gratificacio, total_gratificacio=0;
    do
        {
        System.out.printf ("\n\nIntrodueix el nom?\n");
        nom=in.nextLine();
        if (!nom.equals("FI"))    
            {
            System.out.printf ("Quants anys portes a l'empresa\n");
            anys=in.nextInt();
            in.nextLine();
            if (anys<3)
                {
                gratificacio=0;
                }                
            else if (anys<10) 
                {
                gratificacio=300;
                }
            else if (anys <15)
                {
                gratificacio=400;
                }
            else
                {
                gratificacio=700;
                }
            total_gratificacio=total_gratificacio+gratificacio;
            }
        }while (!nom.equals("FI"));
    System.out.printf("El total de gratificacions és %.2f euros",total_gratificacio);
 
}
}
