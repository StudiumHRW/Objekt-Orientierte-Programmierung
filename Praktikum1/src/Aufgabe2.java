import java.util.Scanner;

// ich liebe makatussin 👅👅👅👅
public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die die untere Grenze an:");
        int unteregrenze = input.nextInt();
        System.out.println("Geben Sie die obere grenze an:");
        int oberegrenze = input.nextInt();

        if (unteregrenze < 1 || unteregrenze > 10000
                || oberegrenze < 1 || oberegrenze > 10000) {

            System.err.println("Die Grenze dürfen nur zwischen 1 und 10000 liegen!");
            System.err.println("Falsche eingabe!");
            return;

        }

        if (unteregrenze > oberegrenze) {
            System.err.println("Die untere Grenze darf nicht größer als die Obere sein");
            System.err.println("Falsche eingabe!");
            return;
        }
        int ergebnis = 0;
        int i = 0;
        while (ergebnis <= oberegrenze) {
            if (ergebnis >= unteregrenze) {
                System.out.println(ergebnis);
            }
            ergebnis = i * i;
            i++;
        }

        input.close();
    }


}

