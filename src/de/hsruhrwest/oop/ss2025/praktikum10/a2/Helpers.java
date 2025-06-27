package de.hsruhrwest.oop.ss2025.praktikum10.a2;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Helpers {
    public static void printMatching(List<Player> players, Predicate<Player> predicate) {
        players.stream().filter(predicate).forEach(System.out::println);
    }

    public static int sumAfterMap(List<Integer> integers, UnaryOperator<Integer> operator) {
        return integers.stream().map(operator).mapToInt(i -> i).sum();
    }

    public static OptionalInt getMaximumMappedString(List<String> strings, Function<String, Integer> stringToInteger) {
        return strings.stream().mapToInt(stringToInteger::apply).max();
    }
}
