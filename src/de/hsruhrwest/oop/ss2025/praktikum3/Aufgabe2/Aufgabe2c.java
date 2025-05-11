package de.hsruhrwest.oop.ss2025.praktikum3.Aufgabe2;

public class Aufgabe2c {
    public static String reverse(String s) {
        StringBuilder newString = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            newString.append(s.charAt(i));
        }
        return newString.toString();
        //return new StringBuilder(s).reverse().toString();
    }

    public static long reverse(long n) {
        return Long.parseLong(reverse(Long.toString(n)));
    }

    public static void main(String[] args) {
        System.out.println("Hallo");
        System.out.println(reverse("Hallo"));
        System.out.println("123456789");
        System.out.println(reverse(123456789));
    }
}
