package de.hsruhrwest.oop.ss2025.praktikum10.a3;

import java.util.Optional;

public class Helpers {
    public static Optional<Integer> getNextPrimeInRange(int start, int end) {
        for(int i = start + 1; i < end; i++) {
            if(isPrime(i)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    private static boolean isPrime(int number) {
        if(number <= 2) {
            return true;
        }
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
