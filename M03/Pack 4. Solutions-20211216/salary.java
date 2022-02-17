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

public class salary {

    public static void main(String[] args) {
    
        int M=30;
        
    Scanner in= new Scanner(System.in);
	int ht,opc;
	double sn,sb=0.0,st;
	int mestrebaladors=1;
	while (mestrebaladors==1)
        {
        System.out.printf ("\n\nCuantas horas trabaja?\n");
        ht=in.nextInt();
        System.out.printf ("Que turno realiza?\n1.Manana\n2.Tarde\n3.Noche\n");
        opc=in.nextInt();
        switch (opc){
        case 1:{
            sb=(float)ht*M;
            break;
               }
        case 2:{
            sb=(float)(M*1.2)*ht;
            break;
               }
        case 3:{
            sb=(float)(M*1.5)*ht;
            break;
               }
        default:System.out.printf ("La opcion elegida es erronea\n");
        }
        System.out.printf ("El salario bruto es %.2lf\n",sb);
        if (sb<700){
            sn=(double)sb*0.008;
            st=sb-sn;

        }
        else
            if ((700>sb) || (sb>1100)){
                sn=(double)sb*0.12;
                st=sb-sn;
            }
            else{
                sn=(double)sb*0.1;
                st=sb-sn;
            }

         System.out.printf ("El salario neto es %.2lf\n",st);
         System.out.printf("Vols seguir calculant ? Si-1, No-0 ");
         mestrebaladors=in.nextInt();
        }
 
}
}
