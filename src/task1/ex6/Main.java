package task1.ex6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int Min = 0;
        final int Max = 10000;


        int[] mathRandomArray = new int[10];
        int[] randomClassArray = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            mathRandomArray[i] = Min + (int)(Math.random() * ((Max - Min) + 1));
            randomClassArray[i] = random.nextInt(Min, Max);
        }

        System.out.println("Math.random: " + Arrays.toString(mathRandomArray) + "\n");
        System.out.println("Random class: " + Arrays.toString(randomClassArray) + "\n");

        Arrays.sort(mathRandomArray);
        Arrays.sort(randomClassArray);

        System.out.println("Sorted Math.random: " + Arrays.toString(mathRandomArray) + "\n");
        System.out.println("Sorted Random class: " + Arrays.toString(randomClassArray) + "\n");
    }
}