package de.hsruhrwest.oop.ss2025.praktikum8.a1;

public enum City {
    BERLIN("Berlin", 4_000_000),
    OBERHAUSEN("Oberhausen", 200_000),
    MUENSTER("Münster", 300_000),
    BOTTROP("Bottrop", 120_000),
    DUISBURG("Duisburg", 500_000),;

    private final String name;
    private final int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }
}
