package de.hsruhrwest.oop.ss2025.praktikum3.Aufgabe2;

public class Aufgabe2d {

    public static long[] stringToLong(String... strings) {
        long[] longs = new long[strings.length];
        for (int i = 0; i < strings.length; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }
        return longs;
    }

    public static void main(String[] args) {
        long[] longs = stringToLong("1", "2", "3", "4", "5", "67423423423");
        for (long l : longs) {
            System.out.println(l);
        }
    }
}
