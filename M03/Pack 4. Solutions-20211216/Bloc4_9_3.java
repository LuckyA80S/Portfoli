package bloc4;

import java.util.Scanner;

public class Bloc4_9_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int quantitat ;
        boolean primer = true;
                
        System.out.println("Intro quantitat...");
        quantitat = in.nextInt();
        // En aquest cas concret d'esbrinar si és primer
        // És suficient arribar a l'arrel quadrada
        int tope = (int)(Math.sqrt(quantitat));
        for ( int i = 2 ; (i <= tope) && ( primer ) ; i++){
           if ( quantitat % i == 0) {
               System.out.println("No es primer");
               primer = false;
           } 
        }
        if ( primer ) {
            System.out.println("És primer");
        }
    }
}
