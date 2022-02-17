package bloc4;

import java.util.Scanner;

public class Bloc4_22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix el correu");
        String correu = in.nextLine();
        
        int posicio = correu.indexOf('@');
        
        if ( posicio == -1) System.out.println("L'arroba no és present");
        else System.out.println("L'arroba és troba en la posició " + (posicio+1));
        
        
        
        

    }
}
