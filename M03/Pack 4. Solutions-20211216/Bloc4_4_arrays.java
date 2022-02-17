package bloc4;

import java.util.Scanner;

public class Bloc4_4_arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantitat;
      
        System.out.println("Intro quantitat...");
        quantitat = in.nextInt();
        
        int[] vector = new int[quantitat];
        int max=0, min=0, suma = 0;
        
        // bucle per introduir els valors
        for ( int i = 0 ; i < vector.length ; i++){
            System.out.println("intro valor " + i);
            vector[i] = in.nextInt();
        }

        // Bucle per esbrinar max i min, i la suma 
        for ( int i = 0 ; i < vector.length ; i++){
            if ( i == 0){
                max = vector[i];
                min = vector[i];
            }
            suma = suma + vector[i];
            
            if (vector[i] > max) {
                max = vector[i]; 
            } else if (vector[i] < min){
    
            min = vector[i];
            }          
        }         
        float mitjana = (float)suma / quantitat;
        System.out.println("La mitjana és " + mitjana);
    }
}
