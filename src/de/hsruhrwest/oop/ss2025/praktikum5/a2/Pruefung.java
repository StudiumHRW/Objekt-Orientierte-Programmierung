package de.hsruhrwest.oop.ss2025.praktikum5.a2;

public class Pruefung {
    private String name;

    public Pruefung(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prüfung " + "[ " + name + " ]";
    }

    public boolean isPassed() {
        return true;
    }
}
