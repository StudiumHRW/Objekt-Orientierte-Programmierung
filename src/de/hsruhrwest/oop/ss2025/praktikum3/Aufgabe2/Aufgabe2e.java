package de.hsruhrwest.oop.ss2025.praktikum3.Aufgabe2;

public class Aufgabe2e {
    public static void splitSentence(String sentence) {
        String[] words = sentence.split(" ");
        System.out.println("Alle Worte:");
        for (String word : words) {
            if (!isValidNumber(word)) {
                System.out.println("    " + word);
            }
        }
        System.out.println("Alle Zahlen:");
        for (String word : words) {
            if (isValidNumber(word)) {
                System.out.println("    " + word);
            }
        }
    }

    private static boolean isValidNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NullPointerException | NumberFormatException ignored) {
        }
        return false;
    }

    public static String inputSentence() {
        System.out.print("Bitte Text eingeben: ");
        return new java.util.Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        splitSentence(inputSentence());
    }
}
