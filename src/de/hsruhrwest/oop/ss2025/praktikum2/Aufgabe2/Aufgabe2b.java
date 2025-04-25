package de.hsruhrwest.oop.ss2025.praktikum2.Aufgabe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Aufgabe2b {

    public static void main(String[] args) {
        // Arrays mit Zufallselementen erstellen
        List<Integer> duplikate = new ArrayList<>();
        int upperBound = 20;
        int size = 50;
        int[] array1 = new Random().ints(0, upperBound).limit(size).toArray();
        int[] array2 = new Random().ints(0, upperBound).limit(size).toArray();

        // TODO: Code gemäß Aufgabenstellung ergänzen


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if(!duplikate.contains(array1[i])) {
                        duplikate.add(array1[i]);
                    }
                }
            }
        }
        System.out.println("Duplikate:");
        System.out.println(duplikate);
    }
}



