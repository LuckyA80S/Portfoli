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

public class Bloc4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner in= new Scanner(System.in);
    
    int i,nombre=0,maxim=0,minim=0,valor,suma=0;
    
    System.out.printf("Introdueix el nombre de dades a introduir: ");
    nombre=in.nextInt();
    for (i=0;i<nombre;i++)
        {
        System.out.printf("Introdueix nombre %d: ",i+1);
        valor=in.nextInt();
        if (i==0) {maxim=valor;minim=valor;}
        if (valor> maxim) {maxim=valor;}
        else
            {
            if (valor<minim) {minim=valor;}
            }
        suma=suma+valor;
        }
    System.out.printf("El màxim és %d, el mínim és %d i la mitjana, %f",maxim,minim,(float)suma/(float)nombre);
    }
    
}
