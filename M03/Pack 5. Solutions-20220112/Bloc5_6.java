package bloc5;

import java.util.Scanner;

public class Bloc5_6 {

    private static final int COMPONENTS = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] vec = new int[COMPONENTS];
        int min = 0, compta = 0, suma = 0;
        float mitjana;
        
        intro(vec);

        for (int i = 0; i < vec.length; i++) {
            if (i == 0) {
                min = vec[i];
            }
            if (vec[i] <= 25) {
                compta++;
                suma += vec[i];
                if (vec[i] < min){
                    min = vec[i];
                }
            }
        }
        mitjana = (float) suma / compta;
        System.out.println("La mitjana és " + mitjana);
        System.out.println("El mínim és " + min);

    }

    public static void intro(int[] qualificacions) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < qualificacions.length; i++) {
            qualificacions[i] = in.nextInt();
        }
    }
}
