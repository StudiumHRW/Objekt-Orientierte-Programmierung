package de.hsruhrwest.oop.ss2025.praktikum6.a2;

import java.util.Arrays;

public abstract class AbstractStringTransformer {
    public void transform(String[] array) {
        System.out.println(Arrays.toString(transformString(array)));
    }

    protected abstract String[] transformString(String[] array);
}
