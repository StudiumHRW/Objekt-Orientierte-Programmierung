package de.hsruhrwest.oop.ss2025.praktikum6.a2;

public class Reverser extends AbstractStringTransformer {

    @Override
    protected String transformString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}


