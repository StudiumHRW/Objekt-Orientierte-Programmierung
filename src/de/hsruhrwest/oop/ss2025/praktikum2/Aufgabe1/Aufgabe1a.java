package de.hsruhrwest.oop.ss2025.praktikum2.Aufgabe1;

import java.util.Scanner;

public class Aufgabe1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl für n ein");

        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Fehler, keine negativen Zahlen");
            scanner.close();
            return;
        }


        long [] array = new long[n + 1];
        array[0] = 1;
        for (int i = 1; i <= n; i++ ) {
            array[i] = array[i - 1] * i;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("!" + i + " = " + array[i]);
        }



    }
}