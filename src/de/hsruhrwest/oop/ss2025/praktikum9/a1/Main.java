package de.hsruhrwest.oop.ss2025.praktikum9.a1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args)  {
        Path path = Path.of("huresohn.txt");
        var myLandscape = new Landscape(15, 9);
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            myLandscape.outputStream(baos);
            Files.write(path, baos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}