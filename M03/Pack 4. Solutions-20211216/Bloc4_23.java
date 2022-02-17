package bloc4;

import java.util.Scanner;

public class Bloc4_23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String elQueQueda;

        System.out.println("Introdueix la frase");
        String frase = in.nextLine();

        // UNA FORMA
        System.out.println("\nPRIMERA FORMA");
        elQueQueda = frase;
        boolean hemArribatAlFinal = false;

        while (!hemArribatAlFinal) {
            int posicio = elQueQueda.indexOf(' ');
            if (posicio != -1) {
                System.out.println(elQueQueda.substring(0, posicio));
                elQueQueda = elQueQueda.substring(posicio + 1);
            } else {
                System.out.println(elQueQueda);
                hemArribatAlFinal = true;
            }
        }
        
        // ALTRA FORMA
        System.out.println("\nSEGUNDA FORMA");
        for ( int i = 0 ; i < frase.length() ; i++){
            if ( frase.charAt(i) == ' '){
                System.out.println("");
            }else {
                System.out.print(frase.charAt(i));
            } 
 
        }        
        
        // ALTRA FORMA
        System.out.println("\nTERCERA FORMA");
        frase = frase.replace(' ','\n');
        System.out.println(frase);
        
        
        
        
        
        
    }
}
