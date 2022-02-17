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

public class Bloc4_19_2 {

    public static void main(String[] args) {
    
        int M=30;
        
    Scanner in= new Scanner(System.in);
    int hores,opcio,seguim=0;
    double preu_hora=0, salari_brut,impostos,salari_net;


    do
    {
    System.out.printf("Quantes hores ha treballat ?");
    hores=in.nextInt();

    System.out.printf("Escull matí(1), Tarda (2), nit (3)");
    opcio=in.nextInt();

    switch(opcio)
        {
        case 1:
           {
            preu_hora=30.0;
            break;
           }
        case 2:
            {
            preu_hora=30.0*1.2;
            break;
            }
        case 3:
            {
            preu_hora=30.0*1.5;
            break;
            }
        default :
            {
            System.out.printf("No és una opció vàlida");
            }


        }
    salari_brut= (float)hores*preu_hora;
    System.out.printf("El salari brut és %.2f", salari_brut);

    if (salari_brut < 700){impostos=0.008;}
    else if ((salari_brut >=700) && (salari_brut<1100))
            {impostos=0.10;}
        else
        {impostos=0.12;}

    salari_net=salari_brut-(salari_brut*impostos);
    System.out.printf("El salari net és %.2f", salari_net);

    System.out.printf("Vols calcular un altre treballador ? (Si-0, No-1)");
    seguim=in.nextInt();

    } while (seguim==0);
 
}
}
