package de.hsruhrwest.oop.ss2025.praktikum3.Aufgabe2;
import java.util.ArrayList;
public class Aufgabe2b {
    public static ArrayList<Integer> extractPositiveNumbers(String[] input) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }


    public static void main(String[] args) {

        ArrayList <Integer> positiveNumbers = extractPositiveNumbers(args);

        for (int i = 0; i < positiveNumbers.size(); i++) {
            System.out.println(positiveNumbers.get(i));
        }
    }
}



