import java.util.Scanner;

// ich liebe makatussin 👅👅👅👅
public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die die untere Grenze an:");
        int unteregrenze = input.nextInt();
        System.out.println("Geben Sie die obere grenze an:");
        int oberegrenze = input.nextInt();

        if (unteregrenze > oberegrenze) {
            System.err.println("Die untere Grenze darf nicht größer als die Obere sein");
            System.err.println("Falsche eingabe!");
            System.exit(1);
        }
        int ergebnis = 0;
        int i = 0;
        while (ergebnis < oberegrenze) {
            ergebnis = i*i;
            i++;
            if (ergebnis >= unteregrenze){
                System.out.println(ergebnis);
            }
        }

        input.close ();
    }


}

