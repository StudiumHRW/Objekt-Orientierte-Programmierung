package de.hsruhrwest.oop.ss2025.praktikum6.a2;

public class main {
    public static void main(String[] args) {
        String[] test = {"Hallo Welt das ist ein mega geiler String", "Ich hasse mein Leben", "Richtig geil dieser String", "Gadsen sind meine Lieblingstiere"};
        Reverser reverser = new Reverser();
        SpaceRemover spaceRemover = new SpaceRemover();
        reverser.transform(test);
        spaceRemover.transform(test);
    }
}
