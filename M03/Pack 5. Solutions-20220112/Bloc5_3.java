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

public class Bloc5_3 {

private static final int COMPONENTS = 5;
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
	int [] vec;
        vec = new int[COMPONENTS];
        int i, suma=0;
	
        System.out.printf ("Introduce %d valores: \n",COMPONENTS);
	for (i=0;i<COMPONENTS;i++)
            {
            vec[i]=in.nextInt();
            if (i%3 ==0) {suma=suma + vec[i];}
            }
	System.out.printf ("El suma de les posicions múltiples de 3 és %d \n",suma);
    }
    
}
