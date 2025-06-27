package de.hsruhrwest.oop.ss2025.praktikum10.a4;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Helpers {
    public static void main(String[] args) {
        IntStream.rangeClosed(100, 200);
        IntStream.iterate(3, i -> i + 3);
        Stream.iterate(0, i -> i).map(i -> i % 3 == 0 ? '*' : (i % 3 == 1 ? '+' : '-'));
        Stream.generate(() -> List.of("Alice", "Bob", "Clara", "Donald", "Ebbet", "Franz").get((int) (Math.random() * 6)));
    }
}
