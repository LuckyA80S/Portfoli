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

public class Bloc5_5 {

private static final int COMPONENTS = 5;
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
	float [] vec;        
        vec =  new float[COMPONENTS];
        int nota=0, aprovats=0;
	float mitjana;
	int i, notables=0;
	
	System.out.printf ("Introduce %d valores: \n",COMPONENTS);
	for (i=0;i<COMPONENTS;i++)
        {
		vec[i]=in.nextFloat();
		if ((vec[i]>=7.0)&&(vec[i]<9.0)) {notables++;}
		}
	System.out.printf ("Hi ha  %d notables\n",notables);
    }
    
}
