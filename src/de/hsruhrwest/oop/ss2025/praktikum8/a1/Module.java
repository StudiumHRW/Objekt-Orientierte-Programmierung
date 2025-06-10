package de.hsruhrwest.oop.ss2025.praktikum8.a1;

/**
 * A collection of University Modules. Each Module has a unique ID and a name
 */
public enum Module {
    OOP(0, "Objekt Orientierte Programmierung"),
    HMAT(1, "Höhere Mathematik"),
    ENGLISH(2, "English"),
    DATABASES(3, "Datenbanken"),
    DIGITAL_SYSTEMS(4, "Digitale Systeme");

    private final int id;
    private final String name;

    Module(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @return int -> The Modules ID
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return String -> The Modules Name
     */
    public String getName() {
        return name;
    }
}
