package de.hsruhrwest.oop.ss2025.praktikum3.Aufgabe2;

import java.util.Scanner;

public class Aufgabe2a {
    public static long polynom(long x, long y) {
        return 9 * (x * x) - 2 * (x * x * x) + y;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie ihren wert für x ein: ");
        long x = input.nextLong();
        System.out.println("Geben sie ihren wert für y ein: ");
        long y = input.nextLong();

        System.out.println("Das Ergebniss von f(" + x + "," + y + ") lautet: " + polynom(x, y));
        input.close();
    }
}
