package de.hsruhrwest.oop.ss2025.praktikum6.a2;

public class Reverser extends AbstractStringTransformer {
    StringBuilder stringBuilder = new StringBuilder();

    @Override
    protected String[] transformString(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new StringBuilder(array[i]).reverse().toString();
        }
        return result;
    }
}


