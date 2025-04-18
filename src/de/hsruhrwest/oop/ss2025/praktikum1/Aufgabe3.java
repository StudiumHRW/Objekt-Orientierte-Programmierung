package de.hsruhrwest.oop.ss2025.praktikum1;

import java.util.Scanner;

public class Aufgabe3 {
    private static final float DOLLAR_TO_EURO_EXCHANGE = 0.9f;
    private static final float DDK_TO_EURO_EXCHANGE = 0.13f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mit diesem Programm kannst du Währungen ineinander umrechnen. Es werden Dollar ($), Euro (€) und Dänische Kronen (DDK) unterstützt");

        System.out.print("In welcher Währung soll die Eingabe erfolgen? ($/€/DDK): ");
        String sourceCurrency = scanner.nextLine();

        System.out.print("In welche Währung soll umgerechnet werden? ($/€/DDK):");
        String targetCurrency = scanner.nextLine();

        System.out.print("Bitte gib einen Betrag der umgerechnet werden soll: ");
        float sourceValue = scanner.nextFloat();

        float valueInEuro = switch(sourceCurrency) {
            case "$" -> sourceValue * DOLLAR_TO_EURO_EXCHANGE;
            case "DDK" -> sourceValue * DDK_TO_EURO_EXCHANGE;
            default -> sourceValue;
        };
        float valueInTargetCurrency = switch (targetCurrency) {
            case "$" -> valueInEuro / DOLLAR_TO_EURO_EXCHANGE;
            case "DDK" -> valueInEuro / DDK_TO_EURO_EXCHANGE;
            default -> valueInEuro;
        };
        System.out.printf("%f %s entsprechen %f %s", sourceValue, sourceCurrency, valueInTargetCurrency, targetCurrency);
        scanner.close();
    }
}
