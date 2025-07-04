package de.hsruhrwest.oop.ss2025.praktikum6.a4;

import java.util.Scanner;

public class Statistik<T> {
    private T mostCommonElement;
    private T leastCommonElement;

    public Statistik(T mostCommonElement, T leastCommonElement) {
        this.mostCommonElement = mostCommonElement;
        this.leastCommonElement = leastCommonElement;
    }

    public T getMostCommonElement() {
        return mostCommonElement;
    }

    public void setMostCommonElement(T mostCommonElement) {
        this.mostCommonElement = mostCommonElement;
    }

    public T getLeastCommonElement() {
        return leastCommonElement;
    }

    public void setLeastCommonElement(T leastCommonElement) {
        this.leastCommonElement = leastCommonElement;
    }

    @Override
    public String toString() {
        return "Statistik{" +
                "mostCommonElement=" + mostCommonElement +
                ", leastCommonElement=" + leastCommonElement +
                '}';
    }

    public static <T> Statistik<T> getArrayStatistic(T[] array) {
        int[] counter = countElements(array);
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > counter[maxIndex]) {
                maxIndex = i;
            }
            if (counter[i] < counter[minIndex]) {
                minIndex = i;
            }
        }
        return new Statistik<>(array[maxIndex], array[minIndex]);

    }

    private static <T> int[] countElements(T[] array) {
        int[] counter = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            counter[i] = countElement(array[i], array);
        }
        return counter;
    }

    private static <T> int countElement(T currentElement, T[] array) {
        int counter = 0;
        for (T t : array) {
            if (currentElement.equals(t)) {
                counter++;
            }
        }
        return counter;
    }
}
