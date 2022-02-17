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

public class dscount {

    public static void main(String[] args) {
    
    Scanner in= new Scanner(System.in);
	double num,acumulat=0;
	double t,td=0;
	double DP=0.15,DG=0.20;
	int clients=1;

    while ( clients != 0)
    {
        
        num=1;
        System.out.printf ("Introduce los importes: \n");
        while (num!=0)
            {
            num=in.nextFloat();
            acumulat=acumulat+num;
            td=acumulat;
            }
        if (acumulat<800.0 && acumulat>300.0)
            {
            t=acumulat*DP;
            td=acumulat-t;
            }
        if (acumulat>800.0)
            {
            t=acumulat*DG;
            td=acumulat-t;
            }
        System.out.printf ("El importe total es %.2f\nEl importe a pagar es %.2f\n",acumulat,td);
        System.out.printf ("Algun client més (si=1; no=0)");
        clients=in.nextInt();
    }
 
}
}
