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

public class numPerf {

    public static void main(String[] args) {
    
    Scanner in= new Scanner(System.in);
    
    int nombre,i;
    int comptador;
    int sumadivisors=0;

    System.out.printf("Calcula els nombres perfectes entre 1 i ..");
    nombre=in.nextInt();
    System.out.printf("%d\n",nombre);
    for (i=1; i<=nombre; i++)
    {
        sumadivisors=0;
        for (comptador=1;comptador<=i/2;comptador++)
        {
            if (i%comptador ==0)
            {
                sumadivisors=sumadivisors+comptador;
            }
        }
    if (sumadivisors==i) {System.out.printf("El nombre %d és un nombre perfecte\n",i);}
    }
  }  
}
