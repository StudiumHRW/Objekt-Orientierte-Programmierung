package de.hsruhrwest.oop.ss2025.praktikum2.Aufgabe2;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe2b {

    public static void main(String[] args) {
        // Arrays mit Zufallselementen erstellen
        int upperBound = 20;
        int size = 50;
        int[] array1 = new Random().ints(0, upperBound).limit(size).toArray();
        int[] array2 = new Random().ints(0, upperBound).limit(size).toArray();
        int[] duplikate = new int[size];

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        int amountOfDuplicates = 0;
        for (int j : array1) {
            if (contains(array2, j)) {
                if (!contains(duplikate, j)) {
                    duplikate[amountOfDuplicates++] = j;
                }
            }
        }
        duplikate = Arrays.copyOf(duplikate, amountOfDuplicates);
        System.out.println("Duplikate:");
        System.out.println(Arrays.toString(duplikate));
    }

    private static boolean contains(int[] array, int element) {
        for (int j : array) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }
}
