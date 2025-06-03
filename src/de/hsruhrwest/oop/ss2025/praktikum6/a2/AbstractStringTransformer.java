package de.hsruhrwest.oop.ss2025.praktikum6.a2;

public abstract class AbstractStringTransformer {
    public void transform(String[] array) {
        for (String s : array) {
            System.out.println(transformString(s));
        }
    }

    protected abstract String transformString(String string);
}
