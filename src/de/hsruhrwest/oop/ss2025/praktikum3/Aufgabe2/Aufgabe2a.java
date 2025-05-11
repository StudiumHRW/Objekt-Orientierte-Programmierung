package de.hsruhrwest.oop.ss2025.praktikum3.Aufgabe2;
public class Aufgabe2a {
    public static long polynom(long x, long y) {
        return 9 * (x * x) - 2 * (x * x * x) + y;
    }


    public static void main(String[] args) {
        long result = polynom(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(result);
        }
    }
