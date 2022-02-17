package bloc5;

import java.util.Scanner;

public class Bloc5_2_modular {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vec = new int[5];

        intro(vec);
        suma(vec);
    }

    public static void intro(int[] qualificacions) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < qualificacions.length; i++) {
            qualificacions[i] = in.nextInt();
        }
    }

    public static void suma(int[] qualificacions) {
        int sumaP = 0, sumaI = 0;
        for (int i = 0; i < qualificacions.length; i++) {
            if (i % 2 == 0) {
                sumaP += qualificacions[i];
            } else {
                sumaI += qualificacions[i];
            }
        }
        System.out.println("la suma dels parells és " + sumaP);
        System.out.println("la suma dels imparells és " + sumaI);
    }

}
