package de.hsruhrwest.oop.ss2025.praktikum2.Aufgabe1;

import java.util.Scanner;

public class Aufgabe1b {
    public static void main(String[] args) {
        System.out.println("Geben sie eine Zahl für n ein");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Fehler deine n x n matrix kann nicht negativ sein");
            return;
        }

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


