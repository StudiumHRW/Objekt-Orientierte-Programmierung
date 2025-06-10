package de.hsruhrwest.oop.ss2025.praktikum8.a1;

/**
 * An enum of City. Each City saves the Citys name and its population
 */
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

    /**
     *
     * @return int -> The City's population
     */
    public int getPopulation() {
        return population;
    }

    /**
     *
     * @return String -> The City's name
     */
    public String getName() {
        return name;
    }
}
