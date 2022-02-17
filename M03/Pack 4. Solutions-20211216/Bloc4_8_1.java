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

public class Bloc4_8_1 {

    public static void main(String[] args) {
    
    Scanner in= new Scanner(System.in);
    
    int nombre;
    int comptador;
    int sumadivisors=0;
    
    
    System.out.printf("Quin nombre vols comprovar si es perfecte...");
    nombre=in.nextInt();
    System.out.printf("%d\n",nombre);
    for (comptador=1;comptador<=nombre/2;comptador++)
    {
       if (nombre%comptador ==0)
        {
            sumadivisors=sumadivisors+comptador;
        }
    }
    if (sumadivisors==nombre) {System.out.printf("El nombre %d és un nombre perfecte",nombre);}
    else {System.out.printf("El nombre %d no es un nombre perfecte",nombre);}
    }
    
}
