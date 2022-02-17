package bloc5;

import java.util.Scanner;

public class Bloc5_1_modular {

    public static void main(String[] args) {

        float[] notes = new float[5];

        intro(notes);
        calcula(notes);

    }

    public static void intro(float[] qualificacions) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < qualificacions.length; i++) {
            qualificacions[i] = in.nextFloat();
        }
    }

    public static void calcula(float[] qualificacions) {
        Scanner in = new Scanner(System.in);
        float suma = 0;
        for (int i = 0; i < qualificacions.length; i++) {
            suma += qualificacions[i];
        }
        System.out.println("La suma és " + suma);
    }



}
