package de.hsruhrwest.oop.ss2025.praktikum4.a4;

import java.time.LocalDate;

public class Employee {
    private final long id;
    private final String name;
    private final LocalDate birthDate;
    private static long ID_COUNTER = 0;

    public Employee(String name, LocalDate birthDate) {
        this.id = ID_COUNTER++;
        this.name = name;
        this.birthDate = birthDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
