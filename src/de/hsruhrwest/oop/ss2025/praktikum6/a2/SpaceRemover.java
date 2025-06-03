package de.hsruhrwest.oop.ss2025.praktikum6.a2;

public class SpaceRemover extends AbstractStringTransformer {
    @Override
    protected String transformString(String string) {
        return string.replaceAll(" ", "");
    }
}





