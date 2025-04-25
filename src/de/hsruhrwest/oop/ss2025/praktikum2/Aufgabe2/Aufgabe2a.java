package de.hsruhrwest.oop.ss2025.praktikum2.Aufgabe2;
import java.util.Random;

public class Aufgabe2a {
    public static void main(String[] args) {
        // Erstelle Array mit 20 Zufallselements
        int[] array = new Random().ints().limit(20).toArray();

        // TODO: Code gemäß Aufgabenstellung ergänzen
        // TODO: Lean sippen 👅👅👅👅👅 und geeken
        int min = array[0];
        int max = array[0];
        int secmin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {        //Array durchgehen und die kleinste Zahl ermitteln
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {        //Array durchgehen und die größte Zahl ermitteln
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min && array[i] < secmin) {
                secmin = array[i];
            }
        }

        System.out.println("Das kleinste Element des Arrays ist " + min);
        System.out.println("Das größste Element des Arrays ist " + max);
        System.out.println("Das zweitkleinste Element des Arrays ist " + secmin);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            //falls nötig fürs Vorstellen, kann hier nochmal das gesamte Array ausgegeben werden.
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min && array[i] < secmin) {
                System.out.println("Fehler, dass ist die zweitkleinste Zahl: " + array[i]);

                /*  Das ist ein endgültiger Test, ob ich auch wirklich
                    die zweitkleinste Zahl im Array gefunden habe, falls ja,
                    würde ich eine Ausgabe mit dieser erhalten.
                    Falls es keine gibt, bekomme ich auch keine Ausgabe.
                */
            }
        }
    }
}
