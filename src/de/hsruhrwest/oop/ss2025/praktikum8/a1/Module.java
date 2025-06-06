package de.hsruhrwest.oop.ss2025.praktikum8.a1;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
