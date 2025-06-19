package de.hsruhrwest.oop.ss2025.praktikum9.a1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        Path path = Path.of("landscape.txt");
        var myLandscape = new Landscape(15, 9);

        try (var in = new FileInputStream(path.toFile())) {
            myLandscape.read(in);
            System.out.println(myLandscape);
        }

        try (var out = new FileOutputStream(path.toFile())) {
            myLandscape.write(out);
        }
    }
}